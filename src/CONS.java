import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class CONS {
	
	public static Scanner readInput = new Scanner(System.in);
	
	public static int length = 0;

	public static void main(String[] args) throws FileNotFoundException {
		
		String textData = new Scanner(new File("rosalind.txt")).useDelimiter("\\A").next();
		
		System.out.println("Number In: ");
		
		int num = readInput.nextInt();
		
		String[][] mat = separate(num, textData);
		
		int[][] profile = counter(mat);
		
		String[] con = determine(profile);
		
		toString(profile, con);

	}

	public static String[][] separate(int num, String str){
		
		String[][] matrix = new String[num][3000]; // 3000 is an arbitrary value that could hold the length of the DNA strands
		
		int row = 0;
		int col = 0;
		
		for (int i = 0; i < str.length(); i++){
			
			if (str.substring(i, i + 1).equals("A") ||str.substring(i, i + 1).equals("C") ||str.substring(i, i + 1).equals("G") ||str.substring(i, i + 1).equals("T")){
				
				matrix[row][col] = str.substring(i, i + 1);
				
				col++;
				
			}
			
			if (i < str.length() - 1 && str.substring(i + 1, i + 2).equals(">")){
				
				row++;
				
				length = col;
				
				col = 0;
				
			}
			
		}
		
		String[][] matF = new String[num][length];
		
		for (int i = 0; i < num; i++){
			
			for (int j = 0; j < length; j++){
				
				matF[i][j] = matrix[i][j];
				
			}
		}
		
		return matF;
		
	}
	
	public static int[][] counter(String[][] mat){
		
		int[][] ret = new int[4][mat[0].length];
		
		for (int i = 0; i < mat[0].length; i++){
			
			int countA = 0;
			int countC = 0;
			int countG = 0;
			int countT = 0;
			
			
			for(int j = 0; j < mat.length; j++){
				
				if (mat[j][i].equals("A")){
					
					countA++;
					
				}
				else if (mat[j][i].equals("G")){
					
					countG++;
					
				}
				else if (mat[j][i].equals("T")){
					
					countT++;
					
				}
				else if (mat[j][i].equals("C")){
					
					countC++;
					
				}
				
			}
			
			ret[0][i] = countA;
			ret[1][i] = countC;
			ret[2][i] = countG;
			ret[3][i] = countT;
			
		}
		
		return ret;
		
	}
	
	public static String[] determine(int[][] profile ){

		String[] ret = new String[length];
		
		for (int i = 0; i < length; i++){
			
			int max = 0;
			int maxI = 0;
			
			for (int j = 0; j < 4; j++){
				
				if (profile[j][i] > max){
					
					max = profile[j][i];
					
					maxI = j;
					
				}
				
			}
			
			if (maxI == 0){
				
				ret[i] = "A";
				
			}
			else if (maxI == 1){
				
				ret[i] = "C";
				
			}
			else if (maxI == 2){
				
				ret[i] = "G";
				
			}
			else if (maxI == 3){
				
				ret[i] = "T";
				
			}
			
		}
		
		return ret;
		
	}
	
	
	public static void toString(int[][] profile, String[] con){
		
		for (int i = 0; i < con.length; i++){
			
			System.out.print(con[i]);
			
		}
		
		System.out.println("");
		
		for (int i = 0; i < profile.length; i++){
			
			if (i == 0){
				
				System.out.print("A: ");
				
			}
			else if (i == 1){
				
				System.out.print("C: ");
				
			}
			else if (i == 2){
				
				System.out.print("G: ");
				
			}
			else if (i == 3){
				
				System.out.print("T: ");
				
			}
		
			for (int j = 0; j < profile[0].length; j++){
				
				System.out.print(profile[i][j] + " ");
				
				if (j+1 == profile[0].length){
					
					System.out.println("");
					
				}
				
			}
		}
		
	}

	

}
