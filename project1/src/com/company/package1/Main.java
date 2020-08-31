package com.company.package1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      String login = "nazarmik98@gmail.com";
      String pass = "mikimaus";

      Scanner in = new Scanner(System.in);
        System.out.print("Login pleas: ");
        String one = in.nextLine();

        if(one.equals(login)){
            System.out.print("Pass pleas: ");
            String two = in.nextLine();

        if(two.equals(pass)){
            System.out.println("welcome ser!");
            System.out.print("Your number +380-96-80-35-845");
            String three = in.nextLine();
        }

        }else {
            System.out.print("no no no");
        }
    }
}

