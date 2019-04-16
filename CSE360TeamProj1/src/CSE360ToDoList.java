import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CSE360ToDoList extends JFrame implements ActionListener
{
	private JPanel controlPanel;
	private JScrollPane scrollPane;
	private JButton home;
	private JButton add;
	private JButton complete;
	private JButton print;
	private JButton restore;
	private JButton display;
	private JButton change;
	private JButton delete;
	private JButton save;
	private JButton exit;
	
	public CSE360ToDoList()
	{
		super();
		setSize(600,500);
		setLayout(new GridLayout(1,2));
		setTitle("To-Do-List");
	
		home = new JButton("Home");
		home.addActionListener(this);
		
		add = new JButton("Add");
		add.addActionListener(this);
		
		complete = new JButton("Complete");
		complete.addActionListener(this);
		
		print = new JButton("Print");
		print.addActionListener(this);
		
		restore = new JButton("Restore");
		restore.addActionListener(this);
		
		display = new JButton("Display");
		display.addActionListener(this);
		
		change = new JButton("Change");
		change.addActionListener(this);
		
		delete = new JButton("Delete");
		delete.addActionListener(this);
		
		save = new JButton("Save");
		save.addActionListener(this);
		
		exit = new JButton("Exit");
		exit.addActionListener(this);
		
		controlPanel = new JPanel();
		controlPanel.setLayout(new GridLayout(5,2));
		controlPanel.add(home);
		controlPanel.add(display);
		controlPanel.add(add);
		controlPanel.add(change);
		controlPanel.add(complete);
		controlPanel.add(delete);
		controlPanel.add(print);
		controlPanel.add(save);
		controlPanel.add(restore);
		controlPanel.add(exit);
		add(controlPanel);
		
		JTextArea textArea = new JTextArea();
		scrollPane = new JScrollPane(textArea,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		textArea.setText("Test");
		add(scrollPane);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == home)
		{
			//Handler
		}
		else if(e.getSource() == display)
		{
			//Handler
		}
		else if(e.getSource() == add)
		{
			//Handler
		}
		else if(e.getSource() == change)
		{
			//Handler
		}
		else if(e.getSource() == complete)
		{
			//Handler
		}
		else if(e.getSource() == delete)
		{
			//Handler
		}
		else if(e.getSource() == print)
		{
			//Handler
		}
		else if(e.getSource() == save)
		{
			//Handler
		}
		else if(e.getSource() == restore)
		{
			//Handler
		}
		else if(e.getSource() == exit)
		{
			//Handler
		}
	}
	public static void main(String[] args)
	{
		CSE360ToDoList gui = new CSE360ToDoList();
		gui.setVisible(true);
	}
}
