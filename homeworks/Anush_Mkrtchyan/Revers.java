package com.company;

import java.util.Scanner;

public class Revers {

    public static void main(String[] args) {
        int end=0;int a;int i;
        Scanner scanner=new Scanner(System.in);
        int first=scanner.nextInt();
        for(i=first; i>=10; ){
            a=i%10;
            i=i/10;
            end=(end+a)*10;
        }
       end=end +i;
        System.out.println(end);
	}
}
