package package_4.BaseTask1;

public class Plane implements Flying {
    private int countPassengers;
    public Plane(int countPassengers){
        this.countPassengers = countPassengers;
    }
    @Override
    public void Fly() throws FlyException {
        if (countPassengers >= 0){
            System.out.println("Самолет летит");
        } else{
            throw new FlyException("Ошибка: Пассажиров в самолете меньше 0");
        }
    }
}
