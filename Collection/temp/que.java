import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.util.Scanner;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class que{
	public static void main(String[] args)throws Exception ||{
		File f  =  new File("Demo1.xml");
		if(f.createNewFile()){
			System.out.println("hi");
			
		}
		FileWriter fw = new FileWriter(f);
		
		fw.close();
		FileReader fr = new FileReader(f);
		System.out.println(fr.read());
		System.out.println(fr.read());
		Scanner sc = new Scanner(f);
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document d = db.parse(f);
		Element e = d.getDocumentElement();
		NodeList nl = e.getChildNodes();
		for(int i = 0 ;i < nl.getLength() ; i++){
			Node n = nl.item(i);
			
			if(n.getNodeType() == n.ELEMENT_NODE){
				Element e1 = (Element) n ;
				String s1 = e1.getTagName();
				String s2 = e1.getTextContent();
				System.out.println("Tag name : "+s1+" Text Content : "+s2);
			}
		}
		
		fr.close();
		
		
		
	}
}
