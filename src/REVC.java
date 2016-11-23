import java.util.Scanner;
import java.util.ArrayList;

public class REVC {

	
	public static void main(String[] args){
		
		String DNA = "";
		
		Scanner readInput = new Scanner(System.in);
		
		DNA = readInput.nextLine();
		
		ArrayList<String> t = new ArrayList<String>();
		
		for (int i = 0; i < DNA.length(); i++){
			t.add(i, DNA.substring(i,  i + 1));
		}
		
		ArrayList<String> flippedT = flip(t);
		
		ArrayList<String> complimentFlip = compliment(flippedT);
		
		for (int i = 0; i < complimentFlip.size(); i++){
			System.out.print(complimentFlip.get(i));
		}
		
	}
	
	public static ArrayList flip(ArrayList t){
		
		ArrayList<String> flip = new ArrayList<String>();
		
		int index = 0;
		for (int i = t.size() - 1; i >= 0; i--){
				
				String next = (String)t.get(i);
				flip.add(index, next);
				index++;
				
		}
		
		return flip;
	}
	
	public static ArrayList compliment(ArrayList t){
		
		ArrayList<String> last = new ArrayList<String>();
		
		for (int i = 0; i < t.size(); i++){
			
			String readStr = (String)t.get(i);
			last.add(i, readAndReplace(readStr));
		}
		
		return last;
	}
	
	public static String readAndReplace(String str){
		
		String out = "";
		switch (str){
		
		case "A":
			out =  "T";
			break;
			
		case "T":
			out =  "A";
			break;
			
		case "G":
			out = "C";
			break;
			
		case "C":
			out = "G";
			break;
		}
		
		return out;
	}
}
