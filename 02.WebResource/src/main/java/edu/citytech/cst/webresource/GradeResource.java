package edu.citytech.cst.webresource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.citytech.cst.service.GradeCalculator;
import edu.citytech.cst.service.StudentGPACalc;

@RestController
@RequestMapping("/gradesystem")
public class GradeResource {
	
	@RequestMapping("/Midterm")
	public String getMidSemeterStatus(@RequestParam(value="grade")float grade) {
		
		String status = GradeCalculator.midtermStatus(grade);
		
		return status;
	}
	
	@RequestMapping("/A-F")
	public String getLetterGrade(@RequestParam(value="grade")float grade) {
		String letterGrade = StudentGPACalc.getLetterGrade(grade);
		
		return letterGrade;
	}
	
	@RequestMapping("/GPA")
	public String getGPA(@RequestParam(value="grade")float grade) {
		
		float gpa = StudentGPACalc.getGPA(grade);
		
		return gpa + "";
	}

}
