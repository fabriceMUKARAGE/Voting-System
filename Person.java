/**
 * 
 */

/**
 * @author Bethel
 *
 */
public class Person {
	/**
	 *Data Members
	 **/
	private int Age;
    private String FullName;
    private String gender;
    private String Nationality;
    /**
   	 * Default Constructor
   	 */
       public Person(){
           
       }
	/**
	 * @param age
	 * @param fullName
	 * @param gender
	 * @param nationality
	 */
	public Person(int age, String fullName, String gender, String nationality) {
		Age = age;
		FullName = fullName;
		this.gender = gender;
		Nationality = nationality;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return Age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		Age = age;
	}
	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return FullName;
	}
	/**
	 * @param fullName the fullName to set
	 */
	public void setFullName(String fullName) {
		FullName = fullName;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the nationality
	 */
	public String getNationality() {
		return Nationality;
	}
	/**
	 * @param nationality the nationality to set
	 */
	public void setNationality(String nationality) {
		Nationality = nationality;
	}
       
}
