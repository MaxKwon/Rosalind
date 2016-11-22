import java.util.Scanner;
import java.util.ArrayList;

public class GC {

		
	public static void main(String[] args){
		
		int numDNA;
		
		Scanner readInput = new Scanner(System.in);
		
		System.out.println("How many DNA strings?: ");
		
		numDNA = readInput.nextInt();
		
		String[] names = new String[numDNA];
		String[] dna = new String[numDNA];
		double[] contents = new double[numDNA];
		
		for (int i = 0; i < 5; i++){
			System.out.println("K");
		}
		int c = 0;
		while(c < numDNA){
			
			System.out.println("Name " + c + ": ");
			names[c] = readInput.nextLine();
			
			if (names[c] != ""){
				c++;
			}
		}
		
		for (int i = 0; i < numDNA; i++){
			System.out.println("DNA " + i + ": ");
			dna[i] = readInput.nextLine();
			
			contents[i] = getContentGC(dna[i]);
		}
	
		System.out.println(names[determine(contents)] + "/r" + contents[determine(contents)]);
		
		
	}
	
	public static double getContentGC(String DNA){
	
		double gcCounter = 0;
		for (int i = 0; i < DNA.length(); i++){
			if (DNA.substring(i, i+1).equals("G") || DNA.substring(i, i+1).equals("C")){
				gcCounter++;
			}
		}
		
		double percent = (gcCounter/DNA.length());
		
		return percent;
		
	}
	
	public static int determine(double[] contents){
		
		int maxIndex = 0;
		double max = 0;
		for(int i = 0; i < contents.length; i++){
			if (contents[i] > max){
				maxIndex = i;
				max = contents[i];
			}
		}
		
		return maxIndex;
		
	}
	
	
	
	
}
