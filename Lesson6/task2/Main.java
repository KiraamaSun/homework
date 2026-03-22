package Lesson6.task2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PhoneDirectory phoneDirectory = new PhoneDirectory();

        System.out.println(" ДОБАВЛЕНИЕ ЗАПИСЕЙ ");
        phoneDirectory.add("Иванов", "123-45-67");
        phoneDirectory.add("Петров", "234-56-78");
        phoneDirectory.add("Сидоров", "345-67-89");
        phoneDirectory.add("Иванов", "456-78-90");
        phoneDirectory.add("Смирнов", "567-89-01");
        phoneDirectory.add("Иванов", "678-90-12");
        phoneDirectory.add("Петров", "789-01-23");
        phoneDirectory.add("Иванов", "123-45-67");

        phoneDirectory.printAll();

        System.out.println("\n ПОИСК ПО ФАМИЛИИ ");

        String searchLastName = "Иванов";
        List<String> ivanovPhones = phoneDirectory.get(searchLastName);
        System.out.println("Телефоны фамилии " + searchLastName + ": " + ivanovPhones);

        searchLastName = "Петров";
        List<String> petrovPhones = phoneDirectory.get(searchLastName);
        System.out.println("Телефоны фамилии " + searchLastName + ": " + petrovPhones);

        searchLastName = "Кузнецов";
        List<String> kuznetsovPhones = phoneDirectory.get(searchLastName);
        System.out.println("Телефоны фамилии " + searchLastName + ": " +
                (kuznetsovPhones.isEmpty() ? "Не найдено" : kuznetsovPhones));
    }
}