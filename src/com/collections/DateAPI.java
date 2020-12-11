package com.collections;

import java.time.LocalDate;
import java.time.Period;

public class DateAPI {

    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(1988,6,28);
        LocalDate today = LocalDate.now();
        Period period = Period.between(birthday, today);
        System.out.printf("My Age is %d Years %d Months %d Days", period.getYears(), period.getMonths(), period.getDays());
    }
}
