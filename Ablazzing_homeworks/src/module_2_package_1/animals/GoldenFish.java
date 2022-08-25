package module_2_package_1.animals;

import module_2_package_1.abilities.Biteable;
import module_2_package_1.abilities.Swimable;

public class GoldenFish implements Swimable {

    @Override
    public void swim() {
        System.out.println("Золотая рыбка плывет");
    }

}
