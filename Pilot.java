
public class Pilot {
@Override
	public String toString() {
		return "Pilot: " + name + "\nAge: \t" + age + "\nExperience: " + experience+"\n";
	}

private String name;
private int age;
private int experience;

public Pilot(String name, int age, int experience) {
	this.name=name;
	this.age=age;
	this.experience=experience;
}


public Pilot hirePilot() {
	
	return null;
	
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public int getExperience() {
	return experience;
}

public void setExperience(int experience) {
	this.experience = experience;
}

}
