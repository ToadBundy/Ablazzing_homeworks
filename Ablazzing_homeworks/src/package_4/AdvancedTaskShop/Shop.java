package package_4.AdvancedTaskShop;

public class Shop {
    private Worker [] workers = new Worker[0];
    public void addWorker(Worker worker){
        Worker [] temp = new Worker[workers.length + 1];
        for(int i = 0; i< workers.length; i++){
            temp[i] = workers[i];
        }
        temp[workers.length] = worker;
        workers = temp;
    }
    public Worker[] getWorkers(){
        return workers;
    }
}
