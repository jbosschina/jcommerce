package com.jcommerce.core.dao.impl;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.jcommerce.core.dao.DAO;
import com.jcommerce.core.model.ModelObject;

public class DAOImpl implements DAO {

	protected Class modelClass = null;
	
	@PersistenceContext
	private EntityManager entityManager;
	
//	@Autowired
//    private SessionFactory sessionFactory;
//
//    public Session getCurrentSession() {
//        return sessionFactory.getCurrentSession();
//    }

	public List<DAO> getList(String hql) {
		return null;
	}

	public void save(ModelObject obj) {
		if (obj == null) {
			throw new IllegalArgumentException("obj = null");
		}
//		ModelObject _obj = (ModelObject) getHibernateTemplate().merge(obj);
//		setId(obj, getId(_obj));
//		Session session = sessionFactory.openSession();
//		session.getTransaction().begin();
//		session.save(obj);
//		session.getTransaction().commit();
	}

	private Serializable getId(ModelObject obj) {
		return obj.getId();
	}
	
	private void setId(ModelObject obj, Serializable id) {
        obj.setId((String)id);
    }
	
	public ModelObject getById(Serializable id){
//		return (ModelObject) sessionFactory.openSession().get(modelClass, id);
//        return (ModelObject)getHibernateTemplate().get(modelClass, id);
		return null;
    }
	
	public boolean deleteById(Serializable id) {
//        ModelObject obj = getById(id);
//        if (obj == null) {
//            return false;
//        }
//        sessionFactory.openSession().delete(obj);
//        return true;
		return false;
    } 

}
