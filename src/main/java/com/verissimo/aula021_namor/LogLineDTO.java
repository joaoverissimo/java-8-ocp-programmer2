package com.verissimo.namor;

import java.time.LocalDateTime;

public class LogLineDTO {

    private LocalDateTime date;
    private String ip;
    private String request;
    private int status;
    private String userAgent;

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    @Override
    public String toString() {
        return "LogLineDTO{" + "date=" + date + ", ip='" + ip + '\'' + ", request='" + request + '\'' + ", status=" + status + '\'' + '}' + "\n";
    }
}
