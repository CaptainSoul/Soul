package UI.common;

import java.awt.Point;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.canvas.GraphicsContext;

public interface Controller extends EventHandler<Event>{

  /**
   * ÿ��Ⱦһ֡��ִ��һ��
   * 
   * @param context
   */
  public void draw(GraphicsContext context);

  /**
   * ��ȡ��ǰ���λ��
   * 
   * @return
   */
  public Point getMousePoint();

  /**
   * ÿ��Ⱦһ֡��ִ��һ��
   * 
   * @return
   */
  public Controller invoke();

  /**
   * ��ȡ�������
   * 
   * @return
   */
  public Node getControlBar();
  
}