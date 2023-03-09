/**
 * This class implements interfaces Comparable and Priority
 * to create the Process object
 * @author Fanni
 * @version 1.0
 * CS 131
 * Project 2
 */
public class Process implements Comparable<Process>, Priority
{
	protected String processID;//variable stores process ID
	protected int priority;//variable stores priority
	
	/*
	 * constructor with preferred processID argument
	 * @param process ID of Process
	 */
	public Process(String processID)
	{
		this.processID = processID;
	}//end Process
	
	/*
	 * compares the priorities of two Processes
	 * @param Process to compare
	 * @return 0 if same priority, 1 if different
	 */
	public int compareTo(Process p1)
	{
		if(priority == p1.priority)
			return 0;
		else
			return 1;
	}//end compareTo

	/*
	 * @return process ID of Process
	 */
	public String getProcessID() {
		return processID;
	}//end getProcessID

	/*
	 * @param preferred process ID of Process
	 */
	public void setProcessID(String processID) {
		this.processID = processID;
	}//end setProcessID

	/*
	 * @return priority of Process
	 */
	public int getPriority() {
		return priority;
	}//end getPriority

	/*
	 * @param preferred priority of Process
	 */
	public void setPriority(int priority) {
		this.priority = priority;
	}//end setPriority

	@Override
	public String toString() {
		return "Process [processID=" + processID + ", priority=" + priority + "]";
	}//end toString
	
	
}//end class
