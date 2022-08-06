package package_4.AdvancedTask;

public class Rose extends Plant implements Smelling, Blooming {
    @Override
    public void Bloom() {
        System.out.println("Роза: умеет цвести");
    }

    @Override
    public void Smell() {
        System.out.println("Роза: умеет пахнуть");
    }
}
