package com.springframework.datasource;

/**
 * Author: sazal
 * Date: 12/31/17.
 */
public class ExampleDataSource {
    private String userName;
    private String password;
    private String dbUrl;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDbUrl() {
        return dbUrl;
    }

    public void setDbUrl(String dbUrl) {
        this.dbUrl = dbUrl;
    }
}
