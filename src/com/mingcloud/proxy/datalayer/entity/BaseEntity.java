package com.mingcloud.proxy.datalayer.entity;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

public class BaseEntity implements Serializable {
	
	/**
	 *   
	 */
	private static final long serialVersionUID = 2744062545093757584L;
	private int offset;
	private int span;
	private String ordermemo = "desc";
    private String keywords;
    
    /**
     * 组织idlist
     * */
    private String orgList;

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public String getOrdermemo() {
		return ordermemo;
	}

	public void setOrdermemo(String ordermemo) {
		this.ordermemo = ordermemo;
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	public int getSpan() {
		return span;
	}

	public void setSpan(int span) {
		this.span = span;
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
