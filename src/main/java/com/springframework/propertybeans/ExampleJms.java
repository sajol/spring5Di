package com.springframework.propertybeans;

/**
 * Author: sazal
 * Date: 12/31/17.
 */
public class ExampleJms {

    private String jmsUserName;
    private String jsmPassword;
    private String jmsUrl;

    public String getJmsUserName() {
        return jmsUserName;
    }

    public void setJmsUserName(String jmsUserName) {
        this.jmsUserName = jmsUserName;
    }

    public String getJsmPassword() {
        return jsmPassword;
    }

    public void setJsmPassword(String jsmPassword) {
        this.jsmPassword = jsmPassword;
    }

    public String getJmsUrl() {
        return jmsUrl;
    }

    public void setJmsUrl(String jmsUrl) {
        this.jmsUrl = jmsUrl;
    }
}
