package com.company;

/**
 * Created by Алексей on 07.03.2016.
 */
public class Teacher extends HeadOfDep {
    private String name;
    private String birth;

    public Teacher(){}

    public Teacher(String fullName, String birthday) {
        this.name = fullName;
        this.birth = birthday;
    }

    public String fullName(){
        return getName();
    }
    //--------getters generated--------

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getBirth() {
        return birth;
    }

    //--------getters generated--------

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setBirth(String birth) {
        this.birth = birth;
    }
}
