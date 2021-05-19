package com.test;

import com.company.LinkedListOperations;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LinkedListTest {
    LinkedListOperations list= new LinkedListOperations();

    @Before
    public void addDataToList(){
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.traverse();
        System.out.println();
    }

    @Test
    public void testRemove(){
        Assert.assertTrue(list.remove(5));
        System.out.println("----After Remove----");
        list.traverse();
    }

    @Test
    public void testMiddleNode(){
        Assert.assertEquals(3, list.findMiddleNode());
    }
}
