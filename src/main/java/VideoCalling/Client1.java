/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VideoCalling;

import com.github.sarxos.webcam.Webcam;
import static com.primus.lms.Client.img_client;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author smsak
 */
public class Client1 extends Thread{
    public void run(){
        try {
            Socket s = new Socket("localhost", 7800);
            ObjectOutputStream out = new ObjectOutputStream(s.getOutputStream());
            ImageIcon ic;
            BufferedImage br;
            Webcam cam = Webcam.getDefault();
            cam.open();
            
            while(true){
                br = cam.getImage();
                ic = new ImageIcon(br);
                out.writeObject(ic);
                out.flush();
                img_client.setIcon(ic);
                
            }
        } catch (IOException ex) {
            Logger.getLogger(Client1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
