/**
 * this interface sets required methods for classes Process and Task
 * @author Fanni
 * @version 1.0
 * CS 131
 * Project 2
 */
public interface Priority
{
	final int MED_PRIORITY = 5;//variable stores medium priority
	final int MIN_PRIORITY = 1;//variable stores minimum priority
	final int MAX_PRIORITY = 10;//variable stores maximum priority
	
	//setters and getters for priority variable
	
	public void setPriority(int num);
	
	public int getPriority();
}//end interface
