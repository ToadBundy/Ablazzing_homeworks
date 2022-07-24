package package_2.store;

public class Store {
    private int allVodka;
    public Store(int allVodka){
        this.allVodka = allVodka;
    }
    public boolean giveVodka(int numberOfBottles){
        if(numberOfBottles <= allVodka){
            allVodka = allVodka - numberOfBottles;
            return true;
        }else {
            System.out.println("Упс, у нас нет столько водки!");
            return false;
        }
    }

    public void getVodka(){
        System.out.println("На складе осталось: "+ allVodka);
    }
}
