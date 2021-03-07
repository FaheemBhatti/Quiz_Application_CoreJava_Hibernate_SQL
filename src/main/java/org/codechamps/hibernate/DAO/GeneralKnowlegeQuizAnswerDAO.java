package org.codechamps.hibernate.DAO;

import java.util.List;

import org.codechamps.hibernate.entity.GeneralKnowlegeQuizAnswersEntity;
import org.codechamps.hibernate.entity.GeneralKnowlegeQuizQuestionsEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GeneralKnowlegeQuizAnswerDAO 
{
	SessionFactory factory = (SessionFactory) new Configuration()
			.configure("hibernate.cfg.xml")
			.addAnnotatedClass(GeneralKnowlegeQuizQuestionsEntity.class)
			.addAnnotatedClass(GeneralKnowlegeQuizAnswersEntity.class)
			.buildSessionFactory();
	
	public List<GeneralKnowlegeQuizAnswersEntity> getAnswers() {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		String HQL = "from GeneralKnowlegeQuizAnswersEntity ";
		@SuppressWarnings("unchecked")
		List<GeneralKnowlegeQuizAnswersEntity> answersList = session.createQuery(HQL).getResultList();
		session.close();
		return answersList;
	}
	
	
	
	
	public List<GeneralKnowlegeQuizAnswersEntity> getAnswers(int questionId) 
	{
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		String HQL = "from GeneralKnowlegeQuizAnswersEntity where questionId ='" + questionId+"'";
		@SuppressWarnings("unchecked")
		List<GeneralKnowlegeQuizAnswersEntity> answersList = session.createQuery(HQL).getResultList();
		session.close();
		return answersList;
	}
	
	public String getCorrectAnswer(int questionId){
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		String HQL = "from GeneralKnowlegeQuizAnswersEntity where questionId = '" + questionId + "'and flag ='" +1+"'" ;
		GeneralKnowlegeQuizAnswersEntity entity = (GeneralKnowlegeQuizAnswersEntity) session.createQuery(HQL).getSingleResult();
		session.close();
		return entity.getAnswer();
	}
	

}
