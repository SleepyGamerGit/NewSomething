package controller;

import javax.swing.JOptionPane;

import model.MarcoMaker;

import java.util.ArrayList;

public class NewController
{
	private MarcoMaker UserMarco;

	public NewController()
	{
		UserMarco = new MarcoMaker();
	}

	public void start()
	{
		// loopy();

		askUser();
	
		lotsOfMarco();
	}

	// private void loopy()
	// {
	// boolean isDone = false;
	// int count = 0;
	//
	// while (!isDone)// test
	// {
	// JOptionPane.showMessageDialog(null, "BOO");
	// // change the loop variable
	// count++;
	// if (count > 5)
	// {
	// isDone = true; // update
	// }
	// for (int loop = 0; loop < 30; loop += 2)
	// {
	// JOptionPane.showMessageDialog(null, "the loop value is: " + loop);
	// }
	// }
	// }
	private void askUser()
// the list makes marcos
	{
		boolean isDone = false;
		int count = 0;
		while (!isDone)
		{
		JOptionPane.showMessageDialog(null, "Welcome to the marco maker");

		String response = JOptionPane.showInputDialog(null, "How many legs does your Marco have?");
		while (!validDouble(response))
		{
			response = JOptionPane.showInputDialog(null, "No! only numbers allowed");
		}

		response = JOptionPane.showInputDialog(null, "How many eyes does your marco have?");
		while (!validInt(response))
		{
			response = JOptionPane.showInputDialog(null, "No! only numbers allowed?");
		}

		response = JOptionPane.showInputDialog(null, "How many arms does your marco?");
		while (!validInt(response))
		{
			response = JOptionPane.showInputDialog(null, "No! numbers only");
		}

		response = JOptionPane.showInputDialog(null, "Does you marco wear supreme?");
		if (response == null || response.equals("yes" + "no"))
		{
			response = JOptionPane.showInputDialog(null, "No! it's a yes or no quetion");
		}
		JOptionPane.showMessageDialog(null, "Congratulations, you have made your marco");
		count++;
		if (count > 3)
		{
			isDone = true;
		}
	}
		
}
// starts array list 
	private void lotsOfMarco()
	{
		ArrayList<MarcoMaker> myMarco = new ArrayList<MarcoMaker>();
		//makes a list for Marcos
		MarcoMaker sampleMarco = new MarcoMaker();
		MarcoMaker otherMarco = new MarcoMaker();
		myMarco.add(sampleMarco);
		myMarco.add(sampleMarco);
		myMarco.add(otherMarco);
		
		
		for (int index = myMarco.size() / 2; index < myMarco.size(); index += 1)
		{
			MarcoMaker currentRun = myMarco.get(index);
			currentRun.setArmCount(index * currentRun.getArmCount());
		}
		for (MarcoMaker current : myMarco)
		{
			JOptionPane.showMessageDialog(null, "This Marco is has" + current.getArmCount());
		}
	}   
	
	public boolean validInt(String example)
	{
		boolean isValid = false;

		try
		{
			Integer.parseInt(example);
			isValid = true;
		}
		catch (NumberFormatException error)
		{
			System.out.println("valid int value human!");
		}
		return isValid;
	}

	public boolean validDouble(String example)
	{
		boolean isValid = false;

		try
		{
			Double.parseDouble(example);
			isValid = true;
		}
		catch (NumberFormatException error)
		{
			System.out.println("input only");
		}

		return isValid;
	}
}
