package com.zyf.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zyf.dao.GsDao;
import com.zyf.entity.Gongsi;

@Service
public class GsServiceImpl implements GsService{

	@Resource
	private GsDao dao;

	public List<Gongsi> selectAll(Map<String, Object> map) {
		// TODO Auto-generated method stub
		
		List<Gongsi> list = dao.selectAll(map);
		return list;
	}

	public Gongsi selectById(int cid) {
		// TODO Auto-generated method stub
		Gongsi gongsi = dao.selectById(cid);
		return gongsi;
	}

	public int upd(Gongsi gongsi) {
		// TODO Auto-generated method stub
		int i = dao.upd(gongsi);
		return i;
	}
}
