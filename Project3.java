import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Queue;

public class Project3 {
	public static String employeeFileName;
	public static String tier1TicketFileName;
	public static String tier2TicketFileName;
	public static String workOrderFileName;
	public static ArrayList<Employee> employeeList;
	public static Queue<Ticket> tier1TicketFile;
	public static Queue<Ticket> tier2TicketFile;
	public static ArrayList<WorkOrder> workOrderList;

	
	/**
	 * Displays title, sets tier1 and tier2 ticket file names, writes to console, and calls proper methods when needed.
	 *  
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Project 3 Work Order Generator");
		System.out.println();
		tier1TicketFileName = "tier1_ticket_data.csv";
		tier2TicketFileName = "tier2_ticket_data.csv";

		System.out.println("Loading Employee Data");
		employeeList = new ArrayList<Employee>();
		FileHandler.readEmployeeData(employeeFileName);

		System.out.println("Loading Ticket Data");
		tier1TicketFile = FileHandler.readTicketData(tier1TicketFileName);
		tier2TicketFile = FileHandler.readTicketData(tier2TicketFileName);

		System.out.println("Creating Work Orders");
		createWorkOrders();

		System.out.println("Writing Work Order Data to File");
		FileHandler.writeData(workOrderFileName);
		System.out.println("Work Orders Created. Program Exiting.");
	} // end main


	/**
	 * Creates new workOrderList, while there are still ticket files, assign each employee
	 * to the correct tier ticket, removing them as completed and adding them to the workOrderList.
	 * Once all the employees get a ticket, reset the employees.
	 * 
	 */
	public static void createWorkOrders() {
		workOrderList = new ArrayList<WorkOrder>();
		int totalQueueSize = tier1TicketFile.size() + tier2TicketFile.size();
		int i = 0;
		int j = 0;

		while (i < totalQueueSize) 
		{
			if (employeeList.get(j) instanceof Tier2Employee && tier2TicketFile.size() != 0)
			{
				WorkOrder workOrder = new WorkOrder(employeeList.get(j), tier2TicketFile.remove(), LocalTime.now().toString());
				workOrderList.add(workOrder);
			} // end if
			else if (employeeList.get(j) instanceof Employee && tier1TicketFile.size() != 0)
			{
				WorkOrder workOrder = new WorkOrder(employeeList.get(j), tier1TicketFile.remove(), LocalTime.now().toString());
				workOrderList.add(workOrder);
			} // end else if
			i++;
			j++;
			if (j == employeeList.size())
			{
				j = 0;
			} // end if
		} // end while
	} // end createWorkOrders
} // end Project3