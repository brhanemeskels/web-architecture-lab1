package com.msc.webarch.lab1;

public class HelloResponse {
    private String message;
    private String course;

    public HelloResponse(String message, String course) {
        this.message = message;
        this.course = course;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

}
