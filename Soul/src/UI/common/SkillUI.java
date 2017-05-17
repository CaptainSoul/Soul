package UI.common;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dialog;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;


public class SkillUI extends JFrame{
	//��ItemUI����

	public SkillUI(){
		super("а�� ҹ��ħ�n��");
		
		this.addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent arg0) {
				// TODO Auto-generated method stub
				//System.out.print("1");
			}
			
			@Override
			public void windowIconified(WindowEvent arg0) {
				// TODO Auto-generated method stub
				//System.out.print("2");
			}
			
			@Override
			public void windowDeiconified(WindowEvent arg0) {
				// TODO Auto-generated method stub
				//System.out.print("3");
			}
			
			@Override
			public void windowDeactivated(WindowEvent arg0) {
				// TODO Auto-generated method stub
				//System.out.print("4");
			}
			
			@Override
			public void windowClosing(WindowEvent arg0) {
				// TODO Auto-generated method stub
				dispose();
				new SkillBaseUI();
			}
			
			@Override
			public void windowClosed(WindowEvent arg0) {
				// TODO Auto-generated method stub
				//System.out.print("6");
			}
			
			@Override
			public void windowActivated(WindowEvent arg0) {
				// TODO Auto-generated method stub
				//System.out.print("7");
			}
		});
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setSize(500,300);
		this.setLocation(300, 500);
		// maximized at first f.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		Container container = getContentPane();
		
		JPanel panel = new JPanel();
		
		// ���ܵ�ͼƬ�����ڵ�������Ϊ���ӣ���ʱ��Ҫ�ģ���λ�����
		ImageIcon pinky = new ImageIcon("jaken.png");
		JLabel label1 = new JLabel(pinky, JLabel.NORTH_EAST);
		// ���ܵ����֣� λ�ڶ�����Ҳ�Ǳ�������֣�
		JLabel label2 = new JLabel("а�� ҹ��ħ�n��",JLabel.RIGHT);
		// ���ܵ������� λ����������
		JLabel label3 = new JLabel("Ұ���ȱ�����", JLabel.CENTER);
		// ���ܵ�Ч����λ������������ұ�
		JLabel label4 = new JLabel("1145141919���˺�",JLabel.CENTER);
		
		// ͼ�������Ϊ���ߵ�ͼƬ
		Image image = pinky.getImage();
		setIconImage(image);
	
		// ��������
		// �߿�
		Border border = BorderFactory.createLineBorder(Color.BLACK, 10);
		// ����ɫ
		panel.setBackground(Color.lightGray);
		// ����
		//Font font = new Font("���Ĳ���", Font.ITALIC,24);

		// ����	
		panel.setLayout(null);
		label1.setBounds(20 ,10, 250, 250);
		label2.setBounds(290,10, 120, 100);
		label4.setBounds(290,50, 150, 200);
		label3.setBounds(290,180, 120, 100);
		
		panel.setBorder(border);
		panel.add(label1);
		panel.add(label2);
		panel.add(label3);
		panel.add(label4);
		
		container.add(panel);
		setResizable(false);
		setVisible(true);
		requestFocus();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SkillUI skillUI = new SkillUI();
	}

}
