package com.mingcloud.proxy.datalayer.entity.archiveinfo;

import java.math.BigDecimal;
import java.util.Date;

import com.mingcloud.proxy.datalayer.entity.BaseEntity;

public class PositionEntity extends BaseEntity {
	 /**
	 * 
	 */
	private static final long serialVersionUID = -3716363220466447174L;

	private Integer id;

    private String poskey;

    private String posname;

    private Integer rootposid;

    private Integer poscodeid;

    private Integer posgroupid;

    private Integer holidayid;

    private Integer shiftcalendarid;

    private Integer accountid;

    private Integer costtypeid;

    private Integer priorityid;

    private Byte moresubmo;

    private Byte possubflag;

    private Byte mosubflag;

    private Byte woflag;

    private Byte pointflag;

    private Byte histflag;

    private Byte drawingflag;

    private Byte tdmflag;

    private Long posbarcode;

    private Date lastchangedate;

    private Integer lastchangetime;

    private Date lastexportdate;

    private Integer lastexporttime;

    private Date lastimportdate;

    private Integer lastimporttime;

    private BigDecimal yearlyoperationalhours;

    private Integer techrespuuserid;

    private Integer siteid;

    private Byte recordactive;

    private String custombarcode;

    private Byte wopassive;

    private Integer worksupplierid;

    private String extraposinfo1;

    private String extraposinfo2;

    private Integer icon;

    private String extraposinfo3;

    private String extraposinfo4;

    private String extraposinfo5;

    private String userid;

    private Integer customerid;

    private String extraposinfo6;

    private String extraposinfo7;

    private String extraposinfo8;

    private String extraposinfo9;

    private String extraposinfo10;

    private Integer prodworksupplierid;

    private Integer maintworksupplierid;

    private Integer planworksupplierid;

    private Integer apprworksupplierid;

    private Byte fdalogging;

    private Integer locationposid;

    private Integer costcarrierid;

    private Integer debitcosttypeid;

    private Integer shiftrespareaid;

    private Integer plantid;

    private Integer legalunitid;

    private Integer legalunitcurrencyid;

    private Date lastchangedtz;

    private Date lastexportdtz;

    private Date lastimportdtz;

    private Integer recordlanguageid;

    private Date createdate;

    private Integer createuserid;

    private Date modificationdate;

    private Integer modificationuserid;

    private String picpath;

    private String barcode;

    private String memo;

    private Integer orgid;

    private Integer tombstone;

    private Integer positiontype;

    private Integer stockid;

    private BigDecimal extraposdecimal1;

    private BigDecimal extraposdecimal2;

    private BigDecimal extraposdecimal3;

    private BigDecimal extraposdecimal4;

    private BigDecimal extraposdecimal5;

    private Integer extraposint1;

    private Integer extraposint2;

    private Integer extraposint3;

    private Integer extraposint4;

    private Integer extraposint5;

    private Integer extraid1;

    private Integer extraid2;

    private Integer extraid3;

    private Integer extraid4;

    private Integer extraid5;

    private Integer extraid6;

    private Integer extraid7;


    private String extravarchar1;

    private String extravarchar2;

    private String extravarchar3;

    private String extravarchar4;

    private String extravarchar5;

    private String extravarchar6;

    private String extravarchar7;

    private String extravarchar8;

    private String extravarchar9;

    private String extravarchar10;

    private BigDecimal extradecimal1;

    private BigDecimal extradecimal2;

    private BigDecimal extradecimal3;

    private BigDecimal extradecimal4;

    private BigDecimal extradecimal5;

    private Integer extraint1;

    private Integer extraint2;

    private Integer extraint3;

    private Integer extraint4;

    private Integer extraint5;

    private Integer extraint6;

    private Integer extraint7;

    private Integer extraint8;

    private Integer extraint9;

    private Integer extraint10;

    private Date extradatetime1;

    private Date extradatetime2;

    private Date extradatetime3;

    private Date extradatetime4;

    private Date extradatetime5;

    private Date extradatetime6;

    private Date extradatetime7;

    private Date extradatetime8;

    private Date extradatetime9;

    private Date extradatetime10;

    private Integer basetypeid;

    private BigDecimal extradecimal6;

    private BigDecimal extradecimal7;

    private BigDecimal extradecimal8;

    private BigDecimal extradecimal9;

    private BigDecimal extradecimal10;

    private String extravarchar11;

    private String extravarchar12;

    private String extravarchar13;

    private String extravarchar14;

    private String extravarchar15;

    private String extravarchar16;

    private String extravarchar17;

    private String extravarchar18;

    private String extravarchar19;

    private String extravarchar20;

    private String extravarchar21;

    private String extravarchar22;

    private String extravarchar23;

    private String extravarchar24;

    private String extravarchar25;

    private String extravarchar26;

    private String extravarchar27;

    private String extravarchar28;

    private String extravarchar29;

    private String extravarchar30;

    private String extravarchar32;

    private Integer typeid;

    private Integer statusid;

    private Integer costcenterid;

    private String rootpath;

    private Integer sinaporetype;

    public Integer getSinaporetype() {
        return sinaporetype;
    }

    public void setSinaporetype(Integer sinaporetype) {
        this.sinaporetype = sinaporetype;
    }

    public Integer getExtraint6() {
        return extraint6;
    }

    public void setExtraint6(Integer extraint6) {
        this.extraint6 = extraint6;
    }

    public Integer getExtraint7() {
        return extraint7;
    }

    public void setExtraint7(Integer extraint7) {
        this.extraint7 = extraint7;
    }

    public Integer getExtraint8() {
        return extraint8;
    }

    public void setExtraint8(Integer extraint8) {
        this.extraint8 = extraint8;
    }

    public Integer getExtraint9() {
        return extraint9;
    }

    public void setExtraint9(Integer extraint9) {
        this.extraint9 = extraint9;
    }

    public Integer getExtraint10() {
        return extraint10;
    }

    public void setExtraint10(Integer extraint10) {
        this.extraint10 = extraint10;
    }

    public Date getExtradatetime6() {
        return extradatetime6;
    }

    public void setExtradatetime6(Date extradatetime6) {
        this.extradatetime6 = extradatetime6;
    }

    public Date getExtradatetime7() {
        return extradatetime7;
    }

    public void setExtradatetime7(Date extradatetime7) {
        this.extradatetime7 = extradatetime7;
    }

    public Date getExtradatetime8() {
        return extradatetime8;
    }

    public void setExtradatetime8(Date extradatetime8) {
        this.extradatetime8 = extradatetime8;
    }

    public Date getExtradatetime9() {
        return extradatetime9;
    }

    public void setExtradatetime9(Date extradatetime9) {
        this.extradatetime9 = extradatetime9;
    }

    public Date getExtradatetime10() {
        return extradatetime10;
    }

    public void setExtradatetime10(Date extradatetime10) {
        this.extradatetime10 = extradatetime10;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPoskey() {
        return poskey;
    }

    public void setPoskey(String poskey) {
        this.poskey = poskey == null ? null : poskey.trim();
    }

    public String getPosname() {
        return posname;
    }

    public void setPosname(String posname) {
        this.posname = posname == null ? null : posname.trim();
    }

    public Integer getRootposid() {
        return rootposid;
    }

    public void setRootposid(Integer rootposid) {
        this.rootposid = rootposid;
    }

    public Integer getPoscodeid() {
        return poscodeid;
    }

    public void setPoscodeid(Integer poscodeid) {
        this.poscodeid = poscodeid;
    }

    public Integer getPosgroupid() {
        return posgroupid;
    }

    public void setPosgroupid(Integer posgroupid) {
        this.posgroupid = posgroupid;
    }

    public Integer getHolidayid() {
        return holidayid;
    }

    public void setHolidayid(Integer holidayid) {
        this.holidayid = holidayid;
    }

    public Integer getShiftcalendarid() {
        return shiftcalendarid;
    }

    public void setShiftcalendarid(Integer shiftcalendarid) {
        this.shiftcalendarid = shiftcalendarid;
    }

    public Integer getAccountid() {
        return accountid;
    }

    public void setAccountid(Integer accountid) {
        this.accountid = accountid;
    }

    public Integer getCosttypeid() {
        return costtypeid;
    }

    public void setCosttypeid(Integer costtypeid) {
        this.costtypeid = costtypeid;
    }

    public Integer getPriorityid() {
        return priorityid;
    }

    public void setPriorityid(Integer priorityid) {
        this.priorityid = priorityid;
    }

    public Byte getMoresubmo() {
        return moresubmo;
    }

    public void setMoresubmo(Byte moresubmo) {
        this.moresubmo = moresubmo;
    }

    public Byte getPossubflag() {
        return possubflag;
    }

    public void setPossubflag(Byte possubflag) {
        this.possubflag = possubflag;
    }

    public Byte getMosubflag() {
        return mosubflag;
    }

    public void setMosubflag(Byte mosubflag) {
        this.mosubflag = mosubflag;
    }

    public Byte getWoflag() {
        return woflag;
    }

    public void setWoflag(Byte woflag) {
        this.woflag = woflag;
    }

    public Byte getPointflag() {
        return pointflag;
    }

    public void setPointflag(Byte pointflag) {
        this.pointflag = pointflag;
    }

    public Byte getHistflag() {
        return histflag;
    }

    public void setHistflag(Byte histflag) {
        this.histflag = histflag;
    }

    public Byte getDrawingflag() {
        return drawingflag;
    }

    public void setDrawingflag(Byte drawingflag) {
        this.drawingflag = drawingflag;
    }

    public Byte getTdmflag() {
        return tdmflag;
    }

    public void setTdmflag(Byte tdmflag) {
        this.tdmflag = tdmflag;
    }

    public Long getPosbarcode() {
        return posbarcode;
    }

    public void setPosbarcode(Long posbarcode) {
        this.posbarcode = posbarcode;
    }

    public Date getLastchangedate() {
        return lastchangedate;
    }

    public void setLastchangedate(Date lastchangedate) {
        this.lastchangedate = lastchangedate;
    }

    public Integer getLastchangetime() {
        return lastchangetime;
    }

    public void setLastchangetime(Integer lastchangetime) {
        this.lastchangetime = lastchangetime;
    }

    public Date getLastexportdate() {
        return lastexportdate;
    }

    public void setLastexportdate(Date lastexportdate) {
        this.lastexportdate = lastexportdate;
    }

    public Integer getLastexporttime() {
        return lastexporttime;
    }

    public void setLastexporttime(Integer lastexporttime) {
        this.lastexporttime = lastexporttime;
    }

    public Date getLastimportdate() {
        return lastimportdate;
    }

    public void setLastimportdate(Date lastimportdate) {
        this.lastimportdate = lastimportdate;
    }

    public Integer getLastimporttime() {
        return lastimporttime;
    }

    public void setLastimporttime(Integer lastimporttime) {
        this.lastimporttime = lastimporttime;
    }

    public BigDecimal getYearlyoperationalhours() {
        return yearlyoperationalhours;
    }

    public void setYearlyoperationalhours(BigDecimal yearlyoperationalhours) {
        this.yearlyoperationalhours = yearlyoperationalhours;
    }

    public Integer getTechrespuuserid() {
        return techrespuuserid;
    }

    public void setTechrespuuserid(Integer techrespuuserid) {
        this.techrespuuserid = techrespuuserid;
    }

    public Integer getSiteid() {
        return siteid;
    }

    public void setSiteid(Integer siteid) {
        this.siteid = siteid;
    }

    public Byte getRecordactive() {
        return recordactive;
    }

    public void setRecordactive(Byte recordactive) {
        this.recordactive = recordactive;
    }

    public String getCustombarcode() {
        return custombarcode;
    }

    public void setCustombarcode(String custombarcode) {
        this.custombarcode = custombarcode == null ? null : custombarcode.trim();
    }

    public Byte getWopassive() {
        return wopassive;
    }

    public void setWopassive(Byte wopassive) {
        this.wopassive = wopassive;
    }

    public Integer getWorksupplierid() {
        return worksupplierid;
    }

    public void setWorksupplierid(Integer worksupplierid) {
        this.worksupplierid = worksupplierid;
    }

    public String getExtraposinfo1() {
        return extraposinfo1;
    }

    public void setExtraposinfo1(String extraposinfo1) {
        this.extraposinfo1 = extraposinfo1 == null ? null : extraposinfo1.trim();
    }

    public String getExtraposinfo2() {
        return extraposinfo2;
    }

    public void setExtraposinfo2(String extraposinfo2) {
        this.extraposinfo2 = extraposinfo2 == null ? null : extraposinfo2.trim();
    }

    public Integer getIcon() {
        return icon;
    }

    public void setIcon(Integer icon) {
        this.icon = icon;
    }

    public String getExtraposinfo3() {
        return extraposinfo3;
    }

    public void setExtraposinfo3(String extraposinfo3) {
        this.extraposinfo3 = extraposinfo3 == null ? null : extraposinfo3.trim();
    }

    public String getExtraposinfo4() {
        return extraposinfo4;
    }

    public void setExtraposinfo4(String extraposinfo4) {
        this.extraposinfo4 = extraposinfo4 == null ? null : extraposinfo4.trim();
    }

    public String getExtraposinfo5() {
        return extraposinfo5;
    }

    public void setExtraposinfo5(String extraposinfo5) {
        this.extraposinfo5 = extraposinfo5 == null ? null : extraposinfo5.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public Integer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    public String getExtraposinfo6() {
        return extraposinfo6;
    }

    public void setExtraposinfo6(String extraposinfo6) {
        this.extraposinfo6 = extraposinfo6 == null ? null : extraposinfo6.trim();
    }

    public String getExtraposinfo7() {
        return extraposinfo7;
    }

    public void setExtraposinfo7(String extraposinfo7) {
        this.extraposinfo7 = extraposinfo7 == null ? null : extraposinfo7.trim();
    }

    public String getExtraposinfo8() {
        return extraposinfo8;
    }

    public void setExtraposinfo8(String extraposinfo8) {
        this.extraposinfo8 = extraposinfo8 == null ? null : extraposinfo8.trim();
    }

    public String getExtraposinfo9() {
        return extraposinfo9;
    }

    public void setExtraposinfo9(String extraposinfo9) {
        this.extraposinfo9 = extraposinfo9 == null ? null : extraposinfo9.trim();
    }

    public String getExtraposinfo10() {
        return extraposinfo10;
    }

    public void setExtraposinfo10(String extraposinfo10) {
        this.extraposinfo10 = extraposinfo10 == null ? null : extraposinfo10.trim();
    }

    public Integer getProdworksupplierid() {
        return prodworksupplierid;
    }

    public void setProdworksupplierid(Integer prodworksupplierid) {
        this.prodworksupplierid = prodworksupplierid;
    }

    public Integer getMaintworksupplierid() {
        return maintworksupplierid;
    }

    public void setMaintworksupplierid(Integer maintworksupplierid) {
        this.maintworksupplierid = maintworksupplierid;
    }

    public Integer getPlanworksupplierid() {
        return planworksupplierid;
    }

    public void setPlanworksupplierid(Integer planworksupplierid) {
        this.planworksupplierid = planworksupplierid;
    }

    public Integer getApprworksupplierid() {
        return apprworksupplierid;
    }

    public void setApprworksupplierid(Integer apprworksupplierid) {
        this.apprworksupplierid = apprworksupplierid;
    }

    public Byte getFdalogging() {
        return fdalogging;
    }

    public void setFdalogging(Byte fdalogging) {
        this.fdalogging = fdalogging;
    }

    public Integer getLocationposid() {
        return locationposid;
    }

    public void setLocationposid(Integer locationposid) {
        this.locationposid = locationposid;
    }

    public Integer getCostcarrierid() {
        return costcarrierid;
    }

    public void setCostcarrierid(Integer costcarrierid) {
        this.costcarrierid = costcarrierid;
    }

    public Integer getDebitcosttypeid() {
        return debitcosttypeid;
    }

    public void setDebitcosttypeid(Integer debitcosttypeid) {
        this.debitcosttypeid = debitcosttypeid;
    }

    public Integer getShiftrespareaid() {
        return shiftrespareaid;
    }

    public void setShiftrespareaid(Integer shiftrespareaid) {
        this.shiftrespareaid = shiftrespareaid;
    }

    public Integer getPlantid() {
        return plantid;
    }

    public void setPlantid(Integer plantid) {
        this.plantid = plantid;
    }

    public Integer getLegalunitid() {
        return legalunitid;
    }

    public void setLegalunitid(Integer legalunitid) {
        this.legalunitid = legalunitid;
    }

    public Integer getLegalunitcurrencyid() {
        return legalunitcurrencyid;
    }

    public void setLegalunitcurrencyid(Integer legalunitcurrencyid) {
        this.legalunitcurrencyid = legalunitcurrencyid;
    }

    public Date getLastchangedtz() {
        return lastchangedtz;
    }

    public void setLastchangedtz(Date lastchangedtz) {
        this.lastchangedtz = lastchangedtz;
    }

    public Date getLastexportdtz() {
        return lastexportdtz;
    }

    public void setLastexportdtz(Date lastexportdtz) {
        this.lastexportdtz = lastexportdtz;
    }

    public Date getLastimportdtz() {
        return lastimportdtz;
    }

    public void setLastimportdtz(Date lastimportdtz) {
        this.lastimportdtz = lastimportdtz;
    }

    public Integer getRecordlanguageid() {
        return recordlanguageid;
    }

    public void setRecordlanguageid(Integer recordlanguageid) {
        this.recordlanguageid = recordlanguageid;
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
        this.picpath = picpath == null ? null : picpath.trim();
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode == null ? null : barcode.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public Integer getOrgid() {
        return orgid;
    }

    public void setOrgid(Integer orgid) {
        this.orgid = orgid;
    }

    public Integer getTombstone() {
        return tombstone;
    }

    public void setTombstone(Integer tombstone) {
        this.tombstone = tombstone;
    }

    public Integer getPositiontype() {
        return positiontype;
    }

    public void setPositiontype(Integer positiontype) {
        this.positiontype = positiontype;
    }

    public Integer getStockid() {
        return stockid;
    }

    public void setStockid(Integer stockid) {
        this.stockid = stockid;
    }

    public BigDecimal getExtraposdecimal1() {
        return extraposdecimal1;
    }

    public void setExtraposdecimal1(BigDecimal extraposdecimal1) {
        this.extraposdecimal1 = extraposdecimal1;
    }

    public BigDecimal getExtraposdecimal2() {
        return extraposdecimal2;
    }

    public void setExtraposdecimal2(BigDecimal extraposdecimal2) {
        this.extraposdecimal2 = extraposdecimal2;
    }

    public BigDecimal getExtraposdecimal3() {
        return extraposdecimal3;
    }

    public void setExtraposdecimal3(BigDecimal extraposdecimal3) {
        this.extraposdecimal3 = extraposdecimal3;
    }

    public BigDecimal getExtraposdecimal4() {
        return extraposdecimal4;
    }

    public void setExtraposdecimal4(BigDecimal extraposdecimal4) {
        this.extraposdecimal4 = extraposdecimal4;
    }

    public BigDecimal getExtraposdecimal5() {
        return extraposdecimal5;
    }

    public void setExtraposdecimal5(BigDecimal extraposdecimal5) {
        this.extraposdecimal5 = extraposdecimal5;
    }

    public Integer getExtraposint1() {
        return extraposint1;
    }

    public void setExtraposint1(Integer extraposint1) {
        this.extraposint1 = extraposint1;
    }

    public Integer getExtraposint2() {
        return extraposint2;
    }

    public void setExtraposint2(Integer extraposint2) {
        this.extraposint2 = extraposint2;
    }

    public Integer getExtraposint3() {
        return extraposint3;
    }

    public void setExtraposint3(Integer extraposint3) {
        this.extraposint3 = extraposint3;
    }

    public Integer getExtraposint4() {
        return extraposint4;
    }

    public void setExtraposint4(Integer extraposint4) {
        this.extraposint4 = extraposint4;
    }

    public Integer getExtraposint5() {
        return extraposint5;
    }

    public void setExtraposint5(Integer extraposint5) {
        this.extraposint5 = extraposint5;
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
        this.extravarchar1 = extravarchar1 == null ? null : extravarchar1.trim();
    }

    public String getExtravarchar2() {
        return extravarchar2;
    }

    public void setExtravarchar2(String extravarchar2) {
        this.extravarchar2 = extravarchar2 == null ? null : extravarchar2.trim();
    }

    public String getExtravarchar3() {
        return extravarchar3;
    }

    public void setExtravarchar3(String extravarchar3) {
        this.extravarchar3 = extravarchar3 == null ? null : extravarchar3.trim();
    }

    public String getExtravarchar4() {
        return extravarchar4;
    }

    public void setExtravarchar4(String extravarchar4) {
        this.extravarchar4 = extravarchar4 == null ? null : extravarchar4.trim();
    }

    public String getExtravarchar5() {
        return extravarchar5;
    }

    public void setExtravarchar5(String extravarchar5) {
        this.extravarchar5 = extravarchar5 == null ? null : extravarchar5.trim();
    }

    public String getExtravarchar6() {
        return extravarchar6;
    }

    public void setExtravarchar6(String extravarchar6) {
        this.extravarchar6 = extravarchar6 == null ? null : extravarchar6.trim();
    }

    public String getExtravarchar7() {
        return extravarchar7;
    }

    public void setExtravarchar7(String extravarchar7) {
        this.extravarchar7 = extravarchar7 == null ? null : extravarchar7.trim();
    }

    public String getExtravarchar8() {
        return extravarchar8;
    }

    public void setExtravarchar8(String extravarchar8) {
        this.extravarchar8 = extravarchar8 == null ? null : extravarchar8.trim();
    }

    public String getExtravarchar9() {
        return extravarchar9;
    }

    public void setExtravarchar9(String extravarchar9) {
        this.extravarchar9 = extravarchar9 == null ? null : extravarchar9.trim();
    }

    public String getExtravarchar10() {
        return extravarchar10;
    }

    public void setExtravarchar10(String extravarchar10) {
        this.extravarchar10 = extravarchar10 == null ? null : extravarchar10.trim();
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

    public Integer getBasetypeid() {
        return basetypeid;
    }

    public void setBasetypeid(Integer basetypeid) {
        this.basetypeid = basetypeid;
    }

    public BigDecimal getExtradecimal6() {
        return extradecimal6;
    }

    public void setExtradecimal6(BigDecimal extradecimal6) {
        this.extradecimal6 = extradecimal6;
    }

    public BigDecimal getExtradecimal7() {
        return extradecimal7;
    }

    public void setExtradecimal7(BigDecimal extradecimal7) {
        this.extradecimal7 = extradecimal7;
    }

    public BigDecimal getExtradecimal8() {
        return extradecimal8;
    }

    public void setExtradecimal8(BigDecimal extradecimal8) {
        this.extradecimal8 = extradecimal8;
    }

    public BigDecimal getExtradecimal9() {
        return extradecimal9;
    }

    public void setExtradecimal9(BigDecimal extradecimal9) {
        this.extradecimal9 = extradecimal9;
    }

    public BigDecimal getExtradecimal10() {
        return extradecimal10;
    }

    public void setExtradecimal10(BigDecimal extradecimal10) {
        this.extradecimal10 = extradecimal10;
    }

    public String getExtravarchar11() {
        return extravarchar11;
    }

    public void setExtravarchar11(String extravarchar11) {
        this.extravarchar11 = extravarchar11 == null ? null : extravarchar11.trim();
    }

    public String getExtravarchar12() {
        return extravarchar12;
    }

    public void setExtravarchar12(String extravarchar12) {
        this.extravarchar12 = extravarchar12 == null ? null : extravarchar12.trim();
    }

    public String getExtravarchar13() {
        return extravarchar13;
    }

    public void setExtravarchar13(String extravarchar13) {
        this.extravarchar13 = extravarchar13 == null ? null : extravarchar13.trim();
    }

    public String getExtravarchar14() {
        return extravarchar14;
    }

    public void setExtravarchar14(String extravarchar14) {
        this.extravarchar14 = extravarchar14 == null ? null : extravarchar14.trim();
    }

    public String getExtravarchar15() {
        return extravarchar15;
    }

    public void setExtravarchar15(String extravarchar15) {
        this.extravarchar15 = extravarchar15 == null ? null : extravarchar15.trim();
    }

    public String getExtravarchar16() {
        return extravarchar16;
    }

    public void setExtravarchar16(String extravarchar16) {
        this.extravarchar16 = extravarchar16 == null ? null : extravarchar16.trim();
    }

    public String getExtravarchar17() {
        return extravarchar17;
    }

    public void setExtravarchar17(String extravarchar17) {
        this.extravarchar17 = extravarchar17 == null ? null : extravarchar17.trim();
    }

    public String getExtravarchar18() {
        return extravarchar18;
    }

    public void setExtravarchar18(String extravarchar18) {
        this.extravarchar18 = extravarchar18 == null ? null : extravarchar18.trim();
    }

    public String getExtravarchar19() {
        return extravarchar19;
    }

    public void setExtravarchar19(String extravarchar19) {
        this.extravarchar19 = extravarchar19 == null ? null : extravarchar19.trim();
    }

    public String getExtravarchar20() {
        return extravarchar20;
    }

    public void setExtravarchar20(String extravarchar20) {
        this.extravarchar20 = extravarchar20 == null ? null : extravarchar20.trim();
    }

    public String getExtravarchar21() {
        return extravarchar21;
    }

    public void setExtravarchar21(String extravarchar21) {
        this.extravarchar21 = extravarchar21 == null ? null : extravarchar21.trim();
    }

    public String getExtravarchar22() {
        return extravarchar22;
    }

    public void setExtravarchar22(String extravarchar22) {
        this.extravarchar22 = extravarchar22 == null ? null : extravarchar22.trim();
    }

    public String getExtravarchar23() {
        return extravarchar23;
    }

    public void setExtravarchar23(String extravarchar23) {
        this.extravarchar23 = extravarchar23 == null ? null : extravarchar23.trim();
    }

    public String getExtravarchar24() {
        return extravarchar24;
    }

    public void setExtravarchar24(String extravarchar24) {
        this.extravarchar24 = extravarchar24 == null ? null : extravarchar24.trim();
    }

    public String getExtravarchar25() {
        return extravarchar25;
    }

    public void setExtravarchar25(String extravarchar25) {
        this.extravarchar25 = extravarchar25 == null ? null : extravarchar25.trim();
    }

    public String getExtravarchar26() {
        return extravarchar26;
    }

    public void setExtravarchar26(String extravarchar26) {
        this.extravarchar26 = extravarchar26 == null ? null : extravarchar26.trim();
    }

    public String getExtravarchar27() {
        return extravarchar27;
    }

    public void setExtravarchar27(String extravarchar27) {
        this.extravarchar27 = extravarchar27 == null ? null : extravarchar27.trim();
    }

    public String getExtravarchar28() {
        return extravarchar28;
    }

    public void setExtravarchar28(String extravarchar28) {
        this.extravarchar28 = extravarchar28 == null ? null : extravarchar28.trim();
    }

    public String getExtravarchar29() {
        return extravarchar29;
    }

    public void setExtravarchar29(String extravarchar29) {
        this.extravarchar29 = extravarchar29 == null ? null : extravarchar29.trim();
    }

    public String getExtravarchar30() {
        return extravarchar30;
    }

    public void setExtravarchar30(String extravarchar30) {
        this.extravarchar30 = extravarchar30 == null ? null : extravarchar30.trim();
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public Integer getStatusid() {
        return statusid;
    }

    public void setStatusid(Integer statusid) {
        this.statusid = statusid;
    }

    public Integer getCostcenterid() {
        return costcenterid;
    }

    public void setCostcenterid(Integer costcenterid) {
        this.costcenterid = costcenterid;
    }

    public String getRootpath() {
        return rootpath;
    }

    public void setRootpath(String rootpath) {
        this.rootpath = rootpath == null ? null : rootpath.trim();
    }
    public Integer getExtraid6() {
        return extraid6;
    }

    public void setExtraid6(Integer extraid6) {
        this.extraid6 = extraid6;
    }

    public Integer getExtraid7() {
        return extraid7;
    }

    public void setExtraid7(Integer extraid7) {
        this.extraid7 = extraid7;
    }

    public String getExtravarchar32() {
        return extravarchar32;
    }

    public void setExtravarchar32(String extravarchar32) {
        this.extravarchar32 = extravarchar32;
    }
}