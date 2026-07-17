public class Solution3 {
    public static void main(String[] args) {
        System.out.println("=== OOP Pillar Identification ===\n");

        System.out.println("1. Vehicle, Car, Motorcycle with different start() implementations:");
        Vehicle myCar = new Car();
        Vehicle myBike = new Motorcycle();
        myCar.start();
        myBike.start();
        System.out.println("-> This demonstrates POLYMORPHISM (and Abstraction)\n");

        System.out.println("2. BankAccount with private balance:");
        BankAccount account = new BankAccount(1000);
        account.deposit(500);
        account.withdraw(200);
        System.out.println("Balance: " + account.getBalance());
        System.out.println("-> This demonstrates ENCAPSULATION\n");

        System.out.println("3. Dog extends Animal, inherits eat():");
        Dog dog = new Dog();
        dog.eat();
        System.out.println("-> This demonstrates INHERITANCE\n");

        System.out.println("4. Payment interface with multiple implementations:");
        Payment cc = new CreditCardPayment();
        Payment pp = new PayPalPayment();
        cc.pay(50);
        pp.pay(75);
        System.out.println("-> This demonstrates ABSTRACTION (and Polymorphism)");
    }
}

abstract class Vehicle {
    abstract void start();
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car engine starts with a key turn");
    }
}

class Motorcycle extends Vehicle {
    void start() {
        System.out.println("Motorcycle engine starts with a button press");
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double initial) {
        balance = initial;
    }

    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}

class Animal {
    public void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
}

interface Payment {
    void pay(double amount);
}

class CreditCardPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " via Credit Card");
    }
}

class PayPalPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " via PayPal");
    }
}
