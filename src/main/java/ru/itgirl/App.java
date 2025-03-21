package ru.itgirl;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.itgirl.controller.Controller;
import ru.itgirl.controller.WeekdayTranslator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Создаем Spring-контекст
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Controller.class);

        // Получаем бин
        WeekdayTranslator translator = context.getBean(WeekdayTranslator.class);

        // Ввод с консоли
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите день недели на английском: ");
        String inputDay = scanner.nextLine().trim();

        // Перевод и вывод
        String translatedDay = translator.translate(inputDay);
        System.out.println("Перевод: " + translatedDay);

        // Закрываем контекст
        context.close();
    }
}