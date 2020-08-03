package com.sun.fresh.user.biz;

import java.util.List;
import java.util.Map;

import com.sun.fresh.user.entity.MenberInfo;



public interface IMenberInfoBiz {

	public MenberInfo login(MenberInfo af);

	public int checkInfo(Map<String, String> map);

	public int updatePwd(Map<String, String> map);

	public List<MenberInfo> findAll();

	public int update(Map<String, String> map);
	
	public int add(MenberInfo af);
}
