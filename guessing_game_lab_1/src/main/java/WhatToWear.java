import java.util.Scanner;

public class WhatToWear {
    public static void main(String[] args) {

//obtain weather information
        System.out.println("What is the weather like tomorrow (Rainy, Sunny, Cloudy, Snowy):");
        Scanner reader = new Scanner(System.in);
        String weather = reader.nextLine().toLowerCase();
//        obtain temperature
        System.out.println("What is the temperature in \u00B0C:");
        reader = new Scanner(System.in);
        int temperature= Integer.parseInt(reader.nextLine());

//        give advice
        if (temperature < -5 || temperature > 50) {
            System.out.println("Stay inside!");
            System.exit(0);
        }
//        use temp to suggest clothing thickness
        System.out.print("I would advise that you wear a ");
        if (temperature > -5 && temperature <= 9) {
            System.out.print("thick ");
        }
        else if (temperature > 10 && temperature <= 16) {
            System.out.print("medium thickness ");
        }
        else {
            System.out.print("thin ");
        }
//        use weather to suggest clothing type
        if (weather.equals("rainy")) {
            System.out.print("waterproof coat");
        }
        else if (weather.equals("sunny")) {
            System.out.print("T-shirt");
        }
        else if (weather.equals("cloudy")) {
            System.out.print("hoodie");
        }
        else {
            System.out.print("coat");
        }


    }
}

/*
weather
rainy = waterproof coat
sunny = t-shirt and shorts
cloudy = hoodie
snowy = coat

temp
< -5 stay inside
-5 - 9 thick
10 - 16 medium
17 - 50 thin
>50 panic

 */
