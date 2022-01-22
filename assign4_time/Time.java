package time;
import java.util.Timer;
import java.util.TimerTask;

public class Time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1
		String shortString = "x";
		String longString = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";

		String tempString = "";
		int numberOfConcatanations = 0;
		long startTime = System.currentTimeMillis(); // fetch starting time
		while ((System.currentTimeMillis() - startTime) < 1000) {
			tempString = tempString + shortString;
			numberOfConcatanations++;
		}
		
		System.out.println("Finall String length using + operator while adding short strings: " + tempString.length()); 
		System.out.println("Total number of concatanations using + operator while adding short strings: " + numberOfConcatanations + "\n\n"); 
		
		//2
		tempString = "";
		numberOfConcatanations = 0;
		startTime = System.currentTimeMillis(); // fetch starting time
		while ((System.currentTimeMillis() - startTime) < 1000) {
			tempString = tempString + longString;
			numberOfConcatanations++;
		}
		
		System.out.println("Finall String length using + operator while adding long strings: " + tempString.length()); 
		System.out.println("Total number of concatanations using + operator while adding long strings: " + numberOfConcatanations + "\n\n"); 
		//3
		long endTimeWithToStringMethod = 0;
		long endTimeWithoutToStringMethod = 0;
		StringBuilder sb = new StringBuilder();
		numberOfConcatanations = 0;
		startTime = System.currentTimeMillis(); // fetch starting time
		while (true) {
			sb.append(shortString);
			numberOfConcatanations++;
			if((System.currentTimeMillis() - startTime) < 970)
				continue; /// it checks if it is below 970 goes to append step
			else
			{
				endTimeWithoutToStringMethod = System.currentTimeMillis() - startTime;
				sb.toString();
				endTimeWithToStringMethod = System.currentTimeMillis() - startTime;
				break;
			}	
		}
		
		System.out.println("Finall String length using StringBuilder while adding short strings: " + sb.length()); 
		System.out.println("Total number of concatanations using StringBuilder while adding short strings: " + numberOfConcatanations);
		System.out.println("Total time in milliSeconds excluding StringBuilder ToString method " + endTimeWithoutToStringMethod); 
		System.out.println("Total time in milliSeconds including StringBuilder ToString method " + endTimeWithToStringMethod + "\n\n"); 
		
		//4
		sb = new StringBuilder();
		numberOfConcatanations = 0;
		startTime = System.currentTimeMillis(); // fetch starting time
		while (true) {
			sb.append(longString);
			numberOfConcatanations++;
			if((System.currentTimeMillis() - startTime) < 770)
				continue;
			else
			{
				endTimeWithoutToStringMethod = System.currentTimeMillis() - startTime;
				sb.toString();
				endTimeWithToStringMethod = System.currentTimeMillis() - startTime;
				break;
			}	
		}
		
		System.out.println("Finall String length using StringBuilder while adding long strings: " + sb.length()); 
		System.out.println("Total number of concatanations using StringBuilder while adding long strings: " + numberOfConcatanations);
		System.out.println("Total time in milliSeconds excluding StringBuilder ToString method " + endTimeWithoutToStringMethod); 
		System.out.println("Total time in milliSeconds including StringBuilder ToString method " + endTimeWithToStringMethod); 
	}

}
