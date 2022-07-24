package package_2;
import package_2.animal.Cat;
import package_2.animal.Giraffe;
import package_2.store.Store;
import package_2.store.Worker;

import java.util.HashMap;
import java.util.Map;

public class homework2 {


    public static void main(String[] args) {
        Cat myCat = new Cat(2, 2);
        Giraffe myGiraffe  =new Giraffe(3.34, true);

        Store store = new Store(1000);
        Worker Ivan = new Worker();
        Worker Ilya = new Worker();
        Worker Fedr = new Worker();

        Fedr.spoilSomeVodka(store, 10);
        Fedr.getSpoiledVodka();
        System.out.println("############");
        Ilya.spoilSomeVodka(store, 190);
        Ilya.getSpoiledVodka();
        System.out.println("############");
        Ivan.spoilSomeVodka(store, 300);
        Ivan.getSpoiledVodka();
        System.out.println("############");
        store.getVodka();
    }

    //Задача 1
    public static void base_task1() {
        int i = 1;
        while (i <= 100) {
            System.out.print(i + "a" + " ");
            i++;
        }
    }

    //Задача 2
    public static void base_task2(int ageChildren) {
        if (ageChildren < 6) {
            System.out.println("Пошел в сад!");
        } else if (ageChildren < 11) {
            System.out.println("Пошел в младшую школу!");
        } else if (ageChildren < 17) {
            System.out.println("Пошел в старшую школу!");
        } else {
            System.out.println("Пошел в институт!");
        }
    }

    //Задача 3
    public static void base_task3(boolean chicken, boolean vegetables, boolean sour, boolean toast, boolean sausage, boolean eggs) {
        if (chicken && vegetables && sour && toast) {
            System.out.println("Цезарь");
        } else if ((chicken || sausage) && vegetables && eggs) {
            System.out.println("Оливье");
        } else if (vegetables) {
            System.out.println("Овощной");
        } else {
            System.out.println("Ничего нет");
        }
    }

    //Задача 1(Advanced)
    public static void advance_task1(double increment) {
        if (increment <= 0) {
            return;
        }

        int counter = 0;
        double result = 0;
        while (result < 1_000_000) {
            result = result + increment;
            counter++;
        }
        System.out.println(counter);
    }
    //Задача 2(Advanced)
    public static int[] advance_task2(int [] array){
        for(int i = 0; i< array.length; i++){
            if(i%2 == 0){
                array[i] = 0;
            }
        }
        return array;
    }

    //Задача 3(Advanced)
     public static void advance_task3(boolean hasFuel, boolean hasElectricProblem, boolean hasMotorProblem, boolean hasTransmissionProblem, boolean hasWheelsproblem ){
        int[] services = new int[]{ BooleanToInt(hasElectricProblem), BooleanToInt(hasMotorProblem), BooleanToInt(hasTransmissionProblem), BooleanToInt(hasWheelsproblem)};
        int[] prices = new int[]{ 5000, 10000, 4000, 2000};
        double summ = 0;
        int numberOfBroken = 0;
        double discount = 0;
        for(int i = 0; i < 4; i++){
            summ = summ + services[i] * prices[i];
            numberOfBroken = numberOfBroken + services[i];
        }
        if(!hasFuel && (summ == 0) ){
            System.out.println("1000р за консультацию");
            return;
        }
        //смотрим какая будет скидка
        if(numberOfBroken >= 2){
            discount = 0.1;
        }
        if(hasTransmissionProblem && (hasElectricProblem || hasMotorProblem)){
            discount = 0.2;
        }
        summ = summ - summ * discount;
         System.out.println("С Вас "+ summ + " руб");
         System.out.println("Скидка на услуги составила "+ discount*100 + "%");

     }

    public static void advance_task4(){

    }




     public static int BooleanToInt(boolean value){
        if(value){
            return 1;
        }
        else{return 0;}
     }
}

