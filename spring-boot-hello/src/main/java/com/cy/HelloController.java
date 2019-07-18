package com.cy;

import com.entity.Grade;
import com.entity.Student;
import com.service.GradeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/grade")
public class HelloController {
	@Resource
	private GradeService gradeService;

	@RequestMapping("/save")
	public String save() {
		Grade grade = new Grade();
		grade.setGradeName("TD50");
		Set<Student> studentSet = new HashSet<Student>();
		Student student = new Student();
		student.setAge(23);
		student.setName("Scott");
		Student student2 = new Student();
		student2.setAge(24);
		student2.setName("Yang");
		studentSet.add(student);
		studentSet.add(student2);
		grade.setStudentSet(studentSet);
		gradeService.save(grade);
		return "save ok";
	}

	@RequestMapping("/delete")
	public String delete(){
	   Iterable<Grade> iterable =gradeService.getAll();
		for (Grade grade :iterable) {
			gradeService.delete(grade);
		}
		 return "delete ok" ;
}
	@RequestMapping("/update")
	public String update(){

		return "delete ok" ;
	}

}
