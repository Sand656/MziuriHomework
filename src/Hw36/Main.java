package Hw36;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args){
        //N1
        Supplier<String> passwordSupplier = () -> {
            Random random = new Random();
            StringBuilder password = new StringBuilder(16);

            for (int i = 0; i < 16; i++) {
                int index = (char)random.nextInt(52);
                password.append((char)index+(int)'a');
            }
            return password.toString();
        };
        //N2
        Consumer<String> logMessage = (String a) ->{
            boolean b=true;
            for(int i=0; i<a.length(); i++){
                if(b){
                    for(int j=i; j<a.length(); j++){
                        if(a.substring(i, j)=="Error") {
                            System.out.println("Its an error");
                            j=a.length()-1;
                            b=false;
                        }
                       else  if(a.substring(i, j)=="Warning") {
                            System.out.println("Its a warning");
                            j=a.length()-1;
                            b=false;
                        }
                        else if(a.substring(i,j)=="Info"){
                            System.out.println("Its information");
                            j=a.length()-1;
                            b=false;
                        }
                    }
                }
            }
        };
        //N3
        Function<String, String> reverseString = str -> new StringBuilder(str).reverse().toString();
        //N4
        Predicate<Integer> isPrime=(Integer n)->{
            for(int i=0; i<n; i++){
                if(n%i==0) return false;
            }
            return true;
        };
        //N5
//        String intToString(int num){
//            String s="your number is:"+Integer.toString(num);
//            return s;
//        }
//        boolean isEven(int num){
//            if(num%2==0) return true;
//            return false;
//        }
    }
}
