import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.text.MessageFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import us.monoid.web.BinaryResource;
import us.monoid.web.Resty;


public class TextToSpeech extends JFrame implements ActionListener {
	private static final String BASE_URL = "http://translate.google.it/translate_tts?ie=UTF-8&q={0}&tl={1}&prev=input";
	public JButton btn;
	public JTextField tx1;
  public TextToSpeech(){
	  super("TextToSpeech");
	  setSize(500, 600);
	  setVisible(true);
	  setLayout(new FlowLayout());
	  tx1=new JTextField(30);
	  tx1.setFont(new Font("Times Roman", Font.BOLD, 15));
	  add(tx1);
	  btn=new JButton("Play");
	  add(btn);
	  btn.addActionListener(this);
	  setVisible(true);
	  setLocationRelativeTo(null);
	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  
  }

	
	public static void main(String[] args) {
		new TextToSpeech();
	}
	
	public static void say(String text){
		try {
				File f=new File("translate.mp3");
				String sentence =URLEncoder.encode(text,"UTF-8");
				String urlString=MessageFormat.format(BASE_URL,sentence,"en");
				BinaryResource res=new Resty().bytes(new URI(urlString));
				res.save(f);
				FileInputStream in=new FileInputStream(f);
				Player p=new Player(in);
				p.play();
				p.close();
				f.delete();
				
				
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (URISyntaxException e) {
				e.printStackTrace();
			} catch (JavaLayerException e) {
				e.printStackTrace();
			}
			
		
		
	}


	@Override
	public void actionPerformed(ActionEvent ae) {
     if(ae.getSource() == btn){
    	 String roll = tx1.getText();
    	 say(roll);
     }
     
	}

}
