package basic.optional;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * Created by wangjun on 2019/1/7.
 */
public class OptionalGet {
    public static void main(String[] args){
        Optional<String> firstOdd= Stream.of("fives","even","length").filter(s -> s.length()%2!=0).findFirst();
        System.out.println( firstOdd.orElse("No odd length string"));

        firstOdd.ifPresent(val->System.out.println(val));

    }
}
