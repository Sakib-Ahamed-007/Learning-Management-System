/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import static com.primus.lms.Server.img_server;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.ImageIcon;

/**
 *
 * @author smsak
 */
public class Server1 {
    public void startClass() throws IOException, ClassNotFoundException{
        ServerSocket server = new ServerSocket(7800);
        Socket s = server.accept();
        
        ObjectInputStream in = new ObjectInputStream(s.getInputStream());
        ImageIcon ic;
        
        
        while(true){
            ic = (ImageIcon) in.readObject();
            img_server.setIcon(ic);
        }
    }
}
