package org.codechamps.hibernate.DAO;

import java.util.List;

import org.codechamps.hibernate.entity.SpellingCheckQuizAnswerEntity;
import org.codechamps.hibernate.entity.SpellingCheckQuizQuestionEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SpelCheckAnswerDAO {
	
	SessionFactory factory = (SessionFactory) new Configuration()
			.configure("hibernate.cfg.xml")
			.addAnnotatedClass(SpellingCheckQuizQuestionEntity.class)
			.addAnnotatedClass(SpellingCheckQuizAnswerEntity.class)
			.buildSessionFactory();
	
	
	public List<SpellingCheckQuizAnswerEntity> getAnswers(int questionId) 
	{
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		String HQL = "from SpellingCheckQuizAnswerEntity where spelQuestionId ='" + questionId+"'";
		@SuppressWarnings("unchecked")
		List<SpellingCheckQuizAnswerEntity> answersList = session.createQuery(HQL).getResultList();
		return answersList;
	}


}
