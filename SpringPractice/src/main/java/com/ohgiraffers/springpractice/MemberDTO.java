package com.ohgiraffers.springpractice;

public class MemberDTO {
    private String ID;
    private String PWD;
    private String name;
    private int age;
    private String gender;

    public MemberDTO() {
    }

    public MemberDTO(String ID, String PWD, String name, int age, String gender) {
        this.ID = ID;
        this.PWD = PWD;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "ID='" + ID + '\'' +
                ", PWD='" + PWD + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPWD() {
        return PWD;
    }

    public void setPWD(String PWD) {
        this.PWD = PWD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
