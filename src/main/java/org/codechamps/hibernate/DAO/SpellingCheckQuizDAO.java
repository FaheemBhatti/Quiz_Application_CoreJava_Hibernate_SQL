package org.codechamps.hibernate.DAO;

import java.util.List;

import org.codechamps.hibernate.entity.SpellingCheckQuizEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SpellingCheckQuizDAO {

	SessionFactory factory = (SessionFactory) new Configuration()
			.configure("hibernate.cfg.xml")
			.addAnnotatedClass(SpellingCheckQuizEntity.class)
			.buildSessionFactory();
	
	public List<SpellingCheckQuizEntity> getQuizElements() {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		@SuppressWarnings("unchecked")
		List<SpellingCheckQuizEntity> list = session.createQuery("from SpellingCheckQuizEntity").getResultList();
		return list;
	}
	
	public void addQuizEntity(SpellingCheckQuizEntity entity) {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		session.save(entity);
		session.getTransaction().commit();
	}
	
	public void deleteQuizElement(int QuizId) 
	{
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		SpellingCheckQuizEntity entity = session.get(SpellingCheckQuizEntity.class,QuizId);
		session.remove(entity);
		session.getTransaction().commit();
	}
	
	public void updateQuizElement(SpellingCheckQuizEntity updatedQuiz) 
	{
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		SpellingCheckQuizEntity entity = session.get(SpellingCheckQuizEntity.class, updatedQuiz.getId());
		entity.setAnswer(updatedQuiz.getAnswer());
		entity.setQuestion(updatedQuiz.getQuestion());
		session.getTransaction().commit();
	}
	
	public List<SpellingCheckQuizEntity> getQuizElement(int QuizId) 
	{
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		String HQL = "from GeneralKnowlegeQuizEntity where id ='" + QuizId+"'";
		@SuppressWarnings("unchecked")
		List<SpellingCheckQuizEntity> brand = session.createQuery(HQL).getResultList();
		return brand;
	}
	
}
