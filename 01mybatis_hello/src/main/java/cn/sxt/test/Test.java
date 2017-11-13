package cn.sxt.test;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;

import cn.sxt.entity.User;
import cn.sxt.util.MyBatisUtil;

public class Test {
	public static void main(String[] args) throws IOException {
		SqlSession session=MyBatisUtil.getSession();
		User user = session.selectOne("cn.sxt.entity.UserMapper.selectUser", 1);
		System.out.println("id="+user.getId()+",name="+user.getName()+",pwd="+user.getPwd());
		session.close();
	}
}
