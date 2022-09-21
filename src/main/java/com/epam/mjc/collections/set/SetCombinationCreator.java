package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> result = new HashSet<>();
        Set<String> temp = new HashSet<>();
        temp.addAll(firstSet);
        temp.addAll(secondSet);
        temp.addAll(thirdSet);
        for (String current : temp) {
            if (firstSet.contains(current) && secondSet.contains(current) && (!thirdSet.contains(current))){
                result.add(current);
            }
            if ((!firstSet.contains(current)) && (!secondSet.contains(current)) && (thirdSet.contains(current))){
                result.add(current);
            }
        }
        return result;
    }
}
