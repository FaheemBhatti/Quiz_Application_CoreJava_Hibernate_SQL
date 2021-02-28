package org.codechamps.Main;

import java.awt.EventQueue;

import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

public class GraphicalInstanceController 
{
	public static GraphicalInstance frame;
	
	public void nimbus() {
		try {
		    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
		        if ("Nimbus".equals(info.getName())) {
		            UIManager.setLookAndFeel(info.getClassName());
		            break;
		        }
		    }
		}
		catch (Exception e) {}
	}
	
	public void guiInit()
	{
		
		EventQueue.invokeLater(new Runnable() {
			public void run() 
			{
				nimbus();
				
				try {
					frame = new GraphicalInstance();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

}
