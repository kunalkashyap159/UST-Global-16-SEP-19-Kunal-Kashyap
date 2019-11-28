package com.ustglobal.jpawithhibernate.manytomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.ustglobal.jpawithhibernate.onetomany.PencilBox;

import lombok.Data;

@Entity
@Data
@Table(name="student")
public class Student {

	@Id
	@Column
	private int sid;
	@Column
	private String sname;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="student_course",joinColumns=@JoinColumn(name="sid"))
	private List<Course> course;

}
