import java.io.*;
public class Question2 {
	
	public static void main(String[] args) throws IOException  {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String sentence = " ";
		
			sentence = br.readLine();
			BufferedWriter bw = new BufferedWriter(new FileWriter("data1.txt"));
			bw.write(sentence);
			System.out.println("data  written  successfully...");
			bw.close();
			br.close();
	}
}