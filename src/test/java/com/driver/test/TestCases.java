package com.driver.test;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

public class Main {
    public static void main(String[] args) {
        RWOnly obj=new RWOnly();
        obj.setName("hello kunal");
        System.out.println(obj.getName());
    }
}
