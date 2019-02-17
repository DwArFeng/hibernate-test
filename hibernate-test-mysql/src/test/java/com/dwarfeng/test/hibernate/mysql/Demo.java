package com.dwarfeng.test.hibernate.mysql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.dwarfeng.dutil.basic.io.CT;

public class Demo {

	private static SessionFactory sf = new Configuration()
			.configure("/com/dwarfeng/test/hibernate/mysql/resources/hibernate.cfg.xml").buildSessionFactory();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void getUser() {
		Session session = null;
		Transaction tran = null;
		try {
			session = sf.openSession(); // 创建一个Session
			tran = session.beginTransaction(); // 开启事务
			/*
			 * 这里指明你要获得哪个类型，Hibernate会根据类名查询映射配置文件到数据库查询哪张表，根据指定
			 * id查询实体，通过反射机制创建实体对象
			 */
			EmpReflect empReflect = (EmpReflect) session.get(EmpReflect.class, 7369); // 执行查询，get
			tran.commit();// 事务提交
			CT.trace(empReflect);
		} catch (Exception e) {
			tran.rollback(); // 事务回滚
			throw (e);
		} finally {
			session.close(); // 关闭session
		}
	}
}
