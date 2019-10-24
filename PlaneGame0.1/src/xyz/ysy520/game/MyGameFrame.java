package xyz.ysy520.game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Date;

/**
 * 飞机游戏主窗口
 * @author yangshengyong
 *
 */
public class MyGameFrame extends Frame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static void main(String[] args) {
		MyGameFrame f = new MyGameFrame();
		f.launchFrame();
	}

	Image planeImg = GameUtil.getImage("images/plane.png");
	Image bg = GameUtil.getImage("images/bg.jpg");
	
	Plane plane = new Plane(planeImg, 250, 250); //飞机
	Shell shell = new Shell(); //炮弹
	Shell[] shells = new Shell[20];
	Explode explosion;
	Date startTime = new Date();
	Date endTime;
	int period;
	
	@Override
	public void paint(Graphics g) { //自动被调用。 g相当于一只画笔
		Color c = g.getColor();
		g.drawImage(bg, 0, 0, null);
		plane.drawSelf(g);
		shell.draw(g);
		for (int i=0;i<shells.length;i++) {
			shells[i].draw(g);
			
			boolean crash = shells[i].getRect().intersects(plane.getRect());

			if (crash) { //碰撞之后 飞机的live置false，画爆炸动画， 记录结束时间戳
				plane.live = false;
				//画爆炸
				if(explosion == null) {
					explosion = new Explode(plane.x, plane.y);
					
					//画时间
					endTime = new Date();
					period = (int)((endTime.getTime() - startTime.getTime())/1000);
				}
				explosion.draw(g);
				
				//游戏结束给出提示
				if (!plane.live) {
					g.setColor(Color.red);
					Font f = new Font("宋体", Font.BOLD, 50);
					g.setFont(f);
					g.drawString("时间："+period+"秒", (int)plane.x, (int)plane.y);
					g.setColor(c);
				}
			}
		}
	}
	
	//反复重画窗口
	class PaintThread extends Thread {
		@Override
		public void run() {
			while (true) {
				repaint();
				
				try {
					Thread.sleep(40);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	//键盘监听内部类
	class KeyMonitor extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e) {
			plane.addDirection(e);
		}
		
		@Override
		public void keyReleased(KeyEvent e) {
			plane.minusDirection(e);
		}
	}
	
	/**
	 * 初始化窗口
	 */
	public void launchFrame() {
		this.setTitle("飞机游戏");
		this.setSize(Constant.GAME_WIDTH, Constant.GAME_HEIGHT);
		this.setLocation(300, 300);
		this.setVisible(true);
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		new PaintThread().start();
		addKeyListener(new KeyMonitor());//增加键盘监听
		
		for (int i=0; i < shells.length;i++) { //初始化炮弹
			shells[i] = new Shell();
		}
	}
	
	/**
	 * 双缓冲解决闪烁
	 */
	private Image offScreenImage = null;
	 
	public void update(Graphics g) {
	    if(offScreenImage == null)
	        offScreenImage = this.createImage(Constant.GAME_WIDTH,Constant.GAME_HEIGHT);//这是游戏窗口的宽度和高度
	     
	    Graphics gOff = offScreenImage.getGraphics();
	    paint(gOff);
	    g.drawImage(offScreenImage, 0, 0, null);
	} 
}
