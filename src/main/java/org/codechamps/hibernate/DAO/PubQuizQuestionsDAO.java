package org.codechamps.hibernate.DAO;

import java.util.List;

import org.codechamps.hibernate.entity.PubQuizQuestionsEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PubQuizQuestionsDAO {
	
	SessionFactory factory = (SessionFactory) new Configuration()
			.configure("hibernate.cfg.xml")
			.addAnnotatedClass(PubQuizQuestionsEntity.class)
			.buildSessionFactory();
	
	
	public List<PubQuizQuestionsEntity> getQuizElements() {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		@SuppressWarnings("unchecked")
		List<PubQuizQuestionsEntity> list = session.createQuery("from PubQuizQuestionsEntity").getResultList();
		return list;
	}
	
	public void addQuizEntity(PubQuizQuestionsEntity entity) {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		session.save(entity);
		session.getTransaction().commit();
	}
	
	public void deleteQuizElement(int QuizId) 
	{
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		PubQuizQuestionsEntity entity = session.get(PubQuizQuestionsEntity.class,QuizId);
		session.remove(entity);
		session.getTransaction().commit();
	}
	
	public void updateQuizElement(PubQuizQuestionsEntity updatedQuiz) 
	{
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		PubQuizQuestionsEntity entity = session.get(PubQuizQuestionsEntity.class, updatedQuiz.getId());
		entity.setAnswer(updatedQuiz.getAnswer());
		entity.setQuestion(updatedQuiz.getQuestion());
		session.getTransaction().commit();
	}
	
	public List<PubQuizQuestionsEntity> getQuizElement(int QuizId) 
	{
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		String HQL = "from PubQuizQuestionsEntity where id ='" + QuizId+"'";
		@SuppressWarnings("unchecked")
		List<PubQuizQuestionsEntity> brand = session.createQuery(HQL).getResultList();
		return brand;
	}

}
