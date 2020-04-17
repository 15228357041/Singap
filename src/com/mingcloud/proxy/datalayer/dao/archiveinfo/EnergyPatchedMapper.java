package com.mingcloud.proxy.datalayer.dao.archiveinfo;


import com.mingcloud.proxy.datalayer.dao.BaseMapper;
import com.mingcloud.proxy.datalayer.dto.archiveinfo.EnergyPatchedDto;
import com.mingcloud.proxy.datalayer.dto.archiveinfo.SiterelationpositionDto;
import com.mingcloud.proxy.datalayer.entity.archiveinfo.EnergyPatchedEntity;

import java.math.BigDecimal;
import java.util.List;

/**
* @Author zxf
* @Description EnergyPatchedMapper mapper接口
* @Date 2019/12/9.
*/
public interface EnergyPatchedMapper extends BaseMapper<EnergyPatchedEntity> {

    BigDecimal getTotalEnergy(EnergyPatchedDto energyPatchedDto);

    List <EnergyPatchedDto> getTodayEnergyAndSunhours(SiterelationpositionDto dto);

    List<EnergyPatchedDto> getEnergyAndSunByDate(SiterelationpositionDto obj);
}
