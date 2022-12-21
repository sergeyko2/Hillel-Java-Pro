package task1;

// для перевірки функціонала вирішення завдань

public class Main {

    public static void main(String[] args) {
        Employee emp = new Employee("Serhii Kovalenko", "junior dev",
                "serhiiko222@hmail.com", "099-333-9777", 47);
        System.out.println(emp.getName() + ", phone:" + emp.getPhone() + "\n--------------------------");

        Car car = new Car();
        car.start();

    }



}
