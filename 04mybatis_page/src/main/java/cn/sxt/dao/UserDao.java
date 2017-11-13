package cn.sxt.dao;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import cn.sxt.entity.User;
import cn.sxt.util.MyBatisUtil;

public class UserDao {
	//��ҳ��ѯ
	public List<User> selectAll(int currentPage,int pageSize) throws IOException{
		SqlSession session=MyBatisUtil.getSession();
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("startIndex", (currentPage-1)*pageSize);
		map.put("pageSize", pageSize);
		List<User> list = session.selectList("cn.sxt.entity.UserMapper.selectAll",map);
		session.close();
		return list;
	}
	//��ҳ��ѯ
	public List<User> getAll(int currentPage,int pageSize) throws IOException{
		SqlSession session=MyBatisUtil.getSession();
		RowBounds rowBounds = new RowBounds((currentPage-1)*pageSize,pageSize);
		List<User> list = session.selectList("cn.sxt.entity.UserMapper.getAll",null,rowBounds);
		session.close();
		return list;
	}
	public User getById(int id) throws IOException{
		SqlSession session=MyBatisUtil.getSession();
		User user = session.selectOne("cn.sxt.entity.UserMapper.selectUser", id);
		session.close();
		return user;
	}
	public int add(User user) throws IOException{
		SqlSession session=MyBatisUtil.getSession();
		int result = session.insert("cn.sxt.entity.UserMapper.addUser", user);
		session.commit();
		session.close();
		return result;
	}
	public int update(User user) throws IOException{
		SqlSession session=MyBatisUtil.getSession();
		int result = session.update("cn.sxt.entity.UserMapper.updateUser", user);
		session.commit();
		session.close();
		return result;
	}
	public int delete(int id) throws IOException{
		SqlSession session=MyBatisUtil.getSession();
		int result = session.delete("cn.sxt.entity.UserMapper.deleteUser", id);
		session.commit();
		session.close();
		return result;
	}
}
