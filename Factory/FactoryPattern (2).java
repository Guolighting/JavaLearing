package Factory;

public class FactoryPattern {
    public static void main(String[] args) {
        CarEngineFactory engine=new CarEngineFactory();
        CarEngine carEngine1 =engine.getShape("BMW");
        carEngine1.makemove();
        CarEngine carEngine2 =engine.getShape("Benz");
        carEngine2.makemove();
    }
}
