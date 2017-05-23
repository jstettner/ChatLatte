import java.util.Scanner;

public class ApiImplementation extends ChatLatte {
	public static void main(String[] args) {
		ChatLatte cl = ChatLatte.fetch();
		Scanner scan = new Scanner(System.in);
		String input, response;

		while(true) {
			input = scan.nextLine();
			response = cl.submit(input);
			System.out.println(response);
		}
	}
}
