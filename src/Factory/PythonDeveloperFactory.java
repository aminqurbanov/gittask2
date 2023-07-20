package Factory;

public class PythonDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer creatDeveloper() {
        return new PythonDeveloper();
    }
}
