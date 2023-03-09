/**
 * this class tests classes Process and Task and their methods
 * @author Fanni
 * @version 1.0
 * CS131
 * Project 2
 */
public class ApplicationPriority
{
	//main method
	public static void main(String[] args)
	{
		//creating 4 new Process objects and setting some variables
		Process p1 = new Process("name1");
		p1.setPriority(2);
		p1.setProcessID("new name");
		Process p2 = new Process("name2");
		p2.setPriority(2);
		Process p3 = new Process("name3");
		p3.setPriority(3);
		Process p4 = new Process("name4");
		p4.setPriority(1);
		
		//testing the toString method
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
	
		//testing getters
		System.out.println("p1 process ID: " + p1.getProcessID());
		System.out.println("p1 priority: " + p1.getPriority());
		
		//testing the compareTo method
		if(p1.compareTo(p2) == 0)
			System.out.println("p1 and p2 are of equal priority.");
		else 
			System.out.println("p1 and p2 are of different priority.");	
		
		if(p1.compareTo(p3) == 0)
			System.out.println("p1 and p3 are of equal priority.");
		else
			System.out.println("p1 and p3 are of different priority.");
		
		if(p1.compareTo(p4) == 0)
			System.out.println("p1 and p4 are of equal priority.");
		else
			System.out.println("p1 and p4 are of different priority.");
		
		System.out.print("\n-----------------------------------\n");
		
		//creating 3 new Task objects and setting some variables
		Task t1 = new Task("name1");
		Task t2 = new Task("name2");
		Task t3 = new Task("name3");
		t1.setName("new name");
		t1.setPriority(2);
		t1.setStatus(Task.Status.COMPLETE);
		
		t2.setPriority(2);
		t3.setPriority(4);
		
		//testing toString method
		System.out.println(t1.toString());
		System.out.println(t2.toString());
		System.out.println(t3.toString());
	
		//testing getters
		System.out.println("t1 name: " + t1.getName());
		System.out.println("t1 priority: " + t1.getPriority());
		System.out.println("t1 status: " + t1.getStatus());
		
		//testing the compareTo method
		if(t1.compareTo(t2) == 0)
			System.out.println("t1 and t2 are of equal priority.");
		else 
			System.out.println("t1 and t2 are of different priority.");	
				
		if(t1.compareTo(t3) == 0)
			System.out.println("t1 and t3 are of equal priority.");
		else
			System.out.println("t1 and t3 are of different priority.");
		
		
	}//end main
}//end class
