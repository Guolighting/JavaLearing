package Factory;

public class CarEngineFactory {
    public CarEngine getShape(String engine){
        if(engine==null){
            return null;
        }
        if(engine.equalsIgnoreCase("BMW")){
            return new BMWCarEngine();
        }
        else if(engine.equalsIgnoreCase("Benz")){
            return new BenzCarEngine();
        }
        return null;
    }
}
