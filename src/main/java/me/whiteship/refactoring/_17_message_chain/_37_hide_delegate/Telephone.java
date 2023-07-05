package me.whiteship.refactoring._17_message_chain._37_hide_delegate;

public class Telephone {
    private String officeAreaCode;
    private String officeNumber;

    public Telephone() {
    }

    public String telephoneNumber() {
        return this.officeAreaCode + " " + this.officeNumber;
    }

    public String getOfficeAreaCode() {
        return officeAreaCode;
    }

    public void setOfficeAreaCode(String officeAreaCode) {
        this.officeAreaCode = officeAreaCode;
    }

    public String officeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }
}