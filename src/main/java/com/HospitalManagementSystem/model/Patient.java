package com.HospitalManagementSystem.model;

import java.io.Serializable;
/*import java.util.Date;*/
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;


@Entity
@Table(name = "Patient")
public class Patient implements Serializable {
	public Patient() {
		super();
	}

	@Id
	@Column(name = "patientId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int patientId;
	@Column(name = "firstName")
	private String firstName;
	@Column(name = "lastName")
	private String lastName;
	@Column(name = "password")
	private String password;
	@Column(name = "dob")
	/*@Temporal(TemporalType.DATE)
	@Past*/
	private Date dob;
	@Column(name = "email")
	private String email;
	@Column(name = "contactNumber")
	private String contactNumber;
	@Column(name = "state")
	private String state;
	@Column(name = "insurancePlan")
	private String insurancePlan;

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getInsurancePlan() {
		return insurancePlan;
	}

	public void setInsurancePlan(String insurancePlan) {
		this.insurancePlan = insurancePlan;
	}

	public Patient(String firstName, String lastName, String password,Date dob, String email,
			@NotNull @Size(min = 0, max = 10) String contactNumber, String state, String insurancePlan) {
		super();
		this.patientId = patientId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.dob = dob;
		this.email = email;
		this.contactNumber = contactNumber;
		this.state = state;
		this.insurancePlan = insurancePlan;
	}
	public Patient(String firstName, String lastName, String password, String email,
			@NotNull @Size(min = 0, max = 10) String contactNumber, String state, String insurancePlan) {
		super();
		this.patientId = patientId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.email = email;
		this.contactNumber = contactNumber;
		this.state = state;
		this.insurancePlan = insurancePlan;
	}

	/* void setDob(String string) {
		// TODO Auto-generated method stub
		
	}public
*/
	

}
