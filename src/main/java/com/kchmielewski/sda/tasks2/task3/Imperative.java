package com.kchmielewski.sda.tasks2.task3;

import java.util.ArrayList;
import java.util.List;

public class Imperative implements OnlyPositive {
    @Override
    public List<Integer> positive(List<Integer> numbers) {
        List<Integer> copy = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > 0) copy.add(numbers.get(i));
        }
        return copy;
    }
}
