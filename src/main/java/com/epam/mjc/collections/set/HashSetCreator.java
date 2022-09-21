package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> result = new HashSet<>();
        for (int currentNum : sourceList) {
            if (currentNum % 2 == 0){
                result.add(currentNum);
                while(currentNum / 2 >= 1){
                    currentNum = currentNum / 2;
                    result.add(currentNum);
                }
            } else {
                result.add(currentNum);
                result.add(2*currentNum);
            }

        }
        return result;
    }
}
