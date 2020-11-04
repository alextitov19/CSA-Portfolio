//Copyright Aleksandr Titov 10/15/2020
//Aleksand Titov has ownership and credit for this file


import Playground.FileReader;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the program lad!");

        FileReader fileReader = new FileReader();
        System.out.println(fileReader.GetAttributes()[0]);
    }
}
