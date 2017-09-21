package ml.icitapeng.pera.backend.entity;

import java.util.List;

public class PersonResume {
	
	private Long id;
	
	private Person person;
	
	private List<String> specialities;
	
	private String otherExperienes;
	
	private List<String> languages;
	
	private List<String> diplomas;
	
	private List<String> internships;
	
	private List<String> professionalExperiences;
	
	public PersonResume() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public List<String> getSpecialities() {
		return specialities;
	}

	public void setSpecialities(List<String> specialities) {
		this.specialities = specialities;
	}

	public String getOtherExperienes() {
		return otherExperienes;
	}

	public void setOtherExperienes(String otherExperienes) {
		this.otherExperienes = otherExperienes;
	}

	public List<String> getLanguages() {
		return languages;
	}

	public void setLanguages(List<String> languages) {
		this.languages = languages;
	}

	public List<String> getDiplomas() {
		return diplomas;
	}

	public void setDiplomas(List<String> diplomas) {
		this.diplomas = diplomas;
	}

	public List<String> getInternships() {
		return internships;
	}

	public void setInternships(List<String> internships) {
		this.internships = internships;
	}

	public List<String> getProfessionalExperiences() {
		return professionalExperiences;
	}

	public void setProfessionalExperiences(List<String> professionalExperiences) {
		this.professionalExperiences = professionalExperiences;
	}

	
}
