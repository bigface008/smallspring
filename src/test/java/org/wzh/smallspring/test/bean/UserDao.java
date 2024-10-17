package org.wzh.smallspring.test.bean;

import java.util.HashMap;
import java.util.Map;

public class UserDao {
    private static Map<String, String> hashMap = new HashMap<>();

    public void initDataMethod() {
        System.out.println("Execute: init-method");
        hashMap.put("10001", "Go");
        hashMap.put("10002", "Rust");
        hashMap.put("10003", "Python");
    }

    public void destroyDataMethod() {
        System.out.println("Execute: destroy-method");
        hashMap.clear();
    }

    public String queryUserName(String uid) {
        return hashMap.get(uid);
    }
}
