package org.codechamps.service;

import java.util.List;

import org.codechamps.hibernate.DAO.PubQuizQuestionsDAO;
import org.codechamps.hibernate.entity.PubQuizQuestionsEntity;

public class PubQuizQuestionsService {

	PubQuizQuestionsDAO dao = new PubQuizQuestionsDAO();
	
	public List<PubQuizQuestionsEntity> getQuizElements(){
		return dao.getQuizElements();
	}
	
	public void addQuizEntity(PubQuizQuestionsEntity entity) {
		dao.addQuizEntity(entity);
	}
	
	public void deleteQuizElement(int QuizId) {
		dao.deleteQuizElement(QuizId);
	}
	
	public List<PubQuizQuestionsEntity> getQuizElement(int QuizId) {
		return dao.getQuizElement(QuizId);
	}
}
