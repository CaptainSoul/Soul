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

public class InventoryUI extends JFrame{
	//���UI
	//ȫ�ǰ�ť���
	//�����ť�����¼���СUI
	
	public InventoryUI(){
		//"Package"
		super("���δ����");
		
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setSize(400,600);
		this.setLocation(1000, 300);
		// maximized at first f.setExtendedState(JFrame.MAXIMIZED_BOTH);

		Container container = getContentPane();
		
		GridLayout layout = new GridLayout(5,4);
		
		JPanel panel = new JPanel();
		
		// �������ӵ�ͼƬ
		ImageIcon background = new ImageIcon("background.png");
		
		// ͼ�� 
		ImageIcon yajue = new ImageIcon("YJSNPI.png");
		Image image = yajue.getImage();
		setIconImage(image);
		
		// 20����ť��4*5��С
		JButton[][] btn = new JButton[5][4]; 
		// ÿ����ť�������¼�����
		for ( int i = 0; i != 5; i++){
			for ( int j = 0; j != 4; j++){
				btn[i][j] = new JButton(" ");
				btn[i][j].setIcon(background);
			}
		}
		
		//�ⲿ����ʱδд������Ϊ��item�밴ť����ϵ,��itemʱ��ť��ͼƬ
		//����itemʱ��item��ͼƬת�䣬������ϵ, ���Ǳ�����⣺���i=5��������
		// int countA = 0;
		// int countB = 0;
		// ����actionʱcountA��countB�ı�
		// countA = 3,���item, countA = 0 ����countB++�� numItems++
		// countA = 0,����item, countA = 3 ����countB--�� numItems--
		//ʧȥitemʱ��item��ͼƬ�Ļ�background��������ϵ
		//��Ҫ����ͼƬ�Ĵ�С�����������С���������ʴ�С���뼴��
		//����Ϊ˼�룺����һ����Ʒ���ʱ��
		ImageIcon pinky = new ImageIcon("pinky.png");
		btn[0][0].setIcon(yajue);
		btn[0][1].setIcon(pinky);
		// ��UI��Ҫʵ�ֵ��¼���
		// �����ť����СUI, ��UI����
		// �ر�СUI����UI�ظ�
			btn[0][0].addActionListener(new ActionListener() {				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					dispose();
					new ItemUI();
				}
			});
		//(��һ����Ʒʧȥʱ)
		btn[0][1].setIcon(background);
		
		
		// �߿�
		Border border = BorderFactory.createTitledBorder("Package");
		// ����
		//Font font = new Font("���Ĳ���", Font.ITALIC,24);

		// ����	
		panel.setLayout(layout);
		
		// �Ӱ�ť
		for ( int i = 0; i != 5; i++){
			for ( int j = 0; j != 4; j++){
				panel.add(btn[i][j]);
			}
		}
		panel.setBorder(border);
		container.add(panel);
		setResizable(false);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InventoryUI f = new InventoryUI();
	}

}
