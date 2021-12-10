
package com.rk.main;

import com.rk.MyGeneric;

import java.util.*;

public class UpperBoundedDemo {

    public static void main(String[] args) {
        MyGeneric<Integer> nums = new MyGeneric<Integer>();
        nums.push(21);
        nums.push(3);
        nums.push(15);

        showData(nums);

        // error
        MyGeneric<String> buah = new MyGeneric<String>();
        buah.push("Apel");
        buah.push("Mangga");
        buah.push("Nanas");

        showData(buah); //--> error
    }

    public static void showData(MyGeneric<? extends Number> list) {
        while (!list.isEmpty()) {
            System.out.println(list.pop());
        }
    }
}
