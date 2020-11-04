package Playground;//Copyright Aleksandr Titov 10/15/2020
//Aleksand Titov has ownership and credit for this file


public class Playground {
    public static void main(String[] args) {
        FileReader fileReader = new FileReader();
        System.out.println(fileReader.GetAttributes()[0]);

        FileWriter fileWriter = new FileWriter();
        int[] atts = {900, 732};
        fileWriter.SetValue(atts);

        fileReader = new FileReader();
        System.out.println(fileReader.GetAttributes()[0]);
    }
}
