import java.util.ArrayList;
import java.util.List;

// Classes in general should be relatively dumb data containers.
// So, remove any setup or configuration from the class. 
public class Barracks {
	// Try to use interfaces instead of implementations.
	private List<Pilot> pilotArrayList = new ArrayList<>();

	// This is fine for this assignment, but hard coded data you typically wan't
	// extract this out into a driver or entrance to the program
	// CHANGE: pass a list of Pilots to the barracks on object creation;
	public Barracks(List<Pilot> pilotArrayList) {
		this.pilotArrayList = pilotArrayList;
	}

	public List<Pilot> getPilotArrayList() {
		return pilotArrayList;
	}

	public void setPilotArrayList(List<Pilot> pilotArrayList) {
		this.pilotArrayList = pilotArrayList;
	}
}
