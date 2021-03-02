package org.codechamps.hibernate.DAO;

import java.util.List;

import org.codechamps.hibernate.entity.ITKnowlegeQuizAnswersEntity;
import org.codechamps.hibernate.entity.ITKnowlegeQuizQuestionsEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ITKnowlegeQuizQuestionDAO {

	SessionFactory factory = (SessionFactory) new Configuration()
			.configure("hibernate.cfg.xml")
			.addAnnotatedClass(ITKnowlegeQuizQuestionsEntity.class)
			.addAnnotatedClass(ITKnowlegeQuizAnswersEntity.class)
			.buildSessionFactory();
	
	public List<ITKnowlegeQuizQuestionsEntity> getQuizElements() {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		@SuppressWarnings("unchecked")
		List<ITKnowlegeQuizQuestionsEntity> list = session.createQuery("from ITKnowlegeQuizQuestionsEntity").getResultList();
		return list;
	}
	
	public void addQuizEntity(ITKnowlegeQuizQuestionsEntity entity) {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		session.save(entity);
		session.getTransaction().commit();
	}
	
	public void deleteQuizElement(int QuizId) 
	{
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		ITKnowlegeQuizQuestionsEntity entity = session.get(ITKnowlegeQuizQuestionsEntity.class,QuizId);
		session.remove(entity);
		session.getTransaction().commit();
	}
	
	
	public List<ITKnowlegeQuizQuestionsEntity> getQuizElement(int QuizId) 
	{
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		String HQL = "from ITKnowlegeQuizQuestionsEntity where id ='" + QuizId+"'";
		@SuppressWarnings("unchecked")
		List<ITKnowlegeQuizQuestionsEntity> brand = session.createQuery(HQL).getResultList();
		return brand;
	}
}
