import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Hanger {
	ArrayList<Jet> jetArrayList = new ArrayList<>();
	private ArrayList<Pilot> pilotList;
	
	public Hanger(ArrayList<Pilot> pilotArrayList ) {
		this.pilotList=pilotArrayList;
		
		jetArrayList.add(new Jet("GulfStream", 2500, 2550, 2500000, pilotArrayList.get(0)));
		jetArrayList.add(new Jet("Citation", 3500, 1687, 1050000, pilotArrayList.get(1)));
		jetArrayList.add(new Jet("BlackBird", 4550, 2234, 2200000, pilotArrayList.get(2)));
		jetArrayList.add(new Jet("Eagle", 3878, 1777, 175000, pilotArrayList.get(3)));
		jetArrayList.add(new Jet("Foxhound", 2550, 1500, 150000, pilotArrayList.get(4)));

	}

	
	public ArrayList<Pilot> getPilotList() {
		return pilotList;
	}


	public void setPilotList(ArrayList<Pilot> pilotList) {
		this.pilotList = pilotList;
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
		Jet longestRangeJet=null;
		for (Jet jet: jetArrayList) {
			if (longestRangeJet==null || jet.getRange()>longestRangeJet.getRange()) {
				longestRangeJet=jet;
			}
		}
		System.out.println("Longest Range Jet \n " + longestRangeJet);
		System.out.println("-----------------");

	}
	
	public Pilot assignRandomPilot(ArrayList<Pilot> pilotArrayList ) {
		Random rand = new Random();
		int randomPilotIndex=rand.nextInt(pilotArrayList.size());
		Pilot randomPilotAssigned=pilotArrayList.get(randomPilotIndex);
		return randomPilotAssigned;
		
	}
	
	public Jet addJet(String name, float speed, float range, float price) {
		Pilot pilotForNewJet=assignRandomPilot(pilotList);
		Jet newJet= new Jet(name,speed,range,price,pilotForNewJet); 
		System.out.print(newJet.getModel());
		System.out.print(" Jet is added\n");
		jetArrayList.add(newJet); 
		return newJet;
		
		
	}
	
}
