package package_4.BaseTask1;

public class Duck implements Flying{
    private boolean isInjured;

    public Duck(boolean isInjured){
        this.isInjured = isInjured;
    }
    @Override
    public void Fly() throws FlyException {
        if(!isInjured){
            System.out.println("Утка летит");
        }else{
            throw new FlyException("Ошибка: Утка ранена");
        }
    }
}
