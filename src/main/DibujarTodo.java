package main;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JPanel;

public class DibujarTodo extends JComponent{
	
	 private Dimension d = new Dimension(640,480);//352,240//640,480//[352, 286]
     JPanel pa=null;
     private int x1=400;
     private int y1=400;
     
     private int posx=0;
     private int posy=0;
     private int tiempo=2000;
     private String mundo="http://123.220.250.252/";
    
     private  Image snap= new ImageIcon( getClass().getResource("/livecam/snap.jpg") ).getImage() ;  

  private String Axis="axis-cgi/jpg/image.cgi?resolution="+d.width+"x"+d.height+""; 
  
  public DibujarTodo(JComponent contenedor,JPanel p){
     super();
     this.setBounds(0, 0,contenedor.getWidth() , contenedor.getHeight());
     contenedor.add(this);
     /*  d.width=358;
  	 d.height=500;*/
     this.pa=p;
   }
 
    @Override
  public void paint(Graphics g){
      super.paint(g);
    //  getGrafo().paint(g);
    
          try {
          //libera lo que se halla almacenado en el buffer
          snap.flush();
          //carga la nueva imagen
          /* ----------------- */
          //Odate street
          //snap = new ImageIcon(new URL("http://www.odate-houjinkai.or.jp/snap.jpg")).getImage();
          //tienda japon
          //snap = new ImageIcon(new URL("http://www.hifido.co.jp/camera/osu.jpg")).getImage();
          //barberia japon
          //snap = new ImageIcon(new URL("http://www.salon-net.org/realtime100.jpg")).getImage();
          //Camaras AXIS
          //aeropuerto de rochester
          //snap = new ImageIcon(new URL("http://84.92.80.192:8081/axis-cgi/jpg/image.cgi?resolution=352x240")).getImage();
          //snap = new ImageIcon(new URL("http://206.127.116.63/axis-cgi/jpg/image.cgi?resolution=352x240")).getImage();
          //snap = new ImageIcon(new URL("http://62.42.19.194/axis-cgi/jpg/image.cgi?resolution=352x240")).getImage();
          //tokio
          //snap = new ImageIcon(new URL("http://221.255.120.171/axis-cgi/jpg/image.cgi?resolution=352x240")).getImage();
          //restorant
          //snap = new ImageIcon(new URL( "http://80.25.78.169/" + this.Axis )).getImage();
          //calle
          System.out.println(""+x1+"-->"+y1+"\n"+"pox"+getPosx()+"posy"+getPosy()+"\n"+pa.getY()); 
          if(mundo.indexOf("jpg")!=-1){
           
       snap = new ImageIcon(new URL(mundo)).getImage();
          }
          else{
          snap = new ImageIcon(new URL( mundo + this.Axis )).getImage();
          }
          /* ----------------- */
     
      } catch (MalformedURLException ex) {
      }
       g.drawImage(snap, 0, 0, x1, y1,   null); 
        
           
  }
    
       //metodo que descarga una imagen de internet y la coloca en el JLabel
   private void Cargar_Imagen(){        
      try {
          //libera lo que se halla almacenado en el buffer
          snap.flush();
          //carga la nueva imagen
          /* ----------------- */
          //Odate street
          //snap = new ImageIcon(new URL("http://www.odate-houjinkai.or.jp/snap.jpg")).getImage();
          //tienda japon
          //snap = new ImageIcon(new URL("http://www.hifido.co.jp/camera/osu.jpg")).getImage();
          //barberia japon
          //snap = new ImageIcon(new URL("http://www.salon-net.org/realtime100.jpg")).getImage();
          //Camaras AXIS
          //aeropuerto de rochester
          //snap = new ImageIcon(new URL("http://84.92.80.192:8081/axis-cgi/jpg/image.cgi?resolution=352x240")).getImage();
          //snap = new ImageIcon(new URL("http://206.127.116.63/axis-cgi/jpg/image.cgi?resolution=352x240")).getImage();
          //snap = new ImageIcon(new URL("http://62.42.19.194/axis-cgi/jpg/image.cgi?resolution=352x240")).getImage();
          //tokio
          //snap = new ImageIcon(new URL("http://221.255.120.171/axis-cgi/jpg/image.cgi?resolution=352x240")).getImage();
          //restorant
          //snap = new ImageIcon(new URL( "http://80.25.78.169/" + this.Axis )).getImage();
          //calle
          snap = new ImageIcon(new URL( "http://123.220.250.252/" + this.Axis )).getImage();
          
          /* ----------------- */
      } catch (MalformedURLException ex) {
      }
      
       
        
  }
   
      
         private Thread hilo1 = new Thread()
  {
      
     
      @Override
      public void run()
      {
          try
          {
              while(true)
              {
            
                 
               
                 
                   //aumentamos dependiendo

           pa.repaint();       
               
                  hilo1.sleep(getTiempo());
                 
                  System.out.println(""+tiempo);    
                   
              }
          } catch (java.lang.InterruptedException ie) { System.out.println(ie.getMessage()); }
      }
  };

         
         public void aumentay(){
       y1+=+15;  
         }
  /**
   * @return the hilo1
   */
  public Thread getHilo1() {
      return hilo1;
  }

  /**
   * @param hilo1 the hilo1 to set
   */
  public void setHilo1(Thread hilo1) {
      this.hilo1 = hilo1;
  }

  /**
   * @return the tiempo
   */
  public int getTiempo() {
      return tiempo;
  }

  /**
   * @param tiempo the tiempo to set
   */
  public void setTiempo(int tiempo) {
      this.tiempo = tiempo;
  }

  /**
   * @return the mundo
   */
  public String getMundo() {
      return mundo;
  }

  /**
   * @param mundo the mundo to set
   */
  public void setMundo(String mundo) {
      this.mundo = mundo;
  }

  /**
   * @return the x1
   */
  public int getX1() {
      return x1;
  }

  /**
   * @param x1 the x1 to set
   */
  public void setX1(int x1) {
      this.x1 = x1;
  }



  /**
   * @return the posx
   */
  public int getPosx() {
      return posx;
  }

  /**
   * @param posx the posx to set
   */
  public void setPosx(int posx) {
      this.posx = posx;
  }

  /**
   * @return the posy
   */
  public int getPosy() {
      return posy;
  }

  /**
   * @param posy the posy to set
   */
  public void setPosy(int posy) {
      this.posy = posy;
  }

  /**
   * @return the y1
   */
  public int getY1() {
      return y1;
  }

  /**
   * @param y1 the y1 to set
   */
  public void setY1(int y1) {
      this.y1 = y1;
  }
}
