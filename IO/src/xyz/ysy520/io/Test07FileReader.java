package xyz.ysy520.io;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.*;

public class Test07FileReader extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JPanel jContentPane = null; //创建面板对象
	private JTextArea jTextArea = null;
	private JPanel controlPanel = null;
	private JButton openButton = null;
	private JButton closeButton = null;
	
	private JButton getOpenButton() {
		if (openButton == null) {
			openButton = new JButton();
			openButton.setText("写入文件");
			openButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					File file = new File("word.txt");
					
					try {
						FileWriter out = new FileWriter(file);
						String s = jTextArea.getText();
						out.write(s);
						out.close();
					} catch (Exception e1) {
						e1.printStackTrace();
					}
					
				}
			});
		}
		return openButton;
	}
	
	private JButton getCloseButton() {
		if (closeButton == null) {
			closeButton = new JButton();
			closeButton.setText("读取文件");
			closeButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					File file = new File("word.txt");
					try {
						FileReader in = new FileReader(file);
						char byt[] = new char[1024]; 
						int len = in.read(byt);
						jTextArea.setText(new String(byt, 0, len));
						in.close();
					} catch (Exception e2) {
						e2.printStackTrace();
					}
				}
			});
		}
		return closeButton;
	}
	
	public Test07FileReader() {
		super();
		intialize();
	}
	
	private void intialize() {
		this.setSize(300, 200);
		this.setContentPane(getJContentPanel());
		this.setTitle("JFrame");
	}
	
	private JPanel getJContentPanel() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(new BorderLayout());
			jContentPane.add(getjTextArea(), BorderLayout.CENTER);
			jContentPane.add(getControlPanel(), BorderLayout.SOUTH);
		}
		return jContentPane;
	}

	public JTextArea getjTextArea() {
		return jTextArea;
	}

	public void setjTextArea(JTextArea jTextArea) {
		this.jTextArea = jTextArea;
	}

	public JPanel getControlPanel() {
		return controlPanel;
	}

	public void setControlPanel(JPanel controlPanel) {
		this.controlPanel = controlPanel;
	}
	
	public static void main(String[] args) {
		Test07FileReader thisClass = new Test07FileReader();
		thisClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		thisClass.setVisible(true);
	}
}
