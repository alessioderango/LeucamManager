package it.leucam.manager.project.util;




import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static final SessionFactory sessionFactory;

	static {
		try {
			sessionFactory = new Configuration()
					.configure("resource/hibernate.cfg.xml")
					.addPackage("it.ManagerFlat.project.controller.domain")
					// .addAnnotatedClass(PUT CLASS)
					.buildSessionFactory();

		} catch (Throwable ex) {
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
