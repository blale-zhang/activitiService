package com.ht.commonactivity.vo;

public class HisProcListVo {
    private String proInstId;
    private String startTime;
    private String endTime;
    private String isComplate;
    private String proName;
    private String busKey;

    public String getBusKey() {
        return busKey;
    }

    public void setBusKey(String busKey) {
        this.busKey = busKey;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public String getProInstId() {
        return proInstId;
    }

    public void setProInstId(String proInstId) {
        this.proInstId = proInstId;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getIsComplate() {
        return isComplate;
    }

    public void setIsComplate(String isComplate) {
        this.isComplate = isComplate;
    }
}
