package com.mingcloud.proxy.datalayer.dao.archiveinfo;

import com.mingcloud.proxy.datalayer.dao.BaseMapper;
import com.mingcloud.proxy.datalayer.dto.archiveinfo.SiterelationpositionDto;
import com.mingcloud.proxy.datalayer.entity.archiveinfo.PositionEntity;

import java.util.List;

public interface PositionMapper extends BaseMapper<PositionEntity> {

	int updatePositionExtInfo(PositionEntity entity);

	List<PositionEntity> selectByPositiontype(PositionEntity entity);
	
	List<PositionEntity> selectAllApi();

	List<PositionEntity> selectAllToTask();

	PositionEntity selectByPosKey(String posKey);

	List<PositionEntity> selectAllCheryPosition();

	List<PositionEntity> selectKeyIdMap();

    List<PositionEntity> selectPosition(PositionEntity entity);

	List<SiterelationpositionDto> selectSiteId(PositionEntity entity);
}