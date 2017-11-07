package com.kchmielewski.sda.tasks2.task4;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Functional implements FlatMap {
    @Override
    public <T> List<T> flatMap(List<List<T>> numbers) {
        List<T> flatmap = numbers.stream().flatMap(Collection::stream).collect(Collectors.toList());
        return  flatmap;
    }
}
