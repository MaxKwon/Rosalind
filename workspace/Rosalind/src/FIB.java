import java.util.Scanner;

public class FIB {


		public static int k, n;
		public static void main(String[] args){
			
			Scanner readInput = new Scanner(System.in);
			
			System.out.println("Enter K: ");
			
			k = readInput.nextInt();
			
			System.out.println("Enter N: ");
			
			n = readInput.nextInt();
			
			System.out.println(calculate());
			
		}
		
		public static long calculate(){
			
			long sub;
			long val = 1;
			long rec = 1;
			for (int i = 0; i < n - 2 ; i++){
				
				sub = val;
				val = val + getKVal(i, rec);
				rec = sub;
			}
			
			return val;
			
		}
		
		public static long getKVal(long i, long rec){ // itteration number = i
			
			long val; 
		
			val = k * rec;
			
			return val;
			
		}
		
		
}
