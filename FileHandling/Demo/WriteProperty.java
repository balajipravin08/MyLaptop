import java.util.Properties;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
class WriteProperty{
	public static void main(String[] args) throws IOException{
		Properties p = new Properties();
		p.setProperty("name","Balaji");
		p.setProperty("age","21");
		p.setProperty("email","balaji@gmail.com");
		
		//File f = new File("Demo");
		FileOutputStream fos = new FileOutputStream("newProperties.properties");
		p.store(fos,"Sample property...");
		fos.close();
		//System.out.println("properties in "+.getAbsolutePath());
	}
	
}
