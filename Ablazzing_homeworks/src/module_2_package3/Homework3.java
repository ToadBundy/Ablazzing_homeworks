package module_2_package3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Homework3 {
    public static void main(String[] args) {
        HashSet<User> users = new HashSet<>();
    //Task_1
        users.add(new User(23, "Ivan"));
        users.add(new User(45, "Ivan"));
        users.add(new User(52, "Gorgio"));
        System.out.println(users);
    //Task_2
        HashSet<UserBroken> brokenUsers = new HashSet<>();
        brokenUsers.add(new UserBroken(23, "Migel"));
        brokenUsers.add(new UserBroken(56, "Anton"));
        brokenUsers.add(new UserBroken(90, "Lisa"));
        System.out.println(brokenUsers);
    //Task_3
        HashMap<CarBroken, Integer> brokenCars = new HashMap<>();
        brokenCars.put(new CarBroken(), 123);
        brokenCars.put(new CarBroken(), 345);

        System.out.println(brokenCars);
    }

}
