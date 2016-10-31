# JavaF
 This is my final for java and this is a GUI program that allows you to order off a menu and allows you to see the price of everything
 
</ br>
<code> 
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
			txtArea.append("House Sauce is selected"+"\n");
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
			txtArea.append("Side of House Sauce is selected"+"\n");
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
			txtArea.append("Curly Fries is selected"+"\n");
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

}
</code>
In today’s age everyone is trying to make things easier. We are trying to improve on things that we have used and done the same way for years. We try to improve efficacy and are always trying to eliminate the middle man. I personal think a side by side work place is the better choice.
    
There are many ways we can have man and machine work together rather than replacing. In fast food they want to replace people with machines and I don’t know if I trust that. At the same time, it’s hard to trust a person to get your order right the first time so I thought of a way they should implement one side of that.

I want to make an interactive menu for fast food that could be implemented in a lot of other places like restaurants with tablets at the table or something like that. Simple menu you put your burger together with the ingredients you want and it shows you the price of how much it would be for the item every step of the way. Then you can send your order off knowing it’s what you ordered and not having to be worried about speaker systems that don’t work in the drive in or broken ears.

The project is easy to use select the items you want(based off one customer)when selecting the items you will see that items are selected and displayed and when your done you can see the price take away what you want or add anything you missed. when you are done hit submit and a thank you sign appears.

It will help make sure that everything someone wants is what they ordered. If you implement a items check list for the person that’s making it that they have to hit a button when they add something to make sure orders are complete. If this was done I would feel strongly about having minimum wage to be raised to 15 an hr. due to making them do all little more work for it because accuracy is important to a lot of customers like myself.

 

Things that can go wrong on this is not knowing how to use this but with options to talk to a live person I think that can be fixed. Messing up your own order could also be a problem and punching that an item was put on there but it wasn’t may also cause some issues. Since I will only do the menu side for the customer I will only focused on fixing those bugs.

           

I like to see new faster ways to get things done. I don’t like waiting very much but most of all if I do wait I at least want to make sure I got the right items that I paid for. I think this would just be a cool start for that to change.
