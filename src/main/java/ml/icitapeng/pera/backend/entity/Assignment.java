package ml.icitapeng.pera.backend.entity;

public class Assignment {
	
	private Long id;
	
	private Agent agent;
	
	private String function; //post
	
	private Organization organization; //unit
	
	private String effectiveDate;
	
	private String serviceWeapon;
	
	private String serviceCertification; //etat signaletique

	private String note;
	
	private Position position;
	
	private PaymentDetails paymentDetails;
	
	public Assignment() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFunction() {
		return function;
	}

	public void setFunction(String function) {
		this.function = function;
	}

	public Organization getOrganization() {
		return organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	public String getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public String getServiceWeapon() {
		return serviceWeapon;
	}

	public void setServiceWeapon(String serviceWeapon) {
		this.serviceWeapon = serviceWeapon;
	}

	public String getServiceCertification() {
		return serviceCertification;
	}

	public void setServiceCertification(String serviceCertification) {
		this.serviceCertification = serviceCertification;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public Agent getAgent() {
		return agent;
	}

	public void setAgent(Agent agent) {
		this.agent = agent;
	}

	public PaymentDetails getPaymentDetails() {
		return paymentDetails;
	}

	public void setPaymentDetails(PaymentDetails paymentDetails) {
		this.paymentDetails = paymentDetails;
	}
	
	
	
}
