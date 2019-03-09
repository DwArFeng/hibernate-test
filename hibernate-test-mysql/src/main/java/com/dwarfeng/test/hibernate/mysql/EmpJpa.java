package com.dwarfeng.test.hibernate.mysql;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "emp")
public class EmpJpa {

	@Id
	@Column(name = "empno")
	private Integer empno;
	@Column(name = "ename")
	private String ename;
	@Column(name = "job")
	private String job;

	/**
	 * 无参数构造器。
	 */
	public EmpJpa() {
	}

	public Integer getEmpno() {
		return empno;
	}

	public void setEmpno(Integer empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	@Override
	public String toString() {
		return "EmpJpa [empno=" + empno + ", ename=" + ename + ", job=" + job + "]";
	}

}
