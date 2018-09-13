package com.epam.dmytro_barsuk.java.lk6_string_enum_number.task1.sudent_info;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Student {
    private String firstName;
    private String lastName;
    private Curriculum course;
    private Date startDate;
    private Date endDate;
  //  final public Calendar calendar = Calendar.getInstance();

    DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm");
    DateFormat hourseFormat = new SimpleDateFormat("HH");

    public Student(String firstName, String lastName, String nameOfCurriculum, String startDate) throws ParseException {
        this.firstName = firstName;
        this.lastName = lastName;
        course = new Curriculum(nameOfCurriculum);
        this.startDate = dateFormat.parse(startDate);

    }

    public String getFirstName() {
        return firstName;
    }

   /* public Date getEndDate(){

    }*/

    public String getLastName() {
        return lastName;
    }

    public Curriculum getCourse() {
        return course;
    }
    public void addTopic(String nameOfTopic, Integer duration) {
        if(duration > 0) {
            course.getListOfCourses().put(nameOfTopic, duration);
        }
        else{
            System.out.println("Время не может быть меньше 0!");
        }
    }
    public void printFullInfo(){
        System.out.println("STUDENT: "+ firstName + " " + lastName);
        System.out.println("CURRICULUM: " + course.getNameOfCurriculum());
        System.out.println("START DATE: " + startDate);

        course.printListOfCourses();
    }
    @Override
    public String toString() {
        return firstName + " " + lastName + "\n";
    }
}

