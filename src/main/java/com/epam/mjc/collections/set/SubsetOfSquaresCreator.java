package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        TreeSet<Integer> temp = new TreeSet<>();
        for (Integer current : sourceList){
            temp.add(current * current);
        }

        return temp.subSet(lowerBound, true, upperBound, true);
        //NavigableSet subSet(Е lowerBound, boolean lowlncl, Е upperBound, boolean highIncl) - возвращает NavigableSet, включающий все элементы вызывающего набора, которые больше lowerBound и меньше upperBound. Если lowlncl равно true, то элемент, равный lowerBound, включается. Если highlncl равно true, также включается элемент, равный upperBound.
    }
}
