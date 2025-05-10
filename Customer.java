
public class Customer extends Person implements Printable{
	private String customerId;
	private String accountNumber;

	
	/**
	 * Sets customerId and accountNumber for the Customer
	 * 
	 * @param firstName
	 * @param lastName
	 * @param address
	 * @param phoneNumber
	 * @param email
	 * @param customerId
	 * @param accountNumber
	 */
	public Customer(String firstName, String lastName, String address, String phoneNumber, String email, String customerId, String accountNumber) {
		super(firstName, lastName, address, phoneNumber, email);
		setCustomerId(customerId);
		setAccountNumber(accountNumber);
	} // end Constructor

	
	/**
	 * Gets the format for a Customer to send to the WorkOrder
	 * 
	 * @return firstName, lastName, address, phoneNumber, email, customerId, accountNumber
	 */
	public String getFileData()
	{
		// customerId, firstName, lastName, ticketId, ticketCreatedAt, workOrderCreatedAt
				return getFirstName() + "," + getLastName() + "," + getAddress() + "," + /*ticket.getCreatedAt()*/"Ticket CreatedAt" + "," + /*ticket.getTicketId()*/"TicketID"
						+ "," + /*WorkOrder.getCreatedAt()*/ "WorkOrder CreatedAt";
	} // end getFileData


	/**
	 * @return customerId
	 */
	public String getCustomerId() {
		return customerId;
	} // end getCustomerId


	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	} // end setCustomerId


	/**
	 * @return accountNumber
	 */
	public String getAccountNumber() {
		return accountNumber;
	} // end getAccountNumber


	/**
	 * @param accountNumber the accountNumber to set
	 */
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	} // end setAccountNumber
} // end Customer
