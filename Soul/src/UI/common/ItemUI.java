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

public class ItemUI extends JFrame{
	//�㿪��UI������СUI��class
	//����ָ���� ÿ��С�����UI
	//�ܿ������ߵ�ͼ���������Label��
	//����һ��btn��ʹ�ã�button��
	//�ټ�һ������ʾʹ�ú�Ч��
	

	public ItemUI(){
		super("PINKY���");
		
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
				new InventoryUI();
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
		this.setSize(500,550);
		this.setLocation(1200, 500);
		// maximized at first f.setExtendedState(JFrame.MAXIMIZED_BOTH);
		

		Container container = getContentPane();
		
		JPanel panel = new JPanel();
		
		// ���ߵ�ͼƬ�����ڵ�������Ϊ���ӣ���ʱ��Ҫ�ģ���λ�����
		ImageIcon pinky = new ImageIcon("pinky.png");
		JLabel label1 = new JLabel(pinky, JLabel.NORTH_EAST);
		// ���ߵ����֣� λ�ڶ�����Ҳ�Ǳ�������֣�
		JLabel label2 = new JLabel("�����ˣ���������",JLabel.RIGHT);
		// ���ߵ������� λ����������
		JLabel label3 = new JLabel("pinky���", JLabel.CENTER);
		// ���ߵ�Ч����λ������������ұ�
		JLabel label4 = new JLabel("�ķ�ֹͣ���Է�����Ч��",JLabel.CENTER);
		// ����λ�÷��û��������⣨С���⣩���ǳ����İڷ�
		
		// ͼ�������Ϊ���ߵ�ͼƬ
		Image image = pinky.getImage();
		setIconImage(image);

		// һ���ı�����ʾʹ�û��߶������ߺ������
		JTextArea tf = new JTextArea(10,30);
		
		// ������ť�����ߵ�ʹ�ã�����
		JButton button1 = new JButton("Use");
		JButton button2 = new JButton("Drap");
		button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //�Ե����ʳ�װ��������װ������
            	//��������ʾ���ı�������
            	int n = JOptionPane.showConfirmDialog(null, "�����Ҫ��pinky��", "��ʹ", JOptionPane.YES_NO_OPTION);   
            	if (n == JOptionPane.YES_OPTION) {   
            		//������ʳ�remove����
            		//�������߲��Ƴ����ı�����װ����״̬�������ͬ���򲻱䣬���Ҳ��ܵ��ӣ�
            		//ʳ�inventoryUI��Ӧͼ�껹ԭ����ϵ�ж�
            		
            	    JOptionPane.showMessageDialog(new JFrame(),"������");  
            	    tf.setText("�����ˣ�");
            	} else if (n == JOptionPane.NO_OPTION) {   
            	    JOptionPane.showMessageDialog(new JFrame(),"����ֹͣ"); 
            	    tf.setText("���������⣡");
            	}  
            }
        });
		button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //�������item
            	int n = JOptionPane.showConfirmDialog(null, "�ӵ�pinky?", "��ʹ", JOptionPane.YES_NO_OPTION);   
            	if (n == JOptionPane.YES_OPTION) {   
            		//remove��item��,
            		//inventoryUI��Ӧͼ�껹ԭ����ϵ�ж�
            		
            		
            	    JOptionPane.showMessageDialog(new JFrame(),"ʮ��ڸİ�ʮ");  
            	    tf.setText("��������");
            	} else if (n == JOptionPane.NO_OPTION) {   
            	    JOptionPane.showMessageDialog(new JFrame(),"��������");  
            	}  
            	tf.setText("��������");
            }
        });
	
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
		button1.setBounds(100, 280, 70, 40);
		button2.setBounds(290, 280, 70, 40);
		tf.setBounds(20, 330, 440, 100);
		
		panel.setBorder(border);
		panel.add(label1);
		panel.add(label2);
		panel.add(label3);
		panel.add(label4);
		panel.add(tf);
		panel.add(button1);
		panel.add(button2);
		
		container.add(panel);
		setResizable(false);
		setVisible(true);
		requestFocus();
	}
	public static void main(String[] args) {
		ItemUI f = new ItemUI();	
	}
}
