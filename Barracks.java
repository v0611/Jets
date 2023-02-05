import java.util.ArrayList;
import java.util.Scanner;

//  test change

public class Barracks {

	 private ArrayList<Pilot> pilotArrayList = new ArrayList<>();

	Barracks() {
		pilotArrayList.add(new Pilot("Rosie", 35, 10));
		pilotArrayList.add(new Pilot("Sam", 43, 5));
		pilotArrayList.add(new Pilot("Susan", 41, 8));
		pilotArrayList.add(new Pilot("Carl", 39, 7));
		pilotArrayList.add(new Pilot("Jimmy", 45, 10));
		pilotArrayList.add(new Pilot("Lana", 45, 10));



	}

	public ArrayList<Pilot> getPilotArrayList() {
		return pilotArrayList;
	}

	public void setPilotArrayList(ArrayList<Pilot> pilotArrayList) {
		this.pilotArrayList = pilotArrayList;
	}

	
	
	
}
