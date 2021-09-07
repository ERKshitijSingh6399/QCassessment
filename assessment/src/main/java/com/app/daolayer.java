package com.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import com.app.model.Student;
public class daolayer {

	public static void ins(Student s1, Student s2)
	{
		Configuration configuration=new Configuration().configure();
		StandardServiceRegistryBuilder builder=new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
		SessionFactory factory=configuration.buildSessionFactory(builder.build());
		
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(s1);
		session.save(s2);
		transaction.commit();
		session.close();
		factory.close();
	}
}
