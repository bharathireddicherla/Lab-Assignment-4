import java.util.Scanner;

public class Question6 {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			System.out.println("Please Enter a number");
			int num = sc.nextInt();
			try {
				if(num > 100) {
					throw new InputException("number can not be greater than 100");
				}
			} catch (InputException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}