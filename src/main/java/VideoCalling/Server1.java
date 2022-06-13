/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VideoCalling;

import static com.primus.lms.Server.img_server;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author smsak
 */
public class Server1 extends Thread{
    public void run(){
        try {
            ServerSocket server = new ServerSocket(7800);
            Socket s = server.accept();
            
            ObjectInputStream in = new ObjectInputStream(s.getInputStream());
            ImageIcon ic;
            
            
            while(true){
                ic = (ImageIcon) in.readObject();
                img_server.setIcon(ic);
            }
        } catch (IOException ex) {
            Logger.getLogger(Server1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Server1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
