import java.util.Scanner;
import java.util.ArrayList;

public class RNA {

	
	public static void main (String [] args){
		
		String DNA = "";
		
		Scanner readInput = new Scanner(System.in);
		
		DNA = readInput.nextLine();
		
		ArrayList<String> t = new ArrayList<String>();
		
		//DNA.length is the length of the soon to be array
		for (int i = 0; i < DNA.length(); i++){
			t.add(i, DNA.substring(i,  i+1));
		}
		
		ArrayList<String> transcribedRNA = transcribe(t);
		
		for (int i = 0; i < transcribedRNA.size(); i++){
			System.out.print(transcribedRNA.get(i));
		}
		
	}
	
	//the DNA string is known as string t
	public static ArrayList transcribe(ArrayList t){
		
		ArrayList<String> RNA = new ArrayList<String>();
		
		for (int i = 0; i < t.size(); i++){
			
			if (t.get(i).equals("T")){
				t.remove(i);
				t.add(i, "U");
			}
			
		}
		
		for (int j = 0; j < t.size(); j++){
			
			String next = (String) t.get(j);
			RNA.add(j, next);
			
		}
		
		return RNA;
	}
}
