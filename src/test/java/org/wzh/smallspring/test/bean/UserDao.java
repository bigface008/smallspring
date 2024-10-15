package org.wzh.smallspring.test.bean;

import java.util.HashMap;
import java.util.Map;

public class UserDao {
    private static Map<String, String> hashMap = new HashMap<>();

    static {
        hashMap.put("1", "Go");
        hashMap.put("2", "Rust");
        hashMap.put("3", "Python");
    }

    public String queryUserName(String uid) {
        return hashMap.get(uid);
    }
}
