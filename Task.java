/**
 * this class implements interfaces Comparable and Priority
 * to create the Task object
 * @author Fanni
 * @version 1.0
 * CS131
 * Project 2
 */
public class Task implements Comparable<Task>,Priority
{
	//declaring enumerated variable type Status
	enum Status
	{	
		NOT_STARTED,
		IN_PROCESS,
		COMPLETE
	}//end Status
		
	private Status st;//this variable stores the status
	private String name;//this variable stores the name
	private int priority;//this variable stores the priority
	
	/*
	 * constructor with preferred name argument
	 * @param name of Task
	 */
	public Task(String name)
	{
		this.name = name;
	}//end Task

	/*
	 * @return name of Task
	 */
	public String getName() {
		return name;
	}//end getName

	/*
	 * @param preferred name of Task
	 */
	public void setName(String name) {
		this.name = name;
	}//end setName

	/*
	 * @return priority of Task
	 */
	public int getPriority() {
		return priority;
	}//end getPriority

	/*
	 * @param preferred priority of Task
	 */
	public void setPriority(int priority) {
		this.priority = priority;
	}//end setPriority
	
	/*
	 * @return status of Task
	 */
	public Status getStatus()
	{
		return st;
	}//end getStatus
	
	/*
	 * @param preferred status of Task
	 */
	public void setStatus(Status st)
	{
		this.st = st;
	}//end setStatus
	
	/*
	 * compares the priorities of two Tasks
	 * @param Task to compare
	 * @return 0 if same priority, 1 if different
	 */
	public int compareTo(Task t)
	{
		if(priority == t.priority)
			return 0;
		else
			return 1;
	}//end compareTo

	@Override
	public String toString() {
		return "Task [st=" + st + ", name=" + name + ", priority=" + priority + "]";
	}//end toString
	
}//end class
