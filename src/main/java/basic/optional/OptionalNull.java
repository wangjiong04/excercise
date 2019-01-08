package basic.optional;

import java.util.Optional;

/**
 * Created by wangjun on 2019/1/8.
 */
public class OptionalNull {
    public String testOptional(Test test){
        return Optional.ofNullable(test)
                .flatMap(Test::getTest3)
                .flatMap(Test3::getTest2)
                .map(Test2::getInfo)
                .orElse("  ");
    }
}
class Test{
    public Optional<Test3> getTest3(){
        return Optional.empty();
    }
}
class Test2{
    public String getInfo(){
        return "";
    }
}
class Test3{
    public Optional<Test2> getTest2(){
        return Optional.empty();
    }
}


