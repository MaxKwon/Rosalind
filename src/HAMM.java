
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class HAMM {
	
	public static String[] data; 

	public static void main(String[] args) throws FileNotFoundException{
		
		String textData = new Scanner(new File("rosalind.txt")).useDelimiter("\\A").next();
		 
		String[] data = new String[textData.length()];
		
		data = new String[2];
		
		separate(textData, data);
		System.out.println(textData);
		System.out.println("Count: " + determine(data[0], data[1]));
		
	}
	
	public static void separate(String str, String[] data){
		
		int markerM = 0;
		int markerE = 0;
		
		boolean run = true;
		
		for (int i = 0; i < str.length(); i++){
			
			if (str.substring(i, i+1).equals("/") && run){
				
				markerM = i;
				
				run = false;
			
			}
			else if (str.substring(i, i+1).equals("/")){
				markerE = i;
			}
		}
		
		data[0] = str.substring(0, markerM);
		data[1] = str.substring(markerM+1, markerE);
		
	}
	
	public static int determine(String str1, String str2){
		
		int count = 0;
		
		for (int i = 0; i < str1.length() ; i++){
			
			if (!str1.substring(i,  i+1).equals(str2.substring(i , i+1))){
				
				count++;
				
			}
			
		}
		
		return count;
		
	}
	
}
