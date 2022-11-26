package group2;

import java.util.Scanner;

public class Class3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int sum=0;
        if(a>0){
        for(int i=0;i<=a;i++) {
            sum=sum+i;
        }
            System.out.println(sum);
         }else {
            System.out.println("введите положительно число");
        }
    }
}
