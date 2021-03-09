/**
 * 
 */

/**
 * @author Bethel
 *
 */
public class Candidate extends Person{
/**
*Data Members
**/
private String PartyName;
private String Npp="Nana Akuffo Addo";




/**
 * @return the partyName
 */
public String getPartyName() {
	return PartyName;
}
/**
 * @param partyName the partyName to set
 */
public void setPartyName(String partyName) {
	PartyName = partyName;
}
/**
* Default Constructor
*/
public Candidate(){
	super();
}
/**
 * @param age
 * @param fullName
 * @param gender
 * @param nationality
 */
public Candidate(int age, String fullName, String gender, String nationality) {
	super(age, fullName, gender, nationality);
}



	
	

}
