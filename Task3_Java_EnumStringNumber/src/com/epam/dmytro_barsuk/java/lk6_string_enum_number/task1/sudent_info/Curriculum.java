package com.epam.dmytro_barsuk.java.lk6_string_enum_number.task1.sudent_info;

import java.util.HashMap;
import java.util.Map;

class Curriculum {

    private String nameOfCurriculum;
    private int amountDuration;
    private HashMap<String,Integer> listOfCourses = new HashMap<>();
    public Curriculum(String nameOfCurriculum){
        this.nameOfCurriculum = nameOfCurriculum;
    }

    public String getNameOfCurriculum() {
        return nameOfCurriculum;
    }
    public HashMap<String,Integer> getListOfCourses() {
        return listOfCourses;
        }

    public void printListOfCourses(){
        System.out.println("Course");
        for(Map.Entry<String, Integer> item : listOfCourses.entrySet()) {
            String nameOfCourse = item.getKey();
            int duration = item.getValue();
            System.out.println(nameOfCourse + "\t\t" + duration);
        }
    }

    public int getAmountDuration(){
        return 0;
    }


/*    @Override
    public String toString() {
        return "COURSE\t\t" + "DURATION(hrs)\n" +
                "-----------------------------";
    }*/
}
