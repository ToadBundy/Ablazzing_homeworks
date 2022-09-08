package module_2_package3;

public class User {
    private int age;
    private String name;

    public User(int age, String name){
        this.age = age;
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    @Override
    public String toString(){
        return name + ":  "+ age;
    }
    @Override
    public int hashCode(){
        int result = 0;
        char [] charName = name.toCharArray();
        for(int step = 0; step<name.length(); step++){
            result = step*charName[step];
        }
        return result;
    }

    @Override
    public boolean equals(Object object){
        if(object instanceof User) {
            User otherUser = (User) object;
            return name.equals(otherUser.getName());
        }
        return false;
    }
}
