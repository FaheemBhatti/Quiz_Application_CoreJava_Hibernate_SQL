package org.codechamps.service;

import java.util.List;

import org.codechamps.hibernate.DAO.PubQuizAnswersDAO;
import org.codechamps.hibernate.entity.PubQuizAnswersEntity;

public class PubQuizAnswersService {
	
	PubQuizAnswersDAO dao = new PubQuizAnswersDAO();
	public List<PubQuizAnswersEntity> getAnswers(int questionId) {
		return dao.getAnswers(questionId);
	}

}
