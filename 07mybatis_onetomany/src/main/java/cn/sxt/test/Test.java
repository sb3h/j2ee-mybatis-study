package cn.sxt.test;

import java.io.IOException;
import java.util.List;

import cn.sxt.dao.TeacherDao;
import cn.sxt.entity.Student;
import cn.sxt.entity.Teacher;

public class Test {
	public static void main(String[] args) throws IOException {
		TeacherDao teacherDao = new TeacherDao();
		Teacher teacher = teacherDao.getTeacher(1);
		System.out.println("teacher name="+teacher.getName());
		List<Student> list =teacher.getStudents();
		for(Student stu:list){
			System.out.println("student name="+stu.getName());
		}
	}
}
