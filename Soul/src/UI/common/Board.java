package UI.common;

import org.omg.CORBA.PUBLIC_MEMBER;

import character.Sprite;

public class Board {
        private int boardWidth;
		private int boardHeight;
        private int boardgroundAlpha;
        private boolean isDraging = false;
        private String title;
        private boolean dragable;
        
        /**
         * 
         * @param width                   ����
         * @param height                  ����
         * @param backgroundColor        ��屳����ɫ	(δ����)
         * @param backgroundAlpha        ��屳��͸����
         * @param title                   ���������֣���Ϊ���ַ������򲻻ᴴ��������
         * @param dragable        �Ƿ������϶�����Ϊtrue�����ͨ�������������������϶�
         * 
         */
        public Board  ( int boardWidth, int boardHeight, int backgroundAlpha, String title){
        	this.boardWidth = boardWidth;
        	this.boardHeight = boardHeight;
        	this.boardgroundAlpha = boardgroundAlpha;
        	this.title = title;
        	this.dragable = false;
        	
        }
        

//----------------------���Ƿָ��ߣ�����Խ����Ϸ�-----------------------------//
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

 		public int getBoardgroundAlpha() {
 			return boardgroundAlpha;
 		}

 		public void setBoardgroundAlpha(int boardgroundAlpha) {
 			this.boardgroundAlpha = boardgroundAlpha;
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