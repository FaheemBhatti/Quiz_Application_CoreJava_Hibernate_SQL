package org.codechamps.hibernate.DAO;

import java.util.List;

import org.codechamps.hibernate.entity.SpellingCheckQuizQuestionEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SpellingCheckQuizQuestionsDAO {

	SessionFactory factory = (SessionFactory) new Configuration()
			.configure("hibernate.cfg.xml")
			.addAnnotatedClass(SpellingCheckQuizQuestionEntity.class)
			.buildSessionFactory();
	
	public List<SpellingCheckQuizQuestionEntity> getQuizElements() {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		@SuppressWarnings("unchecked")
		List<SpellingCheckQuizQuestionEntity> list = session.createQuery("from SpellingCheckQuizQuestionEntity").getResultList();
		return list;
	}
	
	public void addQuizEntity(SpellingCheckQuizQuestionEntity entity) {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		session.save(entity);
		session.getTransaction().commit();
	}
	
	public void deleteQuizElement(int QuizId) 
	{
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		SpellingCheckQuizQuestionEntity entity = session.get(SpellingCheckQuizQuestionEntity.class,QuizId);
		session.remove(entity);
		session.getTransaction().commit();
	}
	
	public List<SpellingCheckQuizQuestionEntity> getQuizElement(int QuizId) 
	{
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		String HQL = "from SpellingCheckQuizQuestionEntity where id ='" + QuizId+"'";
		@SuppressWarnings("unchecked")
		List<SpellingCheckQuizQuestionEntity> brand = session.createQuery(HQL).getResultList();
		return brand;
	}
}
