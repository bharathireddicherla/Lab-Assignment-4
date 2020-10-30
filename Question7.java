import java.io.IOException;

import Lab-Assignment-4.Question6.InputException;

public class Question7 {

	public static void main(String[] args) {
		ExceptionExample exceptionExample = new ExceptionExample();
		try {
			exceptionExample.throwException();
		} catch (InputException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}