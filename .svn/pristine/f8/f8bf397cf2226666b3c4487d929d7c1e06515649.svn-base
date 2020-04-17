package com.mingcloud.proxy.datalayer.dao;

import java.util.List;
import java.util.Map;

/**
 * @desc 基本的CRUD操作<br>
 * 
 */
public interface BaseMapper<T> {

	/**
	 * @desc 保存对象
	 * 
	 * @param domain
	 */
	public int insert(T domain);
	
	/**
	 * @desc 批量插入
	 * 
	 * @param list
	 */
	public int batchInsert(List<T> list); 

	/**
	 * @desc 更新对象
	 * 
	 * @param domain
	 */
	public int update(T domain);

	/**
	 * @desc 删除对象
	 * 
	 * @param domain
	 */
	public int delete(T domain);
	
	/**
	 * @desc 逻辑删除对象
	 * 
	 * @param domain
	 */
	public int logicDelete(T domain);

	/**
	 * @desc 通过对象属�?判断对象是否存在,sql中以“and =”方式附加domain中的条件
	 * @return
	 */
	public int isExistByProperty(T domain);

	/**
	 * @desc 通过id查询对象
	 * @param domain
	 * @return
	 */
	public T get(T domain);

	/**
	 * @desc sql中以“and =”方式附加domain中的条件并且使用limit 1
	 * @param domain
	 * @return
	 */
	public T selectOne(T domain);

	/**
	 * @desc sql中以“and =”方式附加domain中的条件，查询记录的条数
	 * @param domain
	 * @return
	 */
	public int selectCount(T domain);

	/**
	 * @desc sql中以“and =”方式附加domain中的条件，根据条件查�?
	 * @param domain
	 * @return
	 */
	public List<T> select(T domain);

	/**
	 * @desc 查询全部记录
	 * @param domain
	 * @return
	 */
	public List<T> selectAll();

	/**
	 * @desc sql中以“and =”方式附加domain中的条件，根据条件分页查�?
	 * @param domain
	 * @return
	 */
	public List<T> selectPage(T domain);

	/**
	 * @desc 分页查询全部记录
	 * @param domain
	 * @return
	 */
	public List<T> selectAllPage(T domain);
	
	/**
	 * 
	* @Title: selectChildren  
	* @Description: 查询指定节点的子节点 
	* @param @param domain
	* @param @return    设定文件  
	* @return List<T>    返回类型  
	* @throws
	 */
	public List<T> selectAllChildren(T domain);
	
	/**
	 * 
	* @Title: selectTreeNodeRoutePath  
	* @Description: 根据关键词在名称及编码中模糊搜索满足匹配条件的树形结构的节点路径，用于树的异步模糊搜索功�? 
	* @Description: 不同的业务�?辑�?过存储过程进行封装，无结果集返回，仅有输出参�?
	* @param @param paramMap
	* @param @return    设定文件  
	* @return String    返回类型  
	* @throws
	 */
	@SuppressWarnings("rawtypes")
	public String  selectTreeNodeRoutePath(Map paramMap);
	
	/**
	* @Title: selectTreeNodeRoutePathById  
	* @Description: 根据id搜索满足匹配条件的树形结构的节点路径，用于资源管理器
	* @Description: 不同的业务�?辑�?过存储过程进行封装，无结果集返回，仅有输出参�?
	* @param @param paramMap
	* @param @return    设定文件  
	* @return String    返回类型  
	* @throws
	 */
	@SuppressWarnings("rawtypes")
	public String  selectTreeNodeRoutePathById(Map paramMap);
} 