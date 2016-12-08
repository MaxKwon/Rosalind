
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class IPRB {
	
	public static void main(String[] args) throws FileNotFoundException{
		
		String textData = new Scanner(new File("rosalind.txt")).useDelimiter("\\A").next();
		 
		String[] data = new String[textData.length()];
		
		for (int i = 0; i < data.length; i++){
			 
			 data[i] = textData.substring(i, i+1);
			 
		}
		
//		int dom = Integer.parseInt(data[0]);
//		int mid = Integer.parseInt(data[1]);
//		int rec = Integer.parseInt(data[2]);
		
		int dom = 19;
		int mid = 28;
		int rec = 25;
		
		System.out.println(calculate(dom, mid, rec));
		
	}
	
	public static double calculate(int dom, int mid, int rec){
		
		int total = dom + mid + rec;
		
		double[] chancePairs = new double[9];
		double[] chanceBox = new double[9];
		
		chancePairs[0] = ((double)dom/(double)total) * ((double)(dom - 1)/((double)total-1)); //TT x TT
		chancePairs[1] = ((double)dom/(double)total) * ((double)(mid)/((double)total-1)); //TT x Tt
		chancePairs[2] = ((double)dom/(double)total) * ((double)(rec)/ (double)(total-1)); //TT x tt
		chancePairs[3] = ((double)mid/(double)total) * ((double)(mid - 1)/(double)(total-1)); //Tt x Tt
		chancePairs[4] = ((double)mid/(double)total) * ((double)(rec)/(double)(total-1)); //Tt x tt
		chancePairs[5] = ((double)mid/(double)total) * ((double)(dom)/(double)(total-1)); //Tt x TT
		chancePairs[6] = ((double)rec/(double)total) * ((double)(rec - 1)/(double)(total-1)); //tt x tt
		chancePairs[7] = ((double)rec/(double)total) * ((double)(mid)/(double)(total-1)); //tt x Tt
		chancePairs[8] = ((double)rec/(double)total) * ((double)(dom)/(double)(total-1)); //tt x TT
		
		//Chance for getting T in each combination
		chanceBox[0] = 1.0;
		chanceBox[1] = 1.0;
		chanceBox[2] = 1.0;
		chanceBox[3] = .75;
		chanceBox[4] = .50;
		chanceBox[5] = 1.0;
		chanceBox[6] = 0;
		chanceBox[7] = 0.50;
		chanceBox[8] = 1.0;
		
		double chance = 0;
		
		for (int i = 0; i < chancePairs.length; i++){
			
			chance = chance + (chancePairs[i] * chanceBox[i]);
			
		}
				
		return chance;
		
	}
	
	
}
