package cat;

public class MyExceptionTest {
	public static void main(String[] args) {
		ShowNum a = new ShowNum();
		try {
		a.show(-2);
		}
		catch(Exception e) {
		System.out.println(e.getMessage());
		}
		}

}
