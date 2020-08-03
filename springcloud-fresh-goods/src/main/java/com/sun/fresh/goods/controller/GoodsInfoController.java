package com.sun.fresh.goods.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sun.fresh.goods.biz.IGoodsInfoBiz;
import com.sun.fresh.goods.entity.GoodsInfo;

@Controller
@RequestMapping("/goods")
public class GoodsInfoController{
	
	@Autowired
	private IGoodsInfoBiz biz;
	
	@RequestMapping(value="/findAll", method=RequestMethod.POST)
	@ResponseBody
	private List<GoodsInfo> findAll() {
		return biz.findAll();
	}
	
	@RequestMapping(value="/findByType", method=RequestMethod.GET)
	@ResponseBody
	private Map<String, Object> findByType(Integer tno, Integer page, Integer rows) {
		return biz.findByPage(tno, page, rows);
	}
	
	@RequestMapping(value="/find", method=RequestMethod.GET)
	@ResponseBody
	private GoodsInfo find(Integer gno) {
		return biz.find(gno);
	}
	
	@RequestMapping(value="/update", method=RequestMethod.POST)
	@ResponseBody
	private int update(@RequestParam Map<String, String> map) {
		
		return biz.update(map);
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	@ResponseBody
	private int add(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		FileUploadUtil fuu = new FileUploadUtil();
//		PageContext pageContext = JspFactory.getDefaultFactory().getPageContext(this, request, response, null, true, 8192, true);
//		Map<String, String> map = fuu.upload(pageContext);
//		return biz.add(map);
		return 1;
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.POST)
	@ResponseBody
	private int delete() {
		int result = -1;
		return result;
	}



}
