package module_2_package_1.animals;

import module_2_package_1.abilities.Flyable;
import module_2_package_1.abilities.Swimable;

public class Duck implements Flyable {

    @Override
    public void fly() {
        System.out.println("Утка летит");
    }

}
