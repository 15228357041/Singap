package com.mingcloud.proxy.datalayer.dto.archiveinfo;



import com.mingcloud.proxy.datalayer.dto.BaseDto;

import java.util.Date;

/**
* @Author zxf
* @Description DictionaryDto
* @Date 2019/12/31.
*/
public class DictionaryDto extends BaseDto {
    private Integer id;
    private String dicname;
    private String dicvalue;
    private Integer dictype;
    private Integer order;
    private Date createdate;
    private Integer createuserid;
    private Date modificationdate;
    private Integer modificationuserid;
    private Integer tombstone;

public Integer getId() { return id; }

public void setId(Integer id) { this.id = id; }

public String getDicname() { return dicname; }

public void setDicname(String dicname) { this.dicname = dicname; }

public String getDicvalue() { return dicvalue; }

public void setDicvalue(String dicvalue) { this.dicvalue = dicvalue; }

public Integer getDictype() { return dictype; }

public void setDictype(Integer dictype) { this.dictype = dictype; }

public Integer getOrder() { return order; }

public void setOrder(Integer order) { this.order = order; }

public Date getCreatedate() { return createdate; }

public void setCreatedate(Date createdate) { this.createdate = createdate; }

public Integer getCreateuserid() { return createuserid; }

public void setCreateuserid(Integer createuserid) { this.createuserid = createuserid; }

public Date getModificationdate() { return modificationdate; }

public void setModificationdate(Date modificationdate) { this.modificationdate = modificationdate; }

public Integer getModificationuserid() { return modificationuserid; }

public void setModificationuserid(Integer modificationuserid) { this.modificationuserid = modificationuserid; }

public Integer getTombstone() { return tombstone; }

public void setTombstone(Integer tombstone) { this.tombstone = tombstone; }

}