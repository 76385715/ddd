package com.show.pojo;

import java.util.List;

public class HealthVo {

	private List<Integer> list;
	private Integer Ecr;
	private Integer year;
	private Integer quarter;
	private Integer month;
	public HealthVo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HealthVo(List<Integer> list, Integer ecr, Integer year, Integer quarter, Integer month) {
		super();
		this.list = list;
		Ecr = ecr;
		this.year = year;
		this.quarter = quarter;
		this.month = month;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Integer getQuarter() {
		return quarter;
	}

	public void setQuarter(Integer quarter) {
		this.quarter = quarter;
	}

	public Integer getMonth() {
		return month;
	}

	public void setMonth(Integer month) {
		this.month = month;
	}

	public List<Integer> getList() {
		return list;
	}
	public void setList(List<Integer> list) {
		this.list = list;
	}
	public int getEcr() {
		return Ecr;
	}
	public void setEcr(Integer ecr) {
		Ecr = ecr;
	}
	
}
