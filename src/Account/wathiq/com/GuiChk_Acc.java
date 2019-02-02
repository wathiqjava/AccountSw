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

public class GuiChk_Acc {

	private JFrame frame;
	private static GuiChk_Acc Window;
	Operations ops=new Operations();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 Window = new GuiChk_Acc();
					Window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GuiChk_Acc() {
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
		
        JLabel l1;
        l1=new JLabel("Please Insert Account_No");  
        l1.setBounds(20,50, 200,30);
		
		JButton btn1 =new JButton(new ImageIcon());
		btn1.setBounds(10,279,100, 55);  
		btn1.setText("OK");
		
		JTextField txtf1;    
	    txtf1=new JTextField();  
        txtf1.setBounds(200,60,150,20); 
        
        
        frame.getContentPane().add(btn1);
        frame.getContentPane().add(txtf1);
        frame.getContentPane().add(l1);
        
        btn1.addActionListener(new ActionListener() {	public void actionPerformed(ActionEvent e) {
        	//JOptionPane.showInternalMessageDialog(null,ops.getAcc_no());
        	Integer t1=Integer.parseInt(txtf1.getText());
        	if ((ops.getAcc_no()==t1) && !(txtf1.getText().isEmpty())) {
        		try {
				//GuiChk_Acc window = new GuiChk_Acc();
				Window.frame.setVisible(false);
        		GuiAccount window2 = new GuiAccount();
           		window2.frame.setVisible(true);
        		}
        		catch (Exception ex) {
        			JOptionPane.showInternalMessageDialog(null,ex);
        		}
        	} else {
        		JOptionPane.showInternalMessageDialog(null,"Acount Not Correct or text Empty");
        	}
        	
        }   });
		
		
		
		
	}

}
