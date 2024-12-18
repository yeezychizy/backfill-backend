package com.chizu.backfill.model;

import lombok.Data;

/**
 * @author : chizubeokwuosa
 * @Description :
 * @created : chizubeokwuosa, Sunday
 **/



public class AbsenceDto {
    private String startDate;
    private String endDate;
    private String reason;
    private String className;
    private String email;
    private String fullName;
    private String status;

    public AbsenceDto() {

    }

    public AbsenceDto(String startDate, String endDate, String reason, String className, String email, String fullName, String status) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.reason = reason;
        this.className = className;
        this.email = email;
        this.fullName = fullName;
        this.status = status;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

