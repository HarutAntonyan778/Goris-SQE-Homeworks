package com.company;
import java.util.Scanner;
public class Erankjuni {

    public static void main(String[] args) {
         Scanner scanner=new Scanner(System.in);
            int n=scanner.nextInt();
            for(int i=1;i<n;++i){
                for(int j=1; j<n; ++j){
                    if(j<(n-i)){
                        System.out.print(" ");
                    }else{
                        System.out.print("x ");
                    }
                }
                System.out.println("");
            }

        }
    }

