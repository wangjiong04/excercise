package basic.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Created by wangjun on 2019/1/7.
 */
public class OptionalMap {
    public static void main(String[] args){
        Manager mr=new Manager("Mr.aaa");
        Department d=new Department();
        d.setBoss(mr);
        System.out.println("name: " +d.getBoss().map(Manager::getName));
        System.out.println("name: " +d.getBoss().map(Manager::getName).orElse("empty"));
        test();
    }


    private static void test(){
        List<String> companyNames = Arrays.asList(
                "paypal", "oracle", "", "microsoft", "", "apple");
        Optional<List<String>> listOptional = Optional.of(companyNames);

        int size = listOptional
                .map(List::size)
                .orElse(0);
        System.out.println(size);
    }

}
class Department {
    private Manager boss;

    public Optional<Manager> getBoss() {
        return Optional.ofNullable(boss);
    }

    public void setBoss(Manager boss) {
        this.boss = boss;
    }
}class Manager {
    private String name;

    public Manager(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
