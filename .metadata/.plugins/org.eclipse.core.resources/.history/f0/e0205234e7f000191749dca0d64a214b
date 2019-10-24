import java.awt.*;
import javax.swing.*;

public class BallGame extends JFrame {
	Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
	Image desk = Toolkit.getDefaultToolkit().getImage("images/balldesk.jpg");
	
	double x = 100; //小球横坐标
	double y = 100; //小球纵坐标
	double degree = 3.14/3; //60度
	
	//画窗口的方法
	public void paint(Graphics g) {
		System.out.println("窗口被画一次");
		g.drawImage(desk,0,0,null);
		g.drawImage(ball, (int)x, (int)y, null);
		x=x+10*Math.cos(degree);
		y=y+10*Math.sin(degree);
		if(y>500-40-30||y<40+40) {//500窗口高度 40桌子边框 30球直径 最后40是窗口标题高度
			degree=-degree;
		}
		if(x<0+40||x>856-40-30) {
			degree=3.14-degree;
		}
	}
	//窗口加载
	void launchFrame() {
		setSize(856,500);
		setLocation(50,50);
		setVisible(true);
		
		//重画窗口
		while(true) {
			repaint();
			try {
				Thread.sleep(40);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		System.out.println("helloworld");
		BallGame game=new BallGame();
		game.launchFrame();
	}
}
