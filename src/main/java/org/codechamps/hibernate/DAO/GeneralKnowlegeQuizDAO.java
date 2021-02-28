package org.codechamps.hibernate.DAO;

import java.util.List;

import org.codechamps.hibernate.entity.GeneralKnowlegeQuizEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GeneralKnowlegeQuizDAO 
{
	SessionFactory factory = (SessionFactory) new Configuration()
			.configure("hibernate.cfg.xml")
			.addAnnotatedClass(GeneralKnowlegeQuizEntity.class)
			.buildSessionFactory();
	
	
	public List<GeneralKnowlegeQuizEntity> getQuizElements() {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		@SuppressWarnings("unchecked")
		List<GeneralKnowlegeQuizEntity> list = session.createQuery("from GeneralKnowlegeQuizEntity").getResultList();
		return list;
	}
	
	public void addQuizEntity(GeneralKnowlegeQuizEntity entity) {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		session.save(entity);
		session.getTransaction().commit();
	}
	
	public void deleteQuizElement(int QuizId) 
	{
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		GeneralKnowlegeQuizEntity entity = session.get(GeneralKnowlegeQuizEntity.class,QuizId);
		session.remove(entity);
		session.getTransaction().commit();
	}
	
	public void updateQuizElement(GeneralKnowlegeQuizEntity updatedQuiz) 
	{
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		GeneralKnowlegeQuizEntity entity = session.get(GeneralKnowlegeQuizEntity.class, updatedQuiz.getId());
		entity.setAnswer(updatedQuiz.getAnswer());
		entity.setQuestion(updatedQuiz.getQuestion());
		session.getTransaction().commit();
	}
	
	public List<GeneralKnowlegeQuizEntity> getQuizElement(int QuizId) 
	{
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		String HQL = "from GeneralKnowlegeQuizEntity where id ='" + QuizId+"'";
		@SuppressWarnings("unchecked")
		List<GeneralKnowlegeQuizEntity> brand = session.createQuery(HQL).getResultList();
		return brand;
	}
}
