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
		
	
		for (int i = 0; i < numDNA; i++){
			System.out.println("Name " + i + ": ");
			names[i] = readInput.nextLine();
		}

		for (int i = 0; i < numDNA; i++){
			System.out.println("Name " + i + ": ");
			names[i] = readInput.nextLine();
		}
		
		for (int i = 0; i < numDNA; i++){
			System.out.println("DNA " + i + ": ");
			dna[i] = readInput.nextLine();
			
			contents[i] = getContentGC(dna[i]);
		}
	
		//System.out.println(names[determine(contents)] +"  " + contents[determine(contents)]);
		System.out.println(contents[0] + " " + contents[1]);
		
	}
	
	public static double getContentGC(String DNA){
	
		double gcCounter = 0;
		for (int i = 0; i < DNA.length(); i++){
			if (DNA.substring(i, i+1).equals("G") || DNA.substring(i, i+1).equals("C")){
				gcCounter++;
			}
		}
		
		double percent = (gcCounter/DNA.length()) * 100.0;
		
		return percent;
		
	}
	
	public static int determine(double[] contents){
		
		int maxIndex = 0;
		double max = 0;
		for(int i = 0; i < contents.length; i++){
			if (contents[i] > max){
				maxIndex = i;
				max = contents[i];
				System.out.print("k");
			}
		}
		
		return maxIndex;
		
	}
	
	
	
	
}
