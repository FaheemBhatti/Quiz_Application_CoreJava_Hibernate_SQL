package org.codechamps.service;

import java.util.List;

import org.codechamps.hibernate.DAO.ITKnowlegeQuizAnswerDAO;
import org.codechamps.hibernate.entity.ITKnowlegeQuizAnswersEntity;

public class ITKnowlegeQuizAnswersService {
	ITKnowlegeQuizAnswerDAO dao = new ITKnowlegeQuizAnswerDAO();
	
	public List<ITKnowlegeQuizAnswersEntity> getAnswers(int questionId){
		return dao.getAnswers(questionId);
	}
}
