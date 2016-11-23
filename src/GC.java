
import java.util.ArrayList;
import java.util.Scanner;

public class GC {
	
	 public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		//System.out.println("Num data: ");
		
		int numData = 1;
		
		String[] name = new String[numData];
		
		String[] raw = new String[numData];
		
		double[] data = new double[numData];
		
		for (int i = 0; i < numData; i++){
			
			System.out.println("Name" + i + ": ");
			
			name[i] = input.nextLine();
			
			System.out.println("\r");
			
		}
		
		for (int i = 0; i < numData; i++){
			
			System.out.println("Data" + i + ": ");
		
			raw[i] = input.nextLine();
			
			System.out.println("\r");
			
		}
		
		for(int i = 0; i < numData; i++){
			
			data[i] = calcPer(raw[i]);
			
		}
		
		
		int index = determine(data);
			
		System.out.println(name[index] + " " + data[index]);
		
		
	}
	 
	public static int findLength(String str){
		
		int i = 0;
		while(str.substring(i, i+1).equals(" ")){
			i++;
		}
		
		int counter = 0;
		while(!str.substring(i,i+1).equals(" ")){
			
			i++;
			
			counter++;
			
		}
		
		return counter;
		
	}
	public static double calcPer(String DNA){
		
		int counter = 0;
		
		for (int i = 0; i < DNA.length(); i ++){
			
			if (DNA.substring(i,  i+1).equals("G") || DNA.substring(i,  i+1).equals("C")){
				
				counter++;
				
			}
			
		}
		
		System.out.println("LENGTH: " + DNA.length());
		System.out.println("Count: " + counter);
		
		double percent = ((double)counter)/((double)DNA.length());
		
		return percent;
		
	}
	
	public static int determine(double[] data){
		
		double max = 0;
		int maxI = 0;
		
		for (int i = 0; i < data.length; i++){
			
			if (data[i] > max){
				
				max = data[i];
				
				maxI = i;
				
			}
			
		}
		
		return maxI;
		
	}
	
	

}
