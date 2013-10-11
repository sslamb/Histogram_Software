import java.awt.*;
import javax.swing.JPanel;

public class FigurePanel extends JPanel{
   //Define Constants
   public static final int RECTANGLE = 2;
   
   private int type = 1;
   private boolean filled  = false;
   
   public FigurePanel(){}
   
   public FigurePanel(int type){
      this.type = type;
   }
   
   public FigurePanel(int type,boolean filled){
      this.type = type;
      this.filled = filled;
   }
   
   protected void paintComponent(Graphics g){
      super.paintComponent(g);
      
      int width = getSize().width;
      int height = getSize().height;
      
      g.setColor(Color.blue);
      if(filled)
         g.fillRect((int)(0.1 * width), (int)(0.1*height),(int)(0.8*width),(int)(0.8*height));
      else
         g.drawRect((int)(0.1*width),(int)(0.1*height),(int)(0.8*width),(int)(0.8*height));
   }
   
   public void setType(int type){
      this.type = type;
      repaint();
   }
   
   public int getType(){
      return type;
   }
   
   public void setFilled(boolean filled){
      this.filled = filled;
      repaint();
   }
   
   public boolean isFilled(){
      return filled;
   }
   
   public Dimension getPreferredSize(){
      return new Dimension(80,80);
   }
}