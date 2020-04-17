package com.mingcloud.proxy.datalayer.dto.archiveinfo;

import java.math.BigDecimal;
import java.util.Date;

import com.mingcloud.proxy.datalayer.dto.BaseDto;

/**
 * @author Bxf
 * @desc 通用记录�?
 * @date 2017-7-5 14:15:35
 * */
public class CommonrecodeexDto extends BaseDto {
	
	private static final long serialVersionUID = 693781615538965989L;

	/**
	 *表id自增 
	 * */
    private Integer id;
    
    /**
     * 类型
     * */
    private Integer ntype;
    
    /**
     * 预留int�?
     * */
    private Integer extraid1;
    
    /**
     * 预留int�?
     * */
    private Integer extraid2;
    
    /**
     * 预留int3
     * */
    private Integer extraid3;
    
    /**
     * 预留int4
     * */
    private Integer extraid4;
    
    /**
     * 预留int5
     * */
    private Integer extraid5;
    
    /**
     * 预留String1
     * */
    private String extravarchar1;
    
    /**
     * 预留String2
     * */
    private String extravarchar2;

    /**
     * 预留String3
     * */
    private String extravarchar3;
    
    /**
     * 预留String4
     * */
    private String extravarchar4;
    
    /**
     * 预留String5
     * */
    private String extravarchar5;
    
    /**
     * 预留String6
     * */
    private String extravarchar6;
    
    /**
     * 预留String7
     * */
    private String extravarchar7;
    
    /**
     * 预留String8
     * */
    private String extravarchar8;
    
    /**
     * 预留String9
     * */
    private String extravarchar9;
    
    /**
     * 预留String10
     * */
    private String extravarchar10;
    
    /**
     * 预留decimal
     * */
    private BigDecimal extradecimal1;
    
    /**
     * 预留decimal2
     * */
    private BigDecimal extradecimal2;
    
    /**
     * 预留decimal3
     * */
    private BigDecimal extradecimal3;
    
    /**
     * 预留decimal4
     * */
    private BigDecimal extradecimal4;
    
    /**
     * 预留decimal5
     * */
    private BigDecimal extradecimal5;
    
    /**
     * 预留int1
     * */
    private Integer extraint1;
    
    /**
     * 预留int2
     * */
    private Integer extraint2;

    /**
     * 预留int3
     * */
    private Integer extraint3;

    /**
     * 预留int4
     * */
    private Integer extraint4;

    /**
     * 预留int5
     * */
    private Integer extraint5;

    /**
     * 预留高精�?
     * */
    private Date extradatetime1;

    /**
     * 预留高精�?
     * */
    private Date extradatetime2;

    /**
     * 预留高精�?
     * */
    private Date extradatetime3;

    /**
     * 预留高精�?
     * */
    private Date extradatetime4;

    /**
     * 预留高精�?
     * */
    private Date extradatetime5;

    /**
     * 创建时间
     * */
    private Date createdate;

    /**
     * 创建�?
     * */
    private Integer createuserid;

    /**
     * �?��修改时间
     * */
    private Date modificationdate;

    /**
     * �?��修改�?
     * */
    private Integer modificationuserid;
    
    /**
     * 图片路径
     * */
    private String picpath;
    
    /**
     * 条码
     * */
    private String barcode;
    
    /**
     * 备注
     * */
    private String memo;

    /**
     * 机构组织
     * */
    private Integer orgid;

    /**
     * 成本id
     * */
    private Integer accountid;
    
    /**
     * 逻辑删除
     * 1=正常
     * 2=删除
     * */
    private Integer tombstone;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNtype() {
		return ntype;
	}

	public void setNtype(Integer ntype) {
		this.ntype = ntype;
	}

	public Integer getExtraid1() {
		return extraid1;
	}

	public void setExtraid1(Integer extraid1) {
		this.extraid1 = extraid1;
	}

	public Integer getExtraid2() {
		return extraid2;
	}

	public void setExtraid2(Integer extraid2) {
		this.extraid2 = extraid2;
	}

	public Integer getExtraid3() {
		return extraid3;
	}

	public void setExtraid3(Integer extraid3) {
		this.extraid3 = extraid3;
	}

	public Integer getExtraid4() {
		return extraid4;
	}

	public void setExtraid4(Integer extraid4) {
		this.extraid4 = extraid4;
	}

	public Integer getExtraid5() {
		return extraid5;
	}

	public void setExtraid5(Integer extraid5) {
		this.extraid5 = extraid5;
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

	public String getExtravarchar5() {
		return extravarchar5;
	}

	public void setExtravarchar5(String extravarchar5) {
		this.extravarchar5 = extravarchar5;
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

	public BigDecimal getExtradecimal5() {
		return extradecimal5;
	}

	public void setExtradecimal5(BigDecimal extradecimal5) {
		this.extradecimal5 = extradecimal5;
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

	public Integer getExtraint5() {
		return extraint5;
	}

	public void setExtraint5(Integer extraint5) {
		this.extraint5 = extraint5;
	}

	public Date getExtradatetime1() {
		return extradatetime1;
	}

	public void setExtradatetime1(Date extradatetime1) {
		this.extradatetime1 = extradatetime1;
	}

	public Date getExtradatetime2() {
		return extradatetime2;
	}

	public void setExtradatetime2(Date extradatetime2) {
		this.extradatetime2 = extradatetime2;
	}

	public Date getExtradatetime3() {
		return extradatetime3;
	}

	public void setExtradatetime3(Date extradatetime3) {
		this.extradatetime3 = extradatetime3;
	}

	public Date getExtradatetime4() {
		return extradatetime4;
	}

	public void setExtradatetime4(Date extradatetime4) {
		this.extradatetime4 = extradatetime4;
	}

	public Date getExtradatetime5() {
		return extradatetime5;
	}

	public void setExtradatetime5(Date extradatetime5) {
		this.extradatetime5 = extradatetime5;
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

	public String getPicpath() {
		return picpath;
	}

	public void setPicpath(String picpath) {
		this.picpath = picpath;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public Integer getOrgid() {
		return orgid;
	}

	public void setOrgid(Integer orgid) {
		this.orgid = orgid;
	}

	public Integer getAccountid() {
		return accountid;
	}

	public void setAccountid(Integer accountid) {
		this.accountid = accountid;
	}

	public Integer getTombstone() {
		return tombstone;
	}

	public void setTombstone(Integer tombstone) {
		this.tombstone = tombstone;
	}

	public String getExtravarchar6() {
		return extravarchar6;
	}

	public void setExtravarchar6(String extravarchar6) {
		this.extravarchar6 = extravarchar6;
	}

	public String getExtravarchar7() {
		return extravarchar7;
	}

	public void setExtravarchar7(String extravarchar7) {
		this.extravarchar7 = extravarchar7;
	}

	public String getExtravarchar8() {
		return extravarchar8;
	}

	public void setExtravarchar8(String extravarchar8) {
		this.extravarchar8 = extravarchar8;
	}

	public String getExtravarchar9() {
		return extravarchar9;
	}

	public void setExtravarchar9(String extravarchar9) {
		this.extravarchar9 = extravarchar9;
	}

	public String getExtravarchar10() {
		return extravarchar10;
	}

	public void setExtravarchar10(String extravarchar10) {
		this.extravarchar10 = extravarchar10;
	}

	@Override
	public String toString() {
		return "CommonrecodeexDto [id=" + id + ", ntype=" + ntype + ", extraid1=" + extraid1 + ", extravarchar1="
				+ extravarchar1 + ", extradecimal1=" + extradecimal1 + ", extradatetime1=" + extradatetime1
				+ ", tombstone=" + tombstone + "]";
	}

	
}
