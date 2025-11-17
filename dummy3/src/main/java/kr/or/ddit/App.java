package kr.or.ddit;
import net.datafaker.Faker;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
   Faker faker = new Faker(); 
        System.out.println(faker.name().fullName());
    }
}
