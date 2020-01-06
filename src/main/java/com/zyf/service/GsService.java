package com.zyf.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.zyf.entity.Gongsi;

public interface GsService {
	
	List<Gongsi> selectAll(Map<String,Object> map);//查询
	
	Gongsi  selectById(@Param("cid")int cid);
	int upd(Gongsi gongsi);
}
