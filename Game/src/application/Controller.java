package application;


import java.lang.Math;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

public class Controller {
	
	private static final double playerR = 50.0;
	private static final double ballR   = 30.0; 
	
	@FXML
	private Circle player;
	private double playerX;
	private double playerY;
	private double playerVx=0;
	private double playerVy=0;
	private final double gravity = 1;
	boolean canJump=false;
	
	@FXML
	private Circle ball;
	private double ballX;
	private double ballY;
	private double ballVx=0;
	private double ballVy=0;
	private boolean grounded = false;
	
	private boolean touch = false;
	
	
	public void tick() {
		System.out.printf("playerx: %f playery: %f\n", playerX,playerY);
		System.out.printf("ballx:   %f bally:   %f\n", ballX,ballY);
//		System.out.printf("player: %f ball: %f\n",playerVy,ballVy);
		player.setCenterX(playerX);
		player.setCenterY(playerY);
		ball.setCenterX(ballX);
		ball.setCenterY(ballY+250);
				
		if(canJump==false) {
			playerVy+=gravity;
			
			if(playerCheckboarderY(playerY+playerVy)) {
				playerY+=playerVy;
			}else {
				playerY=0;
				playerVy=0;
			}
								
			if(playerCheckboarderX(playerX+playerVx))
				playerX+=playerVx;
		}else {
			if(playerCheckboarderY(playerY+playerVy))
				playerY+=playerVy;
			if(playerCheckboarderX(playerX+playerVx))
				playerX+=playerVx;
			
		}
		
		//checkLanded
		if(playerY==0) {
			canJump = true;
			playerVy=0;
		}else {
			canJump = false;
		}
		
		//ball part
		if(!ballCheckboarderY(ballY))
			grounded = true;
		
		
		if(grounded) {
			System.out.println("ground");

			ballY=20;
			ballVy=0;
			ballVx=0;
		}else if(touch){
			System.out.println("touch");
			if(!isTouched(Math.abs(ballY-playerY))) {
				touch = false;
				
			}
			ballVy=-20;
			ballVy+=playerVy;
			ballY+=ballVy;
			ballX+=ballVx;
		}else {
			System.out.println("free");

			ballVy+=gravity;
			if(isTouched(Math.abs(ballY-playerY))) {
				System.out.println("free touch");
				ballY=playerY-playerR-ballR-20;
				
				touch = true;
				ballVx=(ballX-playerX)*0.3;
			}else {
				ballY+=ballVy;
				ballX+=ballVx;
			}
			
		}
							
		if(!ballCheckboarderX(ballX+ballVx)) {
			if((ballX+ballVx)<0) {
				ballX=-270;
			}else {
				ballX=270;
			}
			ballVx*=-1;
		}else {
			ballX+=ballVx;
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
	private boolean playerCheckboarderX(double x) {
		if(x>250||x<-250) {
			return false;
		}else {
			return true;
		}
	}
	
	private boolean playerCheckboarderY(double y) {
		if(y>0) {
			return false;
		}else {
			return true;
		}
	}
	private boolean ballCheckboarderX(double x) {
		if(x>270||x<-270) {
			return false;
		}else {
			return true;
		}
	}
	
	private boolean ballCheckboarderY(double y) {
		if(y>20) {
			return false;
		}else {
			return true;
		}
	}
	

	private boolean isTouched(double distance) {
		if(distance<(playerR+ballR)&&Math.abs(playerX-ballX)<70)
		{
			return true;
		}else {
			return false;
		}	
	
	}
}
