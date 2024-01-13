package com.SpringCourse.Section5;

public class Course {
    private int id;
    private String courseName;
    private String author;
    public Course(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Course(int id, String courseName, String author){
        this.author = author;
        this.id = id;
        this.courseName =courseName;
    }

    @Override
    public String toString() {
        return "Course: " + id + " " + courseName + " " + author;
    }
}
