import java.time.LocalDate;

public class HourlyEmployee extends Employee {
	private double payRate;
	private double hoursWorking;
	
	//CONSTRUCTOR
	
	public HourlyEmployee(String firstName, String lastName, String email, LocalDate startDate, String phoneNumber, double payRate, double hoursWorking) {
		super(firstName, lastName, email, startDate,  phoneNumber);
		setPayRate(payRate);
		setHoursWorking(hoursWorking);
	}
	
	
	
	//GETTER
	
	/*
	 * @return payRate
	 */
	public double getPayRate() {
		return payRate;
	}
	/*
	 * @return hoursWorking
	 */
	public double getHoursWorking() {
		return hoursWorking;
	}
	
	// SETTER
	
	/*
	 * @param payRate
	 */
	public void setPayRate(double payRate) {
		if (payRate >= 0) {
			this.payRate = payRate;
		}
	}
	/*
	 * @param hoursWorking
	 */
	public void setHoursWorking(double hoursWorking) {
		if (hoursWorking >= 0 && 40 >= hoursWorking) {
			this.hoursWorking = hoursWorking;
		}
	}
	
	@Override
	public double calculateIncome() {
		return payRate * hoursWorking;
	}

	@Override
	public String toString() {
		return "\n*** Salary Info ***" + 
				super.toString() +
				"\nPay rate is $ " + payRate  + " and working hours is " + hoursWorking +
				" so your income is $ " + calculateIncome();
	}
}
