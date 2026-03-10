package Lesson3;

public class Park {
    String name;
    Address address;
    String workingHours;

    public Park(String name, String street, int houseNumber, int buildingNumber, String workingHours) {
        this.name = name;
        this.address = new Address(street, houseNumber, buildingNumber);
        this.workingHours = workingHours;
    }

    class Address {
        String street;
        int houseNumber;
        int buildingNumber;

        Address(String street, int houseNumber, int buildingNumber) {
            this.street = street;
            this.houseNumber = houseNumber;
            this.buildingNumber = buildingNumber;
        }

        void printInfo() {
            System.out.println("ул. " + street + ", д. " + houseNumber + ", корп. " + buildingNumber);
        }
    }

    class Attraction {
        String name;
        String workingHours;
        int price;

        public Attraction(String name, String workingHours, int price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }

        public void printInfo() {
            System.out.println("Аттракцион: " + name);
            System.out.println("Время работы: " + workingHours);
            System.out.println("Стоимость: " + price);
            System.out.println();
        }
    }
}
