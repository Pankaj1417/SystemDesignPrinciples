package design_patterns.creational.singleton.lazy.threadSafe;

public class Samosa
{
    private static Samosa samosa;
    private Samosa(){

    }
    // Will not work for multiple thread
    public static Samosa getSamosaInstance()
    {
        if(samosa == null){
            samosa = new Samosa();
        }
        return samosa;
    }

    // Will work for multiple threads but it is not good to block the entire method
    public synchronized static Samosa getSamosa()
    {
        if(samosa == null){
            samosa = new Samosa();
        }
        return samosa;
    }

    // Better way  : // Will work for multiple threads with single lock
    public synchronized static Samosa getInstanceWithOneLock()
    {
        if(samosa == null){
            synchronized (Samosa.class) {
                samosa = new Samosa();
            }
        }
        return samosa;
    }

    // Best way  : // Will work for multiple threads with single lock
    public synchronized static Samosa getInstanceWithTwoLock()
    {
        if(samosa == null){
            synchronized (Samosa.class) {
                if(samosa == null) {
                    samosa = new Samosa();
                }
            }
        }
        return samosa;
    }
}
