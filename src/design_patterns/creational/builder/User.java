package design_patterns.creational.builder;

public class User {
    private final String firstName;
    private final String lastName;
    private final int age;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    private User(Builder builder){
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age=builder.age;
    }
    public static Builder builder(){
        return new Builder();
    }
    static class Builder{

        private String firstName;
        private String lastName;
        private int age;

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }
        public User build(){
            return new User(this);
        }
    }
    @Override
    public String toString(){
        return "first name : "+this.firstName+
                "\nlast name : "+this.lastName+
                "\nage: "+this.age;
    }

}
