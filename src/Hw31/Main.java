package Hw31;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        int choice=1;
        if(choice==1){
            ArrayList<Basketballer> players = new ArrayList<>();
            players.add(new Basketballer("a", "d", 30, 10, 2, 8, 3));
            players.add(new Basketballer("b", "e", 25, 5, 1, 10, 4));
            players.add(new Basketballer("c", "f", 28, 12, 3, 6, 5));
            //კლება
//        for(int i=0; i<players.size(); i++){  //1 2 4 3
//            for(int j=i; j<players.size(); j++){
//                if(players.get(j).rating()>players.get(i).rating()){
//                    Basketballer temp=players.get(i);
//                    players.set(i,players.get(j));
//                    players.set(j, temp);
//                }
//            }
//        }
            //ზრდა
            for(int i=0; i<players.size(); i++){  //1 2 4 3
                for(int j=i; j<players.size(); j++){
                    if(players.get(j).rating()<players.get(i).rating()){
                        Basketballer temp=players.get(i);
                        players.set(i,players.get(j));
                        players.set(j, temp);
                    }
                }
            }
            for (Basketballer player : players) {
                player.printInfo();
            }
        }else if(choice==2){
            ArrayList<Student> students = new ArrayList<>();
            StudentSorts studentSorts=new StudentSorts(students);
            System.out.println("Unsorted list:");
            for (Student s : students) {
                System.out.println(s);
            }
            students=studentSorts.sortByAlphabet();
            System.out.println("Sorted by alphabet");
            students=studentSorts.sortByGrade();
            System.out.println("Sorted by grade");
        }else if(choice==3){
            ArrayList<Car> cars = new ArrayList<>();
            for(int i=0; i<cars.size(); i++){  //1 2 4 3
                for(int j=i; j<cars.size(); j++){
                    if(cars.get(j).engineSort()<cars.get(i).engineSort()){ //შეგვიძლია engineSort ჩავანაცვლოთ
                        Car temp=cars.get(i);
                        cars.set(i,cars.get(j));
                        cars.set(j, temp);
                    }
                }
            }
        }

    }
}


class Basketballer{
    String name;
    String surname;
    int scored;
    int rebound;
    int block;
    int assist;
    int turnover;
    public Basketballer(String name, String surname, int scored, int rebound, int block, int assist, int turnover) {
        this.name = name;
        this.surname = surname;
        this.scored = scored;
        this.rebound = rebound;
        this.block = block;
        this.assist = assist;
        this.turnover = turnover;
    }
    double rating(){
        return scored+rebound+block*2+assist*1.5 - turnover*2;
    }
    void printInfo(){
        System.out.println(name+","+surname+","+rating());
    }
}
class StudentSorts{
    public StudentSorts(ArrayList<Student> students) {
        this.students = students;
    }
    ArrayList<Student> students;
    ArrayList<Student> sortByAlphabet(){
        for (int i = 0; i < students.size() - 1; i++) {
            for (int j = i; j < students.size(); j++) {
                String name1 = students.get(j).surname + students.get(j).name;
                String name2 = students.get(j + 1).surname +students.get(j + 1).name;
                int m = 0;
                int length=(name1.length()>name2.length()) ? name1.length() :name2.length();
                while (m <length && name1.charAt(m) == name2.charAt(m)) { // სანამ იგივეა გადაყვება
                    m++;
                }
                if (m<length && name1.charAt(m) > name2.charAt(m)) { // თუ შესაცვლელია  შეამოწმებს
                    // შეცვლის აქ
                    Student temp = students.get(j);
                    students.set(j, students.get(j + 1));
                    students.set(j + 1, temp);
                }
            }
        }
        return students;
    }
    ArrayList<Student> sortByGrade() { // აქ უბრალოდ შეგვეძლო averageScore()-ის ნაცვლად birthDateToInt გამოგვეყენებინა და იქნებოდა
        // დაბადების დღით დასორტვა
        for(int i=0; i<students.size(); i++){  //1 2 4 3
            for(int j=i; j<students.size(); j++){
                if(students.get(j).averageScore()<students.get(i).averageScore()){
                    Student temp=students.get(i);
                    students.set(i,students.get(j));
                    students.set(j, temp);
                }
            }
        }
        return students;
    }

}
class Student{
    String name;
    String surname;
    String date; // dd/mm/yyyy
    ArrayList<Integer> grades;
    public Student(String name, String surname, String date, ArrayList<Integer> grades) {
        this.name = name;
        this.surname = surname;
        this.date = date;
        this.grades = grades;
    }
    int averageScore(){
        int average=0;
        for(int i:grades) average += i;
        return average/grades.size();
    }
    int birthDateToInt(){
        int day = (date.charAt(0) - '0') * 10 + (date.charAt(1) - '0');
        int month = (date.charAt(3) - '0') * 10 + (date.charAt(4) - '0');
        int year = (date.charAt(6) - '0') * 10 + (date.charAt(7) - '0');
        return day+month*30+year*365;
    }
}


class Engine{ //შეიძლებოდა inner კლასიც
    String fuelType;
    int cylinders;
    double volume;
    public Engine(String fuelType, int cylinders, double volume) {
        this.fuelType = fuelType;
        this.cylinders = cylinders;
        this.volume = volume;
    }
}
class Car {
    String brand;
    String model;
    int year;
    int mileage;
    Engine engine;
    public Car(String brand, String model, int year, int mileage, Engine engine) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.engine = engine;
    }
    int yearSort(){
        return year;
    }
    int mileageSort(){
        return mileage;
    }
    double engineSort(){
        return engine.volume;
    }

}



