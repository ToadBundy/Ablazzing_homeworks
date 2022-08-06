package package_4.AdvancedTaskShop;

public class Watch {
    private boolean watchIsOk;
    public Watch(boolean watchIsOk){
        this.watchIsOk = watchIsOk;
    }
    public void TikTak() throws WatchBrokenError{
        if(watchIsOk){
            System.out.println("Часы тикают");
        }else {
            throw new WatchBrokenError();
        }
    }
}
