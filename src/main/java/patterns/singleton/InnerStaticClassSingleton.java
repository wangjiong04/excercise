package patterns.singleton;

public class InnerStaticClassSingleton {
    private InnerStaticClassSingleton(){

    }
    public InnerStaticClassSingleton getInstance(){
        return SingletonHolder.instatnce;
    }
    private static class SingletonHolder{
        private static final InnerStaticClassSingleton instatnce=new InnerStaticClassSingleton();
    }
}
