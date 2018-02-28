package Pojos;

public class Doctor {
    String Fname;
    String Lname;
    int Staffid;
    Long phonenumber;
    String gender;

    public Doctor() {
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String fname) {
        Fname = fname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String lname) {
        Lname = lname;
    }

    public int getStaffid() {
        return Staffid;
    }

    public void setStaffid(int staffid) {
        Staffid = staffid;
    }

    public Long getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(Long phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
