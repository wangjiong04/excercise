package basic.WeekHash;

import java.util.Map;
import java.util.WeakHashMap;

public class WeekHash {
    public static void main(String[] args){
        Map<String, String> weak = new WeakHashMap<String, String>();
        weak.put(new String("1"), "1");
        weak.put(new String("2"), "2");
        weak.put(new String("3"), "3");
        weak.put(new String("4"), "4");
        weak.put(new String("5"), "5");
        weak.put(new String("6"), "6");
        System.out.println(weak.size());
        System.gc();
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(weak.size());
    }
}
