package com.utils;

/**
 * 字符串工具类
* @author zh
* @date 2017年11月5日 下午5:54:12
 */
public class StringUtils {

	/**
	 * 目标字段是否为空
	* @param str
	* @return  true：为null或空值
	* @Author:        zh
	* @Create Date:   2017年11月5日 下午5:55:28
	 */
	public static boolean isEmpty(String str){
		return str == null || "".equals(str);
	}
}
