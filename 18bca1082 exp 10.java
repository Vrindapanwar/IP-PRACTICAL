import java.awt.*;  
import java.awt.event.*;  
class Jam{  
	public static void main(String[] args) {  
	    Frame f=new Frame("buttom with colours"); 
        Button change=new Button(" CHANGE COLOUR"); 
        Choice choice=new Choice();  
        choice.setBounds(60,50,150,30); 
        change.setBounds(60,80,150,30);
    
        choice.setBackground(Color.LIGHT_GRAY); 
        change.setBackground(Color.LIGHT_GRAY); 
        
        choice.add("Green");  
        choice.add("Red");  
        choice.add("Blue");  
        choice.add("Pink");  
        choice.add("yellow");
        change.addActionListener(new ActionListener() {  
            public void actionPerformed(ActionEvent ae) { 
                int index = choice.getSelectedIndex();
                switch(index){
                    case 0:
                        f.setBackground(Color.GREEN);
                        break;
                    case 1:
                        f.setBackground(Color.RED);
                        break;
                    case 2:
                        f.setBackground(Color.BLUE);
                        break;
                    case 3:
                        f.setBackground(Color.PINK);
                        break;
                    case 4:
                        f.setBackground(Color.YELLOW);
                        break; 
                }      
            }  
        });
        
        f.add(choice);
        f.add(change); 
	    f.setSize(270,270);  
	    f.setLayout(null);  
	    f.setVisible(true);  
	     
	   
	    
	}  
}  
