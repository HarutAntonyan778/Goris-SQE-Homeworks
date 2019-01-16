package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args)  throws IOException {
	// write your code here

        StringBuffer sb = new StringBuffer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(String line; (line = br.readLine()) != null; sb.append(line + "\n")){}
        String code = sb.toString();

        Matcher m = Pattern.compile(
                "\\/\\/.*?(?=\\n)|\\/\\*.*?\\*\\/",
                Pattern.DOTALL | Pattern.MULTILINE
        ).matcher(code);

        sb = new StringBuffer();
        while (m.find()){
            sb.append(m.group() + "\n");
        }
        System.out.print(sb);
    }
}
