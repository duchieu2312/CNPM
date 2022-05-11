package DTO;

import java.sql.Date;

public class CUSTOMERDTO {
	private int CUSTOMER_ID;
	private String CUSTOMER_DisplayName;
	private String CUSTOMER_Address;
	private String CUSTOMER_Phone;
	private String CUSTOMER_Email;
	private String CUSTOMER_MoreInfo;
	private Date CUSTOMER_ContactDate;
	private int CUSTOMER_NewID;
	public int getCUSTOMER_ID() {
		return CUSTOMER_ID;
	}
	public void setCUSTOMER_ID(int cUSTOMER_ID) {
		CUSTOMER_ID = cUSTOMER_ID;
	}
	public String getCUSTOMER_DisplayName() {
		return CUSTOMER_DisplayName;
	}
	public void setCUSTOMER_DisplayName(String cUSTOMER_DisplayName) {
		CUSTOMER_DisplayName = cUSTOMER_DisplayName;
	}
	public String getCUSTOMER_Address() {
		return CUSTOMER_Address;
	}
	public void setCUSTOMER_Address(String cUSTOMER_Address) {
		CUSTOMER_Address = cUSTOMER_Address;
	}
	public String getCUSTOMER_Phone() {
		return CUSTOMER_Phone;
	}
	public void setCUSTOMER_Phone(String cUSTOMER_Phone) {
		CUSTOMER_Phone = cUSTOMER_Phone;
	}
	public String getCUSTOMER_Email() {
		return CUSTOMER_Email;
	}
	public void setCUSTOMER_Email(String cUSTOMER_Email) {
		CUSTOMER_Email = cUSTOMER_Email;
	}
	public String getCUSTOMER_MoreInfo() {
		return CUSTOMER_MoreInfo;
	}
	public void setCUSTOMER_MoreInfo(String cUSTOMER_MoreInfo) {
		CUSTOMER_MoreInfo = cUSTOMER_MoreInfo;
	}
	public Date getCUSTOMER_ContactDate() {
		return CUSTOMER_ContactDate;
	}
	public void setCUSTOMER_ContactDate(Date cUSTOMER_ContactDate) {
		CUSTOMER_ContactDate = cUSTOMER_ContactDate;
	}
	public int getCUSTOMER_NewID() {
		return CUSTOMER_NewID;
	}
	public void setCUSTOMER_NewID(int cUSTOMER_NewID) {
		CUSTOMER_NewID = cUSTOMER_NewID;
	}
}
