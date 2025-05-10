public class Person implements Printable{
	private String firstName;
	private String lastName;
	private String address;
	private String phoneNumber;
	private String email;

	/**
	 * Sets the first name, last name, address, phone number, and email for a Person
	 * 
	 * @param firstName
	 * @param lastName
	 * @param address
	 * @param phoneNumber
	 * @param email
	 */
	public Person(String firstName, String lastName, String address, String phoneNumber, String email)  {
		setFirstName(firstName);
		setLastName(lastName);
		setAddress(address);
		setPhoneNumber(phoneNumber);
		setEmail(email);
	} // end Person

	
	/**
	 * Gets the file data for a Person
	 * 
	 * @return firstName, lastName, address, phoneNumber, email
	 */
	public String getFileData()
	{
		return firstName + "," + lastName + "," + address + "," + phoneNumber + "," + email;
	} // end getFileData


	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	} // end getFirstName


	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	} // end setFirstName


	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	} // end getLastName


	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	} // end setLastName


	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	} // end getAddress


	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	} // end setAddress


	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	} // end getPhoneNumber


	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	} // end setPhoneNumber


	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	} // end getEmail


	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	} // end setEmail
} // end Person