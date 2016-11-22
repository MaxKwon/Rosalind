
import java.util.Scanner;

public class DNA {
	
	public static void main (String [] args){
		
		String dna = "";
		
		Scanner readInput = new Scanner(System.in);
		
		System.out.println("Enter Data: ");
		
		dna = readInput.nextLine();
		
		System.out.println(countA(dna) + " " + countC(dna) + " " + 
		countG(dna) + " " + countT(dna));
		
	}
	
	public static int countA(String DNA){
		
		
		int count = 0;
		
		for (int i = 0; i < DNA.length(); i++){
			
			if (DNA.substring(i, i+1).equals("A")){
			
				count++;
				
			}
			
		}
		
		return count;
	}
	
	public static int countC(String DNA){
		
		int count = 0;
		
		for (int i = 0; i < DNA.length(); i++){
			
			if (DNA.substring(i, i+1).equals("C")){
				
				count++;
				
			}
			
		}
		
		return count;
		
	}
	
	public static int countG(String DNA){
		
		int count = 0;
		
		for (int i = 0; i < DNA.length(); i++){
			
			if (DNA.substring(i, i+1).equals("G")){
				
				count++;
				
			}
			
		}
		
		return count;
	}
	
	public static int countT(String DNA){
		
		int count = 0;
		
		for (int i = 0; i < DNA.length(); i++){
			
			if (DNA.substring(i, i+1).equals("T")){
				
				count++;
				
			}
			
		}
		
		return count;
	}
	

}
