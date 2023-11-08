package com.oreilly;

import com.google.common.collect.ImmutableList;
import org.junit.Test;

import javax.management.ImmutableDescriptor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestGoogleLibrary {
    public void method() {
        List<String> list = new ArrayList<>(Arrays.asList("one", "two", "three"));
        List<String> unmodifiableList = Collections.unmodifiableList(list);
        unmodifiableList.add("four");
    }
    @Test(expected = UnsupportedOperationException.class)
    public void givenUsingGuava_whenUnmodifiableListIsCreated_thenNotModifiable() {
        List<String> list = new ArrayList<>(Arrays.asList("one", "two", "three"));
        List<String> unmodifiableList = ImmutableList.copyOf(list);
        unmodifiableList.add("four");
    }
}
