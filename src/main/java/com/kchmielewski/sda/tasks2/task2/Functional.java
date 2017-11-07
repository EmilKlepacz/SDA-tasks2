package com.kchmielewski.sda.tasks2.task2;

import java.util.List;
import java.util.stream.Collectors;

public class Functional implements Squares {
    @Override
    public List<Integer> squares(List<Integer> integers) {
        List<Integer> squaredList = integers.stream().map(s->s*s).collect(Collectors.toList());
        return  squaredList;
    }

}
