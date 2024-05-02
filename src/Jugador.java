import java.awt.Color;

public class Jugador {
	int x,y,w,h;
	Color color=new Color(100,100,20);
	public Jugador(int x, int y,int w,int h,Color color) {
		this.x=x;
		this.y=y;
		this.w=w;
		this.h=h;
		this.color=color;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getW() {
		return w;
	}
	public void setW(int w) {
		this.w = w;
	}
	public int getH() {
		return h;
	}
	public void setH(int h) {
		this.h = h;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	

}
