package com.aor.numbers;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ListAggregatorTest {
    private ListAggregator aggregator;
    private List<Integer> testlist;

    @Before
    public void helper(){
        testlist = new ArrayList<>();
        testlist.add(1);
        testlist.add(2);
        testlist.add(4);
        testlist.add(2);
        testlist.add(5);

        aggregator = new ListAggregator(testlist);
    }
    @Test
    public void sum() {

        int sum = aggregator.sum();

        assertEquals(14, sum);
    }

    @Test
    public void max() {

        int max = aggregator.max();

        assertEquals(5, max);
    }

    @Test
    public void min() {

        int min = aggregator.min();

        assertEquals(1, min);
    }

    @Test
    public void distinct() {

        int distinct = aggregator.distinct(new ListDeduplicator(testlist));

        assertEquals(4, distinct);
    }

    @Test
    public void negmax(){
        List<Integer> list = new ArrayList<>();
        list.add(-1);
        list.add(-4);
        list.add(-5);

        ListAggregator newlist = new ListAggregator(list);

        int max=newlist.max();
        assertEquals(-1,max);
    }

    @Test
    public void dist(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(2);

        ListAggregator newlist = new ListAggregator(list);

        int dist = newlist.distinct(new ListDeduplicator(list));
        assertEquals(3,dist);
    }
}