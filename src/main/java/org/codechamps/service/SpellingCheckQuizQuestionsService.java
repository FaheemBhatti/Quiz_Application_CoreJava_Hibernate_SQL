package org.codechamps.service;

import java.util.List;

import org.codechamps.hibernate.DAO.SpellingCheckQuizQuestionsDAO;
import org.codechamps.hibernate.entity.SpellingCheckQuizQuestionEntity;

public class SpellingCheckQuizQuestionsService {
	
	SpellingCheckQuizQuestionsDAO dao = new SpellingCheckQuizQuestionsDAO();
	
	public List<SpellingCheckQuizQuestionEntity> getQuizElements(){
		return dao.getQuizElements();
	}
	
	public void addQuizEntity(SpellingCheckQuizQuestionEntity entity) {
		dao.addQuizEntity(entity);
	}
	
	public void deleteQuizElement(int QuizId) {
		dao.deleteQuizElement(QuizId);
	}
	
	public List<SpellingCheckQuizQuestionEntity> getQuizElement(int QuizId) {
		return dao.getQuizElement(QuizId);
	}

}
