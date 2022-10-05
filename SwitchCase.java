package empWage;

public class SwitchCase {
	
	public final static int IS_PRESENT = 1;
	public final static int IS_PART_TIME = 2;
	public static int PART_TIME_HOUR = 4;
	public static int FULL_TIME_HOUR = 8;
	public static int WAGE_PER_HOUR = 20;
	public static int empWage = 0;
	
	
      public void empWageCase()	
      {
    	  int empCheck = (int) (Math.floor(Math.random() * 10) % 3);
    	  System.out.println("empCheck=> "+empCheck);
    	  
    	  switch(empCheck)
    	  {
    	  case 1:
    		  System.out.println("Employee is present");
    		  empWage = WAGE_PER_HOUR * FULL_TIME_HOUR ;
    		  break;
    		  
    	  case 2:
    		  System.out.println("Emplyoee working as a part time");
    		  empWage = WAGE_PER_HOUR * PART_TIME_HOUR;
    		  break;
    		  
    		  default:
    			  System.out.println("Employee is Absent");
    			  empWage = 0;
    			  
    		  
    	  }
    	  System.out.println("Employeewage = "+empWage );
      }
      
	   public static void main(String[] args)
	   {
		   SwitchCase a = new SwitchCase();
		   a.empWageCase();
	   }
}
	
	