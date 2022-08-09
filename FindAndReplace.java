import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class FindAndReplace implements ActionListener
{
	//Begin variables
	int aI,bI,cI;
	String a,b,c;
	JFrame frm;
	Container con;
	FlowLayout fly;
	JButton[] fbtn;
	BorderLayout bly;
	Panel pnl,pnl2;
	TextField txt1;
	TextField txt2;
	JTextArea wrt;
	JButton btn;
	JLabel lbl,flbl,rlbl;
	//End variables 
	
	//Begin constructor
	void fR()
	{
		frm=new JFrame();
		con=frm.getContentPane();
		wrt=new JTextArea(12,8);
		//lbl=new JLabel("Test",JLabel.CENTER);
		//lbl.setBackground(Color.decode("#b7b8cf"));
		//lbl.setOpaque(true);
		//lbl.setFont(new Font("Serif", Font.PLAIN, 60));

		
		fly = new FlowLayout();
		con.setLayout(fly);
		
		bly = new BorderLayout();
		con.setLayout(bly);
		
		pnl=new Panel();
		pnl.setLayout(new FlowLayout());
		
		flbl= new JLabel("Find:");
		pnl.add(flbl);
		txt1= new TextField("Write something");
		pnl.add(txt1);
		rlbl= new JLabel("Replace:");
		pnl.add(rlbl);
		txt2= new TextField("Write something");
		pnl.add(txt2);
		pnl2=new Panel();
		pnl2.setLayout(new FlowLayout());
		btn=new JButton("Search");
		btn.addActionListener(this);
		
		con.add(wrt,BorderLayout.NORTH);
		con.add(pnl,BorderLayout.CENTER);
		con.add(btn,BorderLayout.SOUTH);
		
		frm.setSize(400,400);
		frm.setVisible(true);

		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	//End constructor
	public static void main(String args[])
	{
		FindAndReplace c=new FindAndReplace();
		c.fR();
	}
	
	//Other Methods
	public void actionPerformed(ActionEvent e)
	{
		a=txt1.getText();
		b=txt2.getText();
		c=wrt.getText();
		c=c.replace(a,b);
		wrt.setText(c);
	}
}