package com.epam.dmytro_barsuk.java.lk6_string_enum_number.task1.sudent_info;

import java.time.LocalDateTime;

public class Report {
    LocalDateTime currentDate ;
    LocalDateTime startDate;
    LocalDateTime finishDate;

    final private int START_STUDY_TIME = 10;
    final private int END_STUDY_TIME = 18;

    public Report(LocalDateTime startDate, LocalDateTime finishDate) {
        currentDate = LocalDateTime.now();
        this.startDate = startDate;
        this.finishDate = finishDate;
        //currentDate = currentDate.plusHours(6);

    }

    public void smallReport() {
        if (finishDate.isAfter(currentDate)) {
            System.out.println("До окончания обучения осталось" + (finishDate.getDayOfMonth() - currentDate.getDayOfMonth()) + " дня");
        }
        else {
            if (currentDate.getHour() > END_STUDY_TIME || currentDate.getHour() < START_STUDY_TIME) {
                int diffHour = (currentDate.getHour() - END_STUDY_TIME) + 1 ;
                System.out.println("Закончил обучение " + (currentDate.getDayOfMonth() - finishDate.getDayOfMonth()) + " д. " + (Math.abs(currentDate.minusHours(diffHour).getHour() - finishDate.getHour())) + " ч. назад");
            } else {
                System.out.println("Закончил обучение " + (currentDate.getDayOfMonth() - finishDate.getDayOfMonth()) + " д. " + (currentDate.getHour() - finishDate.getHour()) + " ч. назад");
            }
        }
    }
}
