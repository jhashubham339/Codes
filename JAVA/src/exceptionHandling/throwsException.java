package exceptionHandling;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
class ReadAndWrite{
	void readfile() throws FileNotFoundException
	{
		FileInputStream fis = new FileInputStream("d:/abc.txt");
	}
}
public class throwsException {

	public static void main(String[] args) {
		
		ReadAndWrite rw = new ReadAndWrite();
		
		try {
			rw.readfile();
		}
        catch(Exception e)
		{
        	e.printStackTrace();
		}
	}

}
