package me.whiteship.refactoring._10_data_clumps;

public class TelephoneNumber {
    private String areaCode;

    private String phoneNumber;

    public TelephoneNumber(String areaCode, String phoneNumber) {
        this.areaCode = areaCode;
        this.phoneNumber = phoneNumber;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return this.areaCode + "-" + this.phoneNumber;
    }
}
