package module2_package2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class User {
    private int id;
    private List<Integer> lineOfNumbers;
    public User(int id){
        this.setId(id);
    }
    public User setId(int id){
        this.id = id;
        return this;
    }

    public User addLine(List<Integer> list){
        lineOfNumbers = list;
        return this;
    }

    public int getId(){
        return id;
    }
    public List<Integer> getLine(){
        return lineOfNumbers;
    }

}
