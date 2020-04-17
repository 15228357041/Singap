package com.mingcloud.proxy.datalayer.dto.archiveinfo;


import com.mingcloud.proxy.datalayer.dto.BaseDto;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author zxf
 * @Description SiterelationpositionDto
 * @Date 2019/12/12.
 */
public class SiterelationpositionDto extends BaseDto {
    private Integer id;
    private Integer siteid;
    private Integer posid;
    private String poskey;
    private String posname;
    private String posabname;
    private Date startDate;
    private Date endDate;
    //装机容量
    private BigDecimal extradecimal1;

    private Date apiDate;

    public Date getApiDate() {
        return apiDate;
    }

    public void setApiDate(Date apiDate) {
        this.apiDate = apiDate;
    }

    public BigDecimal getExtradecimal1() {
        return extradecimal1;
    }

    public void setExtradecimal1(BigDecimal extradecimal1) {
        this.extradecimal1 = extradecimal1;
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

    public String getPosname() {
        return posname;
    }

    public void setPosname(String posname) {
        this.posname = posname;
    }

    public String getPosabname() {
        return posabname;
    }

    public void setPosabname(String posabname) {
        this.posabname = posabname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSiteid() {
        return siteid;
    }

    public void setSiteid(Integer siteid) {
        this.siteid = siteid;
    }

    public Integer getPosid() {
        return posid;
    }

    public void setPosid(Integer posid) {
        this.posid = posid;
    }

    public String getPoskey() {
        return poskey;
    }

    public void setPoskey(String poskey) {
        this.poskey = poskey;
    }

}