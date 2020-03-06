package com.pack;
import org.springframework.beans.factory.annotation.Required;

public class Student1 {

	    private Student2 student2;

		public Student2 getStudent2() {
			return student2;
		}
        @Required
		public void setStudent2(Student2 student2) {
			this.student2 = student2;
		}   
	
}
