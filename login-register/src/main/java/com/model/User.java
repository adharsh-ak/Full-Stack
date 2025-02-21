package com.model;

import java.util.Date;

public class User {
    int serialNumber;
    String fullName, uname, password, gender, qualification, dstatus;
    Date DateOfBirth;

    public User(String fullName, String uname, String password, String gender, String qualification, String dstatus, Date DateofBirth) {
        super();
        this.fullName = fullName;
        this.uname = uname;
        this.password = password;
        this.qualification = qualification;
        this.dstatus = dstatus;
        this.DateOfBirth = DateofBirth;
        ;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber() {
        this.serialNumber = serialNumber;
    }

    public String getUname(String uname) {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getGender(String gender) {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getQualificatioin(String qualification) {
        return qualification;
    }

    public void setQualificatioin(String qualification) {
        this.qualification = qualification;
    }

    public String getdStatus(String dstatus) {
        return dstatus;
    }

    public void setdStatus(String dstatus) {
        this.dstatus = dstatus;
    }

    public Date getDob(Date DateOfBirth) {
        return DateOfBirth;
    }

    public void setDob() {
        this.DateOfBirth = DateOfBirth;
    }
}
