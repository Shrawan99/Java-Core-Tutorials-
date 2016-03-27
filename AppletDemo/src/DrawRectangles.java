import java.awt.*;
import java.applet.*;
/*
<applet code="Rectangles" width=300 height=200>
</applet>
 */
public class DrawRectangles extends Applet {
	public void paint(Graphics g){
		g.drawRect(10, 10, 60, 50);
		g.fillRect(100, 10, 60, 50);
		g.drawRoundRect(190, 10, 60, 100, 30, 40);
		g.fillRect(70, 90, 140, 40);
		
	} 
	}


