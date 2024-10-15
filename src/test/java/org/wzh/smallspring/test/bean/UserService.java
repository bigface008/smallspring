package org.wzh.smallspring.test.bean;

public class UserService {
    private String name;

    private String uid;

    private UserDao userDao;

//    public UserService() {
//    }
//
//    public UserService(String name) {
//        this.name = name;
//    }

    public String queryUserInfo() {
//        System.out.println("Query User Info " + userDao.queryUserName(uid));
        return userDao.queryUserName(uid);
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uId) {
        this.uid = uId;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        sb.append("UserService: ").append(name);
        return sb.toString();
    }
}
