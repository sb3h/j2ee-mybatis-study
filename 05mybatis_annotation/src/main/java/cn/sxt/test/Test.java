package cn.sxt.test;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import cn.sxt.dao.UserDao;
import cn.sxt.entity.User;
import cn.sxt.util.MyBatisUtil;

public class Test {
	public static void main(String[] args) throws IOException {
		SqlSession session = MyBatisUtil.getSession();
		UserDao userDao = session.getMapper(UserDao.class);
		List<User> list = userDao.getList();
		for(User u:list){
			System.out.println(u);
		}
	}
}
