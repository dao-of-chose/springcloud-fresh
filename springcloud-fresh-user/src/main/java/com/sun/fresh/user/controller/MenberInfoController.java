package com.sun.fresh.user.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sun.fresh.user.biz.IMenberInfoBiz;
import com.sun.fresh.user.entity.MenberInfo;

@Controller
@RequestMapping("/menber")
public class MenberInfoController {
	@Autowired
	private IMenberInfoBiz menberInfoBiz;
	
	@RequestMapping(value="/checklogin", method=RequestMethod.GET)
	@ResponseBody
	private String checkLogin(HttpSession session){
		MenberInfo admin = (MenberInfo)session.getAttribute("currentLoginMenber");
		if (admin != null) {
			return admin.getNickName();
		}
		return null;
	}
	
	@RequestMapping(value="/currentMenber", method=RequestMethod.GET)
	@ResponseBody
	private MenberInfo currentMenber(HttpSession session){
		MenberInfo admin = (MenberInfo)session.getAttribute("currentLoginMenber");
		return admin;
	}
	@RequestMapping(value="/login", method=RequestMethod.POST)
	@ResponseBody
	private int login(HttpSession session, MenberInfo mf) {
		System.out.println(mf.toString());
		int result = -1;
		MenberInfo admin = menberInfoBiz.login(mf);
		if (admin != null) {
			result = 1;
			session.setAttribute("currentLoginMenber", admin);
		}
		System.out.println(result);
		return result;
	}
	
	@RequestMapping(value="/findAll", method=RequestMethod.POST)
	@ResponseBody
	private List<MenberInfo> findAll() {
		return menberInfoBiz.findAll();
	}
	
	@RequestMapping(value="/updatePwd", method=RequestMethod.POST)
	@ResponseBody
	private int updatePwd(@RequestParam Map<String, String> map) {
		
		return menberInfoBiz.updatePwd(map);
	}
	
	@RequestMapping(value="/update", method=RequestMethod.POST)
	@ResponseBody
	private int update(@RequestParam Map<String, String> map) {
		
		return menberInfoBiz.update(map);
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	@ResponseBody
	private int add(HttpSession session, MenberInfo mf) {
		return menberInfoBiz.add(mf);
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.POST)
	@ResponseBody
	private int delete(HttpSession session) {
		int result = -1;
		
		return result;
	}



}
