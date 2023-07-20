package Factory;

public class KotlinDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer creatDeveloper() {
        return new Kotlindeveloper();
    }
}
