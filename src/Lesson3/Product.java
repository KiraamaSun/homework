package Lesson3;

public class Product {
    String name;
    String manufactureDate;
    String manufacturer;
    String country;
    int price;
    boolean isReserved;

    public Product(String name, String manufactureDate, String manufacturer, String country, int price, boolean isReserved) {
        this.name = name;
        this.manufactureDate = manufactureDate;
        this.manufacturer = manufacturer;
        this.country = country;
        this.price = price;
        this.isReserved = isReserved;
    }

    public void printInfo() {
        System.out.println("Название: " + name);
        System.out.println("Дата производства: " + manufactureDate);
        System.out.println("Производитель: " + manufacturer);
        System.out.println("Страна происхождения: " + country);
        System.out.println("Цена: " + price);
        System.out.println("Забронировано: " + (isReserved ? "Да" : "Нет"));
        System.out.println();
    }
}
