import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

// Driver classes exist to orcehstrate the program, so you should move any hardcoded,
//  things into this class and drive the class instances from here
public class JetsDriver {
	private static List<Pilot> PILOTS = new ArrayList<>(
			// List.of returns unmodifable list so create a modifable array list and pass
			// the list allow add/remove.
			List.of(
					new Pilot("Rosie", 35, 10),
					new Pilot("Sam", 43, 5),
					new Pilot("Susan", 41, 8),
					new Pilot("Carl", 39, 7),
					new Pilot("Jimmy", 45, 10),
					new Pilot("Lana", 45, 10)));

	private static List<Jet> JETS = new ArrayList<>(
			List.of(new Jet("GulfStream", 2500, 2550, 2500000, PILOTS.get(0)),
					new Jet("Citation", 3500, 1687, 1050000, PILOTS.get(1)),
					new Jet("BlackBird", 4550, 2234, 2200000, PILOTS.get(2)),
					new Jet("Eagle", 3878, 1777, 175000, PILOTS.get(3)),
					new Jet("Foxhound", 2550, 1500, 150000, PILOTS.get(4))));

	public static void main(String[] args) {
		Barracks barrack = new Barracks(PILOTS);
		Hanger hanger = new Hanger(JETS);

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

	public static Pilot assignRandomPilot(List<Pilot> pilotArrayList) {
		Random rand = new Random();
		int randomPilotIndex = rand.nextInt(pilotArrayList.size());
		Pilot randomPilotAssigned = pilotArrayList.get(randomPilotIndex);
		return randomPilotAssigned;
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
		Jet userNewJet = hanger.addJet(name, assignRandomPilot(PILOTS), speed, range, price);

		return userNewJet;

	}

	public static void getHiredPilot(Scanner scanner, Barracks barrack) {
		System.out.println(">>>Available Pilots for Hire<<<");
		int number = 1;

		for (Pilot pilot : PILOTS) {
			System.out.print(number++);
			System.out.println("." + pilot.getName());
		}
		System.out.println(number + ". Return home");

		int userSelectedPilotNumber = scanner.nextInt();

		System.out.print(PILOTS.get(userSelectedPilotNumber - 1).getName());
		System.out.println(" is hired and on deck.");
	}

}
