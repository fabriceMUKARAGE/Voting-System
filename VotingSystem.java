// super class called pulling station

//abstract 
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
	public  CollacteVotes(){
	
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

//Regional electoraloffice class
public class RegionalElectoralOffice{
	
}


//District Electoral office
public class DistrictElectoralOffice extends PullingStation{
	
}


public class VotingSystem {
	public static void main(String[] arg) {
		//creating tree for National electoral headquaters, District electoral offices,Region electoral offices and Polling Stations
		Node treeRootNode = new Node(null);
		Voter voter =new Voter("nameexample", 454444, Male, 24);
		System.out.print("National electoral headquater! ");
		treeRootNode.getNationalheadquatersname();

		// adding RegionElectoral office to root node
		Scanner input = new Scanner(System.in); //scanner to scan the country
		System.out.print("Number of Region Electoral offices in the Nation: ");
		int number= input.nextInt();
		for(int i=1;i<=number;i++){
				Scanner inputt = new Scanner(System.in); //scanning the input
				System.out.print("Enter the names of Region Electoral Office"+" "+i+": ");
				String region= inputt.nextLine(); //entering the Regions	
				Node childNode1= addChild(treeRootNode, region);
			
			// adding District electoral offices to the region nodes created above
			System.out.print("Number of District electoral offices in this Religion: ");
			int count= input.nextInt();
			for(int j=1;j<=count;j++){
					Scanner enter = new Scanner(System.in); //scanning the input
					System.out.print("insert a name of District region office "+j+": ");
					String districtelectoral= enter.nextLine(); //entering the district electoral office
					Node childNode2= addChild(childNode1, districtelectoral);
			
			// adding the Pulling stations to the District electoral offices
				System.out.print("Number of Polling stations in the District electoral offices : ");
				int counting= input.nextInt();		
				for(int k=1;k<=counting;k++){
						Scanner enterr = new Scanner(System.in); //scanning the input
						System.out.print("insert a name of Polling Station "+k+": ");
						String pullingstation= enterr.nextLine();
						Node childNode3= addChild(childNode2, pollingstation);


				}
			}
		}
		
		private static Node addChild(Node parent, String ElectoralHeadquarters) {
			Node node = new Node(parent);
			node.setElectoralHeadquarters(ElectoralHeadquarters);
			parent.getChildren().add(node);
	 
			return node;
	  }
  
	 //The function that does the traversal and prints out the tree
	 private static void printTree(Node node, String results) {
		   System.out.println(results + node.getElectoralHeadquarters());
		   for (Node each : node.getChildren()) {
				printTree(each, results+ results );
		   }
		
	}
}

