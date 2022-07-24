package package_2.store;
public class Worker {
    private int spoiledVodka;
    public Worker(){
        this.spoiledVodka = 0;
    }

    public void spoilSomeVodka(Store store, int numberOfBottles){
        if(store.giveVodka(numberOfBottles)){
            spoiledVodka = numberOfBottles;
            System.out.println("Я испортил водку!");
        }else{
            return;
        }
    }
    public void getSpoiledVodka(){
        System.out.println("Я испортил: "+ spoiledVodka);
    }
}
