import javax.swing.JOptionPane;
public class Hackathon
{
    static public void main(String[] args)
    {   
        String choice = JOptionPane.showInputDialog("0 for encryption and 1 for decryption");
        int ch=Integer.parseInt(choice);
        if(ch==0)
        {
        String st = JOptionPane.showInputDialog("Enter the message : ");
        int ran,i,j;
        String s1="abcdefghijklmnopqrstuvwxyz",s2="ABCDEFHIJKLMNOPQRSTUVWXYZ",s3="0123456789!@#%&*+-?",str_f="";
        double random;
        random=Math.random();
        ran=(int)(random*10);
        char c;
        for(i=0;i<st.length();i++)
        {
            c=st.charAt(i);
            if(s1.indexOf(c)>=0)
            {
                j=s1.indexOf(c)+ran;
                if(j>25)
                j=j-25;
                c=s1.charAt(j);
            }
            else if(s2.indexOf(c)>=0)
            {
                j=s2.indexOf(c)+ran;
                if(j>25)
                j=j-25;
                c=s2.charAt(j);
            }
            else if(s3.indexOf(c)>=0)
            {
                j=s3.indexOf(c)+ran;
                if(j>24)
                j=j-24;
                c=s3.charAt(j);
            }
            else
            {
                c=c;
            }
            str_f=str_f+c;
        }
        JOptionPane.showMessageDialog(null, "Encrypted Code is : " + str_f+"\n Your Pin is : "+ran, "the title", JOptionPane.PLAIN_MESSAGE);
    }
    else if(ch==1)
    {
        String st = JOptionPane.showInputDialog("Enter the encrypted code : ");
        String r=JOptionPane.showInputDialog("Enter your pin : ");
        int ran=Integer.parseInt(r);
        int i,j;
        String s1="abcdefghijklmnopqrstuvwxyz",s2="ABCDEFHIJKLMNOPQRSTUVWXYZ",s3="0123456789!@#%&*+-?",str_f="";
        char c;
        for(i=0;i<st.length();i++)
        {
            c=st.charAt(i);
            if(s1.indexOf(c)>=0)
            {
                j=s1.indexOf(c)-ran;
                if(j<0)
                j=j+25;
                c=s1.charAt(j);
            }
            else if(s2.indexOf(c)>=0)
            {
                j=s2.indexOf(c)-ran;
                if(j<0)
                j=j+25;
                c=s2.charAt(j);
            }
            else if(s3.indexOf(c)>=0)
            {
                j=s3.indexOf(c)+ran;
                if(j<0)
                j=j+24;
                c=s3.charAt(j);
            }
            else
            {
                c=c;
            }
            str_f=str_f+c;
        }
        JOptionPane.showMessageDialog(null, "Your original code is : " + str_f, "the title", JOptionPane.PLAIN_MESSAGE);
    }
    else
    JOptionPane.showMessageDialog(null, "Enter correct value", "the title", JOptionPane.PLAIN_MESSAGE);

}
}
       
