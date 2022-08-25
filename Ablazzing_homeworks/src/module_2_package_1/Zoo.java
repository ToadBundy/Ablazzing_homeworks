package module_2_package_1;

import module_2_package_1.abilities.Biteable;
import module_2_package_1.abilities.Flyable;
import module_2_package_1.abilities.Swimable;

public class Zoo <T extends Swimable,V extends Flyable,K extends Biteable >{

    T swimable;
    V flyable;
    K biteable;
    public Zoo(){

    }

    public Zoo(T swimable, V flyable, K biteable){
        this.swimable = swimable;
        this.biteable = biteable;
        this.flyable = flyable;
    }

    public void feedSwimable(){
        System.out.println("Плвающее животное ест");
        swimable.swim();
    }
    public void feedFlyable(){
        System.out.println("Летающее животное ест");
        flyable.fly();

    }
    public void feedBiteble(){
        System.out.println("Кусающееся животное ест");
        biteable.bite();

    }

    public void setAnimals(T swimable, V flyable, K biteable){
        this.swimable = swimable;
        this.flyable = flyable;
        this.biteable = biteable;
    }

    public void setAnimal(T swimable){
        this.swimable = swimable;
    }
    public void setAnimal(V flyable){
        this.flyable = flyable;
    }
    public void setAnimal(K biteable){
        this.biteable = biteable;
    }

    public T  getSwimableAnimal(){
        return swimable;
    }
    public V getFlyableAnimal(){
        return flyable;
    }
    public K getBiteableAnimal(){
        return biteable;
    }


}

