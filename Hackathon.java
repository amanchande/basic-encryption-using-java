import javax.swing.JOptionPane;
public class apples
{
    static public void main(String[] args)
    {
        String st = JOptionPane.showInputDialog("Enter the no.");
        int ran,i,j;
        String s1="abcdefghijklmnopqrstuvwxyz",s2="ABCDEFHIJKLMNOPQRSTUVWXYZ",s3="0123456789",str_f="";
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
                c=st.charAt(j);
            }
            else if(s2.indexOf(c)>=0)
            {
                j=s1.indexOf(c)+ran;
                if(j>25)
                j=j-25;
                c=st.charAt(j);
            }
            else if(s3.indexOf(c)>=0)
            {
                j=s1.indexOf(c)+ran;
                if(j>9)
                j=j-9;
                c=st.charAt(j);
            }
            else
            {
                c=c;
            }
            str_f=str_f+c;
        }
        JOptionPane.showMessageDialog(null, "The answer is : " + str_f, "the title", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "Code is : " + ran, "the title", JOptionPane.PLAIN_MESSAGE);
    }
}
