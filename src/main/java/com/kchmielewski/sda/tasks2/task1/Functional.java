package com.kchmielewski.sda.tasks2.task1;

import java.util.List;
import java.util.stream.Collectors;

public class Functional implements CopyList {
    @Override
    public <T> List<T> copy(List<T> list) {
        List<T> copy = list.stream().collect(Collectors.toList());
        return copy;
    }
}
