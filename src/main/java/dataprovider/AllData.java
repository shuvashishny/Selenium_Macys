package dataprovider;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shuvashish on 2/5/2018.
 */
public class AllData {

    public static List<String> getAllData() {

        List<String> linkNames = new ArrayList<>();
        linkNames.add("Men");
        linkNames.add("Sale");
        linkNames.add("Brands");
        linkNames.add("Departments");
        linkNames.add("Kids");
        linkNames.add("Women");

        return linkNames;
    }
}
