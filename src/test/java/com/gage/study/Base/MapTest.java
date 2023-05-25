package com.gage.study.Base;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    @Test
    public void testMap() {
        Map<String, String> map = new HashMap<>();
        map.put("name", "Gage");
        System.out.println(map.get("name"));
        System.out.println((String) null);
    }
}
