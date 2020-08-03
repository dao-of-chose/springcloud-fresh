package com.sun.fresh.user.mapper;

import java.util.List;
import java.util.Map;

import com.sun.fresh.user.entity.MenberInfo;

public interface IMenberInfoMapper {

	public MenberInfo login(MenberInfo af);
	
	public List<MenberInfo> findAll();
	
	public int update(Map<String, String> map);
	
	public int updatePwd(Map<String, String> map);

	public int add(MenberInfo af);
}
