package filter;

import java.util.List;

/**
 * @description
 * @author: panguoyan
 * @date: 2018/12/26 17:40
 */
public interface  Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
