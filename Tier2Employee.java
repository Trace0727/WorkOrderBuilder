public class Tier2Employee extends Employee implements Printable {
	private String certification;


	/**
	 * Sets the ceritication for a Tier2Employee
	 * 
	 * @param firstName
	 * @param lastName
	 * @param address
	 * @param phoneNumber
	 * @param email
	 * @param employeeId
	 * @param clockedIn
	 * @param hiredDate
	 * @param certification
	 */
	public Tier2Employee(String firstName, String lastName, String address, String phoneNumber, String email, String employeeId, String clockedIn, String hiredDate, String certification) {
		super(firstName, lastName, address, phoneNumber, email, employeeId, clockedIn, hiredDate);
		setCertification(certification);
	} // end Constructor

	
	/**
	 * Gets the file data for a Tier2Employee
	 * 
	 * @return employeeId, firstName, lastName, address, phoneNumber, email, clockedIn, hiredDate, certification
	 */
	public String getFileData()
	{
		return super.getEmployeeId() + "," + super.getFirstName() + "," + super.getLastName() + "," + super.getClockedIn() + "," + super.getHiredDate() + "," + certification;
	} // end getFileData


	/**
	 * @return the certification
	 */
	public String getCertification() {
		return certification;
	} // end getCertification


	/**
	 * @param certification the certification to set
	 */
	public void setCertification(String certification) {
		this.certification = certification;
	} // end setCertification
} // end Tier2Employee