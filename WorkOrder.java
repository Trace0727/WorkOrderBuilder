import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class WorkOrder implements Printable{
	private Employee employee;
	private Ticket ticket;
	private String createdAt;


	/**
	 * Writes work order data to the file and sends it to the logger
	 * 
	 * @param employee
	 * @param ticket
	 * @param createdAt
	 */
	public WorkOrder(Employee employee, Ticket ticket, String createdAt)
	{
		setCreatedAt(createdAt);
		setTicket(ticket);
		setEmployee(employee);
	} // end WorkOrder


	/**
	 * Gets the file data from customer, createdAt, and employee to send to create a WorkOrder file.
	 * 
	 * @return getFileData
	 */
	public String getFileData()
	{
		return /*customer.getFileData()*/"Customer File Data" + "\n" + createdAt + "," + employee.getFileData();
	} // end getFileData


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
		Format f = new SimpleDateFormat("hh:mm:ss");
		createdAt = f.format(new Date());
		this.createdAt = createdAt;
	} // end setCreatedAt


	/**
	 * @return the ticket
	 */
	public Ticket getTicket() {
		return ticket;
	} // end getTicket


	/**
	 * @param ticket the ticket to set
	 */
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	} // end setTicket


	/**
	 * @return the employee
	 */
	public Employee getEmployee() {
		return employee;
	} // end getEmployee


	/**
	 * @param employee the employee to set
	 */
	public void setEmployee(Employee employee) {
		this.employee = employee;
	} // end setEmployee
} // end WorkOrder
