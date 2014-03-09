package com.example.gson_client_servidor;

public class Person {

	public int getPerson_id() {
		return person_id;
	}
	public void setPerson_id(int person_id) {
		this.person_id = person_id;
	}
	public String getPerson_givenName() {
		return person_givenName;
	}
	public void setPerson_givenName(String person_givenName) {
		this.person_givenName = person_givenName;
	}
	public String getPerson_sn1() {
		return person_sn1;
	}
	public void setPerson_sn1(String person_sn1) {
		this.person_sn1 = person_sn1;
	}
	public String getPerson_sn2() {
		return person_sn2;
	}
	public void setPerson_sn2(String person_sn2) {
		this.person_sn2 = person_sn2;
	}
	public String getPerson_email() {
		return person_email;
	}
	public void setPerson_email(String person_email) {
		this.person_email = person_email;
	}
	public String getPerson_secondary_email() {
		return person_secondary_email;
	}
	public void setPerson_secondary_email(String person_secondary_email) {
		this.person_secondary_email = person_secondary_email;
	}
	public String getPerson_official_id() {
		return person_official_id;
	}
	public void setPerson_official_id(String person_official_id) {
		this.person_official_id = person_official_id;
	}
	public int getPerson_official_id_type() {
		return person_official_id_type;
	}
	public void setPerson_official_id_type(int person_official_id_type) {
		this.person_official_id_type = person_official_id_type;
	}
	public String getPerson_date_of_birth() {
		return person_date_of_birth;
	}
	public void setPerson_date_of_birth(String person_date_of_birth) {
		this.person_date_of_birth = person_date_of_birth;
	}
	public String getPerson_gender() {
		return person_gender;
	}
	public void setPerson_gender(String person_gender) {
		this.person_gender = person_gender;
	}
	public String getPerson_secondary_official_id() {
		return person_secondary_official_id;
	}
	public void setPerson_secondary_official_id(String person_secondary_official_id) {
		this.person_secondary_official_id = person_secondary_official_id;
	}
	public int getPerson_secondary_official_id_type() {
		return person_secondary_official_id_type;
	}
	public void setPerson_secondary_official_id_type(
			int person_secondary_official_id_type) {
		this.person_secondary_official_id_type = person_secondary_official_id_type;
	}
	public String getPerson_homePostalAddress() {
		return person_homePostalAddress;
	}
	public void setPerson_homePostalAddress(String person_homePostalAddress) {
		this.person_homePostalAddress = person_homePostalAddress;
	}
	public int getPerson_photo() {
		return person_photo;
	}
	public void setPerson_photo(int person_photo) {
		this.person_photo = person_photo;
	}
	public int getPerson_locality_id() {
		return person_locality_id;
	}
	public void setPerson_locality_id(int person_locality_id) {
		this.person_locality_id = person_locality_id;
	}
	public String getPerson_telephoneNumber() {
		return person_telephoneNumber;
	}
	public void setPerson_telephoneNumber(String person_telephoneNumber) {
		this.person_telephoneNumber = person_telephoneNumber;
	}
	public String getPerson_mobile() {
		return person_mobile;
	}
	public void setPerson_mobile(String person_mobile) {
		this.person_mobile = person_mobile;
	}
	public int getPerson_bank_account_id() {
		return person_bank_account_id;
	}
	public void setPerson_bank_account_id(int person_bank_account_id) {
		this.person_bank_account_id = person_bank_account_id;
	}
	public String getPerson_notes() {
		return person_notes;
	}
	public void setPerson_notes(String person_notes) {
		this.person_notes = person_notes;
	}
	public String getPerson_entryDate() {
		return person_entryDate;
	}
	public void setPerson_entryDate(String person_entryDate) {
		this.person_entryDate = person_entryDate;
	}
	public String getPerson_last_update() {
		return person_last_update;
	}
	public void setPerson_last_update(String person_last_update) {
		this.person_last_update = person_last_update;
	}
	public int getPerson_creationUserId() {
		return person_creationUserId;
	}
	public void setPerson_creationUserId(int person_creationUserId) {
		this.person_creationUserId = person_creationUserId;
	}
	public int getPerson_lastupdateUserId() {
		return person_lastupdateUserId;
	}
	public void setPerson_lastupdateUserId(int person_lastupdateUserId) {
		this.person_lastupdateUserId = person_lastupdateUserId;
	}
	public String getPerson_markedForDeletion() {
		return person_markedForDeletion;
	}
	public void setPerson_markedForDeletion(String person_markedForDeletion) {
		this.person_markedForDeletion = person_markedForDeletion;
	}
	public String getPerson_markedForDeletionDate() {
		return person_markedForDeletionDate;
	}
	public void setPerson_markedForDeletionDate(String person_markedForDeletionDate) {
		this.person_markedForDeletionDate = person_markedForDeletionDate;
	}
	public String getDate_of_birth() {
		return date_of_birth;
	}
	public void setDate_of_birth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}
	
	
	
	
	public Person(int person_id, String person_givenName, String person_sn1,
			String person_sn2, String person_email) {
		super();
		this.person_id = person_id;
		this.person_givenName = person_givenName;
		this.person_sn1 = person_sn1;
		this.person_sn2 = person_sn2;
		this.person_email = person_email;
	}

	public Person(){
		super();
	};



	int person_id;
	String person_givenName;
	String person_sn1;
	String person_sn2;
	String person_email;
	String person_secondary_email;
	String person_official_id;
	int person_official_id_type;
	String person_date_of_birth;
	String person_gender;
	String person_secondary_official_id;
	int person_secondary_official_id_type;
	String person_homePostalAddress;
	int person_photo;
	int person_locality_id;
	String person_telephoneNumber;
	String person_mobile;
	int person_bank_account_id;
	String person_notes;
	String person_entryDate;
	String person_last_update;
	int person_creationUserId;
	int person_lastupdateUserId;
	String person_markedForDeletion;
	String person_markedForDeletionDate;
	String date_of_birth;
	
	
}
