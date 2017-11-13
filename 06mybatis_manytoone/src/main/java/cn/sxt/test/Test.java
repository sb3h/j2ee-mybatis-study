package cn.sxt.test;

import java.io.IOException;
import java.util.List;

import cn.sxt.dao.StudentDao;
import cn.sxt.entity.Student;

public class Test {
	public static void main(String[] args) throws IOException {
		StudentDao studentDao = new StudentDao();
		List<Student> list = studentDao.getAll();
		for(Student stu:list){
			System.out.println("student name="+stu.getName()+"   student's teacher name="+stu.getTeacher().getName());
		}
	}
}
