package ml.icitapeng.pera.backend.entity;

import java.util.Date;
import java.util.List;

public class Agent {
	
	private String matricule;
	
	private String bcs;
	
	private Person person;
	
	private Grade grade;
	
	private Date incorporationDate;
	
	private Date retirementDate;
	
	private Integer numberOfPeacekeepingMissions;
	
	private Double disabilityRate;
	
	private List<String> disciplinarySanctions;
	
	private List<String> rewards;
	
	private List<Assignment> assignments;
	
	public Agent() {

	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public String getBcs() {
		return bcs;
	}

	public void setBcs(String bcs) {
		this.bcs = bcs;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	public Date getIncorporationDate() {
		return incorporationDate;
	}

	public void setIncorporationDate(Date incorporationDate) {
		this.incorporationDate = incorporationDate;
	}

	public Date getRetirementDate() {
		return retirementDate;
	}

	public void setRetirementDate(Date retirementDate) {
		this.retirementDate = retirementDate;
	}

	public List<String> getDisciplinarySanctions() {
		return disciplinarySanctions;
	}

	public void setDisciplinarySanctions(List<String> disciplinarySanctions) {
		this.disciplinarySanctions = disciplinarySanctions;
	}

	public Integer getNumberOfPeacekeepingMissions() {
		return numberOfPeacekeepingMissions;
	}

	public void setNumberOfPeacekeepingMissions(Integer numberOfPeacekeepingMissions) {
		this.numberOfPeacekeepingMissions = numberOfPeacekeepingMissions;
	}

	public Double getDisabilityRate() {
		return disabilityRate;
	}

	public void setDisabilityRate(Double disabilityRate) {
		this.disabilityRate = disabilityRate;
	}

	public List<String> getRewards() {
		return rewards;
	}

	public void setRewards(List<String> rewards) {
		this.rewards = rewards;
	}

	public List<Assignment> getAssignments() {
		return assignments;
	}

	public void setAssignments(List<Assignment> assignments) {
		this.assignments = assignments;
	}

	public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}
	
	
	
}
