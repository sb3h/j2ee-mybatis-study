package cn.sxt.test;

import java.io.IOException;
import java.util.List;

import cn.sxt.dao.UserDao;
import cn.sxt.entity.User;

public class Test {
	public static void main(String[] args) throws IOException {
		UserDao userDao = new UserDao();
		User user = userDao.getById(1);
		System.out.println(user);
	}
}
