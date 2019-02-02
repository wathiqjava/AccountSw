package Account.wathiq.com;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class GuiAccount {
	Operations ops=new Operations();
	JFrame frame=new JFrame("Account");
	 

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiAccount window = new GuiAccount();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GuiAccount() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(200, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,400);    
		frame.getContentPane().setLayout(null);    
		frame.setVisible(true); 
		//Create Button
		//=======================================================================================
		JButton btn1 =new JButton(new ImageIcon());
		btn1.setBounds(10,279,100, 55);  
		btn1.setText("Insert");
		JButton btn2 =new JButton(new ImageIcon());
		btn2.setBounds(115,279,100, 55);  
		btn2.setText("Deposit");
		JButton btn3 =new JButton(new ImageIcon());
		btn3.setBounds(225,279,100, 55);  
		btn3.setText("Withdraw");
		
		
		//=======================================================================================
		JTextField txtf2,txtf3;    
	        txtf2=new JTextField();  
	        txtf2.setBounds(100,40,150,20); 
	        txtf3=new JTextField();  
	        txtf3.setBounds(100,80,150,20); 
	      //=======================================================================================
	        JLabel l2,l3;
	        l2=new JLabel("Amount");  
	        l2.setBounds(20,30, 100,30); 
	        l3=new JLabel("Name");  
	        l3.setBounds(20,70, 100,30); 
	      //=======================================================================================
	        frame.getContentPane().add(btn1);
	        frame.getContentPane().add(btn2);
	        frame.getContentPane().add(btn3);
	        frame.getContentPane().add(txtf2);
	        frame.getContentPane().add(txtf3);
	        frame.getContentPane().add(l2);
	        frame.getContentPane().add(l3);
	        
	      //=======================================================================================   

	        
	      //=======================================================================================        
	        
	
  
		            btn1.addActionListener(new ActionListener() {	public void actionPerformed(ActionEvent e) {
		            	if ( !(txtf2.getText().isEmpty()) && !(txtf3.getText().isEmpty())) 
		     	       {
		            		try {
				    
				    Float t2=Float.parseFloat(txtf2.getText());
			        String s3=txtf3.getText();
					ops.insert(s3,t2);
			        JOptionPane.showInternalMessageDialog(null,"You are Name="+ s3 + "\n Account =" +ops.getAcc_no() +"\n Amount =" +ops.getAmount()); 
		            		}
		            		catch (Exception ex ) {
		            			JOptionPane.showInternalMessageDialog(null,"not number  \n" +ex);
		            		}

			   }
		    	        else {
		    	        	JOptionPane.showInternalMessageDialog(null,"Please Fill TextField");
		    	        }
		            	txtf2.setText("");
		            	txtf3.setText("");
		            	}
		            });
		            
		         btn2.addActionListener(new ActionListener() {
			           public void actionPerformed(ActionEvent e) {
			        	   
	    	if ( !(txtf2.getText().isEmpty()) && !(txtf3.getText().isEmpty())) 
			    {
				   	try {
						    Float t2=Float.parseFloat(txtf2.getText());
					        String s3=txtf3.getText();
						   	ops.deposit(t2);
						   	JOptionPane.showInternalMessageDialog(null,"You are Name="+ s3 + "\n An account has been deposited =" + t2 +"\n Become the total Balance =" +ops.getBalance()); 
				        }
				    catch (Exception ex ) {
				            			JOptionPane.showInternalMessageDialog(null,"not number  \n" +ex);
				            		      }

					   }
	       else {
				    	        	JOptionPane.showInternalMessageDialog(null,"Please Fill TextField");
			    }
			        	   
			        	   
        	txtf2.setText("");
        	txtf3.setText("");  	   
			        	   
		     	}
		             });
		            btn3.addActionListener(new ActionListener() {
		         	public void actionPerformed(ActionEvent e) {
		         		
		    	    	if ( !(txtf2.getText().isEmpty()) && !(txtf3.getText().isEmpty())) 
					    {
		    	    		 
		    	    		
						   	try {
						   		
						             
								    Float t2=Float.parseFloat(txtf2.getText());
							        String s3=txtf3.getText();
							        JOptionPane.showInternalMessageDialog(null,ops.withdraw(t2));
							        if (ops.withdraw(t2)!=0.0) {
								  	ops.withdraw(t2);
							        JOptionPane.showInternalMessageDialog(null,"You are Name="+ s3 + "\n An account has been deposited =" + t2 +"\n Become the total account =" +ops.getBalance()); 
						        }
						   	
							        else {
							        	JOptionPane.showInternalMessageDialog(null,"The amount withdrawn is greater than your Balance");
							        }
						   	}
						   
						    catch (Exception ex ) {
						            			JOptionPane.showInternalMessageDialog(null,"not number  \n" +ex);
						            		      }
		    	    		}else {JOptionPane.showInternalMessageDialog(null,"Please Fill TextField");}

						    	        	
		            	txtf2.setText("");
		            	txtf3.setText("");	    
		         	}
	             	});
	     }

	        	
	        
	        

	        	
	        }
		
	

