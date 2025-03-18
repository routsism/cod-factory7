package gr.aueb.cf.excercises.accounts.model;

import java.util.Objects;

public class Account extends  AbstractEntity {
    private String firstname;
    private String lastname;
    private String iban;
    private String ssn;
    private double balance;

    public Account() {

    }

    public Account(String firstname, String lastname, String iban, String ssn, double balance) {
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

    @Override
    public String toString() {
        return "Firstname: " + firstname + " , Lastname: " + lastname + ", Iban: " + iban + ", Ssn: " + ssn  + ", Balance: " +balance;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstname(),getLastname(),getIban(),getBalance(), getSsn());
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (!(other instanceof Account  that)) return false;
        return Objects.equals(getFirstname(), that.getFirstname())
                && Objects.equals(getLastname(), that.getLastname())
                && Objects.equals(getIban(), that.getIban())
                && Objects.equals((getSsn()), that.getSsn())
                && Objects.equals((getBalance()), that.getBalance());
    }
    }




