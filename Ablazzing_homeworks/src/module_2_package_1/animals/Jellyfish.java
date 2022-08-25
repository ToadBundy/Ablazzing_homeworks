package module_2_package_1.animals;

import module_2_package_1.abilities.Swimable;

public class Jellyfish implements Swimable {
    @Override
    public void swim() {
        System.out.println("Медуза плывет");
    }
}
