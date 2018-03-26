package Skiff.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import edu.nju.hello_order.temp_dao.HibernateUtil;


public class BaseDao<T>{
	private Class<T> classType;
	
	@SuppressWarnings("unchecked")
	public BaseDao() {
		ParameterizedType type = (ParameterizedType) this.getClass().getGenericSuperclass();
        classType = (Class<T>) type.getActualTypeArguments()[0];
	}

	public void flush() {
		HibernateUtil.getSession().flush();
	}

	public void clear() {
		HibernateUtil.getSession().clear();
	}

	
	public void save(Object bean) {
		try {
			System.out.println("ready to getsession");	
			Session session =HibernateUtil.getSession() ;
			Transaction tx=session.beginTransaction();
			session.merge(bean);
			tx.commit();

		} catch (Exception e) {
			e.printStackTrace();
		}  
	}
	
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Object load(Class c, String id) {
		try {
			Session session = HibernateUtil.getSession();
			Transaction tx=session.beginTransaction();
			Object o=session.get(c, id);
			tx.commit();
			return o;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} 
	}

	public T findById(Serializable id) {
        Session session = null;
        Transaction tx = null;
        T obj = null;
        try{
            session = HibernateUtil.getSession();
            tx = session.beginTransaction();

            obj = (T) session.get(classType, id);

            tx.commit();
        }catch(Exception ex){
            System.out.println("查找对象出现错误！");
            ex.printStackTrace();
            if(tx != null){
                tx.rollback();
            }
        }finally{
            if(session != null){
                session.close();
            }
        }
        return obj;
    }

	
	public void update(Object entity) {
        Session session = null;
        Transaction tx = null;
        try{
            session = HibernateUtil.getSession();
            tx = session.beginTransaction();
            session.update(entity);
            tx.commit();
        }catch(Exception ex){
            System.out.println("更新对象出现错误！");
            ex.printStackTrace();
            if(tx != null){
                tx.rollback();
            }
        }finally{
            if(session != null){
                session.close();
            }
        }
    }

	
	public void partUpdate(int id, String[] names, Object... values) {
        Session session = null;
        Transaction tx = null;
        try{
            session = HibernateUtil.getSession();
            tx = session.beginTransaction();

            String tab = classType.getSimpleName();
            String hql = "update "+tab+" t";
            for(int i = 0;i < names.length;i ++){
                hql += " set t."+names[i]+"=?";
            }
            hql += " where t.id="+id;
            Query query = session.createQuery(hql);
            for(int i = 0;i < values.length;i ++){
                query.setParameter(i, values[i]);
            }
            System.out.println("部分更新："+hql);
            query.executeUpdate();
            tx.commit();
        }catch(Exception ex){
            System.out.println("更新对象部分属性出现错误！");
            ex.printStackTrace();
            if(tx != null){
                tx.rollback();
            }
        }finally{
            if(session != null){
                session.close();
            }
        }
    }
	
	public List<T> findByHQL(String hql, Object... params) {
        List<T> list = null;
        Session session = null;
        Transaction tx = null;
        try{
            session = HibernateUtil.getSession();
            tx = session.beginTransaction();

            Query query = session.createQuery(hql);
            for(int i = 0;params != null && i < params.length; i ++){
                query.setParameter(i, params[i]);
            }
            System.out.println("HQL查询："+hql);
            list = query.list();

            tx.commit();
        }catch(Exception ex){
            System.out.println("执行HQL查找对象出现错误！");
            ex.printStackTrace();
            if(tx != null){
                tx.rollback();
            }
        }finally{
            if(session != null){
                session.close();
            }
        }
        return list;
    }
	
	public void delete(Object bean) {

		try {
			Session session =HibernateUtil.getSession() ;
			Transaction tx=session.beginTransaction();
			session.delete(bean);;
			tx.commit();

		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

	
}
