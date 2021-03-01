package org.codechamps.hibernate.DAO;

import java.util.List;

import org.codechamps.hibernate.entity.GeneralKnowlegeQuizAnswersEntity;
import org.codechamps.hibernate.entity.GeneralKnowlegeQuizQuestionsEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GeneralKnowlegeQuizQuestionDAO 
{
	SessionFactory factory = (SessionFactory) new Configuration()
			.configure("hibernate.cfg.xml")
			.addAnnotatedClass(GeneralKnowlegeQuizQuestionsEntity.class)
			.addAnnotatedClass(GeneralKnowlegeQuizAnswersEntity.class)
			.buildSessionFactory();
	
	
	public List<GeneralKnowlegeQuizQuestionsEntity> getQuizElements() {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		@SuppressWarnings("unchecked")
		List<GeneralKnowlegeQuizQuestionsEntity> list = session.createQuery("from GeneralKnowlegeQuizQuestionsEntity").getResultList();
		return list;
	}
	
	public void addQuizEntity(GeneralKnowlegeQuizQuestionsEntity entity) {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		session.save(entity);
		session.getTransaction().commit();
	}
	
	public void deleteQuizElement(int QuizId) 
	{
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		GeneralKnowlegeQuizQuestionsEntity entity = session.get(GeneralKnowlegeQuizQuestionsEntity.class,QuizId);
		session.remove(entity);
		session.getTransaction().commit();
	}
	
	public List<GeneralKnowlegeQuizQuestionsEntity> getQuizElement(int QuizId) 
	{
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		String HQL = "from GeneralKnowlegeQuizQuestionsEntity where id ='" + QuizId+"'";
		@SuppressWarnings("unchecked")
		List<GeneralKnowlegeQuizQuestionsEntity> brand = session.createQuery(HQL).getResultList();
		return brand;
	}
	
	
}
