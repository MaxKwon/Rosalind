
import java.util.ArrayList;
import java.util.Scanner;

public class GC {
	
	public static void main (String args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Data: ");
		
		String data = input.nextLine();
		
		System.out.println(splitSec(data) + "k");
		
		
	}
	
	public static ArrayList<String> splitSec(String str){
		
		ArrayList<String> data = new ArrayList<String>();
		
		int trace = 0;
		
		for (int i = 0; i < str.length(); i ++){	
			
			if (str.substring(i, i+1).equals(">") && i != 0){
				
				data.add(str.substring(trace, i));
				
				trace = i;
				
			}
			
		}
		
		return data;
		
	}

}
