import java.io.File;
import java.io.IOException;
import java.util.Arrays;
class FileDemo {
	public static void main(String[] args) throws IOException{
		String s1 = "Demo";
		File f = new File(s1);
		//System.out.println(f.isFile());
		int count = 0;
		String[] str = f.list();
		System.out.println(Arrays.toString(str));
		for(String s : str){
			
			if(new File(s).isFile()){	
				count++;
				System.out.println(s);
			}
		}
		
		System.out.println(count);
	}
}
