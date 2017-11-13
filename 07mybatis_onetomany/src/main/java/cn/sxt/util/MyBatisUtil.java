package cn.sxt.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtil {
	/**
	 * 通过配置文件 创建SqlSessionFactory  是一个SqlSession的工厂类
	 * */
	public static SqlSessionFactory getSqlSessionFactory() throws IOException{
		String resource = "mybatis.cfg.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		return sqlSessionFactory;
	}
	/**
	 * SqlSession 通过id 找到对应的sql语句，执行sql语句
	 * */
	public static SqlSession getSession() throws IOException{
		SqlSessionFactory sqlSessionFactory=getSqlSessionFactory();
		return sqlSessionFactory.openSession();
	}
}
