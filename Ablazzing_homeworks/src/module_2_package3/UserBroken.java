package module_2_package3;

public class UserBroken {
    private int age;
    private String name;
    public UserBroken(int age, String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString(){
        return name + ":  "+ age;
    }

    @Override
    public int hashCode(){

        return 1;
    }

    @Override
    public boolean equals(Object object){

        return true;
    }


}
