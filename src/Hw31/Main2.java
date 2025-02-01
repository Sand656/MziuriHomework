package Hw31;

import java.util.ArrayList;
import java.util.HashMap;

public class Main2 {

}
class Corporation {
    private String name;
    private Address address;
    private HashMap<String, String> contactInfo;
    private ArrayList<Employee> employees;

    public Corporation(String name, Address address) {
        this.name = name;
        this.address = address;
        this.contactInfo = new HashMap<>();
        this.employees = new ArrayList<>();
    }
    void addContact(String type, String number) {contactInfo.put(type, number);}
    void addEmployee(Employee employee) {
        employees.add(employee);
    }
    String aboutUs() {
        return "Address: " + address + "Contact Numbers: " + contactInfo;
    }
    String getContactNumber(String type) {
        return contactInfo.get(type);
    }
    double totalSalaryExpense() {
        double total = 0;
        for (Employee employee : employees) {
            total += employee.salary;
        }
        return total;
    }
}
class Address{
    String country;
    String city;
    String street;
      String building;

    public Address(String country, String city, String street, String building) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.building = building;
    }
}
class Employee {
    String firstName;
    String lastName;
    String id;
    double salary;

    public Employee(String firstName, String lastName, String id, double salary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.salary = salary;
    }
}

