package patterns.singleton;

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton threadSafeSingleton;
    private ThreadSafeSingleton(){}
    private static synchronized ThreadSafeSingleton getInstance(){
        if (null==threadSafeSingleton){
            threadSafeSingleton=new ThreadSafeSingleton();
        }
        return threadSafeSingleton;
    }
}
