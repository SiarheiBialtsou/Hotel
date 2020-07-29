package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CheckIn {
    private String newKlient, newKlientName;
    private int counter, counterRoomsDog, counterRoomsCat, counterRoomsBird, counterRoomsHorse;
    private static int freeRooms;
    public static void check () {
        int freeRooms = 5;
        int counter = 0;
        int counterRoomsDog = 1;
        int counterRoomsCat = 2;
        int counterRoomsBird = 1;
        int counterRoomsHorse = 1;
        List<Animal> animals = new ArrayList();
            do {
                String newKlient = "";
                System.out.println("Welcome in animal's hotel 'Mazzy'!");
                System.out.println("There are rooms for Dog, Cat, Bird, Horse.");
                System.out.println("\nWho are you?");
                Scanner scn = new Scanner(System.in);
                newKlient = scn.nextLine();
                System.out.println("What your name?");
                String newKlientName = scn.nextLine();
                if (newKlient.compareTo("Dog") == 0) {
                    if (counterRoomsDog > 0) {
                        System.out.println("Free rooms " + counterRoomsDog + ", check in 'Mazzy'!");
                        counterRoomsDog--;
                        Dog newKlien = new Dog();
                        newKlien.setName(newKlientName);
                        animals.add(newKlien);
                        counter++;
                        freeRooms--;
                        System.out.println("Your number room " + counter);
                        newKlien.showInfo();
                    } else System.out.println("no free rooms");
                } else
                if (newKlient.compareTo("Cat") == 0) {
                    if (counterRoomsCat > 0) {
                        System.out.println("Free rooms " + counterRoomsCat + ", check in 'Mazzy'!");
                        counterRoomsCat--;
                        Cat newKlien = new Cat();
                        newKlien.setName(newKlientName);
                        animals.add(newKlien);
                        counter += 1;
                        freeRooms--;
                        System.out.println("Your number room " + counter);
                        newKlien.showInfo();
                    } else System.out.println("no free rooms");
                } else
                if (newKlient.compareTo("Bird") == 0) {
                    if (counterRoomsBird > 0) {
                        System.out.println("Free rooms " + counterRoomsBird + ", check in 'Mazzy'!");
                        counterRoomsBird--;
                        Bird newKlien = new Bird();
                        newKlien.setName(newKlientName);
                        animals.add(newKlien);
                        counter += 1;
                        freeRooms--;
                        System.out.println("Your number room " + counter);
                        newKlien.showInfo();
                    } else System.out.println("no free rooms");
                } else
                if (newKlient.compareTo("Horse") == 0) {
                    if (counterRoomsHorse > 0) {
                        System.out.println("Free rooms " + counterRoomsHorse + ", check in 'Mazzy'!");
                        counterRoomsHorse--;
                        Horse newKlien = new Horse();
                        newKlien.setName(newKlientName);
                        animals.add(newKlien);
                        counter += 1;
                        freeRooms--;
                        System.out.println("Your number room " + counter);
                        newKlien.showInfo();
                    } else System.out.println("no free rooms");
                } else System.out.println("Sorry! Next time.");
            } while (freeRooms > 0);
        System.out.println("In Hotel " + animals.size() + " animals. Full. \n" + animals.subList(0, counter));
    }
}
