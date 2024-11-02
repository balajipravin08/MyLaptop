import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
class CsvDemo{
	public static void main(String[] args) throws IOException{
		FileWriter fw=new FileWriter("NewCSV.csv");
		fw.append("Name,Age,Email\n");
		fw.append("Balaji,21,balaji@gmail.com\n");
		fw.append("Sakthi,21,Sakthi@gmail.com\n");
		fw.close();
		File f = new File("NewCSV.csv");
		Scanner sc = new Scanner(f);
		sc.useDelimiter(",");
		while(sc.hasNext()){
			System.out.print(sc.next()+"\t");
		}
		System.out.println();
		sc.close();
		
		BufferedReader bf = new BufferedReader(new FileReader("NewCSV.csv"));
		String s = bf.readLine();	
		while(s!=null){
			System.out.println(s);
			s=bf.readLine();			
		}
		bf.close();
		
	}
}
