package com.self.datastructures.maps;

import java.util.HashMap;
import java.util.Map;

/*
This problem was recently asked by Google:

Given a nested dictionary, flatten the dictionary,
where nested dictionary keys can be represented through dot notation.

Example:

Input: {
  'a': 1,
  'b': {
    'c': 2,
    'd': {
      'e': 3
    }
  }
}
Output: {
  'a': 1,
  'b.c': 2,
  'b.d.e': 3
}

You can assume there will be no arrays, and all keys will be strings.
 */
public class FlattenDictionary {

    public Map<String, Object> flatten(Map<String, Object> map) {

        Map<String, Object> result = new HashMap<>();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            flattenRecur(map, entry.getKey(), entry.getValue(), result);
        }
        return result;
    }

    public void flattenRecur(Map<String, Object> map, String key, Object val, Map<String, Object> result) {
        if (!(val instanceof Map)) {
            result.put(key, val);
        } else {
            for (Map.Entry<String, Object> childKey : ((Map<String, Object>) val).entrySet()) {
                flattenRecur(map, key + "." + childKey.getKey(), childKey.getValue(), result);
            }
        }
    }
}
