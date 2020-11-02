import java.time.LocalDate;

public class SalesEmployee extends Employee {
	private double commitionRate;
	private double totalSales;
	
	//CONSTRUCTOR
	
	public SalesEmployee(String firstName, String lastName, String email, LocalDate startDate, String phoneNumber, double commitionRate, double totalSales) {
		super(firstName, lastName, email, startDate, phoneNumber);
		setCommitionRate(commitionRate);
		setTotalSales(totalSales);
	}
	
	
	
	//GETTER
	
	/*
	 * @return commitionRate
	 */
	public double getCommitionRate() {
		return commitionRate;
	}
	/*
	 * @return totalSales
	 */
	public double getTotalSales() {
		return totalSales;
	}
	
	// SETTER
	
	/*
	 * @param commitionRate
	 */
	public void setCommitionRate(double commitionRate) {
		if (commitionRate >= 0) {
			this.commitionRate = commitionRate;
		}
	}
	/*
	 * @param totalSales
	 */
	public void setTotalSales(double totalSales) {
		if (totalSales >= 0) {
			this.totalSales = totalSales;
		}
	}
	
	@Override
	public double calculateIncome() {
		return (commitionRate/100) * totalSales;
	}
	
	@Override
	public String toString() {
		return  "\n*** Salary Info ***" +
				super.toString() +
				"\nCommition Rate is " + commitionRate + " and total sales is " + totalSales +
				" so your income is $ " + calculateIncome();
	}
}
