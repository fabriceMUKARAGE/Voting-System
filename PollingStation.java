import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Bethel
 *
 */
public class PollingStation {
	private String StationName;
	public ArrayList<String> InfoArray = new ArrayList<String>();

	/**
	 * @return the stationName
	 */
	public String getStationName() {
		return StationName;
	}

	/**
	 * @param stationName the stationName to set
	 */
	public void setStationName(String stationName) {
		StationName = stationName;
	}

	/**
	 * @param stationName
	 */
	public PollingStation() {
	}
	
	public ArrayList<String> getInfoArray() {
		return InfoArray;
	}
	public void setInfoArray(ArrayList<String> polls) {
		InfoArray = polls;
	}

	@Override
	public int hashCode() {
		return Objects.hash(StationName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof PollingStation))
			return false;
		PollingStation other = (PollingStation) obj;
		return Objects.equals(StationName, other.StationName);
	}
//we're specifying 2 regions, so region 1 has 2 districts and so does region 2, and within those two districts 
//within each district, there are 2 polling stations
	
public static void main(String[]args) {
		PollingStation data= new PollingStation();
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your FullName,Age,VoterId,Polling Station number,Prefered Partyname,district,Region");
		String VoteInfo= input.next();
		ArrayList<String> FullInfo= new ArrayList<String>();
	    FullInfo.add(VoteInfo);
	    data.setInfoArray(FullInfo);
	    System.out.println(data.InfoArray);
	    
//we're specifying 2 regions, so region 1 has 2 districts and so does region 2, and within those two districts 
//within each district, there are 2 polling stations
	  		    
System.out.println("The first 2 polling stations are in district 1 ");
	ArrayList<String> Poll1NDC = new ArrayList<String>();
	ArrayList<String> Poll2NDC = new ArrayList<String>();
	ArrayList<String> Poll3NDC = new ArrayList<String>();
	ArrayList<String> Poll4NDC = new ArrayList<String>();
	ArrayList<String> Poll5NDC = new ArrayList<String>();
	ArrayList<String> Poll6NDC= new ArrayList<String>();
	ArrayList<String> Poll7NDC= new ArrayList<String>();
	ArrayList<String> Poll8NDC= new ArrayList<String>();
for(int i=0; i < data.InfoArray.size(); i++ ) {
	boolean check= data.InfoArray.get(i).contains("Poll1NDC");
	if(check== true) {
	Poll1NDC.add(data.InfoArray.get(i));
		}
	}
for(int j=0; j < data.InfoArray.size(); j++ ) {
	boolean check2= data.InfoArray.get(j).contains("Poll2NDC");
	if(check2== true) {
	Poll2NDC.add(data.InfoArray.get(j));
		}
	}
for(int k=0; k < data.InfoArray.size(); k++ ) {
	boolean check3= data.InfoArray.get(k).contains("Poll3NDC");
	if(check3== true) {
	Poll3NDC.add(data.InfoArray.get(k));
		}
	}
for(int l=0; l < data.InfoArray.size(); l++ ) {
	boolean check4= data.InfoArray.get(l).contains("Poll4NDC");
	if(check4== true) {
	Poll4NDC.add(data.InfoArray.get(l));
		}
	}
for(int m=0; m < data.InfoArray.size(); m++ ) {
	boolean check5= data.InfoArray.get(m).contains("Poll5NDC");
	if(check5== true) {
	Poll5NDC.add(data.InfoArray.get(m));
		}
	}
for(int n=0; n < data.InfoArray.size(); n++ ) {
	boolean check6= data.InfoArray.get(n).contains("Poll6NDC");
	if(check6== true) {
	Poll6NDC.add(data.InfoArray.get(n));
		}
	}
for(int o=0; o < data.InfoArray.size(); o++ ) {
	boolean check7= data.InfoArray.get(o).contains("Poll7NDC");
	if(check7== true) {
	Poll7NDC.add(data.InfoArray.get(o));
		}
	}
for(int p=0; p < data.InfoArray.size(); p++ ) {
	boolean check8= data.InfoArray.get(p).contains("Poll8NDC");
	if(check8== true) {
	Poll8NDC.add(data.InfoArray.get(p));
		}
	}
	

System.out.println(Poll1NDC);
System.out.println(Poll2NDC);
System.out.println(Poll3NDC);
System.out.println(Poll4NDC);
System.out.println(Poll5NDC);
System.out.println(Poll6NDC);
System.out.println(Poll7NDC);
System.out.println(Poll8NDC);

System.out.println("The first 2 polling stations are in district 1 ");
ArrayList<String> Poll1NPP = new ArrayList<String>();
ArrayList<String> Poll2NPP = new ArrayList<String>();
ArrayList<String> Poll3NPP = new ArrayList<String>();
ArrayList<String> Poll4NPP = new ArrayList<String>();
ArrayList<String> Poll5NPP = new ArrayList<String>();
ArrayList<String> Poll6NPP= new ArrayList<String>();
ArrayList<String> Poll7NPP= new ArrayList<String>();
ArrayList<String> Poll8NPP= new ArrayList<String>();
for(int i=0; i < data.InfoArray.size(); i++ ) {
boolean check= data.InfoArray.get(i).contains("Poll1NPP");
if(check== true) {
Poll1NPP.add(data.InfoArray.get(i));
	}
}
for(int j=0; j < data.InfoArray.size(); j++ ) {
boolean check2= data.InfoArray.get(j).contains("Poll2NPP");
if(check2== true) {
Poll2NPP.add(data.InfoArray.get(j));
	}
}
for(int k=0; k < data.InfoArray.size(); k++ ) {
boolean check3= data.InfoArray.get(k).contains("Poll3NPP");
if(check3== true) {
Poll3NPP.add(data.InfoArray.get(k));
	}
}
for(int l=0; l < data.InfoArray.size(); l++ ) {
boolean check4= data.InfoArray.get(l).contains("Poll4NPP");
if(check4== true) {
Poll4NPP.add(data.InfoArray.get(l));
	}
}
for(int m=0; m < data.InfoArray.size(); m++ ) {
boolean check5= data.InfoArray.get(m).contains("Poll5NPP");
if(check5== true) {
Poll5NPP.add(data.InfoArray.get(m));
	}
}
for(int n=0; n < data.InfoArray.size(); n++ ) {
boolean check6= data.InfoArray.get(n).contains("Poll6NPP");
if(check6== true) {
Poll6NPP.add(data.InfoArray.get(n));
	}
}
for(int o=0; o < data.InfoArray.size(); o++ ) {
boolean check7= data.InfoArray.get(o).contains("Poll7NPP");
if(check7== true) {
Poll7NPP.add(data.InfoArray.get(o));
	}
}
for(int p=0; p < data.InfoArray.size(); p++ ) {
boolean check8= data.InfoArray.get(p).contains("Poll8NPP");
if(check8== true) {
Poll8NPP.add(data.InfoArray.get(p));
	}
}
System.out.println(Poll1NPP);
System.out.println(Poll2NPP);
System.out.println(Poll3NPP);
System.out.println(Poll4NPP);
System.out.println(Poll5NPP);
System.out.println(Poll6NPP);
System.out.println(Poll7NPP);
System.out.println(Poll8NPP);

}
}




		


