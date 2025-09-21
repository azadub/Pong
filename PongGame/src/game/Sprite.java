package game;

import java.awt.Color;
import java.awt.Rectangle;

public class Sprite {
	private int xPos;
	private int yPos;
	private int xVel;
	private int yVel;
	private int width;
	private int height;
	private Color colour;
	private int initialxPosition;
	private int initialyPosition;

	public int getXPos() {
		return xPos;
	}
	
	public void setXPos(int xPos) {
		this.xPos = xPos;
	}
	
	public void setXPos(int newX, int panelWidth) {
		xPos = newX;
		if (xPos < 0) {
			xPos = 0;
		}else if (xPos + width > panelWidth) {
			xPos = panelWidth - width;
		}
	}
	
	public int getYPos() {
		return yPos;
	}
	
	public void setYPos(int yPos) {
		this.yPos = yPos;
	}
	
	public void setYPos(int newY, int panelHeight) {
		yPos = newY;
		if (yPos < 0) {
			yPos = 0;
		}else if (yPos + height > panelHeight) {
			yPos = panelHeight - height;
		}
	}
	
	public int getXVel() {
		return xVel;
	}
	
	public void setXVel(int xVel) {
		this.xVel = xVel;
	}
	
	public int getYVel() {
		return yVel;
	}
	
	public void setYVel(int yVel) {
		this.yVel = yVel;
	}
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public Color getColour() {
		return colour;
	}
	
	public void setColour(Color colour) {
		this.colour = colour;
	}
	
	public void setInitialxPosition(int initialxPosition) {
		this.initialxPosition = initialxPosition;
	}
	
	public void setInitialyPosition(int initialyPosition) {
		this.initialyPosition = initialyPosition;
	}
	
	public void resetToInitialPosition() {
		setXPos(initialxPosition);
		setYPos(initialyPosition);
	}
	
	public Rectangle getRectangle() {
		return new Rectangle(getXPos(), getYPos(), getWidth(), getHeight());
	}
}
