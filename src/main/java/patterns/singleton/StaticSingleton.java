package patterns.singleton;

public class StaticSingleton {
    private static StaticSingleton staticSingleton;
    static {
        staticSingleton=new StaticSingleton();
    }
    private StaticSingleton(){}
    private static StaticSingleton getInstance(){
        return staticSingleton;
    }
}
