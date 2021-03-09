import java.util.Scanner;
import java.util.ArrayList;

/**
 * @author Bethel
 *
 */
public class Voter extends Person{
/**
*Data Members
**/
private int VoterId;


/**
 * @return the voterId
 */
public int getVoterId() {
	return VoterId;
}
/**
 * @param voterId the voterId to set
 */
public void setVoterId(int voterId) {
	VoterId = voterId;
}
/**
 * Default Constructor
 */
public Voter() {
    super();
}
/**
 * @param age
 * @param fullName
 * @param gender
 * @param nationality
 */
public Voter(int age, String fullName, String gender, String nationality) {
	super(age, fullName, gender, nationality);
	
}


}










	



	    


