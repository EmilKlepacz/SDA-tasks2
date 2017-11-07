package com.kchmielewski.sda.tasks2.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Imperative implements CopyList {
    @Override
    public <T> List<T> copy(List<T> list) {
        return new ArrayList<T>(list);
    }
}
