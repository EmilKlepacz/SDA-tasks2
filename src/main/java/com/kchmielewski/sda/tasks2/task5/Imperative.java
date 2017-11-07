package com.kchmielewski.sda.tasks2.task5;

import java.util.List;

public class Imperative implements Mean {
    @Override
    public double integersMean(List<Integer> numbers) {
        if (numbers.size() == 0) return 0;
        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return (sum / numbers.size());
    }


}
