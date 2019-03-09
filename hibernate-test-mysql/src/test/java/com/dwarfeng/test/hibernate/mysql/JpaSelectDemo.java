package com.dwarfeng.test.hibernate.mysql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.dwarfeng.dutil.basic.io.CT;

public class JpaSelectDemo {

	public static void main(String[] args) {
		/*
		 * 通过预先准备的配置创建会话工厂。
		 */
		SessionFactory sessionFactory = new Configuration()
				.configure("/com/dwarfeng/test/hibernate/mysql/resources/hibernate.jpa-demo.cfg.xml")
				.buildSessionFactory();

		Session session = null;
		try {
			session = sessionFactory.openSession(); // 创建一个Session

			/*
			 * 下面的方法将会生成一个会话，并且查询id号为7369的员工，并输出在控制台上。
			 */
			{
				Transaction tran = null;
				try {
					tran = session.beginTransaction(); // 开启事务
					/*
					 * 这里指明你要获得哪个类型，Hibernate会根据类名查询映射配置文件到数据库查询哪张表，根据指定
					 * id查询实体，通过反射机制创建实体对象
					 */
					EmpJpa empJpa = session.get(EmpJpa.class, 7369); // 执行查询，get
					tran.commit();// 事务提交
					/*
					 * 在控制台上显示信息。
					 */
					CT.trace("将查询的emp信息输出在控制台上！");
					CT.trace(empJpa);
				} catch (Exception e) {
					tran.rollback();
				}
			}

		} catch (Exception e) {
			throw (e);
		} finally {
			session.close(); // 关闭session
		}

	}

}
