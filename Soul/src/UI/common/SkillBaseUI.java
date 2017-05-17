package UI.common;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

import skill.Skill;


public class SkillBaseUI extends JFrame{
	//	��InventoryUI����
	// SkillBase������ɾ������ѡ�ֻ�������Ӽ���
	public SkillBaseUI(){
		//"Package"
		super("ս������");
		
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setSize(100,500);
		this.setLocation(500, 400);
		// maximized at first f.setExtendedState(JFrame.MAXIMIZED_BOTH);

		Container container = getContentPane();
		
		GridLayout layout = new GridLayout(5,1);
		
		JPanel panel = new JPanel();
		
		// �������ӵ�ͼƬ
		ImageIcon background = new ImageIcon("background.png");
		
		// ͼ�� 
		ImageIcon sik = new ImageIcon("sik.png");
		Image image = sik.getImage();
		setIconImage(image);
		
		// 5����ť��1*5��С
		JButton[][] btn = new JButton[5][1]; 
		// ÿ����ť�������¼�����
		for ( int i = 0; i != 5; i++){
				btn[i][0] = new JButton(" ");
				btn[i][0].setIcon(background);
		// ��UI��Ҫʵ�ֵ��¼���
		// �����ť����СUI, ��UI����
		// �ر�СUI����UI�ظ�
				btn[i][0].addActionListener(new ActionListener() {				
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						dispose();
						new SkillUI();
					}
				});
		}
		
		//�ⲿ����ʱδд������Ϊ��skill�밴ť����ϵ,��skillʱ��ť��ͼƬ
		//����skillʱ��skill��ͼƬת�䣬������ϵ
		//��Ҫ����ͼƬ�Ĵ�С�����������С���������ʴ�С���뼴��
		ImageIcon yajue = new ImageIcon("YJSNPI.png");
		btn[0][0].setIcon(sik);
		btn[1][0].setIcon(yajue);
		
		// �߿�
		Border border = BorderFactory.createTitledBorder("SkillBase");
		// ����
		//Font font = new Font("���Ĳ���", Font.ITALIC,24);

		// ����	
		panel.setLayout(layout);
		
		// �Ӱ�ť
		for ( int i = 0; i != 5; i++){
			panel.add(btn[i][0]);
		}
		panel.setBorder(border);
		container.add(panel);
		setResizable(false);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SkillBaseUI skillBaseUI = new SkillBaseUI();
	}

}
