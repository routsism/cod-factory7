package gr.aueb.cf.excercises.accounts.dto;



public class AccountInsertDTO {
    private String firstname;
    private String lastname;
    private String iban;
    private String ssn;
    private double balance;

    public AccountInsertDTO() {

    }

    public AccountInsertDTO(String firstname, String lastname, String iban, String ssn, double balance) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.iban = iban;
        this.ssn = ssn;
        this.balance = balance;
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

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
