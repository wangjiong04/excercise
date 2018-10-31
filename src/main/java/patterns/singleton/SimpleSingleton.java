package patterns.singleton;

public class SimpleSingleton {
    private static SimpleSingleton simpleSingleton;
    private SimpleSingleton(){}
    public static SimpleSingleton getInstance(){
        if (null== simpleSingleton){
            simpleSingleton =new SimpleSingleton();
        }
        return simpleSingleton;
    }
}
