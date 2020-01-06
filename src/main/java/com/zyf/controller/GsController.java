package com.zyf.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zyf.entity.Gongsi;
import com.zyf.service.GsService;

@Controller
public class GsController {

	
	@Resource
	private GsService ser;
	
	
	
	@RequestMapping("list.do")
	public String selectAll(Model model,@RequestParam(defaultValue="1")int pageNum,String keywords,
			String description,String cname,String zcBegin,String zcend,String clBegin,String clend){
		
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("keywords",keywords);
		map.put("description",description);
		map.put("cname",cname);
		map.put("zcBegin",zcBegin);
		map.put("zcend",zcend);
		map.put("clBegin",clBegin);
		map.put("clend",clend);
		PageHelper.startPage(pageNum,3);
		List<Gongsi> list = ser.selectAll(map);
		PageInfo<Gongsi> page=new PageInfo<Gongsi>(list);
		model.addAttribute("page",page);
		model.addAttribute("map",map);
		return "list";
		
	}
	
	
	@RequestMapping("selectById.do")
	@ResponseBody
	public Object selectById(int cid){
		Gongsi gongsi = ser.selectById(cid);
		
		return  gongsi;
	}
	
	@RequestMapping("upd.do")
	public String upd(Gongsi gongsi){
		int i = ser.upd(gongsi);
		if(i>0){
			return "list.do";
		}else{
			return "upd.do";
		}
	}
}
