package basic.optional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Created by wangjun on 2019/1/8.
 */
public class OptionalFunction {
    public Optional<Manager> findById(int id){return Optional.of( new Manager("aaa"));};
    public List<Manager> findByIds(List<Integer> ids){
        return ids.stream().map(this::findById).filter(Optional::isPresent).map(Optional::get).collect(Collectors.toList());
    }
}
