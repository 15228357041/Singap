package com.mingcloud.proxy.datalayer.dto.archiveinfo;

import java.math.BigDecimal;

import com.mingcloud.proxy.datalayer.dto.BaseDto;

public class CurrentStockDto extends BaseDto {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2778776982679170585L;

	private String cInvCode;
	
	private String cWhCode;
	
	private BigDecimal iQuantity;

	public String getCInvCode() {
		return cInvCode;
	}

	public void setCInvCode(String cInvCode) {
		this.cInvCode = cInvCode;
	}

	public String getcWhCode() {
		return cWhCode;
	}

	public void setcWhCode(String cWhCode) {
		this.cWhCode = cWhCode;
	}

	public BigDecimal getiQuantity() {
		return iQuantity;
	}

	public void setiQuantity(BigDecimal iQuantity) {
		this.iQuantity = iQuantity;
	}
	

}
