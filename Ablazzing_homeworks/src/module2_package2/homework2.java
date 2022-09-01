package module2_package2;

import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class homework2 {
    public static void main(String[] args) {
        //Task_1
        List<Integer> integers = List.of(1,2,3,4,5,5,8,8,9);
        Random random = new Random(1);

        integers.stream()
                .filter(p-> p>4)
                .distinct()
                .map(User::new)
                .map(e->e.addLine(Stream.generate(()->random.nextInt(10))
                        .limit(e.getId())
                        .collect(Collectors.toList())))
                .map(User::getLine)
                .flatMap(Collection::stream)
                .map(e -> e*10)
                .reduce(Integer::sum)
                .ifPresentOrElse(System.out::println,()->System.out.println(0));


        //Task_2
        List<List<Integer>> lists = List.of(List.of(1, 2), List.of(3, 4, 5), List.of());
        lists.stream()
                .sorted((a,b) -> b.size() - a.size())
                .flatMap(Collection::stream)
                .collect(Collectors.toList())
                .forEach(e -> System.out.print(e+" "));

        //Task 3
        System.out.println();
        lists.stream()
                .map(e -> e.stream().reduce(0,Integer::sum))
                .map(e->e==12)
                .reduce((a,b)->a || b)
                .ifPresent(System.out::println);


    }

}

