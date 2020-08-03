package com.sun.fresh.goods.mapper;

import java.util.List;
import java.util.Map;

import com.sun.fresh.goods.entity.GoodsType;

public interface IGoodsTypeMapper {
	public int add(GoodsType type);
	
	public List<GoodsType> findAll();
	
	public int update(Map<String, String> map);
	
	public int delete(int tno);

}
