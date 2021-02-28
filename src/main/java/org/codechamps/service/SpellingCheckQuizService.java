package org.codechamps.service;

import java.util.List;

import org.codechamps.hibernate.DAO.SpellingCheckQuizDAO;
import org.codechamps.hibernate.entity.SpellingCheckQuizEntity;

public class SpellingCheckQuizService {
	
	SpellingCheckQuizDAO dao = new SpellingCheckQuizDAO();
	
	public List<SpellingCheckQuizEntity> getQuizElements(){
		return dao.getQuizElements();
	}
	
	public void addQuizEntity(SpellingCheckQuizEntity entity) {
		dao.addQuizEntity(entity);
	}
	
	public void deleteQuizElement(int QuizId) {
		dao.deleteQuizElement(QuizId);
	}
	
	public void updateQuizElement(SpellingCheckQuizEntity updatedQuiz) {
		dao.updateQuizElement(updatedQuiz);
	}
	
	public List<SpellingCheckQuizEntity> getQuizElement(int QuizId) {
		return dao.getQuizElement(QuizId);
	}

}
