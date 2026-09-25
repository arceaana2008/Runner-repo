import com.github.javafaker.Faker;

public class Main {
    public static void main(String[] args) {
        Faker faker = new Faker();
        String county = String.valueOf(faker.address().country());
        String job = String.valueOf(faker.job().title());
        String name = String.valueOf(faker.name().fullName());
        System.out.println(name + " " + job + " " + county.toString());
    }
}