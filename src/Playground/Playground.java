package Playground;//Copyright Aleksandr Titov 10/15/2020
//Aleksand Titov has ownership and credit for this file


public class Playground {
    public static void main(String[] args) {
        FileReader fileReader = new FileReader();
        System.out.println(fileReader.GetAttributes()[0]);

        int[] atts = {900, 732};
        fileReader.SetValue(atts);
        fileReader.SetNewCurrentUser(5);

    }
}
