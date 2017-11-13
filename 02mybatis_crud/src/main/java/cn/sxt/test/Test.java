package cn.sxt.test;

import java.io.IOException;
import java.util.List;

import cn.sxt.dao.UserDao;
import cn.sxt.entity.User;

public class Test {
	public static void main(String[] args) throws IOException {
		UserDao userDao = new UserDao();
		List<User> list = userDao.getAll();
		for(User u:list){
			System.out.println(u);
		}
	}
}
