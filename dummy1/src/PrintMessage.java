package kr.or.ddit;
import kr.or.ddit.service.MessageService;
import java.util.*;

public class PrintMessage {
	public static void main(String[] args) {
		MessageService service = 
		new MessageService();
		String message1 = service.getMessage();
		String message2 = service.getMessage();
		List<String> messages = List.of(message1, message2);
		System.out.println(messages);
	}
}