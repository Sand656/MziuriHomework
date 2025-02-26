package Hw39;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    static int multiplyByThree(int n){
        return 3*n;
    }
    static boolean isOdd(int n){
        if(n%2==1) return true;
        return false;
    }
    public static void main(String[] args){
        //N1
        List<Worker> list= new ArrayList<>();
        List<String> top5Names = list.stream().filter(worker->worker.getSalary()>500).sorted(Comparator.comparingInt(Worker::getSalary).reversed())
                .map(Worker::getName).limit(5).collect(Collectors.toList());
                // .map-shi da comparator-shi aucileblad getteri unda?
        //N2
        List<Integer> list2=new ArrayList<>();
        List<Integer> a=list2.stream().filter(Main::isOdd).map(Main::multiplyByThree).limit(2).toList();
        System.out.println(Collections.max(a));
        //N3
        List<Product> list3=new ArrayList<>();
        int totalPrice=list3.stream().filter(product->product.getPrice() > 70)
                .collect(Collectors.summingInt(Product::getPrice));
        //N4
        List<Student> list4=new ArrayList<>();
        Map<String, Integer> nameAndScore = list4.stream().filter(student->student.getScore()>70).collect(Collectors.toMap(
                Student::getName,
                Student::getScore,
                (existing, replacement) -> existing, // ratom ar mushaobs amis gareshe?
                LinkedHashMap::new //save as map
        ));

    }


}
class Worker{
    String name;
    int salary;
    String department;
    int getSalary(){
        return this.salary;
    }
    String getName(){
        return this.name;
    }
}
class Product{
    int price;
    String name;
    int getPrice(){
        return price;
    }
    String getName(){
        return name;
    }
}
class Student{
    String name;
    int score;
    String getName(){
        return this.name;
    }
    int getScore(){
        return this.score;
    }
}