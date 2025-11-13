package kr.or.ddit.service;
import net.datafaker.Faker;

public class MessageService{
	public String getMessage() {
		Faker faker = new Faker();
		return faker.name().fullName();
	}
	
}