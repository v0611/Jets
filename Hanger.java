import java.util.ArrayList;
import java.util.List;

public class Hanger {
	// Try to use interfaces instead of implementations for references.
	// use private, unless you have a reason to use something else.
	private List<Jet> jetArrayList = new ArrayList<>();

	// This is fine for this assignment, but hard coded data you typically wan't
	// extract this out into a driver or entrance to the program
	// CHANGE: pass a list of Jets to the barracks on object creation;
	// CHANGE: Remove pilot reference and let the driver control this.
	public Hanger(List<Jet> jets) {
		this.jetArrayList = jets;
	}

	public void printFleetofJets() {
		System.out.println("===Fleet of available Jets===");
		for (Jet jet : jetArrayList) {
			System.out.println(jet);
			System.out.println("==================");
		}
	}

	public void printFastestJet() {
		Jet fastestJet = null;
		for (Jet jet : jetArrayList) {
			if (fastestJet == null || jet.getSpeed() > fastestJet.getSpeed()) {
				fastestJet = jet;
			}
		}
		System.out.println("Fastest Jet \n" + fastestJet);
		System.out.println("-----------------");

	}

	public void printLongestRangeJet() {
		Jet longestRangeJet = null;
		for (Jet jet : jetArrayList) {
			if (longestRangeJet == null || jet.getRange() > longestRangeJet.getRange()) {
				longestRangeJet = jet;
			}
		}
		System.out.println("Longest Range Jet \n " + longestRangeJet);
		System.out.println("-----------------");
	}

	public Jet addJet(String name, Pilot pilot, float speed, float range, float price) {
		Jet newJet = new Jet(name, speed, range, price, pilot);
		System.out.print(newJet.getModel());
		System.out.print(" Jet is added\n");
		jetArrayList.add(newJet);
		return newJet;
	}
}
