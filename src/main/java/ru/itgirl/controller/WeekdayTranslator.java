package ru.itgirl.controller;

import java.util.HashMap;
import java.util.Map;

public class WeekdayTranslator {
    private static final Map<String, String> daysMap = new HashMap<>();

    static {
        daysMap.put("monday", "Понедельник");
        daysMap.put("tuesday", "Вторник");
        daysMap.put("wednesday", "Среда");
        daysMap.put("thursday", "Четверг");
        daysMap.put("friday", "Пятница");
        daysMap.put("saturday", "Суббота");
        daysMap.put("sunday", "Воскресенье");
    }

    public String translate(String day) {
        return daysMap.getOrDefault(day.toLowerCase(), "Некорректный день");
    }
}