package org.wzh.smallspring.test.bean;

import org.wzh.smallspring.beans.factory.DisposableBean;
import org.wzh.smallspring.beans.factory.InitializingBean;

public class UserService implements InitializingBean, DisposableBean {
    private String uid;

    private String company;

    private String location;

    private UserDao userDao;

    public String queryUserInfo() {
        return userDao.queryUserName(uid) + "," + company + "," + location;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
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
        sb.append("UserService: uid=")
                .append(uid)
                .append("; company=")
                .append(company)
                .append("; location=")
                .append(location)
                .append(";");
        return sb.toString();
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Execute: UserService.destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Execute: UserService.afterPropertiesSet");
    }
}
