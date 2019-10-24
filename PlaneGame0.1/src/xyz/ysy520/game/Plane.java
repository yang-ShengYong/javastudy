package xyz.ysy520.game;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;

public class Plane extends GameObject {
	boolean left, up, right, down;
	boolean live = true; //�ɻ��Ƿ����
	int speed = 3;
	// ��дdrawSelf����
	public void drawSelf(Graphics g) {
		if (live) {
			g.drawImage(img, (int)x, (int)y, null);
			if (left) {
				x -= speed;
			}
			if (right) {
				x += speed;
			}
			if (up) {
				y -= speed;
			}
			if (down) {
				y += speed;
			}	
		} else {
			
		}
	}
	
	public Plane (Image img, int x, int y) {
		this.img = img;
		this.x = x;
		this.y = y;
		this.speed = 3;
		this.width = 22;
		this.height = 33;
	}
	
	public void addDirection(KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_LEFT :
			left = true;
			break;
		case KeyEvent.VK_UP :
			up = true;
			break;
		case KeyEvent.VK_RIGHT :
			right = true;
			break;
		case KeyEvent.VK_DOWN :
			down = true;
			break;
		}
	}
	
	public void minusDirection(KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_LEFT :
			left = false;
			break;
		case KeyEvent.VK_UP :
			up = false;
			break;
		case KeyEvent.VK_RIGHT :
			right = false;
			break;
		case KeyEvent.VK_DOWN :
			down = false;
			break;
		}
	}
}
