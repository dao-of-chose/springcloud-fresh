package com.sun.fresh.goods.biz;

import java.util.List;
import java.util.Map;

import com.sun.fresh.goods.entity.GoodsInfo;

public interface IGoodsInfoBiz {
	
	public int add(Map<String, String> map);
	
	public GoodsInfo find(Integer gno);
	
	public List<GoodsInfo> findAll();
	
	public List<GoodsInfo> findByType(Map<String, Integer> map);
	
	public Map<String, Object> findByPage(Integer tno, Integer page, Integer rows);
	
	public int update(Map<String, String> map);
	
	public int delete(int gno);
}
