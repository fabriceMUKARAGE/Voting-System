# Voting-System
Ashesi ICP project

// super class called pulling station
abstract class PullingStation{
	private String stationname;
	
	//Constructor of Person
	public Voter(String name) {
		this.stationname=stationname;
	}

	//getter methods			
	public String getStationname() {
		return stationname;
	}

	public void setStationname(String stationname) {
		this.stationname=stationname;
	}
	public CollacteVotes(){
	
	}

	CategorizeVotes(){
	
	}

class Voter extend PullingStation{
	private String name;
	private long id;
	private String gender;
	private int age;
	
	//Constructor of Person
	public Voter(String name, long id, String gender, int age) {
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.id=id;
	}

	//getter methods			
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	public int getgender() {
		return gender;
	}
	public int getid() {
		return id;
	}
	
	//setter methods
	public void setName(String name) {
		this.name=name;
	}
		
	public void setAge(int age) {
		this.age=age;
	}
	public void setGender(int gender) {
		this.gender=gender;
	}
	public void setId(int id) {
		this.id=id;
	}

	// tostring() method which returns the message needed to be displayed
	public String toString() {
        	return "Name: " + getName()+", The Age: "+getAge()+", ID: "+getId()+", gender: "+getGender();
    }	
