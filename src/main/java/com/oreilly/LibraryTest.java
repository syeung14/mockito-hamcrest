package com.oreilly;

import com.google.common.collect.ImmutableList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class LibraryTest {

    public static final String DIMENSION_INSTANCE_ID = "InstanceId";
    public static final String DIMENSION_AVAILABILITY_ZONE = "AvailabilityZone";

    void method() {

        List<String> perInstanceDimensionNames = ImmutableList.of("Program", DIMENSION_INSTANCE_ID);
        List<String> perAZDimensionNames = ImmutableList.of("Program", DIMENSION_AVAILABILITY_ZONE);
        List<String> dimensionsExcludedFromMappingMetrics = ImmutableList.of("PID", "Marketplace", DIMENSION_INSTANCE_ID, DIMENSION_AVAILABILITY_ZONE);
        List<String> perCallerDimensionNames = ImmutableList.of(MetricsNames.DIMENSION_CALLER);
        List<String> perCallerAndEventProcessDimensionNames = ImmutableList
            .<String>builder()
            .add("Program")
            .addAll(perCallerDimensionNames)
            .add(MetricsNames.DIMENSION_EVENT_PROCESS)
            .build();
        List<String> importDimensionNames = ImmutableList
            .<String>builder()
            .addAll(perCallerAndEventProcessDimensionNames)
            .add(MetricsNames.DIMENSION_EVENT_TYPE)
            .build();
        List<String> perCallerSourceTypeDimensionNames = ImmutableList
            .<String>builder()
            .add("Program")
            .addAll(perCallerDimensionNames)
            .add(MetricsNames.DIMENSION_SOURCE_TYPE)
            .build();
        List<String> importSdcIndicatorGraphListDimensionsNames = ImmutableList
            .<String>builder()
            .addAll(importDimensionNames)
            .add(MetricsNames.DIMENSION_INDICATOR_GRAPH)
            .build();
        System.out.println(perCallerDimensionNames);
        System.out.println(perCallerAndEventProcessDimensionNames);
        System.out.println(importSdcIndicatorGraphListDimensionsNames);
    }

    void method2() {
        int[] nums = { 3, 2, 1 };
    }

    public static void main(String[] args) {
        new LibraryTest().compareList();
//        new LibraryTest().method();

    }

    <T> void printList(Iterable<T> iter) {
        for (T v : iter) {
            System.out.println(v);
        }
    }

    void compareList() {
        // create two Array List
        List<String> ArrayList1 = new ArrayList<>();
        List<String> ArrayList2 = new ArrayList<>();

        // insert items in ArrayList 1
        ArrayList1.add("item 1");
        ArrayList1.add("item 2");
        ArrayList1.add("item 4");
        ArrayList1.add("item 3");

        // insert items in ArrayList 2
        ArrayList2.add("item 1");
        ArrayList2.add("item 3");
        ArrayList2.add("item 2");
        ArrayList2.add("item 4");

        // Display both ArrayList
        System.out.println(" ArrayList1 = " + ArrayList2);
        System.out.println(" ArrayList1 = " + ArrayList1);

        // compare ArrayList1 with ArrayList2
        Collections.sort(ArrayList1);
        Collections.sort(ArrayList2);
        if (ArrayList1.equals(ArrayList2)) {
            System.out.println(" Array List are equal");
        } else
        // else block execute when
        // ArrayList are not equal
        {
            System.out.println(" Array List are not equal");
        }

        printList(ArrayList2);

    }
}
