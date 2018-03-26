package Skiff.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import edu.nju.hello_order.temp_model.*;

public class HibernateUtil {
	private static SessionFactory sessionFactory;
	
	 public static SessionFactory getSessionFactory(){
		 try {
				Configuration config;
				ServiceRegistry serviceRegistry;
				config = new Configuration().configure();
				config.addAnnotatedClass(Comment.class);
				config.addAnnotatedClass(Follow.class);
				config.addAnnotatedClass(Fond.class);
				config.addAnnotatedClass(Note.class);
				config.addAnnotatedClass(Places.class);
				config.addAnnotatedClass(Route.class);
				config.addAnnotatedClass(RoutePlan.class);
				config.addAnnotatedClass(TopicDao.class);
				config.addAnnotatedClass(User.class);
				config.addAnnotatedClass(Wish.class);
				serviceRegistry =new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
				sessionFactory=config.buildSessionFactory(serviceRegistry);	
				return sessionFactory;
			}catch (Exception e) {
				e.printStackTrace();
				return null;
			}
	 }
	 
	 
	 public static Session getSession(){
		 return getSessionFactory().getCurrentSession();
	 }
}
