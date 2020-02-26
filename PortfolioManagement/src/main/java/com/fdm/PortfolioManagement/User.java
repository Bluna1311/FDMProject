package com.fdm.PortfolioManagement;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="users")
	public class User {
		
	@Id
	private String UserName;
	private String firstname;
	private String lastname;
	private String Email;
	private String SecurityQ1;
	private String SecurityA1;
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getSecurityQ1() {
		return SecurityQ1;
	}
	public void setSecurityQ1(String securityQ1) {
		SecurityQ1 = securityQ1;
	}
	public String getSecurityA1() {
		return SecurityA1;
	}
	public void setSecurityA1(String securityA1) {
		SecurityA1 = securityA1;
	}
	public String getSecurityQ2() {
		return SecurityQ2;
	}
	public void setSecurityQ2(String securityQ2) {
		SecurityQ2 = securityQ2;
	}
	public String getSecurityA2() {
		return SecurityA2;
	}
	public void setSecurityA2(String securityA2) {
		SecurityA2 = securityA2;
	}
	private String SecurityQ2;
	private String SecurityA2;
	
	private int age;
	@OneToOne(cascade=CascadeType.ALL)
	private Portfolio portfolio;
	@OneToMany(cascade=CascadeType.ALL)
	private List<BankAccount> accounts ;

	
	
		public User() {
		
	}
		
		public User(String userName, String firstname, String lastname, String email, String securityQ1,
				String securityA1, String securityQ2, String securityA2, int age, Portfolio portfolio) {
			super();
			UserName = userName;
			this.firstname = firstname;
			this.lastname = lastname;
			Email = email;
			SecurityQ1 = securityQ1;
			SecurityA1 = securityA1;
			SecurityQ2 = securityQ2;
			SecurityA2 = securityA2;
			this.age = age;
			this.portfolio = portfolio;
		}
		public String getUserName() {
		return UserName;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Portfolio getPortfolio() {
		return portfolio;
	}
	public void setPortfolio(Portfolio portfolio) {
		this.portfolio = portfolio;
	}
	public List<BankAccount> getAccounts() {
		return accounts;
	}
	public void setAccounts(List<BankAccount> accounts) {
		this.accounts = accounts;
	}
		
}