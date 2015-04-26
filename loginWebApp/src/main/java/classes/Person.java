package classes;

import java.util.List;

public class Person {

	
	String userName=null;
	String password=null;
	String email=null;
	String privilage=null;
	List<String> livingAddress=null;
	List<String> mailAddress=null;
	List<String> jobAddress=null;
	
	/* public Person(String userName, String password, String email, String privilage,List<String> livingAddress,
			List<String> mailAddress,List<String> jobAddress){
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.privilage = privilage;
		this.livingAddress = livingAddress;
		this.mailAddress = mailAddress;
		this.jobAddress = jobAddress;
		
	}*/
	
	
	
	
	public List<String> getLivingAddress() {
		return livingAddress;
	}

	public void setLivingAddress(List<String> livingAddress) {
		this.livingAddress = livingAddress;
	}

	public List<String> getMailAddress() {
		return mailAddress;
	}

	public void setMailAddress(List<String> mailAddress) {
		this.mailAddress = mailAddress;
	}

	public List<String> getJobAddress() {
		return jobAddress;
	}

	public void setJobAddress(List<String> jobAddress) {
		this.jobAddress = jobAddress;
	}

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPrivilage() {
		return privilage;
	}
	public void setPrivilage(String privilage) {
		this.privilage = privilage;
	}
	
	
	
	
	
}
