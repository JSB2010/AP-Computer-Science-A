package Week18.april_weather_data;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Weather {

    public static double average(int[] temps){
        int sum = 0;
        for (int temp : temps) {
            sum += temp;
        }
        return (double) sum /temps.length;
    }

    public static int[] minMax(int[] temps){
        int max = temps[0];
        int min = temps[0];
        for (int temp : temps){
            if  (temp > max){
                max = temp;
            }
            if (temp < min){
                min = temp;
            }
        }
        return new int[]{min,max};
    }
    public static void main(String[] args) throws IOException {

        //Loading all files
        File newYork = new File("src/Week18/april_weather_data/new_york_april.txt");
        File chicago = new File("src/Week18/april_weather_data/chicago_april.txt");

        //Creating all scanners
        Scanner newYorkReader = new Scanner(newYork);
        Scanner chicagoReader = new Scanner(chicago);


        //Initializing all arrays
        int[] nyArr = new int[30];
        int[] chicagoArr = new int[30];

        //Adding values to arrays
        for(int i = 0; i < nyArr.length; i++){
            nyArr[i] = newYorkReader.nextInt();
        }
        for(int i = 0; i < chicagoArr.length; i++){
            chicagoArr[i] = chicagoReader.nextInt();
        }

        System.out.println("City: New York");
        System.out.println("Average: " + average(nyArr));
        System.out.println("Min: " + minMax(nyArr)[0]);
        System.out.println("Min: " + minMax(nyArr)[1]);
        System.out.println();

        System.out.println("City: Chicago");
        System.out.println("Average: " + average(chicagoArr));
        System.out.println("Min: " + minMax(chicagoArr)[0]);
        System.out.println("Min: " + minMax(chicagoArr)[1]);
        System.out.println();

        System.out.println("Comparison");

        if(Weather.average(nyArr) > Weather.average(chicagoArr)){
            System.out.println("Highest average: New York (" + Weather.average(nyArr) + "ºF)");
        }
        else{
            System.out.println("Highest average: Chicago (" + Weather.average(chicagoArr) + "ºF)");
        }

        if(Weather.minMax(nyArr)[0] < Weather.minMax(chicagoArr)[0]){
            System.out.println("Lowest minimum: New York (" + minMax(nyArr)[0] + "ºF)");
        }
        else{
            System.out.println("Lowest minimum: Chicago (" + minMax(chicagoArr)[0] + "ºF)");
        }

        if(Weather.minMax(nyArr)[1] - Weather.minMax(nyArr)[0] > Weather.minMax(chicagoArr)[1] - Weather.minMax(chicagoArr)[0]){
            System.out.println("Biggest Range: New York (" + (Weather.minMax(nyArr)[1] - Weather.minMax(nyArr)[0]) + "ºF)");
        }
        else{
            System.out.println("Biggest Range: Chicago (" + (Weather.minMax(chicagoArr)[1] - Weather.minMax(chicagoArr)[0]) + "ºF)");
        }
    }
}
