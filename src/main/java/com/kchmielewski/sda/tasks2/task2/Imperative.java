package com.kchmielewski.sda.tasks2.task2;

import java.util.ArrayList;
import java.util.List;

public class Imperative implements Squares {
    @Override
    public List<Integer> squares(List<Integer> integers) {
        List<Integer> result = new ArrayList<>(integers);
        for (int i = 0; i < integers.size(); i++) {
            result.set(i, (int) Math.pow(integers.get(i), 2));
        }
        return result;
    }
}
