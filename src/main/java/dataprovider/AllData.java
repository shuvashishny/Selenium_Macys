package dataprovider;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shuvashish on 2/5/2018.
 */
public class AllData {

    public static List<String> getAllData() {

        List<String> linkNames = new ArrayList<String>();
        linkNames.add("MEN");
        linkNames.add("HOME");
        linkNames.add("BED & BATH");
        linkNames.add("SHOES");
        linkNames.add("HANDBAGS");
        linkNames.add("BEAUTY");
        linkNames.add("KIDS");
        linkNames.add("WOMEN");

        return linkNames;
    }
}
