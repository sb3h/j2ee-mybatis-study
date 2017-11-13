package cn.sxt.test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.sxt.dao.UserDao;
import cn.sxt.entity.User;

public class Test {
	public static void main(String[] args) throws IOException {
		UserDao userDao = new UserDao();
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("name", "hhh");
		List<User> list = userDao.getAll(map);
		for(User u:list){
			System.out.println(u);
		}
	}
}
