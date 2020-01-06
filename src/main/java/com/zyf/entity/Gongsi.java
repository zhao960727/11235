package com.zyf.entity;

import org.springframework.format.annotation.DateTimeFormat;

public class Gongsi {
	
	private int cid;
	private String keywords;
	private String description;
	private String cname;
	private String goods;
	private String address;
	private String czb;
	private String ccl;
	private String cnj;
	private String czt;
	private String cbz;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getKeywords() {
		return keywords;
	}
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getGoods() {
		return goods;
	}
	public void setGoods(String goods) {
		this.goods = goods;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCzb() {
		return czb;
	}
	public void setCzb(String czb) {
		this.czb = czb;
	}
	public String getCcl() {
		return ccl;
	}
	public void setCcl(String ccl) {
		this.ccl = ccl;
	}
	public String getCnj() {
		return cnj;
	}
	public void setCnj(String cnj) {
		this.cnj = cnj;
	}
	public String getCzt() {
		return czt;
	}
	public void setCzt(String czt) {
		this.czt = czt;
	}
	public String getCbz() {
		return cbz;
	}
	public void setCbz(String cbz) {
		this.cbz = cbz;
	}
	public Gongsi() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Gongsi(int cid, String keywords, String description, String cname, String goods, String address, String czb,
			String ccl, String czt) {
		super();
		this.cid = cid;
		this.keywords = keywords;
		this.description = description;
		this.cname = cname;
		this.goods = goods;
		this.address = address;
		this.czb = czb;
		this.ccl = ccl;
		this.czt = czt;
	}
	@Override
	public String toString() {
		return "Column [cid=" + cid + ", keywords=" + keywords + ", description=" + description + ", cname=" + cname
				+ ", goods=" + goods + ", address=" + address + ", czb=" + czb + ", ccl=" + ccl + ", cnj=" + cnj
				+ ", czt=" + czt + ", cbz=" + cbz + "]";
	}
	
}
