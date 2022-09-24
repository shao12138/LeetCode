package SuanFa_300;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NestedIterator_341 implements Iterator<Integer> {
    ArrayList<Integer> result = new ArrayList<>();
    int index = 0;

    private void add(List<NestedInteger> nestedList) {
        for (NestedInteger nestedInteger : nestedList) {
            if (nestedInteger.isInteger()) {
                result.add(nestedInteger.getInteger());
            } else {
                add(nestedInteger.getList());
            }
        }
    }

    public NestedIterator_341(List<NestedInteger> nestedList) {
        add(nestedList);
    }


    public Integer next() {
        return result.get(index++);
    }

    public boolean hasNext() {
        return index < result.size();
    }
}


interface NestedInteger {
    public boolean isInteger();

    public Integer getInteger();

    public List<NestedInteger> getList();
}