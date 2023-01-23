import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JetsDriver {
	public static void main(String[] args) {
		Barracks barrack = new Barracks();
		Hanger hanger = new Hanger(barrack.getPilotArrayList());
		Scanner scanner = new Scanner(System.in);


		boolean keepPlaying = true;
		while (keepPlaying) {
			int userSelection = printOptions(scanner);


			switch (userSelection) {
			case 1:
				hanger.printFleetofJets();
				break;
			case 2:
				hanger.printFastestJet();
				break;
			case 3:
				hanger.printLongestRangeJet();
				break;
			case 4:
				userNewJet(scanner, hanger);
				
				break;
			case 5:
				getHiredPilot(scanner, barrack);
				break;
			case 6:
				System.out.println("Exited Game");
				System.exit(0);
			}
		}
		scanner.close();


	}

	public static int printOptions(Scanner scanner) {

		System.out.println("===Welcome to Jets. Select Options Below===");
		System.out.println("1. View Fleet");
		System.out.println("2. View Fastest Jet");
		System.out.println("3. View Jet with Longest Range");
		System.out.println("4. Add Jet to the Fleet");
		System.out.println("5. Hire a pilot");
		System.out.println("6. Quit");
		System.out.println();

		int userSelection = scanner.nextInt();
		return userSelection;
	}

	public static Jet userNewJet(Scanner scanner, Hanger hanger) {

		System.out.println("Enter Model of the Jet: ");
		String name = scanner.next();
		System.out.println("Enter Speed of the Jet: ");
		float speed = scanner.nextFloat();
		System.out.println("Enter Range of the Jet: ");
		float range = scanner.nextFloat();
		System.out.println("Enter the price of the Jet: ");
		float price = scanner.nextFloat();
		Jet userNewJet = hanger.addJet(name, speed, range, price);

		return userNewJet;

	}

	public static  void getHiredPilot(Scanner scanner, Barracks barrack) {
		System.out.println(">>>Available Pilots for Hire<<<");
		int number = 1;
		ArrayList<Pilot> pilotList=barrack.getPilotArrayList();
		
		for (Pilot pilot : pilotList) {
			System.out.print(number++);
			System.out.println("." + pilot.getName());
		}
		System.out.println(number+". Return home");
		
		int userSelectedPilotNumber = scanner.nextInt();
		
		System.out.print(pilotList.get(userSelectedPilotNumber-1).getName());
		System.out.println(" is hired and on deck.");

		
	}

	
}
