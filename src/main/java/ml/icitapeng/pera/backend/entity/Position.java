package ml.icitapeng.pera.backend.entity;

import java.util.Date;

public class Position {

	private Long id;
	
	private Date startDate;
	
	private String effectivePositionName;
	
	private String job;
	
	private Organization organization;
	
	private boolean employmentStatus;
	
	private Date proposedEndDate;
	
	private Date effectiveDate;
	
	private Grade proposedGrade;
	
	private Double proposedBasePay;
	
	public Position() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getEffectivePositionName() {
		return effectivePositionName;
	}

	public void setEffectivePositionName(String effectivePositionName) {
		this.effectivePositionName = effectivePositionName;
	}

	public Organization getOrganization() {
		return organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	public boolean isEmploymentStatus() {
		return employmentStatus;
	}

	public void setEmploymentStatus(boolean employmentStatus) {
		this.employmentStatus = employmentStatus;
	}

	public Date getProposedEndDate() {
		return proposedEndDate;
	}

	public void setProposedEndDate(Date proposedEndDate) {
		this.proposedEndDate = proposedEndDate;
	}

	public Date getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public Grade getProposedGrade() {
		return proposedGrade;
	}

	public void setProposedGrade(Grade proposedGrade) {
		this.proposedGrade = proposedGrade;
	}

	public Double getProposedBasePay() {
		return proposedBasePay;
	}

	public void setProposedBasePay(Double proposedBasePay) {
		this.proposedBasePay = proposedBasePay;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}
	
	
}
