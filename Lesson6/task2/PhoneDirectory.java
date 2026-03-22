package Lesson6.task2;

import java.util.*;

public class PhoneDirectory {
    private Map<String, List<String>> directory;

    public PhoneDirectory() {
        directory = new HashMap<>();
    }

    public void add(String lastName, String phoneNumber) {
        if (directory.containsKey(lastName)) {
            List<String> phones = directory.get(lastName);
            if (!phones.contains(phoneNumber)) {
                phones.add(phoneNumber);
                System.out.println("Добавлен номер " + phoneNumber + " для фамилии " + lastName);
            } else {
                System.out.println("Номер " + phoneNumber + " уже существует для фамилии " + lastName);
            }
        } else {
            List<String> phones = new ArrayList<>();
            phones.add(phoneNumber);
            directory.put(lastName, phones);
            System.out.println("Добавлена новая запись: " + lastName + " - " + phoneNumber);
        }
    }

    public List<String> get(String lastName) {
        if (directory.containsKey(lastName)) {
            return directory.get(lastName);
        } else {
            return new ArrayList<>();
        }
    }

    public void printAll() {
        System.out.println("\n ТЕЛЕФОННЫЙ СПРАВОЧНИК ");
        if (directory.isEmpty()) {
            System.out.println("Справочник пуст");
            return;
        }
        for (Map.Entry<String, List<String>> entry : directory.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
