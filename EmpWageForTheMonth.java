package empWage;

public class EmpWageForTheMonth {
	
	public static int IS_PRESENT = 1;
	public static int IS_PART_TIME = 2;
	public static int WAGE_PER_HOUR = 20;
	public static int FULL_TIME_HOUR = 8;
	public static int PART_TIME_HOUR = 4;
	public static int empWage = 0;
	public static int count = 0;
	public static int WAGEPERMONTH = 0;
	 
	public void empWageMonth()
	
	{
		count = (int) (Math.floor(Math.random() * 10) % 3);
		System.out.println("Total Emp Wage Per Month at the begining is :" +WAGEPERMONTH);
		for (count = 1; count <= 20; count++) {
			System.out.println("incremental total wage per month" +WAGEPERMONTH);
			int empCheck = (int) (Math.floor(Math.random() * 10 ) % 3);
			System.out.println("empCheck=> " +empCheck);
			if (empCheck == IS_PRESENT) {
				System.out.println("Employee is Present");
				empWage = WAGE_PER_HOUR * FULL_TIME_HOUR;
				
			} else if (empCheck == IS_PART_TIME) {
				System.out.println("Employee is partime");
				empWage = WAGE_PER_HOUR * PART_TIME_HOUR ;
				
			} else {
				System.out.println("Employee is absent");
				empWage = 0;
				
			}
			
			System.out.println("Employee Wage  = " +empWage);
			WAGEPERMONTH = WAGEPERMONTH + empWage;
			
		}
		System.out.println("Total emp wage per month is :" +WAGEPERMONTH);
	}
	

	public static void main(String[] args) {
     EmpWageForTheMonth b = new EmpWageForTheMonth();
     b.empWageMonth();
	}

}
