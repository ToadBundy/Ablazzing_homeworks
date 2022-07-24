package package_2.animal;

public class Cat {
    private double weight;
    public int age;

    public Cat(double weight, int age){
        this.age =age;
        this.weight = weight;
    }

    public void setAge(int age){
        this.age = age;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }

    public int getAge(){
        return this.age;
    }
    public double getWeight(double weight){
        return this.weight;
    }

}
