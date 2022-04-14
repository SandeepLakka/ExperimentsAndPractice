package com.self.datastructures.maps;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class FlattenDictionaryTest {

    private FlattenDictionary underTest;

    @BeforeEach
    public void init() {
        underTest = new FlattenDictionary();
    }

    @Test
    void test_flatten_with_nested_input() {
        Map<String, Object> input, result, expected;
        input = new HashMap<String, Object>() {{
            put("a", 1);
            put("b", new HashMap<String, Object>() {{
                put("c", 2);
                put("d", new HashMap<String, Integer>() {{
                    put("e", 3);
                }});
            }});
        }};
        expected = new HashMap<String, Object>() {{
            put("a", 1);
            put("b.c", 2);
            put("b.d.e", 3);
        }};
        testMapsEquality(expected, underTest.flatten(input));
    }

    @Test
    public void test_flatten_with_non_nested_input() {
        Map<String, Object> input, result, expected;
        input = new HashMap<String, Object>() {{
            put("a", 1);
            put("b", 2);
            put("c", 3);
        }};

        expected = input;

        result = underTest.flatten(input);
        testMapsEquality(expected, result);
    }

    @Test
    public void test_flatten_with_nested_null_key_value() {
        Map<String, Object> input, result, expected;
        input = new HashMap<String, Object>() {{
            put("a", 1);
            put("b", 2);
            put("c", new HashMap<String, Object>() {{
                put(null, null);
            }});
        }};

        expected = new HashMap<String, Object>() {{
            put("a", 1);
            put("b", 2);
            put("c.null", null);
        }};

        result = underTest.flatten(input);
        testMapsEquality(expected, result);
    }


    private void testMapsEquality(Map<String, Object> expected, Map<String, Object> actual) {
        if ((expected == null && actual != null) ||
                (expected != null && actual == null)) {
            fail("Expected or Actual should not be null");
        }
        if ((expected == null) && (actual == null)) {
            return;
        }
        if (expected.size() != actual.size()) {
            fail("Sizes doesn't match");
        }
        assertEquals(expected.keySet(), actual.keySet(), "Keys doesn't match");
        for (String key : expected.keySet()) {
            assertEquals(expected.get(key), actual.get(key), "Values doesn't match for key " + key);
        }
    }
}