public class Main {
    public static void main(String[] args) {

    }


}
class City{
    String name;
    int area;
    int population;
    City(String name, int area, int population){
        this.name=name;
        this.area=area;
        this.population=population;
    }
    int getArea(){
        return this.area;
    }
    int getPopulation(){
        return this.population;
    }
}

class Country{
    City[] cities;
    City capital;
    Country(City[] cities, City capital){
        this.cities=cities;
        this.capital=capital;
    }
    int area(){
        int area=0;
        for(int i=0; i<cities.length; i++){
            area=area+cities[i].getArea();
        }
        return area+capital.getArea();
    }
    int population(){
        int population=0;
        for(int i=0; i<cities.length; i++){
            population=population+cities[i].getPopulation();
        }
        return population+capital.getPopulation();
    }
}

class Person{
    String name;
    String surname;
    int age;
    Person(String name, String surname, int age){
        this.name=name;
        this.surname=surname;
        this.age=age;
    }
    void printInfo(){
        String delimiter=" , ";
        System.out.println(name+delimiter+surname+delimiter+age);
    }
}
class Doctor extends Person{
    String rank;
    String name2;
    String seniority;
    String hospital;
    int age2;
    Doctor(String name, String surname, int age,  String rank, String name2 , String seniority, String hospital, int age2){
        super(name,surname,age);
        this.age2=age2;
        this.rank=rank;
        this.name2=name2;
        this.seniority=seniority;
        this.hospital=hospital;
    }
}
class AutoInsurance implements Insurance{
    int price;
    String name;
    int age;
    public void packageInfo(){
        System.out.println("info");
    }
    public AutoInsurance(int price, String name, int age) {
        this.price = price;
        this.name = name;
        this.age = age;
    }
}
class HealthCare implements Insurance{
    int age;
    int income;
    boolean abroad; //+20% price
    public void packageInfo(){
        System.out.println("info");
    }
    public HealthCare(int age, int income, boolean abroad) {
        this.age = age;
        this.income = income;
        this.abroad = abroad;
    }
}
class TravelInsurance implements Insurance{
    int days;
    boolean luggage; //+10%
    public void packageInfo(){
        System.out.println("info");
    }
    public TravelInsurance(int days, boolean luggage) {
        this.days = days;
        this.luggage = luggage;
    }
}
class Customer{
    String name;
    String surname;
    int privateNumber;
    public Customer(String name, String surname, int privateNumber) {
        this.name = name;
        this.surname = surname;
        this.privateNumber = privateNumber;
    }
}

class Country2{
    String name;
    int population;
    String capital;
    public Country2(String name, int population, String capital) {
        this.name = name;
        this.population = population;
        this.capital = capital;
    }

    static class River{
        int length;
        String name;
        public River(int length, String name) {
            this.length = length;
            this.name = name;
        }
    }
}





