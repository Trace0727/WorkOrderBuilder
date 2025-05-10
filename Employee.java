
public class Employee extends Person implements Printable {
	private String employeeId;
	private String clockedIn;
	private String hiredDate;

	
	/**
	 * Sets employeeId, clockedIn, and hiredDate for an employee
	 * 
	 * @param firstName
	 * @param lastName
	 * @param address
	 * @param phoneNumber
	 * @param email
	 * @param employeeId
	 * @param clockedIn
	 * @param hiredDate
	 */
	public Employee(String firstName, String lastName, String address, String phoneNumber, String email, String employeeId, String clockedIn, String hiredDate) {
		super(firstName, lastName, address, phoneNumber, email);
		setEmployeeId(employeeId);
		setClockedIn(clockedIn);
		setHiredDate(hiredDate);
	} // end Constructor


	/**
	 * Gets the format for an Employee to send to the WorkOrder
	 * 
	 * @return employeeId, firstName, lastName, address, phoneNumber, email, clockedIn, hiredDate
	 */
	public String getFileData() {
		return employeeId + "," + super.getFirstName() + "," + super.getLastName() + "," + clockedIn + "," + hiredDate;
	} // end getFileData


	/**
	 * @return employeeID
	 */
	public String getEmployeeId() {
		return employeeId;
	} // end getEmployeeID


	/**
	 * @param employeeID the employeeId to set
	 */
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	} // end setEmployeeId


	/**
	 * @return clockedIn
	 */
	public String getClockedIn() {
		return clockedIn;
	} // end getClockedIn


	/**
	 * @param clockedIn the clockedIn to set
	 */
	public void setClockedIn(String clockedIn) {
		this.clockedIn = clockedIn;
	} // end setClockedIn


	/**
	 * @return hiredDate
	 */
	public String getHiredDate() {
		return hiredDate;
	} // end getHiredDate


	/**
	 * @param hiredDate the hiredDate to set
	 */
	public void setHiredDate(String hiredDate) {
		this.hiredDate = hiredDate;
	} // end setHiredDate
} // end Employee