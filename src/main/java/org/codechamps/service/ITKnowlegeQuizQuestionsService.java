package org.codechamps.service;

import java.util.List;

import org.codechamps.hibernate.DAO.ITKnowlegeQuizQuestionDAO;
import org.codechamps.hibernate.entity.ITKnowlegeQuizQuestionsEntity;

public class ITKnowlegeQuizQuestionsService {
	
	ITKnowlegeQuizQuestionDAO dao = new ITKnowlegeQuizQuestionDAO();
	
	public List<ITKnowlegeQuizQuestionsEntity> getQuizElements(){
		return dao.getQuizElements();
	}
	
	public void addQuizEntity(ITKnowlegeQuizQuestionsEntity entity) {
		dao.addQuizEntity(entity);
	}
	
	public void deleteQuizElement(int QuizId) {
		dao.deleteQuizElement(QuizId);
	}
	
	public List<ITKnowlegeQuizQuestionsEntity> getQuizElement(int QuizId) {
		return dao.getQuizElement(QuizId);
	}

}
