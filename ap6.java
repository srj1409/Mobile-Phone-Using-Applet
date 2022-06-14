import java.awt.*;
import java.applet.*;
import java.awt.Font.*;
/*<Applet code="ap6.class" width="1000" height="1000">
</Applet>*/
public class ap6 extends Applet
{
    public void paint(Graphics g)
    {
        g.drawImage(picture,255,200,this);
        g.drawImage(picture1,390,670,this);
        g.drawImage(picture2,450,670,this);
        g.drawImage(picture3,265,670,this);
        g.drawImage(picture4,329,670,this);
        g.drawImage(picture5,510,670,this);
        g.drawRoundRect(255,200,300,526,20,20);
        g.drawRoundRect(252,198,307,532 ,20,20);
        g.fillOval(258,208,15,15);

        g.setFont(new Font("Default",Font.BOLD,12));
        g.drawString("Jio 4G",278,218);
        g.drawString("10:40",320,218);
        g.setFont(new Font("Default",Font.BOLD,9));
        g.drawString("50",524,214);
        g.drawString("PM",364,300);
        g.setFont(new Font("Arial",Font.BOLD,14));
        g.drawString("Sun,Mar 20",290,320);
        g.setFont(new Font("Default",Font.BOLD,30));
        g.drawString("10:40",287,300);
        g.drawRect(520,205,15,10);
        g.fillRect(535,208,3,4);
        g.fillRect(502,212,3,4);
        g.fillRect(506,210,3,6);
        g.fillRect(510,208,3,8);

        g.setColor(Color.WHITE);
        g.fillRoundRect(278,590,250,40,2,2);
        
        g.setColor(Color.RED);
        g.setFont(new Font("Default",Font.BOLD,25));
        g.drawString("G",280,620);
        g.drawArc(510,608,6,6,0,-180);
        g.drawArc(510,609,6,6,0,-180);
        g.fillOval(360,663,18,18);
        g.fillOval(420,663,18,18);

        g.setColor(Color.WHITE);
        g.setFont(new Font("Default",Font.BOLD,12));
        g.drawString("1",364,675);
        g.drawString("12",421,675);

        g.setColor(Color.BLUE);
        g.fillRect(289,610,6,3);
        g.fillRoundRect(510,600,6,10,2,2);
        g.drawLine(513,620,513,613);
        
    }
    Image picture,picture1,picture2,picture3,picture4,picture5;
    public void init()
    {
        picture=getImage(getDocumentBase(),"A2.JPG");
        picture1=getImage(getDocumentBase(),"whatsapp.JPG");
        picture2=getImage(getDocumentBase(),"camera.JPG");
        picture3=getImage(getDocumentBase(),"caller.PNG");
        picture4=getImage(getDocumentBase(),"message.JPG");
        picture5=getImage(getDocumentBase(),"gallery.JPG");
    }
   
}