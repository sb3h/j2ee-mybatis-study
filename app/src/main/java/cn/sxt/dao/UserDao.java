package cn.sxt.dao;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import cn.sxt.entity.User;
import cn.sxt.util.MyBatisUtil;

public class UserDao {
	public List<User> getAll(Map<String,Object> map) throws IOException{
		SqlSession session=MyBatisUtil.getSession();
		List<User> list = session.selectList("cn.sxt.entity.UserMapper.getUserByCondition",map);
		session.close();
		return list;
	}
}
