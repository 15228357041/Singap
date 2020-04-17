package com.mingcloud.proxy.datalayer.dto;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class BaseDto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1121104508935276635L;
	
	/**
	 * 1代表添加�?代表修改
	 */
    private Integer operator;
    
	/**
	 * 0代表降序�?代表升序
	 */
    private Integer orderflag = 0;
    
    /**
     * 搜索关键�?
     */
    private String keywords;
    
    /**
     * 组织idlist
     * */
    private String orgList;

	public Integer getOperator() {
		return operator;
	}
	
	public Integer getOrderflag() {
		return orderflag;
	}

	public void setOrderflag(Integer orderflag) {
		this.orderflag = orderflag;
	}

	public void setOperator(Integer operator) {
		this.operator = operator;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

	public String getOrgList() {
		return orgList;
	}

	public void setOrgList(String orgList) {
		this.orgList = orgList;
	}
	
}
