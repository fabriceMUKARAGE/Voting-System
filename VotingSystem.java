import java.util.Scanner;

// super class called pulling station

//abstract 
abstract class PullingStation{
	private String stationname;
	
	//Constructor of pulling station
	public PullingStation(String stationname) {
		this.stationname=stationname;
	}

	//getter methods			
	public String getStationname() {
		return stationname;
	}

	public void setStationname(String stationname) {
		this.stationname=stationname;
	}
	public void CollacteVotes(){
	
	}

	public abstract void CategorizeVotes();
}  


//voter class 
class Voter extends Candidate{
	private String name;
	private long id;
	private String gender;
	private int age;
	
	//Constructor of Person
	Voter(String name, long id, String gender, int age) {
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

	public void CastVote(){
	
	}
	
	public void VerifyRegistration(){
	
	}
	
	public void ViewCandidates(){
		HashMap<String, Integer> candidates = new HashMap<String, Integer>();
		candidates.put(super.getCandidatename(),super.getCandidatenumber());
	}
}

//interface
interface NationalElectoralHeadquarters{
	public void CollectVotes();
	public void FinalCount();
}

// candidate class
 public class Candidate{
	 private String candidatename;
	 private int candidatenumber;
	 private String politicalparty;
	 public Candidate(String candidatename, int candidatenumber, String politicalparty) {
			this.candidatename=candidatename;
			this.candidatenumber=candidatenumber;
			this.politicalparty=politicalparty;
		}
		
		//getter methods			
		public String getCandidatename() {
			return getCandidatename;
		}

		public int getgetCandidatenumber() {
			return getCandidatename;
		}
		public int getPoliticalparty() {
			return politicalparty;
		}
		
		//setter methods
		public void setPoliticalparty(String politicalparty) {
			this.politicalparty=politicalparty;
		}
			
		public void setAge(int candidatenumber) {
			this.candidatenumber=candidatenumber;
		}
		public void setCandidatename(String candidatename) {
			this.candidatename=candidatename;	 
 		}
		public String toString() {
        	return "Candidate name: " + getCandidatename()+", Candidate number: "+getCandidatenumber()+", Political Party: "+getPoliticalparty();
    		}	
	 
}

//Regional electoraloffice class
public class RegionalElectoralOffice{
	
}


//District Electoral office
public class DistrictElectoralOffice extends PullingStation{
	
}


public class VotingSystem {
	public static void main(String[] arg) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number of candidate: ");
	int number=input.nextInt(); 
	for(int i=0;i<number;i++){
		System.out.println("Enter the name of candidate: ");
		int name=input.nextLine(); 
		System.out.println("Enter the number of candidate: ");
		int num=input.nextInt(); 
		System.out.println("Enter the politcal party: ");
		int party=input.nextLine(); 
	
		
	}
}

