package patterns.singleton;

/**
 * 原子操作（atomic）就是不可分割的操作，在计算机中，就是指不会因为线程调度被打断的操作。
 * 什么是指令重排？
 * 简单来说，就是计算机为了提高执行效率，会做的一些优化，在不影响最终结果的情况下，可能会对一些语句的执行顺序进行调整。
 * 由于有一个『instance已经不为null但是仍没有完成初始化』的中间状态，而这个时候，如果有其他线程刚好运行到第一层if (instance == null)这里，
 * 这里读取到的instance已经不为null了，所以就直接把这个中间状态的instance拿去用了，就会产生问题。
 * volatile关键字的一个作用是禁止指令重排，把instance声明为volatile之后，对它的写操作就会有一个内存屏障，
 * 这样，在它的赋值完成之前，就不用会调用读操作。
 */
public class LockSafeSingleton {
    private static volatile LockSafeSingleton lockSafeSingleton;
    private LockSafeSingleton(){

    }
    public  static LockSafeSingleton getInstance(){
        if (null==lockSafeSingleton){
            synchronized (LockSafeSingleton.class){
                if (null==lockSafeSingleton){
                    lockSafeSingleton=new LockSafeSingleton();
                }
            }
        }
        return lockSafeSingleton;
    }
}
