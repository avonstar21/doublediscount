import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Integer;
class disc extends JPanel
{
   JButton calculate, reset;
   JTextField discount1, discount2, taxrate, initialprice;
   JLabel endprice;
   String p1,p2,p3,p4;
   double price, rate1, rate2, taxes, result;
   
   public disc()
   {
      setLayout(new GridLayout(6,0));
       
      initialprice = new JTextField();
      add(initialprice);
      initialprice.setText("Enter Initial Price");
      initialprice.addFocusListener(new FocusListener1());
      discount1 = new JTextField();
      add(discount1);
      discount1.addFocusListener(new FocusListener2());
      discount1.setText("Enter the First Discount (Omit % sign)");
      discount2 = new JTextField();
      add(discount2);
      discount2.addFocusListener(new FocusListener3());
      discount2.setText("Enter the Second Discount (Omit % sign)");
      taxrate = new JTextField();
      add(taxrate);
      taxrate.setText("Enter the Tax Rate (Omit % sign, if unknown enter 0)");
      taxrate.addFocusListener(new FocusListener4());
      calculate = new JButton();
      calculate.setText("Calculate Price");
      calculate.addActionListener(new listenercalc());
      add(calculate);
      reset = new JButton();
      reset.setText("Reset Everything");
      reset.addActionListener(new listenerclear());
      add(reset);
      endprice = new JLabel();
      add(endprice);
 }         
 public class FocusListener1 implements FocusListener
 {
   public FocusListener1()
   {
      
   }
   public void focusGained(FocusEvent e)
   {
      initialprice.setText(null);   
   }
   public void focusLost(FocusEvent e)
   {
   
   }
 } 
  public class FocusListener2 implements FocusListener
 {
   public FocusListener2()
   {
      
   }
   public void focusGained(FocusEvent e)
   {
      discount1.setText(null);   
   }
   public void focusLost(FocusEvent e)
   {
   
   }
 } 
   public class FocusListener3 implements FocusListener
 {
   public FocusListener3()
   {
      
   }
   public void focusGained(FocusEvent e)
   {
      discount2.setText(null);   
   }
   public void focusLost(FocusEvent e)
   {
   
   }
 }
   public class FocusListener4 implements FocusListener
 {
   public FocusListener4()
   {
      
   }
   public void focusGained(FocusEvent e)
   {
      taxrate.setText(null);   
   }
   public void focusLost(FocusEvent e)
   {
   
   }
 } 
   
   public class listenercalc implements ActionListener
   {
      public listenercalc()
      {}
         public void actionPerformed(ActionEvent e)
         {
            p4 = initialprice.getText();
            price = 1.0 * Double.parseDouble(p4);            
            p1 = discount1.getText();
            rate1 = 1.0 * Double.parseDouble(p1);
            rate1 = 1.0 - (rate1/100.0);
            p2 = discount2.getText();
            rate2 = 1.0 * Double.parseDouble(p2);
            rate2 = 1.0 - (rate2/100.0);
            p3 = taxrate.getText();
            taxes = 1.0 * Double.parseDouble(p3);
            taxes = (taxes/100.0)+1.0;
            result = price * taxes * rate1 * rate2;
            endprice.setText("" + result); 
         }
      
   }
   public class listenerclear implements ActionListener
   {
      public listenerclear()
      {}
         public void actionPerformed(ActionEvent e)
         {
            result = 0.0;
            rate1 = 0.0;
            rate2 = 0.0;
            taxes = 0.0;
            price = 0.0;
            discount1.setText("Enter the First Discount (Omit % sign)");
            discount2.setText("Enter the Second Discount (Omit % sign)");
            taxrate.setText("Enter the Tax Rate (Omit % sign, if unknown enter 0)");
            initialprice.setText("Enter Initial Price");
            endprice.setText(""); 
         }
      
   }
   
   
 

}

public class discountCalc
{
       public static void main(String[] args)
      {
         JFrame frame = new JFrame("Discount Calcuator");
         frame.setSize(400, 400);
         frame.setLocation(200, 100);
         frame.setContentPane(new disc());
         frame.setVisible(true);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      }
}