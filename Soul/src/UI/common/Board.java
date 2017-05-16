package UI.common;

import org.omg.CORBA.PUBLIC_MEMBER;

import character.Sprite;

public class Board {
        private int boardWidth;
		private int boardHeight;
        private boolean isDraging = false;
        private String title;
        private boolean dragable;
        
        /**
         * 
         * @param width                   ����
         * @param height                  ����
         * @param backgroundColor        ��屳����ɫ	(δ����)
         * @param backgroundAlpha        ��屳��͸����(��ɾ��)
         * @param title                   ���������֣���Ϊ���ַ������򲻻ᴴ��������
         * @param dragable        �Ƿ������϶�����Ϊtrue�����ͨ�������������������϶�
         * 
         */
        public Board  ( int boardWidth, int boardHeight, String title){
        	this.boardWidth = boardWidth;
        	this.boardHeight = boardHeight;
        	this.title = title;
        	this.dragable = false;
        }
        
        /**
         * Ϊ��������Ԫ�� 
         * @param instance        		      ��Ԫ��ʵ��
         * @param x                        ��Ԫ�ؽ�Ҫ��ӵ��ĺ�����λ��
         * @param y                        ��Ԫ�ؽ�Ҫ��ӵ���������λ��
         * 
         */                
 
        
//----------------------���濪ʼ�Ƕ�д��-----------------------------//                
        public int getBoardWidth() {
 			return boardWidth;
 		}

 		public void setBoardWidth(int boardWidth) {
 			this.boardWidth = boardWidth;
 		}

 		public int getBoardHeight() {
 			return boardHeight;
 		}

 		public void setBoardHeight(int boardHeight) {
 			this.boardHeight = boardHeight;
 		}

 		public String getTitle() {
 			return title;
 		}

 		public void setTitle(String title) {
 			this.title = title;
 		}

 		public boolean isDragable() {
 			return dragable;
 		}

 		public void setDragable(boolean dragable) {
 			this.dragable = dragable;
 		}

 		public void setDraging(boolean isDraging) {
 			this.isDraging = isDraging;
 		}
}