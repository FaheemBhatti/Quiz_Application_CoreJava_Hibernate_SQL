package org.codechamps.Main;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.util.*;

import org.codechamps.hibernate.entity.GeneralKnowlegeQuizAnswersEntity;
import org.codechamps.hibernate.entity.GeneralKnowlegeQuizQuestionsEntity;
import org.codechamps.service.GeneralKnowlegeQuizAnswerService;
import org.codechamps.service.GeneralKnowlegeQuizQuestionsService;

import javax.swing.JRadioButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JCheckBox;

import java.awt.event.ActionListener;
import java.awt.Component;
import java.awt.event.ActionEvent;

public class GeneralKnowledgeQuizGraphicalInstance extends JFrame {


	
	int currentQuestionIndex = 0;
	int currentAnswerIndex = 0;
	JLabel lblNewLabel;
	JCheckBox rdbtnNewRadioButton;
	JCheckBox rdbtnNewRadioButton_1; 
	JCheckBox rdbtnNewRadioButton_1_1;
	private static final long serialVersionUID = 1L;
	GeneralKnowlegeQuizQuestionsEntity tempElement;
	GeneralKnowlegeQuizQuestionsService gkQuestionService = new GeneralKnowlegeQuizQuestionsService();
	GeneralKnowlegeQuizAnswerService gkAnswerService = new GeneralKnowlegeQuizAnswerService();
	List<GeneralKnowlegeQuizAnswersEntity> gkAnswerEntity;
	List<GeneralKnowlegeQuizQuestionsEntity> gkQuestionEntity = gkQuestionService.getQuizElements();
	List<Integer> checkAnswers;
	
	
	
	
	private JPanel contentPane;


	public GeneralKnowledgeQuizGraphicalInstance() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 843, 501);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		lblNewLabel = new JLabel("");
		
		rdbtnNewRadioButton = new JCheckBox("");
		
		rdbtnNewRadioButton_1 = new JCheckBox("");
		
		rdbtnNewRadioButton_1_1 = new JCheckBox("");
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GraphicalInstance.getFrame().setVisible(false);
			}
				
		
		});
		
		JButton btnNext = new JButton("Start");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				currentAnswerIndex = 0;
				btnNext.setText("Next");
				tempElement = nextQuestion();
				gkAnswerEntity = gkAnswerService.getAnswers(tempElement.getQuestionId());
				
				try
				{
					lblNewLabel.setText(tempElement.getQuestionText());
					rdbtnNewRadioButton.setText(nextAnswer().getAnswer());
					rdbtnNewRadioButton_1.setText(nextAnswer().getAnswer());
					rdbtnNewRadioButton_1_1.setText(nextAnswer().getAnswer());
					setRadioButtonVisibility();
					
					
					System.out.println(gkAnswerService.getCorrectAnswer(tempElement.getQuestionId()));
					System.out.println(rdbtnNewRadioButton.isSelected());
					System.out.println(rdbtnNewRadioButton.isEnabled());

				}
				catch (Exception e) {
					Component frame = null;
					JOptionPane.showMessageDialog(frame, "You have reached the end of the Quiz, please submit");
				}
			}
		});
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int count = 0;
				for(Integer myAnswers: checkAnswers)
				{
					if(myAnswers == 1)
					{
						
						count ++;
					}
				}
				Component frame = null;
				JOptionPane.showMessageDialog(frame, "Total Questions Attempted" + checkAnswers.size()+ 
													  "Total Correct Answers " + count);
				
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(112)
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
					.addGap(376))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(154)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(rdbtnNewRadioButton_1_1, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
						.addComponent(rdbtnNewRadioButton_1, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
						.addComponent(rdbtnNewRadioButton, GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE))
					.addGap(63))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(46)
					.addComponent(btnCancel, GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
					.addGap(92)
					.addComponent(btnNext, GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
					.addGap(87)
					.addComponent(btnSubmit, GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
					.addGap(176))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(26)
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 15, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(rdbtnNewRadioButton, GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(rdbtnNewRadioButton_1, GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(rdbtnNewRadioButton_1_1, GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(77)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(btnCancel, GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
									.addGap(161))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(btnNext, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
									.addContainerGap())))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(68)
							.addComponent(btnSubmit, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
		);
		contentPane.setLayout(gl_contentPane);
		
	}
	
	public GeneralKnowlegeQuizQuestionsEntity nextQuestion(){
	    if(currentQuestionIndex + 1 != gkQuestionEntity.size())
	    	return gkQuestionEntity.get(currentQuestionIndex++);
	    else if(currentQuestionIndex + 1 == gkQuestionEntity.size())
	    	return gkQuestionEntity.get(currentQuestionIndex);
	    else
	    	return null;
	    
	}
	
	public GeneralKnowlegeQuizAnswersEntity nextAnswer() {
		if(currentAnswerIndex +1 != gkAnswerEntity.size())
			return gkAnswerEntity.get(currentAnswerIndex++);
		else if(currentAnswerIndex +1 == gkAnswerEntity.size())
			return gkAnswerEntity.get(currentAnswerIndex);
		else
			return null;
	}
	
	public void setRadioButtonVisibility() {
		String radioOneText = rdbtnNewRadioButton.getText();
		String radioTwoText = rdbtnNewRadioButton_1.getText();
		String radioThreeText = rdbtnNewRadioButton_1_1.getText();
		
		if(radioOneText.equals(radioTwoText) || (radioOneText.equals(radioThreeText))) {
			rdbtnNewRadioButton.setVisible(false);
		
		}
		else if (radioTwoText.equals(radioOneText) || (radioTwoText.equals(radioThreeText))) {
			rdbtnNewRadioButton_1.setVisible(false);
	
		}
		else if (radioThreeText.equals(radioOneText) || (radioThreeText.equals(radioTwoText))) {
			rdbtnNewRadioButton_1_1.setVisible(false);

		}

	}

	public void checkAnswer() {
		String correctAnswer = gkAnswerService.getCorrectAnswer(tempElement.getQuestionId());
		
		if(rdbtnNewRadioButton.isSelected())
		{
			if(rdbtnNewRadioButton.getText().equals(correctAnswer))
				checkAnswers.add(1);
			else
				checkAnswers.add(0);
		}
		
		else if(rdbtnNewRadioButton_1.isSelected())
		{
			if(rdbtnNewRadioButton_1.getText().equals(correctAnswer))
				checkAnswers.add(1);
			else
				checkAnswers.add(0);
		}
		
		else if(rdbtnNewRadioButton_1_1.isSelected())
		{
			if(rdbtnNewRadioButton_1_1.getText().equals(correctAnswer))
				checkAnswers.add(1);
			else 
				checkAnswers.add(0);
		}
	}
}
