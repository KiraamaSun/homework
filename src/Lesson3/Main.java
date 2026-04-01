package Lesson3;

public class Main {
    public static void main(String[] args) {
        Product[] productsArray = new Product[5];

        productsArray[0] = new Product("Samsung S25 Ultra", "01.02.2025", "Samsung Corp.", "Korea", 5599, true);
        productsArray[1] = new Product("iPhone 15 Pro", "13.01.2025", "Apple Inc.", "Korea", 4699, false);
        productsArray[2] = new Product("Xiaomi 14", "11.03.2025", "Xiaomi Corp.", "Korea", 3888, true);
        productsArray[3] = new Product("Huawei P60", "12.02.2025", "Huawei Tech.", "Korea", 4999, false);
        productsArray[4] = new Product("Google Pixel 8", "12.12.2024", "Google LLC", "Korea", 5444, true);

        for (int i = 0; i < productsArray.length; i++) {
            productsArray[i].printInfo();
        }
        Park park = new Park("Центральный парк", "Центральная", 10, 1, "08:00-23:00");

        Park.Attraction attraction1 = park.new Attraction("Колесо обозрения", "10:00-22:00", 500);
        Park.Attraction attraction2 = park.new Attraction("Американские горки", "11:00-21:00", 800);
        Park.Attraction attraction3 = park.new Attraction("Комната страха", "12:00-20:00", 400);

        attraction1.printInfo();
        attraction2.printInfo();
        attraction3.printInfo();
    }
}