package com.sun.fresh.goods.biz.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sun.fresh.goods.biz.IGoodsTypeBiz;
import com.sun.fresh.goods.entity.GoodsType;
import com.sun.fresh.goods.mapper.IGoodsTypeMapper;

@Service
public class GoodsTypeBizImpl implements IGoodsTypeBiz {
	
	@Autowired
	public IGoodsTypeMapper mapper;

	@Override
	public int add(GoodsType type) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<GoodsType> findAll() {
		return mapper.findAll();
	}

	@Override
	public int update(Map<String, String> map) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int tno) {
		// TODO Auto-generated method stub
		return 0;
	}

}
