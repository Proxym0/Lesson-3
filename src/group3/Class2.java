package group3;

import java.util.Scanner;

public class Class2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("введите сумму вклада");
        int a=scanner.nextInt();//сумма вклада
        System.out.println("введите срок вклада");
        int b=scanner.nextInt();//количество месяцев
        float sum=a;

        for(int i=0;i<b;i++){
            sum=sum*1.07f;
        }System.out.println("итоговая сумма: "+sum);
    }
}
