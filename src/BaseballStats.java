import java.util.*;
public class BaseballStats {

	public static void main(String[] args) {
		//title of app
		System.out.println("Welcome to Batting Average Calcultor!" + "\n");
		
		//open scanner
		Scanner input = new Scanner (System.in);
		//keepgoing
		String keepGoing = "y";
		
		while (keepGoing.equalsIgnoreCase("y")){
		//get number of times at bat from user
		System.out.println("Enter number of times at bat: ");
		int timesAtBat = input.nextInt();
		input.nextLine();

		//present info on point system
		System.out.println("0-out, 1=single. 2=double, 3=triple, 4=home run");
		//array 
		int [] tsArray = new int [timesAtBat];
		
		//for loop to put at bat results in array
		for (int i =0; i < timesAtBat; i++){
			System.out.print("Result for at-bat "+ i + ":");
			tsArray [i]= input.nextInt();
			input.nextLine();
		}//for loop to put user in array
		int sumBat= 0;
		int counter=0;
		//for to add batting points
		for (int j= 0; j < timesAtBat; j++){
			sumBat+=tsArray[j];
			if (tsArray[j]!=0){
				counter++;
			}//end if for add to counter
		}
		//make varibles doubles
		double a= (double)counter;
		double b= (double)timesAtBat;
		double c= (double)sumBat;
		//find batting average
		double battingAVG = a/b;
		System.out.println("Batting Average: " + battingAVG);
		
		//find slugging
		double sluggingPerc = c/b;
		System.out.println("Slugging Percentage: " + sluggingPerc);	
		System.out.println("Continue y/n?: ");
		keepGoing = input.nextLine();
		}//end while to keep going
	}//main

}//public class
