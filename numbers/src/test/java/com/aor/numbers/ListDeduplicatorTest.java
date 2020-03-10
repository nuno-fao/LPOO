package com.aor.numbers;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ListDeduplicatorTest {
    private ListDeduplicator deduplicator;
    private List<Integer> expected;

    @Before
    public void helper(){

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(2);
        list.add(5);

        expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(4);
        expected.add(5);

        deduplicator = new ListDeduplicator(list);
    }

    @Test
    public void deduplicate() {
        List<Integer> distinct = deduplicator.deduplicate();

        assertEquals(expected, distinct);
    }

    @Test
    public void duptest(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(2);

        ListDeduplicator newlist = new ListDeduplicator(list);

        List<Integer> dups=newlist.deduplicate();
        assertEquals(3,dups.size());
    }
}