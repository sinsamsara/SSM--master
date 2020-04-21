package com.jl.test;
import java.util.List;

/**
 * @ClassName: [Yb]
 * @Description: []
 * @Author: [jilun]
 * @Time: [2020/4/21 16:47]
 */
public class Yb {
    private Integer ID;
    private String Name;
    private Number Age;
    private List<String> work;

    public Integer getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Yb{" +
                "ID=" + ID +
                ", Name='" + Name + '\'' +
                ", Age=" + Age +
                ", work=" + work +
                '}';
    }

    public void setName(String name) {
        Name = name;
    }

    public void setAge(Number age) {
        Age = age;
    }

    public void setWork(List<String> work) {
        this.work = work;
    }

    public Number getAge() {
        return Age;
    }

    public List<String> getWork() {
        return work;
    }
}
