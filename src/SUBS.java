
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class SUBS {
	
	public static String[] dataPoints;
	
	public static void main (String[] args) throws FileNotFoundException{
	
		String textData = new Scanner(new File("rosalind.txt")).useDelimiter("\\A").next();
		
		dataPoints = separate(textData);
		
		String in = dataPoints[1];
		
		int[] out = determine(in, dataPoints[0]);
		
		for (int i = 0; i < out.length; i++){
		
				System.out.print(out[i]);
			
		}
		
	}
	
	public static String[] separate(String str){
		
		String[] ret = new String[2];
		
		int mIndex = 0;
		
		for (int i = 0; i < str.length(); i++){
			
			if (str.substring(i,  i+1).equals("/")){
				mIndex = i;
			}
			
		}
		
		ret[0] = str.substring(0, mIndex);
		ret[1] = str.substring(mIndex + 1, str.length());
		
		return ret;
		
	}
	
	public static int[] determine(String strIn, String strO){
		
		System.out.println(strO.substring(1,5).equals("ATAT"));
		System.out.println(strIn);
		
		int[] indexes = new int[3];
		
		int length = strIn.length();
		
		int count = 0;
		for (int i = 0; i < strO.length() - (length - 1); i++){
			
			if (strO.substring(i, i + length).equals("ATAT")){
				
				indexes[count] = i;
				
				count++;
				
				System.out.println("L");
				
			}
			
		}
		
		return indexes;
		
	}

}
