package com.epam.dmytro_barsuk.java.lk6_string_enum_number.task1.sudent_info;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Student {
    private String firstName;
    private String lastName;

    private Curriculum course;
    /**
     * Start Date of studying
     */
    private LocalDateTime startDate;
    /**
     * End date of studying
     */
    private LocalDateTime endDate;


    final private int START_STUDY_TIME = 10;
    final private int END_STUDY_TIME = 18;
    final private int STUDY_TIME = 8;

    DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("d.MM.yyyy HH:mm");

    public Student(String firstName, String lastName, String nameOfCurriculum, String startDate) throws ParseException {
        this.firstName = firstName;
        this.lastName = lastName;
        course = new Curriculum(nameOfCurriculum);
        this.startDate =LocalDateTime.parse(startDate, dateFormat); //LocalDateTime.of(year, month, day,START_STUDY_TIME,0);
        endDate = this.startDate;
    }

    /**
     * ==================================Getters & Setters=============================================================
     */
    public String getFirstName() {
        return firstName;
    }

    public LocalDateTime getStartDate(){
        return startDate;
    }
    public LocalDateTime getEndDate() {
        return endDate;
    }

    public String getLastName() {
        return lastName;
    }

    public Curriculum getCourse() {
        return course;
    }

    public void setEndDate() {
        endDate = endDate.plusDays(course.totalDurationDay());
        endDate = endDate.plusHours(course.totalDurationHours());
    }

    /**
     * =================================================================================================================
     */

    public void addTopic(String nameOfTopic, Integer duration) {
        if (duration > 0) {
            course.getListOfCourses().put(nameOfTopic, duration);
            course.plusAmountDuration(duration);
        } else {
            System.out.println("Время не может быть меньше 0!");
        }
    }

    public void printFullInfo() {
        System.out.println("STUDENT: " + firstName + " " + lastName);
        System.out.println("CURRICULUM: " + course.getNameOfCurriculum());
        System.out.println("START DATE: " + startDate.format(dateFormat));
        System.out.println("END DATE: "+ getEndDate().format(dateFormat));
        course.printListOfCourses();

    }

    @Override
    public String toString() {
        return firstName + " " + lastName + "\n";
    }
}

