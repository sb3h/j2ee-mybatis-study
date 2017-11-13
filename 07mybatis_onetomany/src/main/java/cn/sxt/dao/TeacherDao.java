package cn.sxt.dao;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;

import cn.sxt.entity.Teacher;
import cn.sxt.util.MyBatisUtil;

public class TeacherDao {
	public Teacher getTeacher(int id) throws IOException{
		SqlSession session=MyBatisUtil.getSession();
		Teacher teacher = session.selectOne("cn.sxt.entity.teacher.mapper.getTeacher",id);
		session.close();
		return teacher;
	}
}
