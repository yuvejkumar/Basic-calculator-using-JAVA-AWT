
import java.awt.*;
import java.awt.event.*;

class calculater extends Frame implements ActionListener {
    TextField tf1,tf2,tf3;
    calculater()
    {
        setLayout(null);
        tf1 = new TextField();
        tf2 = new TextField();
        tf3 = new TextField();

        tf1.setBounds(600, 50, 100, 30);
        tf2.setBounds(600, 100, 100, 30);
        tf3.setBounds(600, 150, 100, 30);

        Label val1=new Label("Enter value 1 ->");
        val1.setBounds(500,50,350,25);
        Label val2=new Label("Enter value 2 ->");
        val2.setBounds(500,100,350,25);
        Label res=new Label("result ->");
        res.setBounds(550,150,350,25);
        Label owner=new Label("Welcome to yuvej kumar claculator");
        owner.setBounds(100,50,350,100);

        Button b2 = new Button("-");
        Button b1 = new Button("+");
        Button b3 = new Button("x");
        Button b4 = new Button("/");

        b1.setBounds(100, 200, 80, 30);
        b2.setBounds(200, 200, 80, 30);
        b3.setBounds(300, 200, 80, 30);
        b4.setBounds(400, 200, 80, 30);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        add(tf1);
        add(tf2);
        add(tf3);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(val1);
        add(val2);
        add(res);
        add(owner);
        
        setSize(300,300);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e)
    {

        String a =tf1.getText();
        String b=tf2.getText();
        int c=0;
        int x=0;
        int y=0;
        boolean t=false;
        try{
        x=Integer.parseInt(a);
        y=Integer.parseInt(b);
        }
        catch(Exception str){
            t=true;
            tf3.setText("Error");
        }
        if (!t){
            try{
                if (e.getActionCommand().equals("+")){
                    c=x+y;
                }
                else if (e.getActionCommand().equals("-")){
                    c=x-y;
                }
                else if (e.getActionCommand().equals("x")){
                    c=x*y;
                }
                else if (e.getActionCommand().equals("/")){
                    c=x/y;
                }
            
                String res=Integer.toString(c);
                tf3.setText(res);
                }
            catch(Exception excep){
                tf3.setText("error");
            }
        }
    }
  
    public static void main(String[] args)
    {
      new calculater(); 
    }
}


