import com.epam.dmytro_barsuk.java.lk6_string_enum_number.task1.sudent_info.Report;
import com.epam.dmytro_barsuk.java.lk6_string_enum_number.task1.sudent_info.Student;

import java.text.ParseException;
import java.util.Calendar;

public class Program {
    public static void main(String[] args) throws ParseException {
        Student st1 = new Student("Ivan","Ivanov","Java SE Developer","13.09.2018 10:00");
        st1.addTopic("Основы Java", 1);
        st1.addTopic("Java Selenium", 1);
        st1.setEndDate();
        st1.printFullInfo();
        Report report = new Report(st1.getStartDate(), st1.getEndDate());
        report.smallReport();

    }
}
