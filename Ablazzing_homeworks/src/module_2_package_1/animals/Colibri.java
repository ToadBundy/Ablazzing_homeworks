package module_2_package_1.animals;

import module_2_package_1.abilities.Flyable;

public class Colibri implements Flyable {

    @Override
    public void fly() {
        System.out.println("Колибри летит");
    }
}
