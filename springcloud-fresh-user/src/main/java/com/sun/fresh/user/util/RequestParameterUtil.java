package com.sun.fresh.user.util;

import java.util.HashMap;
import java.util.Map;

public class RequestParameterUtil {
	public static Map<String, Integer> pageParam(Integer page, Integer rows){
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("page",	(page - 1) * rows);
		map.put("rows", rows);
		return map;
	}
}
