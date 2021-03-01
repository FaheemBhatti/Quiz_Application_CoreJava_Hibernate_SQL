package org.codechamps.Main;

import java.util.List;

import org.codechamps.hibernate.entity.GeneralKnowlegeQuizAnswersEntity;
import org.codechamps.service.GeneralKnowlegeQuizAnswerService;

public class Main {
	public static void main(String[] args) {
		
		List<GeneralKnowlegeQuizAnswersEntity> list;
		GeneralKnowlegeQuizAnswerService service = new GeneralKnowlegeQuizAnswerService();
		list = service.getAnswers(6);
		
		for (GeneralKnowlegeQuizAnswersEntity var : list) 
		{ 
		    System.out.println(var.getAnswer());
		}
		
		//GraphicalInstanceController.guiInit();
	}
}
