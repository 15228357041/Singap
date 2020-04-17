package com.mingcloud.proxy.datalayer.dto.archiveinfo;


import com.mingcloud.proxy.datalayer.dto.BaseDto;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author zxf
 * @Description PlannedelectricDto
 * @Date 2019/1/11.
 */
public class PlannedelectricDto extends BaseDto {
    private Integer id;
    private String plannedelectrickey;
    private String plannedelectricname;
    private Integer stationid;
    private BigDecimal incidencerate;
    private Date plandate;
    private Date createdate;
    private Integer createuserid;
    private Date modificationdate;
    private Integer modificationuserid;
    private String extravarchar1;
    private String extravarchar2;
    private String extravarchar3;
    private String extravarchar4;
    private BigDecimal extradecimal1;
    private BigDecimal extradecimal2;
    private BigDecimal extradecimal3;
    private BigDecimal extradecimal4;
    private Integer extraint1;
    private Integer extraint2;
    private Integer extraint3;
    private Integer extraint4;
    private Integer tombstone;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlannedelectrickey() {
        return plannedelectrickey;
    }

    public void setPlannedelectrickey(String plannedelectrickey) {
        this.plannedelectrickey = plannedelectrickey;
    }

    public String getPlannedelectricname() {
        return plannedelectricname;
    }

    public void setPlannedelectricname(String plannedelectricname) {
        this.plannedelectricname = plannedelectricname;
    }

    public Integer getStationid() {
        return stationid;
    }

    public void setStationid(Integer stationid) {
        this.stationid = stationid;
    }

    public BigDecimal getIncidencerate() {
        return incidencerate;
    }

    public void setIncidencerate(BigDecimal incidencerate) {
        this.incidencerate = incidencerate;
    }

    public Date getPlandate() {
        return plandate;
    }

    public void setPlandate(Date plandate) {
        this.plandate = plandate;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Integer getCreateuserid() {
        return createuserid;
    }

    public void setCreateuserid(Integer createuserid) {
        this.createuserid = createuserid;
    }

    public Date getModificationdate() {
        return modificationdate;
    }

    public void setModificationdate(Date modificationdate) {
        this.modificationdate = modificationdate;
    }

    public Integer getModificationuserid() {
        return modificationuserid;
    }

    public void setModificationuserid(Integer modificationuserid) {
        this.modificationuserid = modificationuserid;
    }

    public String getExtravarchar1() {
        return extravarchar1;
    }

    public void setExtravarchar1(String extravarchar1) {
        this.extravarchar1 = extravarchar1;
    }

    public String getExtravarchar2() {
        return extravarchar2;
    }

    public void setExtravarchar2(String extravarchar2) {
        this.extravarchar2 = extravarchar2;
    }

    public String getExtravarchar3() {
        return extravarchar3;
    }

    public void setExtravarchar3(String extravarchar3) {
        this.extravarchar3 = extravarchar3;
    }

    public String getExtravarchar4() {
        return extravarchar4;
    }

    public void setExtravarchar4(String extravarchar4) {
        this.extravarchar4 = extravarchar4;
    }

    public BigDecimal getExtradecimal1() {
        return extradecimal1;
    }

    public void setExtradecimal1(BigDecimal extradecimal1) {
        this.extradecimal1 = extradecimal1;
    }

    public BigDecimal getExtradecimal2() {
        return extradecimal2;
    }

    public void setExtradecimal2(BigDecimal extradecimal2) {
        this.extradecimal2 = extradecimal2;
    }

    public BigDecimal getExtradecimal3() {
        return extradecimal3;
    }

    public void setExtradecimal3(BigDecimal extradecimal3) {
        this.extradecimal3 = extradecimal3;
    }

    public BigDecimal getExtradecimal4() {
        return extradecimal4;
    }

    public void setExtradecimal4(BigDecimal extradecimal4) {
        this.extradecimal4 = extradecimal4;
    }

    public Integer getExtraint1() {
        return extraint1;
    }

    public void setExtraint1(Integer extraint1) {
        this.extraint1 = extraint1;
    }

    public Integer getExtraint2() {
        return extraint2;
    }

    public void setExtraint2(Integer extraint2) {
        this.extraint2 = extraint2;
    }

    public Integer getExtraint3() {
        return extraint3;
    }

    public void setExtraint3(Integer extraint3) {
        this.extraint3 = extraint3;
    }

    public Integer getExtraint4() {
        return extraint4;
    }

    public void setExtraint4(Integer extraint4) {
        this.extraint4 = extraint4;
    }

    public Integer getTombstone() {
        return tombstone;
    }

    public void setTombstone(Integer tombstone) {
        this.tombstone = tombstone;
    }
}