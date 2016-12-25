
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
		
				System.out.print(out[i] + " ");
			
		}
		
	}
	
	public static String[] separate(String str){ // "/" between strings and  "\" at end
		
		String[] ret = new String[2];
		
		int mIndex = 0;
		int eIndex = 0;
		
		for (int i = 0; i < str.length(); i++){
			
			if (str.substring(i,  i+1).equals("/")){
				mIndex = i;
			}
			
			if (str.substring(i,  i+1).equals("\\")){
				eIndex = i;
			}
			
			
		}
		
		
		ret[0] = str.substring(0, mIndex);
		ret[1] = str.substring(mIndex + 1, eIndex);
		
		return ret;
		
	}
	
	public static int[] determine(String strIn, String strO){
		
		int[] indexes = new int[100]; // 100 is an arbitrary value, just really high (for the application)
		
		int length = strIn.length();
		
		int count = 0;
		for (int i = 0; i < strO.length() - (length - 1); i++){
			
			if (strO.substring(i, i + length).equals(strIn)){
				
				indexes[count] = i + 1;
				
				count++;
				
			}
			
		}
		
		int lengthCount = 0;
		
		for (int i = 0; i < indexes.length; i++){ // counts the number of used indexes in the array "indexes"
			
			if (indexes[i] == 0  && i != 0){
				
				break;
				
			}
			
			lengthCount++;
			
		}
		
		int[] r = new int[lengthCount];
		
		for (int i = 0; i < lengthCount; i++){ //fills the array that will actually be returned
			
			r[i] = indexes[i];
			
		}
		
		return r;
		
	}

}
