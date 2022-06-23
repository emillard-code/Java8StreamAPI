package com.project;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainTest {

    @Test
    public void testFilter() {

        List<String> list = Arrays.asList("Reflection", "Collection", "Stream");
        List<String> assertList = Arrays.asList("Stream");

        List<String> result = list
                .stream()
                .filter(s->s.startsWith("S"))
                .collect(Collectors.toList());

        Assertions.assertEquals(result, assertList);

    }

    @Test
    public void testMapping() {

        List<Integer> list = Arrays.asList(2,3,4,5);
        List<Integer> assertList = Arrays.asList(4,9,16,25);

        List<Integer> result = list
                .stream()
                .map(x->x*x)
                .collect(Collectors.toList());

        Assertions.assertEquals(result, assertList);

    }

    @Test
    public void testSorting() {

        List<String> list = Arrays.asList("Reflection", "Collection", "Stream");
        List<String> assertList = Arrays.asList("Collection", "Reflection", "Stream");

        List<String> result = list
                .stream()
                .sorted()
                .collect(Collectors.toList());

        Assertions.assertEquals(result, assertList);

    }

}
