package com.mingcloud.proxy.datalayer.dto.archiveinfo;


import com.mingcloud.proxy.datalayer.dto.BaseDto;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author zxf
 * @Description EnergyPatchedDto
 * @Date 2019/12/9.
 */
public class EnergyPatchedDto extends BaseDto {
    private Integer recordId;
    private Date date;
    private Integer meterId;
    private BigDecimal energy;
    private BigDecimal sunHours;
    private Date startDate;
    private Date endDate;
    private String siteIdList;
    private Integer posId;

    public BigDecimal getSunHours() {
        return sunHours;
    }

    public void setSunHours(BigDecimal sunHours) {
        this.sunHours = sunHours;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getSiteIdList() {
        return siteIdList;
    }

    public void setSiteIdList(String siteIdList) {
        this.siteIdList = siteIdList;
    }

    public Integer getPosId() {
        return posId;
    }

    public void setPosId(Integer posId) {
        this.posId = posId;
    }

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getMeterId() {
        return meterId;
    }

    public void setMeterId(Integer meterId) {
        this.meterId = meterId;
    }

    public BigDecimal getEnergy() {
        return energy;
    }

    public void setEnergy(BigDecimal energy) {
        this.energy = energy;
    }
}