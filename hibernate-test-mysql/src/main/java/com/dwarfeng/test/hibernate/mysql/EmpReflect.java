package com.dwarfeng.test.hibernate.mysql;

import java.util.Date;

public final class EmpReflect {

	private Integer empno;
	private String ename;
	private String job;
	private Integer mgr;
	private Date hiredate;
	private Double sal;
	private Double comm;
	private Integer deptno;

	public EmpReflect() {
	}

	/**
	 * @return the empno
	 */
	public Integer getEmpno() {
		return empno;
	}

	/**
	 * @param empno
	 *            the empno to set
	 */
	public void setEmpno(Integer empno) {
		this.empno = empno;
	}

	/**
	 * @return the ename
	 */
	public String getEname() {
		return ename;
	}

	/**
	 * @param ename
	 *            the ename to set
	 */
	public void setEname(String ename) {
		this.ename = ename;
	}

	/**
	 * @return the job
	 */
	public String getJob() {
		return job;
	}

	/**
	 * @param job
	 *            the job to set
	 */
	public void setJob(String job) {
		this.job = job;
	}

	/**
	 * @return the mgr
	 */
	public Integer getMgr() {
		return mgr;
	}

	/**
	 * @param mgr
	 *            the mgr to set
	 */
	public void setMgr(Integer mgr) {
		this.mgr = mgr;
	}

	/**
	 * @return the hiredate
	 */
	public Date getHiredate() {
		return hiredate;
	}

	/**
	 * @param hiredate
	 *            the hiredate to set
	 */
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}

	/**
	 * @return the sal
	 */
	public Double getSal() {
		return sal;
	}

	/**
	 * @param sal
	 *            the sal to set
	 */
	public void setSal(Double sal) {
		this.sal = sal;
	}

	/**
	 * @return the comm
	 */
	public Double getComm() {
		return comm;
	}

	/**
	 * @param comm
	 *            the comm to set
	 */
	public void setComm(Double comm) {
		this.comm = comm;
	}

	/**
	 * @return the deptno
	 */
	public Integer getDeptno() {
		return deptno;
	}

	/**
	 * @param deptno
	 *            the deptno to set
	 */
	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		return "EmpReflect [empno=" + empno + ", ename=" + ename + ", job=" + job + ", mgr=" + mgr + ", hiredate="
				+ hiredate + ", sal=" + sal + ", comm=" + comm + ", deptno=" + deptno + "]";
	}

}
