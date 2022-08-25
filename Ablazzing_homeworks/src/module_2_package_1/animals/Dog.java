package module_2_package_1.animals;

import module_2_package_1.abilities.Biteable;
import module_2_package_1.abilities.Swimable;

public class Dog implements  Biteable {

    @Override
    public void bite() {
        System.out.println("Собака кусает");
    }

}
