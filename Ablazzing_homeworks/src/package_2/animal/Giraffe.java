package package_2.animal;

public class Giraffe {
    private double height;
    private boolean sex;
    public Giraffe(double height, boolean sex){
        this.height = height;
        this.sex = sex;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public void setSex(boolean sex){
        this.sex = sex;
    }

    public double getHeight(){
        return this.height;
    }

    public boolean getSex(){
        return this.sex;
    }

}

