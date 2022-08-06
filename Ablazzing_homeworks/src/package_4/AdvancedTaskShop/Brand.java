package package_4.AdvancedTaskShop;

public class Brand {
    private Shop [] shops = new Shop[0];
    public void addShop(Shop worker){
        Shop [] temp = new Shop[shops.length + 1];
        for(int i = 0; i< shops.length; i++){
            temp[i] = shops[i];
        }
        temp[shops.length] = worker;
        shops = temp;
    }

    public Shop[] getShops(){
        return shops;
    }

}
