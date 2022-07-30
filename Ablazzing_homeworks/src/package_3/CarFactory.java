package package_3;

import package_3.aboutCars.Toyota;
import package_3.aboutCars.Zhiguli;

public class CarFactory {
    public static Zhiguli createZhiguli(){
        return new Zhiguli();
    }
    public static Toyota createToyota(){
        return new Toyota();
    }
}
