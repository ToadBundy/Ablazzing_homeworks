package module_2_package_1;

public class MyList<T extends Object> {
    T[] objects = (T[]) new Object[3];
    int size = 0;

    public void add(T object){
        if(size < objects.length){
            objects[size] = object;
            size++;
        }else{
            increase();
            this.add(object);
        }
    }

    private void increase(){
        T[] tmp = (T[])new Object[objects.length*2];
        for(int counter = 0; counter < objects.length; counter++){
            tmp[counter] = objects[counter];
        }
        objects = tmp;
    }

    public void checkThisWorkFine(){
        for(T mem : objects){
            System.out.println(mem);
        }
    }

}
