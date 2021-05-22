package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

public class Controller {
	
	@FXML
	private Circle player;
	private double playerX;
	private double playerY;
	private double playerVx=0;
	private double playerVy=0;
	private final double gravity = 1;
	boolean canJump=false;
	
	
	public void tick() {
		System.out.printf("x: %f y: %f\n", playerX,playerY);
		player.setCenterX(playerX);
		player.setCenterY(playerY);
		
		
		if(canJump==false) {
			playerVy+=gravity;
			System.out.println(playerVy);
			if(checkboarderY(playerY+playerVy)) {
				playerY+=playerVy;
			}else {
				playerY=0;
			}
								
			if(checkboarderX(playerX+playerVx))
				playerX+=playerVx;
		}else {
			if(checkboarderY(playerY+playerVy))
				playerY+=playerVy;
			if(checkboarderX(playerX+playerVx))
				playerX+=playerVx;
		}
		
		//checkLanded
		if(playerY==0) {
			canJump = true;
		}else {
			canJump = false;
		}
	}
	
//	public void up() {
//		System.out.println("UP");
//		myCircle.setCenterY(y-=20);
//	}
//	
//	
//	public void down() {
//		System.out.println("DOWN");
//		myCircle.setCenterY(y+=20);
//	}
//	
//	public void right() {
//		System.out.println("RIGHT");
//		myCircle.setCenterX(x+=20);
//		
//	}
//	
//	public void left() {
//		System.out.println("LEFT");
//		myCircle.setCenterX(x-=20);
//	}
	public void setx(double x) {
		this.playerX=x;
	}
	public void sety(double y) {
		this.playerY=y;
	}
	
	public void setVelx(double vx) {
		this.playerVx=vx;
	}
	public void setVely(double vy) {
		this.playerVy=vy;
	}
	
	public void jump() {
		if(canJump==true) {
			this.playerVy=-20;
		}
		
		
	}
	private boolean checkboarderX(double x) {
		if(x>250||x<-250) {
			return false;
		}else {
			return true;
		}
	}
	
	private boolean checkboarderY(double y) {
		if(y>0) {
			return false;
		}else {
			return true;
		}
	}
}
