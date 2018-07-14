package pl.zaworov.learningApp.application;

import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.regex.Pattern;

import pl.zaworov.learningApp.domain.River;

public class Interface {

    static Scanner sc = new Scanner(System.in);
    
    static RiverDAO riverDao = new RiverDAO();

    public static void main(String[] args) {
    	String userChoice;
    	do {
    		System.out.println();
    		System.out.println("Choose whatever you want to do and press enter:");
	    	System.out.println("[1] Add new river");
	    	System.out.println("[2] Show all rivers");
	    	System.out.println("[x] Terminate");
			userChoice = getUserInput();
	    	if (userChoice.equals("1")) {
	    		addRiver();
	    	} else if (userChoice.equals("2")) {
	    		showRivers();
	    	}
    	} while (!userChoice.equalsIgnoreCase("x"));
        
    }

	private static void showRivers() {
		System.out.println();
		System.out.println("#########################################################");
		System.out.println("######               LIST OF RIVERS                ######");
		System.out.println("#########################################################");
		
		River river;
		for (int i=0; i < riverDao.getListOfRivers().size(); i++) {
			river = riverDao.getListOfRivers().get(i);
			System.out.println(i + ": " + river.getRiverName());
		}
		System.out.println();
		Pattern numberPattern = Pattern.compile("\\d*");
		String givenNumber;
		do {
			System.out.print("Which river you'd like to know better?");
			givenNumber = getUserInput();
		} while (!numberPattern.matcher(givenNumber).matches());
		
		Integer riverNumber = Integer.parseInt(givenNumber);
		if (riverDao.getListOfRivers().size() > riverNumber) {
			River chosenRiver = riverDao.getListOfRivers().get(riverNumber);
			System.out.println("Chosen river is named "+chosenRiver.getRiverName()+", its length is "+chosenRiver.getRiverLength()+", it's situated in" + chosenRiver.getRiverLocation().toString());
		} else {
			System.out.println("Unfortunately there's no river of such number. Please try again.");
		}
	}

	private static void addRiver() {
		System.out.println();
		System.out.println("#########################################################");
		System.out.println("######                 ADD  RIVER                  ######");
		System.out.println("#########################################################");
		River river = new River();
		System.out.print("Typer river's name.");
        river.setRiverName(getUserInput());

        Pattern lengthPattern = Pattern.compile("\\d*");
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd");
        String riverLength;
        do {
            System.out.print("Type river length in kilometers.");
            riverLength = getUserInput();
            if (lengthPattern.matcher(riverLength).matches()) {
            	river.setRiverLength(Integer.valueOf(riverLength));
            } else {
            	System.out.println("Provide length in numeric format.");
            }
        } while (river.getRiverLength() == 0);
        
        Pattern locationPattern = Pattern.compile("[a-zA-Z]*");
        String givenLocation;
        do {
            System.out.print("Type river's location.");
            givenLocation = getUserInput();
            if (locationPattern.matcher(givenLocation).matches()) {
                river.setRiverLocation(givenLocation);
            } else {
            	System.out.println("Location should contain letters.");
            }
        } while (river.getRiverLocation() == null);

        riverDao.addRiver(river);
        
        System.out.println("Thank you for adding new river!");
	}

    public static String getUserInput() {
        return sc.nextLine().trim();
    }
}
