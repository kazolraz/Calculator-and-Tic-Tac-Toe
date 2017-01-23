import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;




import java.lang.*;
import javax.management.timer.Timer;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;



public  class MyActionLis extends JFrame implements ActionListener{
	
	JTextField p, s, r;
	String equation=null;
	String equation1=null;
	MyCalFrame f;
	String first;
	String second;
	String str=null; 
	double me;
	

	
	public MyActionLis() {
		
		
	}
	
	public MyActionLis(MyCalFrame myCalFrame) {
		this.f = myCalFrame;
		
	}
	
	

	

		
			
		
	public void actionPerformed(ActionEvent e) {
		
		
		Object obj = e.getSource();
		  JButton source = (JButton) obj;

		  
		  
		  
		  
			if(source.equals(this.f.btn0)){	
				 f.txt.append("0");
			}
				
				if(source.equals(this.f.btn1)){
					
					 f.txt.append("1");
				}
					 
			    if(source.equals(this.f.btn2)){	
			    f.txt.append("2"); 
			    }
			    
			    
				if(source.equals(this.f.btn3)){	
				f.txt.append("3");
				}
				
				
				if(source.equals(this.f.btn4)){	
				f.txt.append("4");
				}
				
				
				if(source.equals(this.f.btn5)){	
				f.txt.append("5");
				}
				
				if(source.equals(this.f.btn6)){	
				f.txt.append("6");
				}
				
				
				if(source.equals(this.f.btn7)){	
				f.txt.append("7");
				}
				
				if(source.equals(this.f.btn8)){	
				f.txt.append("8"); 
				}
				
				if(source.equals(this.f.btn9)){	
				f.txt.append("9");
				}
				if(source.equals(this.f.btnDot)){	
					f.txt.append(".");
					}
				
				
				
				if(source.equals(this.f.btnP)){	
					str=e.getActionCommand();	
					    equation = f.txt.getText();	
					  //  equation+="+";
						f.txt.setText(null);
					
					
					}
				if(source.equals(this.f.btnM)){	
					str=e.getActionCommand();	
					    equation = f.txt.getText();	
					  //  equation+="+";
						f.txt.setText(null);
					
					
					}
				
				if(source.equals(this.f.btnD)){	
					str=e.getActionCommand();	
					    equation = f.txt.getText();	
					  //  equation+="+";
						f.txt.setText(null);
				}
				
				
				if(source.equals(this.f.btnC)){	
					
						f.txt.setText(null);
						f.txt2.setText(null);
						f.txt3.setText(null);
						
				}
				
				
				if(source.equals(this.f.btnMs)){
					System.out.println("i m here");
					str=e.getActionCommand();	
					 equation = f.txt3.getText();	
					   me=Double.valueOf(equation);
					  //  equation+="+";
						//f.txt.setText(String.valueOf(me));
				}
				
				
				
				if(source.equals(this.f.btnMr)){
					
					System.out.println("i m here");
					
					    
					  
						f.txt3.setText(String.valueOf(me));
						f.txt.setText(null);
				}
				
				
				
				
				if(source.equals(this.f.btnI)){	
					str=e.getActionCommand();	
					    equation = f.txt.getText();	
					  //  equation+="+";
						f.txt.setText(null);
				}
				
				
				if(source.equals(this.f.btnSin)){	
					str=e.getActionCommand();
					f.txt.setText(null);
					f.txt3.setText(null);
					f.txt2.setText("  sin");
					    equation = f.txt.getText();	
					   // equation+=".";
					
						
				}
				
				if(source.equals(this.f.btnCos)){	
					str=e.getActionCommand();
					f.txt.setText(null);
					f.txt3.setText(null);
					f.txt2.setText("  cos");
					   // equation = f.txt.getText();	
					   // equation+=".";
					
						
				}
				
				
				
				if(source.equals(this.f.btnTan)){	
					str=e.getActionCommand();
					f.txt.setText(null);
					f.txt3.setText(null);
					f.txt2.setText("  tan");
					   // equation = f.txt.getText();	
					   // equation+=".";
					
						
				}
				
				if(source.equals(this.f.btnsqrt))
				{	str=e.getActionCommand();
		         
		            System.out.println("you ar here");
		          
		           f.txt3.setText("");
		           f.txt.setText("");
		           f.txt2.setText("√");

		         }
				
				
				
				  if(source.equals(this.f.btnsqr)){
					  str=e.getActionCommand();
			        
				
			        	 f.txt2.setText("^2");
			         } 
				  
				  
				  
				  if(source.equals(this.f.btnCube)){
			        	str=e.getActionCommand();
			        	 
					  f.txt2.setText("^3");
			        	
			        	
			         } 
				
				
				
				
				
				
				if(source.equals(this.f.btnE)){
					equation1= f.txt.getText();	
			        double sum;
					double div;
					double in;
					double m;
					
					
					 if (str=="sin")
			            {
					    double x;
						div=Double.valueOf(equation1);
						
					     x = Math.toRadians(div);
						System.out.println(Math.sin(x));
						f.txt.setText("");
						f.txt3.setText("");
						f.txt3.setText(String.valueOf(Math.sin(x)));
						
			                
			            }
					 
					 
					 if (str=="cos")
			            {
					    double x;
						div=Double.valueOf(equation1);
						
					     x = Math.toRadians(div);
						System.out.println(Math.cos(x));
						f.txt3.setText(String.valueOf(Math.cos(x)));
						f.txt.setText("");
			                
			            }
					 
					 if (str=="tan")
			            {
					    double x;
						div=Double.valueOf(equation1);
						
					     x = Math.toRadians(div);
						System.out.println(Math.tan(x));
						f.txt3.setText(String.valueOf(Math.tan(x)));
						f.txt.setText("");
			                
			            }
					 
					 
					 
					 if(str=="^2")
					 {
						 
						 
			        	 equation = f.txt.getText();
			        	 div= Double.valueOf(equation)*Double.valueOf(equation);
			        	 
			        	 f.txt3.setText(Double.toString(div)); 
			        	 f.txt.setText("");
						 
						 
						 
					 }
					 
					 
					 if (str=="^3")
					 {
						 
						 equation = f.txt.getText();
			        	 div= Double.valueOf(equation)*Double.valueOf(equation)*Double.valueOf(equation);
			        	 
			        	 f.txt3.setText(Double.toString(div)); 
			        	 f.txt.setText("");
						 
						 
						 
						 
					 }
					 
					 
					 
					
					
					if(str=="+"){
					
					sum = Double.valueOf(equation) + Double.valueOf(equation1);
					f.txt3.setText(String.valueOf(sum));
					f.txt.setText("");
					}
					
					if(str=="/"){
						div= Double.valueOf(equation) /Double.valueOf(equation1);
						f.txt3.setText(String.valueOf(div));
						f.txt.setText("");
						
						
					}
					
					if(str=="*"){
						div= Double.valueOf(equation) *Double.valueOf(equation1);
						f.txt3.setText(String.valueOf(div));
						f.txt.setText("");
						
						
					}
					
					if(str=="-"){
						div= Double.valueOf(equation) -Double.valueOf(equation1);
						f.txt3.setText(String.valueOf(div));
						f.txt.setText("");
						
						
					}
					
					if(str=="√"){
						
						double num = Math.sqrt(Double.parseDouble(f.txt.getText()));
			            f.txt3.setText(Double.toString(num));
			            f.txt.setText("");
						
					}
					
						
						
			}
					
					
					
					
				
					
					
					
					
			         
			       
			         
			         
			       
			        	 
			        	 
			        	
			     
				
					}
	}





			

						
						
					
					
													 
				
				
			
			
				
				
				
				
				
				
		
		
					
					
					
				
				
				
			
													 
				
				
			
			




				






	