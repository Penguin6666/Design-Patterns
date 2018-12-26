package filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @description
 * @author: panguoyan
 * @date: 2018/12/26 17:40
 */
public class CriteriaMale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getGender().equalsIgnoreCase("MALE")){
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
