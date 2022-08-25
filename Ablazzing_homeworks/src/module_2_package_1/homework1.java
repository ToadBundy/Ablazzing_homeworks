package module_2_package_1;

import module_2_package_1.abilities.Biteable;
import module_2_package_1.abilities.Flyable;
import module_2_package_1.abilities.Swimable;
import module_2_package_1.animals.*;

public class homework1 {
    public static void main(String[] args) {
         //task 1
         Tiger tiger = new Tiger();
         Jellyfish jellyfish = new Jellyfish();
         Colibri colibri = new Colibri();
         Dog dog = new Dog();
         Duck duck = new Duck();
         GoldenFish goldenFish = new GoldenFish();

         Zoo<Swimable, Flyable, Biteable> zoo1 = new Zoo<>(jellyfish, colibri, tiger);
         Zoo<Swimable, Flyable, Biteable> zoo2 = new Zoo<>(goldenFish, duck, dog);

         zoo1.feedBiteble();
         //task2
          MyList<String> myList = new MyList<>();
          myList.add("one");
          myList.add("two");
          myList.add("three");
          myList.add("four");
          myList.add("five");

          myList.checkThisWorkFine();

    }


}
