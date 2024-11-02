import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.OutputStreamWriter;
import java.io.FileWriter;
import java.io.BufferedWriter;
class DemoCSV{
	public static void inputStreamReader()throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
			System.out.println("Enter some letters : ");
			char letters =(char)isr.read();
				while(isr.ready()){
					System.out.println(letters);
					letters =(char) isr.read();
				}
				isr.close();
	}
	public static void fileReader(File f)throws IOException{
		FileReader fr = new FileReader(f);
			char letters =(char)fr.read();
				while(fr.ready()){
					System.out.println(letters);
					letters =(char) fr.read();
				}
				fr.close();
	}
	public static void fileWriter(File f) throws IOException{
		FileWriter fw = new FileWriter(f,false);
			fw.write("i\nam\nfrom\nSrivilliputhur");
			fw.close();
		bufferedReader(f);
	}
	public static void bufferedReader (File f) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader(f));
		while(br.ready()){
			System.out.println(br.readLine());
		}
		br.close();
	}
	public static void bufferedWriter(File f) throws IOException{
		BufferedWriter fw =new BufferedWriter(new FileWriter(f,true));
			fw.write(" i am from Srivilliputhur");
			fw.close();
		bufferedReader(f);
	}
	public static void bufferedReader () throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("You typed : "+br.readLine());
			br.close();
	}
	
	public static void outputStreamWriter() throws IOException{
		OutputStreamWriter osw = new OutputStreamWriter(System.out);
			osw.write("hi");
			osw.write(33);
			osw.write("I");
			osw.write(32);
			osw.write("am");
			osw.close();
	}
	
	public static void main(String[] args) throws IOException{
		File f = new File("Demo.txt");
		//fileWriter(f);
		//bufferedWriter(f);'
		outputStreamWriter();
		//bufferedReader();
		//inputStreamReader();
	}
}
