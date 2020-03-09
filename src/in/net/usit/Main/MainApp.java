package in.net.usit.Main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import in.net.usit.Entity.Book;
import in.net.usit.Entity.Classes;
import in.net.usit.Entity.Pages;
import in.net.usit.Entity.Student;

public class MainApp {

	public static void main(String[] args) {

		System.out.println("Main Application Started........");

		SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(Student.class)
				.addAnnotatedClass(Classes.class).addAnnotatedClass(Book.class).addAnnotatedClass(Pages.class)
				.buildSessionFactory();

		Session session = sessionFactory.openSession();

		Student s1 = new Student("vinay", "vinay@gmail.com");
		Student s2 = new Student("vijay", "vijay@gmail.com");
		Student s3 = new Student("sudha", "sudha@gmail.com");

		List<Student> ll = new ArrayList<Student>();
		ll.add(s1);
		ll.add(s2);
		ll.add(s3);
		Classes c1 = new Classes("1st");
		Classes c2 = new Classes("2nd");
		Classes c3 = new Classes("3rd");
		

	

		session.beginTransaction();

		Pages p = new Pages(4, 120);

		Book b = new Book("ABC", "ABC-book description");
		b.setPagesList(p);
		Classes c = new Classes("Diploma");
		List<Book> bList = new ArrayList<Book>();
		bList.add(b);
		Student s = new Student("Rajani", "Rajani@gmail.com", bList);
		ll.add(s);
		c.setList(ll);
		c1.setList(ll);
		c2.setStudList(ll.subList(0, 1));
		c3.setStudList(ll.subList(0, 2));

		// int id=1;

		// Classes c=(Classes) session.get(Classes.class, id);

		// System.out.println("class is :======>"+c);

		session.save(c);
		session.save(c1);
		session.save(c2);
		session.save(c3);

		session.getTransaction().commit();

		System.out.println("application executed successfully.......");
	}

}
