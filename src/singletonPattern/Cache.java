package singletonPattern;

import java.util.HashMap;
import java.util.Map;

public class Cache {
    private Map<String, String> map;

    private static Cache instance;

    private Cache() {
        map = new HashMap<>();
    }

    public synchronized static Cache getInstance() {
        // synchronized -> ensures that only one thread can access this method at a time
        if (instance == null) {
            instance = new Cache();
        }
        return instance;
    }

    public void putKeyValue(String key, String value) {
        map.put(key, value);
    }

    public String getValue(String key) {
        return map.get(key);
    }
}
