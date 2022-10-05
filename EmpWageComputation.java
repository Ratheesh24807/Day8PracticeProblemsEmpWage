package empWage;

public class EmpWageComputation {
	public final static int IS_PRESENT = 1;
	public static int WAGE_PER_HOUR = 20;
	public static int FULL_DAY_HOUR = 8;
	
	public static int EmpDailyWage() {
		
		if ((int) Math.floor(Math.random() * 10) % 2 == IS_PRESENT) {
			System.out.println("Employee is Present");
			System.out.println("Employee Daily Wage Is : " +(WAGE_PER_HOUR * FULL_DAY_HOUR));
			return IS_PRESENT;
			
		}else {
			System.out.println("Employee is absent :");
			System.out.println("Emp Daily Wage is 0");
			return 0;
			
			
		}
	}
	
	public static void main(String[] args) {
		EmpDailyWage();
		
		
	}

	
}
