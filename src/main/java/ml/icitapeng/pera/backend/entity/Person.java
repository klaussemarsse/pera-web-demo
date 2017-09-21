package ml.icitapeng.pera.backend.entity;

import java.util.Date;
import java.util.List;

public class Person {
	
	private Long id;
	
	private String nina;
	
	private String amo;
	
	private String name;
	
	private String surname;
	
	private String fatherName;
	
	private String motherName;
	
	private String gender;
	
	private Date dateOfBirth;
	
	private String placeOfBirth;
	
	private String bloodGroup;
	
	private String maritalStatus;
	
	private AddressAndContact addressAndContact;
	
	private String emergencyContact;
	
	private String passportNumber;
	
	private List<String> wivesNames;
	
	private List<String> childsNames;
	
	private Integer totalNumberOfChilds;
	
	private Integer totalNumberOfInvalidChilds;
	
	private PersonResume resume;
	
	public Person() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNina() {
		return nina;
	}

	public void setNina(String nina) {
		this.nina = nina;
	}

	public String getAmo() {
		return amo;
	}

	public void setAmo(String amo) {
		this.amo = amo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPlaceOfBirth() {
		return placeOfBirth;
	}

	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public AddressAndContact getAddressAndContact() {
		return addressAndContact;
	}

	public void setAddressAndContact(AddressAndContact addressAndContact) {
		this.addressAndContact = addressAndContact;
	}

	public String getEmergencyContact() {
		return emergencyContact;
	}

	public void setEmergencyContact(String emergencyContact) {
		this.emergencyContact = emergencyContact;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	public List<String> getWivesNames() {
		return wivesNames;
	}

	public void setWivesNames(List<String> wivesNames) {
		this.wivesNames = wivesNames;
	}

	public List<String> getChildsNames() {
		return childsNames;
	}

	public void setChildsNames(List<String> childsNames) {
		this.childsNames = childsNames;
	}

	public Integer getTotalNumberOfChilds() {
		return totalNumberOfChilds;
	}

	public void setTotalNumberOfChilds(Integer totalNumberOfChilds) {
		this.totalNumberOfChilds = totalNumberOfChilds;
	}

	public Integer getTotalNumberOfInvalidChilds() {
		return totalNumberOfInvalidChilds;
	}

	public void setTotalNumberOfInvalidChilds(Integer totalNumberOfInvalidChilds) {
		this.totalNumberOfInvalidChilds = totalNumberOfInvalidChilds;
	}

	public PersonResume getResume() {
		return resume;
	}

	public void setResume(PersonResume resume) {
		this.resume = resume;
	}
	
}
