package com.sun.fresh.goods.biz.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sun.fresh.goods.biz.IGoodsInfoBiz;
import com.sun.fresh.goods.entity.GoodsInfo;
import com.sun.fresh.goods.mapper.IGoodsInfoMapper;
import com.sun.fresh.goods.util.RequestParameterUtil;
import com.sun.fresh.goods.util.StringUtil;

@Service
public class GoodsInfoBizImpl implements IGoodsInfoBiz {

	@Autowired
	public IGoodsInfoMapper mapper;
	
	@Override
	public int add(Map<String, String> map) {
		return mapper.add(map);
	}

	@Override
	public List<GoodsInfo> findAll() {
		
		return mapper.findAll();
	}

	@Override
	public int update(Map<String, String> map) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int gno) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<GoodsInfo> findByType(Map<String, Integer> map) {
		return mapper.findByType(map);
	}
	
	@Override
	public Map<String, Object> findByPage(Integer tno, Integer page, Integer rows){
		Map<String, Integer> map = RequestParameterUtil.pageParam(page, rows);
		map.put("tno", tno);
		List<GoodsInfo> list = findByType(map);
		Integer total = mapper.findTypeTotal(list.get(0).getTno());
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("goods", list);
		result.put("total", total);
		return result;
	}

	@Override
	public GoodsInfo find(Integer gno) {
		return mapper.find(gno);
	}

}
