package directory;

public class Directory {
    private String numberPhone;
    private String ContactGroup;
    private String name;
    private String gender;
    private String address;
    private String day;
    private String email;

    public Directory(String numberPhone, String contactGroup, String name, String gender, String address, String day, String email) {
        this.numberPhone = numberPhone;
        ContactGroup = contactGroup;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.day = day;
        this.email = email;
    }
    public Directory() {}

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getContactGroup() {
        return ContactGroup;
    }

    public void setContactGroup(String contactGroup) {
        ContactGroup = contactGroup;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return numberPhone +","+ContactGroup+ "," + name + "," + gender + "," + address + "," + day + "," + email;
    }
}
