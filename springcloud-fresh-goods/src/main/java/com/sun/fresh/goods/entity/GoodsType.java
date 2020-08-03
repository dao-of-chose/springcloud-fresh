package com.sun.fresh.goods.entity;

import java.io.Serializable;

public class GoodsType implements Serializable{

	private static final long serialVersionUID = -6854009829430963227L;
	
	private int tno;
	private String tname;
	private String pic;
	private int status;
	
	
	public int getTno() {
		return tno;
	}
	public void setTno(int tno) {
		this.tno = tno;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	
}
