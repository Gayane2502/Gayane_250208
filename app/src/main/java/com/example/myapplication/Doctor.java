package com.example.myapplication;

public class Doctor {

    String email, fullName, medFac, phoneNum;

    public Doctor() {
    }

    public Doctor(String email, String fullName, String medFac, String phoneNum) {
        this.email = email;
        this.fullName = fullName;
        this.medFac = medFac;
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getMedFac() {
        return medFac;
    }

    public void setMedFac(String medFac) {
        this.medFac = medFac;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
}
