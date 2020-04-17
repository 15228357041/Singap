package com.mingcloud.proxy.util;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.mingcloud.proxy.util.ComplexPropertyPreFilter;

/**
 * <b>标题：FastJson转换工具类.</b> <br>
 * <br>
 * 2015-3-26 上午11:04:15 <br>
 * 说明：
 * 
 * 
 */
public final class JsonParser {

	/**
	 * <b>标题：将Java对象通过FastJson转换成JSON字符串.</b> <br>
	 * 2015-3-26 上午11:16:10 <br>
	 * 说明： <br>
	 * 1. <br>
	 * 2.
	 * 
	 * @param object
	 * @return
	 */
	public static String parseJsonStr(Object object) {
		return parseJsonStr(object, null, null);
	}

	/**
	 * <b>标题：将Java对象通过FastJson转换成JSON字符串.</b> <br>
	 * 2015-3-26 上午11:14:50 <br>
	 * 说明： <br>
	 * 1. <br>
	 * 2.
	 * 
	 * @param object
	 * @param excludes
	 *            排除的属性
	 * @param includes
	 *            包含的属性
	 * @return
	 */
	public static String parseJsonStr(Object object,
			Map<Class<?>, String[]> excludes, Map<Class<?>, String[]> includes) {
		ComplexPropertyPreFilter filter = new ComplexPropertyPreFilter();
		if (null != excludes && excludes.size() > 0) {
			filter.setExcludes(excludes);
		}
		if (null != includes && includes.size() > 0) {
			filter.setIncludes(includes);
		}
		//
		String json;
		// 使用SerializerFeature.WriteDateUseDateFormat特性来序列化日期格式的类型为yyyy-MM-dd
		// hh24:mi:ss
		// 使用SerializerFeature.DisableCircularReferenceDetect特性关闭引用检测和生成
		if (null != filter
				&& (null != filter.getIncludes() && filter.getIncludes().size() > 0)
				|| (null != filter.getExcludes() && filter.getExcludes().size() > 0)) {
			json = JSON.toJSONString(object, filter,
					SerializerFeature.WriteDateUseDateFormat,
					SerializerFeature.DisableCircularReferenceDetect);
		} else {
			json = JSON.toJSONString(object,
					SerializerFeature.WriteDateUseDateFormat,
					SerializerFeature.DisableCircularReferenceDetect);
		}
		return json;
	}

	/**
	 * <b>标题：将Java对象通过FastJson转换成JSON字符串.</b> <br>
	 * 2015-3-26 上午11:17:59 <br>
	 * 说明： <br>
	 * 1. <br>
	 * 2.
	 * 
	 * @param object
	 * @param includes
	 * @return
	 */
	public static String parseJsonStrByIncludes(Object object,
			Map<Class<?>, String[]> includes) {
		return parseJsonStr(object, null, includes);
	}

	/**
	 * <b>标题：将Java对象通过FastJson转换成JSON字符串.</b> <br>
	 * 2015-3-26 上午11:18:10 <br>
	 * 说明： <br>
	 * 1. <br>
	 * 2.
	 * 
	 * @param object
	 * @param excludes
	 * @return
	 */
	public static String parseJsonStrByExcludes(Object object,
			Map<Class<?>, String[]> excludes) {
		return parseJsonStr(object, excludes, null);
	}

	/**
	 * 
	 * <b>标题：将String转化对象.</b> <br>
	 * 2015-5-12 上午9:15:18 <br>
	 * 说明： <br>
	 * 1. <br>
	 * 2.
	 * 
	 * @param object
	 * @param excludes
	 * @return
	 */
	public static Object parseJsonObject(String text, Class<?> clazz) {
		return JSON.parseObject(text, clazz);
	}

	/**
	 * <b>标题：从json数组的字符串中解析domain[类型为T]的列表</b> <br>
	 * 2015-5-12 上午9:15:18 <br>
	 * 说明：
	 * 
	 * @param text
	 * @return
	 */
	public static <T> List<T> parseJsonArray(String text, Class<T> clazz) {
		List<T> list = new ArrayList<T>(JSONArray.parseArray(text, clazz));
		return list;
	}

}
