
public class Jet {
	private String model;
	private float speed;
	private float range;
	private int capacity;
	private Pilot pilot;
	private float price;

	public Jet(String model, float speed, float range, float price, Pilot pilot) {
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
		this.pilot = pilot;
	}

	private float convertToMach(float speedInMPH) {
		int machSpeed;
		machSpeed = (int) (speedInMPH / 767.3);
		return machSpeed;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public float getSpeed() {
		return speed;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public Pilot getPilot() {
		return pilot;
	}

	public void setPilot(Pilot pilot) {
		this.pilot = pilot;
	}

	public float getRange() {
		return range;
	}

	public void setRange(float range) {
		this.range = range;
	}

	@Override
	public String toString() {
		return "Model: \t" + model +"\nSpeed: " +"\t"+ convertToMach(speed) +"\nRange: " + range+"\nPrice: "+price
				+"\nPilot: "+pilot.getName()+"\nAge: "+pilot.getAge()+"\nExperience: "+pilot.getExperience();
	}

}
