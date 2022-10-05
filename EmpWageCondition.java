package empWage;

public class EmpWageCondition {
	
	public final static int IS_FULL_TIME = 1;
	public final static int IS_PART_TIME = 2;
	public static int WAGE_PER_HOUR = 20;
	public static int NO_OF_WORKING_DAYS = 20;
	public static int MAX_HOURS_IN_MONTH = 100;
	
	public void empWageBuilder()
	
	{
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
		
		while(totalEmpHrs <= MAX_HOURS_IN_MONTH && totalWorkingDays <= NO_OF_WORKING_DAYS)
			
		{
			totalWorkingDays++;
			
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			
			switch (empCheck)
			{
			case IS_PART_TIME:
				empHrs = 4;
				break;
				
			case IS_FULL_TIME:
				empHrs = 8;
				break;
				
				default:
					empHrs = 0;
					
				
			}
			totalEmpHrs+= empHrs;
			System.out.println("Day: " +totalWorkingDays+ "Emp Hrs:" +empHrs);
		}
		int totalEmpWage = totalEmpHrs *WAGE_PER_HOUR;
		System.out.println("Total Emp Wage : "+totalEmpWage);
	}
	  
	

	public static void main(String[] args) {

		EmpWageCondition r = new EmpWageCondition ();
		r.empWageBuilder();
	}

}
