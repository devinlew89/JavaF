import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.event.*;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ItemListener;
import java.math.*;
import java.text.*;




public class BurgerHouse2 extends JFrame implements ItemListener,ActionListener
{
	
	
	JCheckBox a1=new JCheckBox("Beef ");
	JCheckBox a2= new JCheckBox("Vegi");
	
	
	JCheckBox b1=new JCheckBox("Cheese ");
	JCheckBox b2=new JCheckBox("Pickles ");
	JCheckBox b3=new JCheckBox("Lettuce ");
	JCheckBox b4=new JCheckBox("Ketchup ");
	JCheckBox b5=new JCheckBox("Mustard ");
	JCheckBox b6=new JCheckBox("House Sause ");
	JCheckBox b7=new JCheckBox("Over M Egg ");
	
	
	JCheckBox c1=new JCheckBox("Extra Cheese ");
	JCheckBox c2=new JCheckBox("Extra Pic ");
	JCheckBox c3=new JCheckBox("Extra Lettuce ");
	JCheckBox c4=new JCheckBox("Extra Ketchup ");
	JCheckBox c5=new JCheckBox("Side of House Sause  ");
	JCheckBox c6=new JCheckBox("Extra Egg ");
	
	
	JCheckBox d1=new JCheckBox("French Fries ");
	JCheckBox d2=new JCheckBox("Curley Fries ");
	JCheckBox d3=new JCheckBox("Waffle Fries ");
	JCheckBox d4=new JCheckBox("with Cheese ");
	
	
	JCheckBox e1=new JCheckBox("Sprite ");
	JCheckBox e2=new JCheckBox("Coke ");
	JCheckBox e3=new JCheckBox("Dr P ");
	JCheckBox e4=new JCheckBox("Fanta ");
	JCheckBox e5=new JCheckBox("Water ");

	
	JCheckBox f1=new JCheckBox("Apple Pie ");
	JCheckBox f2=new JCheckBox("Blueberry Pie ");
	JCheckBox f3=new JCheckBox("Vanila Icecream ");
	JCheckBox f4=new JCheckBox("Chocolate IceCream ");
	JCheckBox f5=new JCheckBox("Chocolate Cookies ");
	
	JPanel panel= new JPanel();
	JPanel panel2= new JPanel();
	JPanel panel3= new JPanel();
	JPanel panel4= new JPanel();
	JPanel panel5= new JPanel();
	JPanel panel6= new JPanel();
	JPanel panel7= new JPanel();
	JPanel panel8= new JPanel();
	
	JLabel g1=new JLabel("Burger Types:"+"\n");
	JLabel g2=new JLabel("Topping:"+"\n");
	JLabel g3=new JLabel("Extras:"+"\n");
	JLabel g4=new JLabel("Fries:"+"\n");
	JLabel g5=new JLabel("Drinks:"+"\n");
	JLabel g6=new JLabel("Desserts:"+"\n");
	
	
	
	
	JButton btn=new JButton("Charges So Far");
	JButton btn2=new JButton("Send Order");
	JTextArea txtArea= new JTextArea();
	JTextField priceTxtFeild=new JTextField(10);
	
	public BurgerHouse2()
	{
		setTitle("BurgerHouse2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		getContentPane().setLayout(new FlowLayout());
		setLayout(new GridLayout(3, 4));
		
		add(panel);
		add(new JLabel("Welcome to Burger House"));
		add(new JLabel("One Order Per Person"));
		add(new JLabel("Order By Selection"));
		txtArea.setText("Running List of Selection"+"\n");
		add(txtArea);
		
		add(panel2);
		panel2.add(g1);
		panel2.add(a1);
		panel2.add(a2);
		
		add(panel3);
		panel3.add(g2);
		panel3.add(b1);
		panel3.add(b2);
		panel3.add(b3);
		panel3.add(b4);
		panel3.add(b5);
		panel3.add(b6);
		panel3.add(b7);
		
		add(panel4);
		panel4.add(g3);
		panel4.add(c1);
		panel4.add(c2);
		panel4.add(c3);
		panel4.add(c4);
		panel4.add(c5);
		panel4.add(c6);
		
		add(panel5);
		panel5.add(g4);
		panel5.add(d1);
		panel5.add(d2);
		panel5.add(d3);
		panel5.add(d4);
		
		add(panel6);
		panel6.add(g5);
		panel6.add(e1);
		panel6.add(e2);
		panel6.add(e3);
		panel6.add(e4);
		panel6.add(e5);
		
		add(panel7);
		panel7.add(g6);
		panel7.add(f1);
		panel7.add(f2);
		panel7.add(f3);
		panel7.add(f4);
		panel7.add(f5);
		
		add(panel8);
		panel8.add(btn);
		
		add(priceTxtFeild);
		panel8.add(btn2);

		//btn.addActionListener(this);
		
		
		
		
		
		a1.addItemListener(this);
		a2.addItemListener(this);
		
		b1.addItemListener(this);
		b2.addItemListener(this);
		b3.addItemListener(this);
		b4.addItemListener(this);
		b5.addItemListener(this);
		b6.addItemListener(this);
		b7.addItemListener(this);
		
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
		c4.addItemListener(this);
		c5.addItemListener(this);
		c6.addItemListener(this);
		
		d1.addItemListener(this);
		d2.addItemListener(this);
		d3.addItemListener(this);
		d4.addItemListener(this);
		
		e1.addItemListener(this);
		e2.addItemListener(this);
		e3.addItemListener(this);
		e4.addItemListener(this);
		e5.addItemListener(this);
		
		f1.addItemListener(this);
		f2.addItemListener(this);
		f3.addItemListener(this);
		f4.addItemListener(this);
		f5.addItemListener(this);
		btn.addActionListener(this);		
		btn2.addActionListener(this);		
		
	
	}

	@Override
	public void itemStateChanged(ItemEvent e)
	{
		Object source=e.getSource();
		int select=e.getStateChange();
		if(source==a1)
		{
			if(select==ItemEvent.SELECTED)
			txtArea.append("Beef is selected"+"\n");
			//else 
			//txtArea.append("Beef is de-selected"+"\n");
		}
		else if(source==a2)
		{
			if(select==ItemEvent.SELECTED)
			txtArea.append("Vegi is selected"+"\n");
			//else 
			//txtArea.append("Vegi is de-selected"+"\n");
		}
		else if(source==b1)
		{
			if(select==ItemEvent.SELECTED)
			txtArea.append("Cheese is selected"+"\n");
			//else 
			//txtArea.append("Cheese is de-selected"+"\n");
		}
		else if(source==b2)
		{
			if(select==ItemEvent.SELECTED)
			txtArea.append("Pickles is selected"+"\n");
			//else 
			//txtArea.append("Pickles is de-selected"+"\n");
		}
		else if(source==b3)
		{
			if(select==ItemEvent.SELECTED)
			txtArea.append("Lettuce is selected"+"\n");
			//else 
			//txtArea.append("Lettuce is de-selected"+"\n");
		}
		else if(source==b4)
		{
			if(select==ItemEvent.SELECTED)
			txtArea.append("Ketchup is selected"+"\n");
			//else 
			//txtArea.append("Ketchup is de-selected"+"\n");
		}
		else if(source==b5)
		{
			if(select==ItemEvent.SELECTED)
			txtArea.append("Mustard is selected"+"\n");
			//else 
			//txtArea.append("Mustard is de-selected"+"\n");
		}
		else if(source==b6)
		{
			if(select==ItemEvent.SELECTED)
			txtArea.append("House Sause is selected"+"\n");
			//else 
			//txtArea.append("House Sause is de-selected"+"\n");
		}
		else if(source==b7)
		{
			if(select==ItemEvent.SELECTED)
			txtArea.append("Over Med Egg is selected"+"\n");
			//else 
			//txtArea.append("Over Med Egg is de-selected"+"\n");
		}
		else if(source==c1)
		{
			if(select==ItemEvent.SELECTED)
			txtArea.append("Extra Cheese is selected"+"\n");
			//else 
			//txtArea.append("Extra Cheese is de-selected"+"\n");
		}
		else if(source==c2)
		{
			if(select==ItemEvent.SELECTED)
			txtArea.append("Extra Pickles is selected"+"\n");
			//else 
			//txtArea.append("Extra Pickles is de-selected"+"\n");
		}
		else if(source==c3)
		{
			if(select==ItemEvent.SELECTED)
			txtArea.append("Extra Lettuce is selected"+"\n");
			//else 
			//txtArea.append("Extra Lettuce is de-selected"+"\n");
		}
		else if(source==c4)
		{
			if(select==ItemEvent.SELECTED)
			txtArea.append("Extra Ketchup is selected"+"\n");
			//else 
			//txtArea.append("Extra Ketchup is de-selected"+"\n");
		}
		else if(source==c5)
		{
			if(select==ItemEvent.SELECTED)
			txtArea.append("Side of House Sause is selected"+"\n");
			//else 
			//txtArea.append("Side of House Sause is de-selected"+"\n");
		}
		else if(source==c6)
		{
			if(select==ItemEvent.SELECTED)
			txtArea.append("Extra Egg is selected"+"\n");
			//else 
			//txtArea.append("Extra Egg is de-selected"+"\n");
		}
		else if(source==d1)
		{
			if(select==ItemEvent.SELECTED)
			txtArea.append("French Fries is selected"+"\n");
			//else 
			//txtArea.append("French Fries is de-selected"+"\n");
		}
		else if(source==d2)
		{
			if(select==ItemEvent.SELECTED)
			txtArea.append("Curley Fries is selected"+"\n");
			//else 
			//txtArea.append("Curley Fries is de-selected"+"\n");
		}
		else if(source==d3)
		{
			if(select==ItemEvent.SELECTED)
			txtArea.append("Waffle Fries is selected"+"\n");
			//else 
			//txtArea.append("Waffle Fries is de-selected"+"\n");
		}
		else if(source==d4)
		{
			if(select==ItemEvent.SELECTED)
			txtArea.append("With Cheese is selected"+"\n");
			//else 
			//txtArea.append("With Cheese is de-selected"+"\n");
		}
		else if(source==e1)
		{
			if(select==ItemEvent.SELECTED)
			txtArea.append("Sprite is selected"+"\n");
			//else 
			//txtArea.append("Sprite is de-selected"+"\n");
		}
		else if(source==e2)
		{
			if(select==ItemEvent.SELECTED)
			txtArea.append("Coke is selected"+"\n");
			//else 
			//txtArea.append("Coke is de-selected"+"\n");
		}
		else if(source==e3)
		{
			if(select==ItemEvent.SELECTED)
			txtArea.append("Dr P is selected"+"\n");
		//	else 
			//txtArea.append("Dr P is de-selected"+"\n");
		}
		else if(source==e4)
		{
			if(select==ItemEvent.SELECTED)
			txtArea.append("Fanta is selected"+"\n");
			//else 
			//txtArea.append("Fanta is de-selected"+"\n");
		}
		else if(source==e5)
		{
			if(select==ItemEvent.SELECTED)
			txtArea.append("Water is selected"+"\n");
			//else 
			//txtArea.append("Water is de-selected"+"\n");
		}
		
		
		else if(source==f1)
		{
			if(select==ItemEvent.SELECTED)
			txtArea.append("Apple Pie is selected"+"\n");
			//else 
			//txtArea.append("Apple Pie is de-selected"+"\n");
		}
		else if(source==f2)
		{
			if(select==ItemEvent.SELECTED)
			txtArea.append("Blueberry Pie is selected"+"\n");
			//else 
			//txtArea.append("Blueberry Pie is de-selected"+"\n");
		}
		else if(source==f3)
		{
			if(select==ItemEvent.SELECTED)
			txtArea.append("Vanila IceCream is selected"+"\n");
			//else 
			//txtArea.append("Vanila IceCream is de-selected"+"\n");
		}
		else if(source==f4)
		{
			if(select==ItemEvent.SELECTED)
			txtArea.append("Chocolate IceCream is selected"+"\n");
			//else 
			//txtArea.append("Chocolate IceCream is de-selected"+"\n");
		}
		else if(source==f5)
		{
			if(select==ItemEvent.SELECTED)
			txtArea.append("Chocolate Cookies is selected"+"\n");
			//else 
			//txtArea.append("Chocolate Cookies is de-selected"+"\n");
		}
		
	}	
		public void actionPerformed(ActionEvent e)
			
			{
				Object source=e.getSource();
				double s1=0;
				if (source==btn)
				{
					if(a1.isSelected())
					{
					s1+=2.00;

					}
					if(a2.isSelected())
					{
						s1+=3.00;

					}
					if(b1.isSelected())
					{
						s1+=0.15;

					}
					if(b2.isSelected())
					{
						s1+=0.15;

					}
					if(b3.isSelected())
					{
						s1+=0.15;

					}
					if(b4.isSelected())
					{
						s1+=0.15;

					}
					if(b5.isSelected())
					{
						s1+=0.15;

					}
					if(b6.isSelected())
					{
						s1+=0.20;

					}
					if(b7.isSelected())
					{
						s1+=0.50;

					}
					if(c1.isSelected())
					{
						s1+=0.15;

					}
					if(c2.isSelected())
					{
						s1+=0.15;

					}
					if(c3.isSelected())
					{
						s1+=0.15;

					}
					if(c4.isSelected())
					{
						s1+=0.15;

					}
					if(c5.isSelected())
					{
						s1+=0.20;

					}
					if(c6.isSelected())
					{
						s1+=0.50;

					}
					if(d1.isSelected())
					{
						s1+=2.00;

					}
					if(d2.isSelected())
					{
						s1+=3.00;

					}
					if(d3.isSelected())
					{
						s1+=3.00;

					}
					if(d4.isSelected())
					{
						s1+=0.20;

					}
					if(e1.isSelected())
					{
						s1+=1.00;

					}
					if(e2.isSelected())
					{
						s1+=1.00;

					}
					if(e3.isSelected())
					{
						s1+=1.00;

					}
					if(e4.isSelected())
					{
						s1+=1.00;

					}
					if(e5.isSelected())
					{
						s1+=0.50;

					}
					if(f1.isSelected())
					{
						s1+=1.00;

					}
					if(f2.isSelected())
					{
						s1+=1.00;

					}
					if(f3.isSelected())
					{
						s1+=1.00;

					}
					if(f4.isSelected())
					{
						s1+=1.00;

					}
					if(f5.isSelected())
					{
						s1+=1.00;

					}
					DecimalFormat display=new DecimalFormat("###.00");
					priceTxtFeild.setText("Total is "+display.format(s1));
				}
				else if (source==btn2) 
				{
					JOptionPane.showMessageDialog(null,"Thank You");
					System.exit(0);
				}
			}

		
		
		
		
		
		
		
		
		
	
	public static void main(String[] args) 
		{
			final int WIDTH=1000;
			final int HEIGHT=1600;
			
			BurgerHouse2 burgerFrame=new BurgerHouse2();
			burgerFrame.setSize(WIDTH,HEIGHT);
			burgerFrame.setVisible(true);


		}
	}	
	
	
	
	
	