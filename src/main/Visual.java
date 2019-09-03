package main;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Visual extends JFrame{
	
	DefaultComboBoxModel dc1 = new DefaultComboBoxModel();
	private DibujarTodo contenedor;
	int sleep=2000;
	 
	public Visual(){
		super("por andres2288");
	    //initComponents();
	     // contenedor= new DibujarTodo(panel1,panel1);
	      dc1.addElement("http://123.220.250.252/");
	      dc1.addElement("http://www.odate-houjinkai.or.jp/snap.jpg");
	      dc1.addElement("http://www.hifido.co.jp/camera/osu.jpg");
	      dc1.addElement("http://www.salon-net.org/realtime100.jpg");
	      dc1.addElement("http://84.92.80.192:8081/axis-cgi/jpg/image.cgi?resolution=352x240");
	      dc1.addElement("http://206.127.116.63/axis-cgi/jpg/image.cgi?resolution=352x240");
	      dc1.addElement("http://62.42.19.194/axis-cgi/jpg/image.cgi?resolution=352x240");
	      dc1.addElement("http://221.255.120.171/axis-cgi/jpg/image.cgi?resolution=352x240");
        dc1.addElement("http://128.97.43.214/");
	}
}
