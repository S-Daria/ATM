package builder;

public class Main {
    public static void main(String[] args) {
        User user = User.builder()
                .firstName("Daria")
                .lastName("Shabatska")
                .occupation("UCU")
                .age(19)
                .build();
        System.out.println(user);
    }
}
