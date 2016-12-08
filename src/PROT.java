
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class PROT {

	public static String[] codons;
	
	public static void main(String[] args) throws FileNotFoundException{
		
		String textData = new Scanner(new File("rosalind.txt")).useDelimiter("\\A").next();
		 
		String[] data = new String[textData.length()];	
		
		codons = new String[textData.length()/3];
		
		System.out.println(textData.length()/3);
		
		int i = 0;
		int p = 0;
		
		while (i < textData.length()/3){
			
			codons[i] = textData.substring(p, p + 3);
			
			i = i + 1;
			
			p = p + 3;
			
		}
		
		ArrayList<String> fin = determine(codons);
		
		for (int j = 0; j < fin.size(); j++){
			System.out.print(fin.get(j));
		}
		
	}
	
	public static ArrayList<String> determine(String[] arr){
		
		ArrayList<String> protein = new ArrayList<String>();
		
		for (int i = 0; i < arr.length - 1; i++){
			
			if (codons[i].equals("UUU") || codons[i].equals("UUC")) {
				protein.add("F");
			}
			else if ((codons[i].equals("UUA") || codons[i].equals("UUG") || codons[i].equals("CUU"))
				    || (codons[i].equals("CUG") || codons[i].equals("CUC") || codons[i].equals("CUA"))) {
				protein.add("L");

			} 	
			else if (codons[i].equals("UGU") || codons[i].equals("UGC")) {
				protein.add("C");

			}
			else if (codons[i].equals("UCU") || codons[i].equals("UCC") || codons[i].equals("UCA")|| codons[i].equals("UCG")) {
				protein.add("S");

			}
			else if (codons[i].equals("UAU") || codons[i].equals("UAC")) {
				protein.add("Y");
			}
			else if (codons[i].equals("UGG")) {
				protein.add("W");

			}
			else if (codons[i].equals("GUU") || codons[i].equals("GUC") || codons[i].equals("GUA") || codons[i].equals("GUG")) {
				protein.add("V");

			} 
			else if (codons[i].equals("GCU") || codons[i].equals("GCC") || codons[i].equals("GCA")|| codons[i].equals("GCG")) {
				protein.add("A");

			} 
			else if (codons[i].equals("GGG") || codons[i].equals("GGA") || codons[i].equals("GGC")|| codons[i].equals("GGU")) {
				protein.add("G");
			}
			else if (codons[i].equals("CCU") || codons[i].equals("CCC") || codons[i].equals("CCA")|| codons[i].equals("CCG")) {
				protein.add("P");

			} 
			else if (codons[i].equals("CAU") || codons[i].equals("CAC")) {
				protein.add("H");

			} 
			else if (codons[i].equals("CAA") || codons[i].equals("CAG")) {
				protein.add("Q");

			} 
			else if (codons[i].equals("CGU") || codons[i].equals("CGC") || codons[i].equals("CGA")|| codons[i].equals("CGG")) {
				protein.add("R");

			} 
			else if (codons[i].equals("ACU") || codons[i].equals("ACC") || codons[i].equals("ACA")|| codons[i].equals("ACG")) {
				protein.add("T");

			} 
			else if (codons[i].equals("AUU") || codons[i].equals("AUC") || codons[i].equals("AUA")) {
				protein.add("I");

			}
			else if (codons[i].equals("AUG")) {
				protein.add("M");

			} 
			else if (codons[i].equals("AAU") || codons[i].equals("AAC")) {
				protein.add("N");

			} 
			else if (codons[i].equals("AAA") || codons[i].equals("AAG")) {
				protein.add("K");

			} 
			else if (codons[i].equals("AGU") || codons[i].equals("AGC")) {
				protein.add("S");

			} 
			else if (codons[i].equals("AGA") || codons[i].equals("AGG")) {
				protein.add("R");

			} 
			else if (codons[i].equals("GAU") || codons[i].equals("GAC")) {
				protein.add("D");

			} 
			else if (codons[i].equals("GAA") || codons[i].equals("GAG")) {
				protein.add("E");

			}
			
		}
		
		return protein;
		
		
	}
}
