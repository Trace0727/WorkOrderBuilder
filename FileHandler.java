import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.Scanner;

public class FileHandler {
	
	
	/**
	 * Writes work orders to new workOrder_data.csv file with a new header, getting the file data from 
	 * the customer, employee, and tickets. Logger logs work orders to log file.
	 * 
	 * @param workOrderFileName
	 */
	public static void writeData(String workOrderFileName)
	{
		workOrderFileName = "workOrder_data.csv";

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(workOrderFileName))) {
			logger("Writing Work Order Data to File");
			bw.write("customer_id,customer_first_name,customer_last_name,ticket_id,ticket_createdAt,workorder_createdAt,employee_id,employee_first_name,employee_last_name,clocked_in,certification\n");

			for (WorkOrder workOrder : Project3.workOrderList) {
				bw.write(workOrder.getFileData() + "\n");
				logger(workOrder.getFileData());
			} // end for
			logger("Work Orders Created. Program Exiting");
		} catch(Exception e) {
			System.out.println("Cannot write to File");
		} // end try/catch
	} // end writeData

	
	/**
	 * Reads the employee file, splitting the lines by commas and assigning them to their own values. Using the 
	 * tier value, this method splits the tier1 and tier2 employees into their respective lists.
	 * 
	 * @param employeeFileName
	 */
	public static void readEmployeeData(String employeeFileName)
	{
		employeeFileName = "employee_data.csv";
		try (BufferedReader br = new BufferedReader(new FileReader(employeeFileName))) {			
			String line;
			line = br.readLine();
			@SuppressWarnings("unused")
			String[] headers = line.split(",");
			while ((line = br.readLine()) != null) {
				String[] values = line.split(",");

				String employeeID = values[0];
				String firstName = values[1];
				String lastName = values[2];
				String email = values[3];
				String address = values[4];
				String phoneNumber = values[5]; 
				String clockedIn = values[6];
				String hiredDate = values[7];
				String tier = values[8];
				String certification = values[9];

				Employee employee;
				if (tier.equalsIgnoreCase("tier1")) {
					employee = new Employee(firstName, lastName, address, phoneNumber, email, employeeID, clockedIn, hiredDate);
				} else {
					employee = new Tier2Employee(firstName, lastName, address, phoneNumber, email, employeeID, clockedIn, hiredDate, certification);
				}
				Project3.employeeList.add(employee);
			}
			logger("Loading Employee Data");
			br.close();
		} catch (IOException e) {
			System.out.println("File cannot be found");
		}
	} // end readEmployeeData


	/**
	 * Creates a new LinkedList to store tickets, creating customer and tickets, and assigning the tickets to the ticketList
	 * and returning it to main for the work orders.
	 * 
	 * @param ticketFileName
	 * @return
	 */
	public static LinkedList<Ticket> readTicketData(String ticketFileName)
	{
		LinkedList<Ticket> ticketList = new LinkedList<Ticket>();
		String[] line;

		try {
			FileInputStream fileStream = new FileInputStream(ticketFileName);
			Scanner fileScanner = new Scanner(fileStream);
			fileScanner.nextLine();
			while (fileScanner.hasNextLine()) {
				line = fileScanner.nextLine().split(",");
				Customer customer = new Customer(line[0], line[1], line[2], line[3], line[4], line[5], line[6]);
				Ticket ticket = new Ticket(customer, line[7], line[8]);
				ticketList.add(ticket);
			} // end while
			fileScanner.close();
			fileStream.close();
			logger("Loading Ticket Data");
		} catch (IOException e) {
			System.out.println("File cannot be found");
		} // end try/catch	
		return ticketList;
	} // end LinkedList

	
	/**
	 * Formats date when log is written to with proper format and makes values append to the log file.
	 * 
	 * @param log
	 * @param employeeList
	 * @param tier1Tickets
	 * @param tier2Tickets
	 */
	static void logger(String log) {
		Format f = new SimpleDateFormat("mm/dd/yyyy hh:mm:ss");
		String str = f.format(new Date());
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("logger.txt", true))) {
			bw.append("Log: " + str + " : " + log + "\n");
			bw.close();
		} catch(Exception e) {
			System.out.println("Cannot write to File");
		} // end try/catch
	} // end logger
} // end class