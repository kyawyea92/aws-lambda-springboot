package com.helloworld.test.dto;

public class Student {
    private int id;
    private String name;
    private String nickName;

    public Student() {}
    public Student(int id, String name, String nickName) {
        this.id = id;
        this.name = name;
        this.nickName = nickName;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
