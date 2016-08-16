package oop.design;

/**
 * Created by rinko on 8/15/2016.
 */
public class EmployeeContactData {

    private String ContactType;
    private String PrimaryContactName;
    private String  PhoneNumber;
    private String Mobile;
    private String Address;
    private String Email;

    public String getContactType() {
        return ContactType;
    }

    public void setContactType(String contactType) {
        ContactType = contactType;
    }

    public String getPrimaryContactName() {
        return PrimaryContactName;
    }

    public void setPrimaryContactName(String primaryContactName) {
        PrimaryContactName = primaryContactName;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String mobile) {
        Mobile = mobile;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public EmployeeContactData()
    {

    }

    public EmployeeContactData(String ContactType,String PrimaryContactName,String  PhoneNumber,String Mobile,String Address,String Email)
    {
        this.ContactType= ContactType;
        this.PrimaryContactName = PrimaryContactName;
        this.PhoneNumber = PhoneNumber;
        this.Mobile = Mobile;
        this.Address = Address;
        this.Email = Email;

    }

}
