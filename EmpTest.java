import java.io.*;
public class  EmpTest {
	public static void main(String[] args) throws Exception {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("tester3.ser"));
			Emp emp = new Emp("Reddicherla Bharathi", 51894689, "kadapa", 27000.0);
			oos.writeObject(emp);
			emp.display();
			System.out.println("data serialized successfully..!");
			ObjectInputStream ois;
			ois = new ObjectInputStream(new FileInputStream("tester3.ser"));
			Emp empObj = (Emp) ois.readObject();
			empObj.display();
			System.out.println("successfully data was deserialized....!");
	}
}