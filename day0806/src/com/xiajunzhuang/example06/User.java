package com.xiajunzhuang.example06;

public class User {
    private String name;
    private String gender;
    private int age;
    private String phone;
    private String qq;
    private String address;

    public User() {
    }

    public User(String name, String gender, int age, String phone, String qq, String address) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.phone = phone;
        this.qq = qq;
        this.address = address;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
