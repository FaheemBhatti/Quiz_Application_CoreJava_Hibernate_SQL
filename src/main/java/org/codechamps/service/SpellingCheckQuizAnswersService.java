package org.codechamps.service;

import java.util.List;

import org.codechamps.hibernate.DAO.SpelCheckAnswerDAO;
import org.codechamps.hibernate.entity.SpellingCheckQuizAnswerEntity;

public class SpellingCheckQuizAnswersService {
	
	SpelCheckAnswerDAO dao = new SpelCheckAnswerDAO();
	
	public List<SpellingCheckQuizAnswerEntity> getAnswers(int questionId) {
		return dao.getAnswers(questionId);
	}
}
