package patterns.singleton;

public enum EnumSingleton {
    INSTANCE;
    private String name;

    public void doSomething(){
        System.out.println(name);
    }
}
