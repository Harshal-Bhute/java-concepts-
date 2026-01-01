package day17.polymorphism;

// Main Class
public class HumanBeing {

    public static void main(String[] args) {

        // Creating Student object
        Student s = new Student();

        // Accessing Heart members (Has-A relationship)
        System.out.println(s.h.getweight());
        System.out.println(s.h.getduty());

        // Passing Book object
        Book book = new Book("Robert Greene", 200);
        s.has(book);

        // Passing Bike object
        Bike bike = new Bike(33, "Sports");
        s.hasA(bike);
    }
}


// ------------------ Student Class ------------------
class Student {

    // Student HAS-A Heart
    heart h = new heart(25, "Pumping blood");

    // Student HAS-A Brain
    brain b = new brain(200, 1400);

    // Student HAS-A Bike (passed temporarily)
    void hasA(Bike bike) {
        System.out.println(bike.getmilage());
        System.out.println(bike.gettype());
    }

    // Student HAS-A Book (passed temporarily)
    void has(Book book) {
        System.out.println(book.getauthor());
        System.out.println(book.getprice());
    }
}


// ------------------ Heart Class ------------------
class heart {
    int weight;
    String duty;

    public heart(int weight, String duty) {
        this.weight = weight;
        this.duty = duty;
    }

    int getweight() {
        return weight;
    }

    String getduty() {
        return duty;
    }
}


// ------------------ Brain Class ------------------
class brain {
    int iq;
    int weight;

    public brain(int iq, int weight) {
        this.iq = iq;
        this.weight = weight;
    }

    int getiq() {
        return iq;
    }

    int getweight() {
        return weight;
    }
}


// ------------------ Book Class ------------------
class Book {
    String author;
    int price;

    public Book(String author, int price) {
        this.author = author;
        this.price = price;
    }

    String getauthor() {
        return author;
    }

    int getprice() {
        return price;
    }
}


// ------------------ Bike Class ------------------
class Bike {
    int milage;
    String type;

    public Bike(int milage, String type) {
        this.milage = milage;
        this.type = type;
    }

    int getmilage() {
        return milage;
    }

    String gettype() {
        return type;
    }
}
