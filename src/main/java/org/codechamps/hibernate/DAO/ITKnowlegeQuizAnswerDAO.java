package org.codechamps.hibernate.DAO;

import java.util.List;

import org.codechamps.hibernate.entity.GeneralKnowlegeQuizAnswersEntity;
import org.codechamps.hibernate.entity.GeneralKnowlegeQuizQuestionsEntity;
import org.codechamps.hibernate.entity.ITKnowlegeQuizAnswersEntity;
import org.codechamps.hibernate.entity.ITKnowlegeQuizQuestionsEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ITKnowlegeQuizAnswerDAO {
	
	SessionFactory factory = (SessionFactory) new Configuration()
			.configure("hibernate.cfg.xml")
			.addAnnotatedClass(ITKnowlegeQuizQuestionsEntity.class)
			.addAnnotatedClass(ITKnowlegeQuizAnswersEntity.class)
			.buildSessionFactory();
	
	
	public List<ITKnowlegeQuizAnswersEntity> getAnswers(int questionId) 
	{
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		String HQL = "from ITKnowlegeQuizAnswersEntity where itQuestionId ='" + questionId+"'";
		@SuppressWarnings("unchecked")
		List<ITKnowlegeQuizAnswersEntity> answersList = session.createQuery(HQL).getResultList();
		return answersList;
	}

}
