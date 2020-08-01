import java.util.Scanner;

public class FortuneTellerDemo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your first name?");
		String firstName = input.nextLine();
		
		System.out.println("What is your last name?");
		String lastName = input.nextLine();
		
		System.out.println("What is your favorite ROYGBIV color?" + "(Type Help for info on ROYGBIV)");
	    String roygbivColor = input.nextLine();
		    
		String modeOfTransportation = "";
		if(roygbivColor.toLowerCase().equals("red")) {
		    modeOfTransportation = "Lamborghini";
		}else if(roygbivColor.toLowerCase().equals("orange")) {
		    modeOfTransportation = "Bicycle";
		}else if(roygbivColor.toLowerCase().equals("yellow")) {
		    modeOfTransportation = "Train";
		}else if(roygbivColor.toLowerCase().equals("green")) {
		    modeOfTransportation = "Motorcycle";
		}else if(roygbivColor.toLowerCase().equals("blue")) {
		    modeOfTransportation = "Private Jet";
		}else if(roygbivColor.toLowerCase().equals("indigo")) {
		    modeOfTransportation = "Bus";
		}else if(roygbivColor.toLowerCase().equals("violet")) {
		    modeOfTransportation = "Uber";
		}while(roygbivColor.toLowerCase().equals("help")) {
		    System.out.println("The ROYGBIV colors are red, orange, yellow, green, blue, indigo, violet.");
		    System.out.println("What is your favorite ROYGBIV color?" + "(Type Help for info on ROYGBIV)");
		    roygbivColor = input.nextLine();
		    modeOfTransportation = "";
		    if(roygbivColor.toLowerCase().equals("red")) {
		    	modeOfTransportation = "Lamborghini";
		    }else if(roygbivColor.toLowerCase().equals("orange")) {
		    	modeOfTransportation = "Bicycle";
		    }else if(roygbivColor.toLowerCase().equals("yellow")) {
		    	modeOfTransportation = "Train";
		    }else if(roygbivColor.toLowerCase().equals("green")) {
		    	modeOfTransportation = "Motorcycle";
		    }else if(roygbivColor.toLowerCase().equals("blue")) {
		    	modeOfTransportation = "Private Jet";
		    }else if(roygbivColor.toLowerCase().equals("indigo")) {
		    	modeOfTransportation = "Bus";
		    }else if(roygbivColor.toLowerCase().equals("violet")) {
		    	 modeOfTransportation = "Uber";
		    }
		}
	
		System.out.println("How old are you?");
		int yourAge = input.nextInt();
		    
		int retirementYears = 0;
		if(yourAge % 2==0) {
		    retirementYears = 10;
		}else {
		    retirementYears = 15;
		}
		
		System.out.println("How many siblings do you have?");
		int numberOfSiblings = input.nextInt();
		    
		String vacationHomeLocation = "";
		if(numberOfSiblings <= 3) {
		    vacationHomeLocation = "Kissimmee, Florida";
		}else if(numberOfSiblings == 4) {
		    vacationHomeLocation = "Whittier North, Carolina";
		}else if(numberOfSiblings == 5) {
		    vacationHomeLocation = "Killington, Vermont";
		}else if(numberOfSiblings >= 6) {
		    vacationHomeLocation = "Sevierville, Tennessee";
		}
		    
		System.out.println("What is your birth month?"+ "(Use the number)");
		int birthMonth = input.nextInt();
		    
		int bankBalance = 0;
		if(birthMonth == 1) {
		    bankBalance = (int) 500000;
		}else if(birthMonth == 2) {
		    bankBalance = (int) 750000;
		}else if(birthMonth == 3) {
		    bankBalance = (int) 1000;
		}else if(birthMonth == 4) {
		    bankBalance = (int) 8;
		}else if(birthMonth == 5) {
		    bankBalance = (int) 20;
		}else if(birthMonth == 6) {
		    bankBalance = (int) 100;
		}else if(birthMonth == 7) {
		    bankBalance = (int) 40;
		}else if(birthMonth == 8) {
		    bankBalance = (int) 5000000;
		}else if(birthMonth == 9) {
		    bankBalance = (int) 250000;
		}else if(birthMonth == 10) {
		    bankBalance = (int) 75;
		}else if(birthMonth == 11) {
		    bankBalance = (int) 1000000.;
		}else if(birthMonth == 12) {
		    bankBalance = (int) 123;
		}else {
		    bankBalance = 0;
		}
		
		System.out.print(firstName + " " + lastName);
		System.out.print(" will retire in " +retirementYears +" years");
		System.out.print(" with " +bankBalance + " dollars in the bank,");
		System.out.print("a vacation home in " +vacationHomeLocation +",");
		System.out.print("and travel by " +modeOfTransportation +".");
		input.close();
	}
}