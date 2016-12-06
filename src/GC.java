
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class GC {
	
	public static double[] percents; // same indexes as data sets 
	public static String[] dataSets;
	public static int[] segmentPoint;
	public static int numData = 5;
	
	 public static void main(String[] args) throws FileNotFoundException{
		 
		 String textData = new Scanner(new File("rosalind.txt")).useDelimiter("\\A").next();
		 
		 String[] data = new String[textData.length()];
		 
		 for (int i = 0; i < data.length; i++){
			 
			 data[i] = textData.substring(i, i+1);
			 
		 }
		 
		 segmentPoint = new int[numData+ 1];
		 
		 dataSets = new String[numData];
		 
		 separate(data, textData, ">");
		 
		 percents = new double[dataSets.length]; //parallel data structure
		 
		 for (int i = 0; i < dataSets.length; i++){
			 
			 percents[i] = calculate(dataSets[i]);
			 
		 }
		 
		 System.out.println(dataSets[determine(percents)].substring(1, 14)); 
		 System.out.println("Index: " + determine(percents));
		 System.out.println("Percent: " + percents[determine(percents)]);
	
	
	 }
	 
	 public static void separate(String[] str,String orig, String tar){ //fills dataSets array with separated data
		 
		 int count = 0;
		 for (int i = 0; i < str.length; i++){
			 
			 if (str[i].equals(tar)){
				 
				 segmentPoint[count] = i;
				 
				 count++;
				 
			 } 
		 }
		 
		 for (int i = 0; i <= count - 2; i++){
			 
			 dataSets[i] = orig.substring(segmentPoint[i], segmentPoint[i+1]); 
			 
		 }
	 }
	 
	 
	 public static double calculate(String str){
		 
		 int count = 0;
		 int total = 0;
		 for (int i = 14; i < str.length(); i++){
			 if (str.substring(i, i+1).equals("C") || str.substring(i, i+1).equals("G")){
				 
				 count++;
				 
				 total++;
			 }
			 else if (str.substring(i, i+1).equals("T") || str.substring(i, i+1).equals("A")){
				 
				 total ++;
				 
			 }
		 }
		 
		 double percent = (double)(count)/((double)(total)) * 100.00;
		 
		 return percent;
		 
	 }
	 
	 public static int determine(double[] percents){ // returns index of highest percent
		 
		 int index = 0;
		 double maxV = 0.0;
		 for (int i = 0; i < percents.length; i++){
			 
			 if (percents[i] > maxV){
				 
				 maxV = percents[i];
				 
				 index = i;
				 
			 }
			 
		 }
		 
		 return index;
		 
	 }
	 
	 
	 
}
