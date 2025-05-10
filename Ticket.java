
public class Ticket implements Printable {
	private Customer customer;
	private String createdAt;
	private String ticketId;


	/**
	 * Sets customer, createdAt, and ticketId for the Ticket
	 * 
	 * @param customer
	 * @param createdAt
	 * @param ticketId
	 */
	public Ticket(Customer customer, String createdAt, String ticketId)
	{
		setCustomer(customer);
		setCreatedAt(createdAt);
		setTicketId(ticketId);
	} // end Constructor


	/**
	 * Gets the file data for a Ticket to send to WorkOrder
	 * 
	 * @return customer, createdAt, ticketId
	 */
	public String getFileData()
	{
		return customer + "," + createdAt + "," + ticketId;
	} // end getFileData


	/**
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	} // end getCustomer


	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	} // end setCustomer


	/**
	 * @return the createdAt
	 */
	public String getCreatedAt() {
		return createdAt;
	} // end getCreatedAt


	/**
	 * @param createdAt the createdAt to set
	 */
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	} // end setCreatedAt


	/**
	 * @return the ticketId
	 */
	public String getTicketId() {
		return ticketId;
	} // end getTicketId


	/**
	 * @param ticketId the ticketId to set
	 */
	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
	} // end setTicketId
} // end Ticket
