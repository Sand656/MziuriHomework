package Hw5;

public class palindrome {
    static boolean func(int x){
        String reversed ="";
        String string ="";
        StringBuilder stringBuilder= new StringBuilder();
        stringBuilder.append(string);
        while(x>0){
            reversed = reversed + (x%10);
            x=x/10;
        }
        string = reversed;
        System.out.println(string);
        stringBuilder.reverse();
        System.out.println(string);
        if(reversed.equals(string)) return true;
        return false;
    }
    int[] filter(int[] arr){
        String data=",";
        int size=0;
        for(int i=1; i<arr.length-1; i++){
            if(arr[i]!=arr[i-1] && arr[i]!=arr[i+1]){
                size=size+1;
                data = data+ arr[i]+',';
            }
        }
        int[] arr2= new int[size];
        int count=0;
        for(int i=0; i<data.length()-1; i++){
            if(data.charAt(i)==','){
                for(int j=i+1; j<data.length(); j++){
                    if(data.charAt(j)==','){
                        arr2[count]=Integer.valueOf(data.substring(i+1,j));
                        count++;
                    }
                }
            }
        }
        return arr2;
    }
    public static void main(String[] args){
        int x=121;
        System.out.println(func(x));
    }
}
