package com.show.pojo;

import java.util.List;

public class UserVo {

	private List<Userinfo> list;

	private Integer totalCounts;

	private Integer conditionCounts;

	public UserVo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserVo(List<Userinfo> list, Integer totalCounts, Integer conditionCounts) {
		super();
		this.list = list;
		this.totalCounts = totalCounts;
		this.conditionCounts = conditionCounts;
	}

	public List<Userinfo> getList() {
		return list;
	}

	public void setList(List<Userinfo> list) {
		this.list = list;
	}

	public Integer getTotalCounts() {
		return totalCounts;
	}

	public void setTotalCounts(Integer totalCounts) {
		this.totalCounts = totalCounts;
	}

	public Integer getConditionCounts() {
		return conditionCounts;
	}

	public void setConditionCounts(Integer conditionCounts) {
		this.conditionCounts = conditionCounts;
	}

}
