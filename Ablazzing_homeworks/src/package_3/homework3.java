package package_3;

import package_3.aboutCars.Cars;
import package_3.aboutCars.Toyota;
import package_3.aboutCars.Zhiguli;

import java.io.*;
import java.util.Random;

public class homework3 {
    public static void main(String[] args) throws IOException {
        //task1_basic
        System.out.println("Task1_base");
        Zhiguli lada = new Zhiguli();
        Toyota toyota = new Toyota();
        lada.Broke();
        toyota.TurnTheMusic();
        System.out.println("###################");

        //task2_basic
        System.out.println("Task2_base");
        String line = "";
        BufferedReader br = new BufferedReader(new FileReader("Ablazzing_homeworks/src/package_3/my_first_file.txt"));
        while(br.ready()) {
            line += br.readLine()+ " ";
        }
        System.out.println(line);
        br.close();
        System.out.println("#####################");


        //task3_basic
        FinancialRecord finRec = new FinancialRecord(500, 300);
        String report = "Incomes:\t"+ finRec.getIncomes()+ "\n"+"Outcomes:\t" + finRec.getOutcomes();
        FileWriter fw = new FileWriter("Ablazzing_homeworks/src/package_3/report.txt");
        fw.write(report);
        fw.close();

        //task1_advanced
        System.out.println("Task1_Advancced");
        Cars[] cars = new Cars[40];
        int i = 0;
        while(i<39){
            cars[i] = CarFactory.createToyota();
            cars[i+1] = CarFactory.createZhiguli();
            i+=2;
        }

        for (Cars car : cars){
            if(car instanceof Zhiguli){
                ((Zhiguli) car).Broke();
            } else {
                ((Toyota) car).TurnTheMusic();
             }
        }
        System.out.println("##############");

        //task2_advanced
        Integer fullIncome = 0;
        Integer fullOutcome = 0;
        System.out.println("Task2_Advancced");
        FileWriter fileWriter = new FileWriter("Ablazzing_homeworks/src/package_3/report.txt");

        FinancialRecord[] finbase = new FinancialRecord[10];
        Random random = new Random(1);

        i = 0;
        while(i<10){
            finbase[i] = new FinancialRecord(random.nextInt(10000), random.nextInt(10000));
            i++;
        }
        for(FinancialRecord rep : finbase){
            fileWriter.write(rep.getIncomes() + ";"+ rep.getOutcomes() + "\n");
        }
        fileWriter.close();
        BufferedReader bufferedReader = new BufferedReader(new FileReader("Ablazzing_homeworks/src/package_3/report.txt"));
        while(bufferedReader.ready()) {
            fullIncome += Integer.parseInt(bufferedReader.readLine().split(";")[0]);
            fullOutcome += Integer.parseInt(bufferedReader.readLine().split(";")[1]);
        }
        bufferedReader.close();
        System.out.println("Вся выручка: "+ fullIncome);
        System.out.println("Все расходы: "+ fullOutcome);

    }
}
