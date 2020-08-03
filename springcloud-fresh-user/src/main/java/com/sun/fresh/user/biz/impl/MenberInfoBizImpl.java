package com.sun.fresh.user.biz.impl;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sun.fresh.user.biz.IMenberInfoBiz;
import com.sun.fresh.user.entity.MenberInfo;
import com.sun.fresh.user.mapper.IMenberInfoMapper;
import com.sun.fresh.user.util.StringUtil;

@Service
public class MenberInfoBizImpl implements IMenberInfoBiz {

	@Autowired
	private IMenberInfoMapper mapper;
	
	@Override
	public MenberInfo login(MenberInfo af) {
		if(StringUtil.checkNull(af.getNickName(), af.getPwd())){
			return null;
		}
		
		return mapper.login(af);
	}

	@Override
	public int checkInfo(Map<String, String> map) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updatePwd(Map<String, String> map) {
		return mapper.updatePwd(map);
	}

	@Override
	public List<MenberInfo> findAll() {
		return mapper.findAll();
	}

	@Override
	public int update(Map<String, String> map) {
		return mapper.update(map);
	}

	@Override
	public int add(MenberInfo mf) {
		if(StringUtil.checkNull(mf.getNickName(), mf.getPwd())){
			return 0;
		}
		return mapper.add(mf);
	}

}
