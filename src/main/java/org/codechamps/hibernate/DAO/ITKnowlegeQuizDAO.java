package org.codechamps.hibernate.DAO;

import java.util.List;

import org.codechamps.hibernate.entity.ITKnowlegeQuizEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ITKnowlegeQuizDAO {

	SessionFactory factory = (SessionFactory) new Configuration()
			.configure("hibernate.cfg.xml")
			.addAnnotatedClass(ITKnowlegeQuizEntity.class)
			.buildSessionFactory();
	
	public List<ITKnowlegeQuizEntity> getQuizElements() {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		@SuppressWarnings("unchecked")
		List<ITKnowlegeQuizEntity> list = session.createQuery("from ITKnowlegeQuizEntity").getResultList();
		return list;
	}
	
	public void addQuizEntity(ITKnowlegeQuizEntity entity) {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		session.save(entity);
		session.getTransaction().commit();
	}
	
	public void deleteQuizElement(int QuizId) 
	{
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		ITKnowlegeQuizEntity entity = session.get(ITKnowlegeQuizEntity.class,QuizId);
		session.remove(entity);
		session.getTransaction().commit();
	}
	
	public void updateQuizElement(ITKnowlegeQuizEntity updatedQuiz) 
	{
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		ITKnowlegeQuizEntity entity = session.get(ITKnowlegeQuizEntity.class, updatedQuiz.getId());
		entity.setAnswer(updatedQuiz.getAnswer());
		entity.setQuestion(updatedQuiz.getQuestion());
		session.getTransaction().commit();
	}
	
	public List<ITKnowlegeQuizEntity> getQuizElement(int QuizId) 
	{
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		String HQL = "from ITKnowlegeQuizEntity where id ='" + QuizId+"'";
		@SuppressWarnings("unchecked")
		List<ITKnowlegeQuizEntity> brand = session.createQuery(HQL).getResultList();
		return brand;
	}
}
