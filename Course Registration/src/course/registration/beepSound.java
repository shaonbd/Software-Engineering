/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course.registration;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.swing.JOptionPane;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
/**
 *
 * @author Jahid
 */
public class beepSound implements IPropertyListener{
    @Override
    public void onPropertyEvent() {   
        
            InputStream in;
            try {
                in = new FileInputStream(new File("beep.wav"));
                AudioStream sound = new AudioStream(in);
                AudioPlayer.player.start(sound);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error coming from BeepSound Notifier class");
            }
    }   
    
}
