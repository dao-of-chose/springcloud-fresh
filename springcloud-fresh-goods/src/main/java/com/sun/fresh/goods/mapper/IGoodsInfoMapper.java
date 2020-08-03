package com.sun.fresh.goods.mapper;

import java.util.List;
import java.util.Map;

import com.sun.fresh.goods.entity.GoodsInfo;
import com.sun.fresh.goods.entity.GoodsType;

public interface IGoodsInfoMapper {
	
	public int add(Map<String, String> map);
	
	public GoodsInfo find(Integer gno);
	
	public List<GoodsInfo> findAll();
	
	public List<GoodsInfo> findByType(Map<String, Integer> map);
	
	public Integer findTypeTotal(Integer tno);
	
	public int update(Map<String, String> map);
	
	public int delete(int gno);
	
	

}
