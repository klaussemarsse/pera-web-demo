package ml.icitapeng.pera.backend.entity;

public class PaymentDetails {
	
	// pay
	
	private Long id;
	
	private String paymentMethod;
	
	private String grossEarningsIndex;
	
	private String familyAllowanceAmount;
	
	private String premiumsAndAllowances;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getGrossEarningsIndex() {
		return grossEarningsIndex;
	}

	public void setGrossEarningsIndex(String grossEarningsIndex) {
		this.grossEarningsIndex = grossEarningsIndex;
	}

	public String getFamilyAllowanceAmount() {
		return familyAllowanceAmount;
	}

	public void setFamilyAllowanceAmount(String familyAllowanceAmount) {
		this.familyAllowanceAmount = familyAllowanceAmount;
	}

	public String getPremiumsAndAllowances() {
		return premiumsAndAllowances;
	}

	public void setPremiumsAndAllowances(String premiumsAndAllowances) {
		this.premiumsAndAllowances = premiumsAndAllowances;
	}
	
	
	
}
