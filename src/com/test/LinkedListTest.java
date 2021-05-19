package com.test;

import com.company.LinkedListOperations;
import org.junit.Test;

public class LinkedListTest {
    LinkedListOperations list= new LinkedListOperations();

    @Test
    public void addDataToList(){
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.traverse();
    }
}
