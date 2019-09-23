package main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class PanelVideo extends JPanel{
	
	private boolean hayConexion=false;
	private String direccionIP="192.168.1.105";
	public BufferedImage frame=null;
	
	public boolean isHayConexion() {
		return hayConexion;
	}
	public void setHayConexion(boolean hayConexion) {
		this.hayConexion = hayConexion;
	}
	public String getDireccionIP() {
		return direccionIP;
	}
	public void setDireccionIP(String direccionIP) {
		this.direccionIP = direccionIP;
	}
	public BufferedImage getFrame() {
		return frame;
	}
	public void setFrame(BufferedImage frame) {
		this.frame = frame;
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D)g;
		g2.setColor(Color.WHITE);
		g2.fillRect(0, 0, getWidth(), getHeight());
		//if(hayConexion){
			try{
				URL url = new URL(direccionIP);
				frame = ImageIO.read(url);
				if(frame!=null){
					g2.drawImage(frame,0,0,this);
				}
			}catch(MalformedURLException ex){
				hayConexion=false;
				g2.drawString(ex.toString(), 5, 15);
			}catch (IOException ex) {
				hayConexion=false;
				g2.drawString(ex.toString(), 5, 15);
			}
		/*}
		else{
			g2.setColor(Color.BLACK);
			g2.drawString("No se ha establecido conexión con el dispositivo", 5, 15);
		}*/
	}
	
	
}
