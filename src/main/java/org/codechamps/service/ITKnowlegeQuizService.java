package org.codechamps.service;

import java.util.List;

import org.codechamps.hibernate.DAO.ITKnowlegeQuizDAO;
import org.codechamps.hibernate.entity.ITKnowlegeQuizEntity;

public class ITKnowlegeQuizService {
	
	ITKnowlegeQuizDAO dao = new ITKnowlegeQuizDAO();
	
	public List<ITKnowlegeQuizEntity> getQuizElements(){
		return dao.getQuizElements();
	}
	
	public void addQuizEntity(ITKnowlegeQuizEntity entity) {
		dao.addQuizEntity(entity);
	}
	
	public void deleteQuizElement(int QuizId) {
		dao.deleteQuizElement(QuizId);
	}
	
	public void updateQuizElement(ITKnowlegeQuizEntity updatedQuiz) {
		dao.updateQuizElement(updatedQuiz);
	}
	
	public List<ITKnowlegeQuizEntity> getQuizElement(int QuizId) {
		return dao.getQuizElement(QuizId);
	}

}
