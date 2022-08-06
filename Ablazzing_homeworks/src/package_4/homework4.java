package package_4;

import package_4.AdvancedTask.*;
import package_4.AdvancedTaskShop.*;
import package_4.BaseTask1.Duck;
import package_4.BaseTask1.FlyException;
import package_4.BaseTask1.Flying;
import package_4.BaseTask1.Plane;



public class homework4 {
    public static void main(String[] args)  {

        //Task1_base
        Flying[] array = new Flying[4];

        array[0] = new Duck(true);
        array[1] = new Duck(false);
        array[2] = new Plane(10);
        array[3] = new Plane(-1);

        for(Flying f : array){
            try{
                f.Fly();
            }catch (FlyException e){
                System.out.println(e.getMessage());
            }
        }

        //Task1_Advanced
        System.out.println("#################");
        Blooming[] blooming = new Blooming[2];
        blooming[0] = new Rose();
        blooming[1] = new Fern();
        Smelling[] smelling = new Smelling[3];
        smelling[0] = new Pine();
        smelling[1] = new Fir();
        smelling[2] = new Rose();

        for(Blooming b : blooming){
            b.Bloom();
        }
        for(Smelling s: smelling){
            s.Smell();
        }

        //Task_Advanced_2
        System.out.println("#################");
        Brand brand = new Brand();
        Shop shop1 = new Shop();
        Shop shop2 = new Shop();
        Worker worker1 = new Worker(new Watch(true));
        Worker worker2 = new Worker(new Watch(false));

        shop1.addWorker(worker1);
        shop2.addWorker(worker2);
        brand.addShop(shop1);
        brand.addShop(shop2);

        for(Shop i : brand.getShops()){
            for(Worker j : i.getWorkers()){
                try{
                j.getWatch().TikTak();}
                catch (WatchBrokenError e){
                    System.out.println("Часы сломаны");
                }
            }
        }


    }
}
