package fr.afcepf.atod.business.admin.dto;
import java.util.*;

public class CustomerDTO {    
    private Integer id;
    private  String lastname;
    private  String firstname;
    private  Date birthdate;
    private  String mail;
    private  String login;
    private  String password;
    private  String phonenumber;
    private  Date createdAt;
    private  Date updatedAt;
    private  Civility civility;
	private Boolean activated;
	
	public CustomerDTO() {
	    
	}
    
    public CustomerDTO(Integer id, String lastname, 
                    String firstname, Date birthdate, String email,
                    String login, String password, String phonenumber,
                    Date createdAt, Date updatedAt, Civility civility,
                    Boolean activated ) {
        this.id = id;
        this.lastname = lastname;
        this.firstname = firstname;
        this.birthdate = birthdate;
        this.mail = email;
        this.login = login;
        this.password = password;
        this.phonenumber = phonenumber;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.civility = civility;
        this.activated = activated;
    }
    
    // ------------ Getters && setters --------------//
    
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Civility getCivility() {
        return civility;
    }

    public void setCivility(Civility civility) {
        this.civility = civility;
    }

    public Boolean getActivated() {
        return activated;
    }

    public void setActivated(Boolean activated) {
        this.activated = activated;
    }

    @Override
    public String toString() {
        return "Customer [id=" + id + ", lastname=" + lastname + ", firstname=" + firstname + ", birthdate=" + birthdate
                + ", mail=" + mail + ", login=" + login + ", password=" + password + ", phonenumber=" + phonenumber
                + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + ", civility=" + civility + ", activated="
                + activated + "]";
    }
    
    
}