package in.net.usit.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Fetch;

import com.lowagie.text.pdf.XfaForm.InverseStore;

@Entity
public class Classes {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String className;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "Class_id")
	private List<Student> list = new ArrayList<Student>();

	@ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.DETACH, 
			CascadeType.MERGE, 
			CascadeType.PERSIST,
			CascadeType.REFRESH })
	@JoinTable(name="Classes_Students",
			joinColumns = @JoinColumn(name="Class_id"),
			inverseJoinColumns=@JoinColumn(name="Student_id")
			)
	private List<Student> studList=new ArrayList<Student>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public List<Student> getList() {
		return list;
	}

	public void setList(List<Student> list) {
		this.list = list;
	}
	

	public Classes(int id, String className, List<Student> list, List<Student> studList) {
		super();
		this.id = id;
		this.className = className;
		this.list = list;
		this.studList = studList;
	}

	public List<Student> getStudList() {
		return studList;
	}

	public void setStudList(List<Student> studList) {
		this.studList = studList;
	}

	@Override
	public String toString() {
		return "Classes [id=" + id + ", className=" + className + ", list=" + list + ", studList=" + studList + "]";
	}

	public Classes(int id, String className, List<Student> list) {
		super();
		this.id = id;
		this.className = className;
		this.list = list;
	}

	public Classes() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Classes(String string) {
		// TODO Auto-generated constructor stub
		this.className = string;
	}

}
