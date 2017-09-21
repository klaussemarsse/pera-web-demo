package ml.icitapeng.pera.backend.entity;

import java.util.Date;

public class Grade {
	
	private Long id;
	
	private Agent agent;
	
	private String corps;
	
	private Date corpsDate;
	
	private String grade;
	
	private Date gradeDate;
	
	private String echelon;
	
	private Date echelonDate;	

	private Integer index;
	
	private String ratings; //Notations
	
	public Grade() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Agent getAgent() {
		return agent;
	}

	public void setAgent(Agent agent) {
		this.agent = agent;
	}

	public String getCorps() {
		return corps;
	}

	public void setCorps(String corps) {
		this.corps = corps;
	}

	public Date getCorpsDate() {
		return corpsDate;
	}

	public void setCorpsDate(Date corpsDate) {
		this.corpsDate = corpsDate;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public Date getGradeDate() {
		return gradeDate;
	}

	public void setGradeDate(Date gradeDate) {
		this.gradeDate = gradeDate;
	}

	public String getEchelon() {
		return echelon;
	}

	public void setEchelon(String echelon) {
		this.echelon = echelon;
	}

	public Date getEchelonDate() {
		return echelonDate;
	}

	public void setEchelonDate(Date echelonDate) {
		this.echelonDate = echelonDate;
	}

	public Integer getIndex() {
		return index;
	}

	public void setIndex(Integer index) {
		this.index = index;
	}

	public String getRatings() {
		return ratings;
	}

	public void setRatings(String ratings) {
		this.ratings = ratings;
	}
	
	
}
