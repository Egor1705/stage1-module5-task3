package com.epam.mjc;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectionService {

    public List<Integer> filterEvenNumbers(List<Integer> list) {
        return list.stream().filter(n->n%2==0).collect(Collectors.toList());
      //  throw new UnsupportedOperationException("You should implement this method.");
    }

    public List<String> toUpperCaseCollection(List<String> list) {
        return list.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
       // throw new UnsupportedOperationException("You should implement this method.");
    }

    public Optional<Integer> findMax(List<Integer> list) {
        Optional<Integer> var =  list.stream().max(Comparator.naturalOrder());
        if(var.isPresent()){
            var.get();
        }
        return var;
       // throw new UnsupportedOperationException("You should implement this method.");
    }

    public Optional<Integer> findMin(List<List<Integer>> list) {
        List<Integer> newList = list.stream().flatMap(l->l.stream()).collect(Collectors.toList());
        Optional<Integer> var = newList.stream().min(Comparator.naturalOrder());
        if(var.isPresent()){
            var.get();
        }
        return var;
    }

    public Integer sum(List<Integer> list) {
        return list.stream().reduce(0,(a,b)->a+b);
        //throw new UnsupportedOperationException("You should implement this method.");
    }
}
