import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.Timer;


public class Listener extends JFrame implements ActionListener {
	MyCalFrame f;
	String source;
	String str;
	String equation;
	
	int t=0;

	public Listener(MyCalFrame m){
		
		f=m;
		
		
	}
	
	
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		Object obj = e.getSource();
		  JButton source = (JButton) obj;
		  
		  if(source.equals(this.f.btnTime)){  
		  int hour,min,sec=0;   
			Calendar rightNow=Calendar.getInstance();
			 hour=rightNow.get(Calendar.HOUR_OF_DAY);
			 min=rightNow.get(Calendar.MINUTE);
			sec=rightNow.get(Calendar.SECOND);
			
			
			f.txt.setText(hour+":"+min+":"+sec);
			System.out.println(hour+":"+min+":"+sec);
		  
		 

	    }
}
}
		
		 
		
		
	

	

