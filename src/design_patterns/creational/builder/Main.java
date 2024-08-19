package design_patterns.creational.builder;

public class Main {
    public static void main(String[] args) {
        User user = User.builder()
                .setAge(25)
                .setFirstName("Pankaj")
                .setLastName("Kumar")
                .build();
        System.out.println(user);
    }
}
