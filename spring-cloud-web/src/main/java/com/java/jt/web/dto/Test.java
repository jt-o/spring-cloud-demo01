package com.java.jt.web.dto;

import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jt on 2019/10/26 9:57
 */
public class Test {
    public static void main(String[] args) {
        char[] c = new char[]{};
        for (char c1 : c) {
            System.out.println(c1);
        }

        List<String> list = new ArrayList<>();
        list.forEach(l -> {

        });

        CollectionUtils.isEmpty(list);

    }
}
