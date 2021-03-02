package org.codechamps.hibernate.DAO;

import java.util.List;

import org.codechamps.hibernate.entity.PubQuizAnswersEntity;
import org.codechamps.hibernate.entity.PubQuizQuestionsEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PubQuizAnswersDAO {
	
	SessionFactory factory = (SessionFactory) new Configuration()
			.configure("hibernate.cfg.xml")
			.addAnnotatedClass(PubQuizQuestionsEntity.class)
			.addAnnotatedClass(PubQuizAnswersEntity.class)
			.buildSessionFactory();
	
	public List<PubQuizAnswersEntity> getAnswers(int questionId) 
	{
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		String HQL = "from PubQuizAnswersEntity where pubQuestionId ='" + questionId+"'";
		@SuppressWarnings("unchecked")
		List<PubQuizAnswersEntity> answersList = session.createQuery(HQL).getResultList();
		return answersList;
	}


}
