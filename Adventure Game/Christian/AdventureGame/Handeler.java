


//This separates words in the input
public class Handeler {
public static void main (String[] args)
{
	if(TextGUI.game.getText().equals("help"))
	{
		//if this passes the help info is displayed
		if(TextGUI.roomNum == 17)
				{
					TextGUI.area.setText(TextGUI.area.getText()+ "\nWell looks like you made it this far but here's all you'll need to know on how to fight\nAttack: Use this command to attack with all your strength.\nCharge: use this command to bring forth strength to attack, be carful not to over  do it\nDefend: If you'r opponate has charged up tons you may wanna use this, if you defend properly his attacks will do nothing.\nUse 'info' to check on your stats.");
				}
		else TextGUI.area.setText(TextGUI.area.getText() + "\nThis is a list of example commands in this game.\nGo\nExamin\nPick up\nUse");
	}
	//These first few else ifs check to see if common basic commands are being run so that they don't need to be coded in each room
	else if(TextGUI.game.getText().equals("do"))
	{
		TextGUI.area.setText(TextGUI.area.getText() + "\nWhat do you want to do?");
	}
	else if(TextGUI.game.getText().equals("go"))
	{
		TextGUI.area.setText(TextGUI.area.getText() + "\nWhere do you want to go?");
	}
	else if(TextGUI.game.getText().equals("use"))
	{
		TextGUI.area.setText(TextGUI.area.getText() + "\nWhat do you want to use?");
	}
	else if(TextGUI.game.getText().equals("take"))
	{
		TextGUI.area.setText(TextGUI.area.getText() + "\nWhat do you want to take?");
	}
	else if(TextGUI.game.getText().equals("info"))
	{
		TextGUI.area.setText(TextGUI.area.getText() + "\nThis is your inventory");
		if(TextGUI.hasKey1 == true)
			TextGUI.area.setText(TextGUI.area.getText() + "\nMural Peice");
		if(room5.haskey1 == true)
			TextGUI.area.setText(TextGUI.area.getText() + "\nKey");
		if(room5.haskey2 == true)
			TextGUI.area.setText(TextGUI.area.getText() + "\nKey");
		if(room5.haskey3 == true)
			TextGUI.area.setText(TextGUI.area.getText() + "\nKey");
		if(TextGUI.hassigil == true)
			TextGUI.area.setText(TextGUI.area.getText() + "\nSigle");
		if(TextGUI.hasgoldenkey == true)
			TextGUI.area.setText(TextGUI.area.getText() + "\nGolden Key");
		if(TextGUI.hasgoldensword == true)
			TextGUI.area.setText(TextGUI.area.getText() + "\nGolden Sword");
		if(room9.lighterandgas == true)
			TextGUI.area.setText(TextGUI.area.getText() + "\nLighter Filled With Gas");
		
		TextGUI.area.setText(TextGUI.area.getText() + "\n                              ====STATS====");
		TextGUI.area.setText(TextGUI.area.getText() + "\nHP: " + Boss.playerHealth + "/30");
		TextGUI.area.setText(TextGUI.area.getText() + "\nCP: "+ Boss.playerCharge);
		
		if(TextGUI.roomNum == 17)
			TextGUI.area.setText(TextGUI.area.getText() + "\nBoss HP: " + Boss.bossHealth+ "/30");
			
	}
	
	else if(TextGUI.roomNum == 0)
		//room 0 is really just used in the intro to name the player
			{
			TextGUI.playerName = TextGUI.game.getText();
			TextGUI.area.setText(TextGUI.area.getText() + "\n Hello, This is your story, you are about to embark on a great adventure full of wonder and awe, your name is " + TextGUI.playerName + " You were born into a world of poverty and misery, Sad indeed. \n Raised by two powerful garden gnomes, you are constantly challenged. \n Jumping into a pond of carnivorous tadpoles has been your biggest regret. \n you enjoy speaking to animals, this is probably why you have no friends. \n A few minutes ago, you did not remember what your name was...");
			TextGUI.roomNum=1;
			TextGUI.area.setText(TextGUI.area.getText() + "\nYou find yourself in a small damp room there is are reminants of an old rug on the floor, and dim lighting that seems to be coming from nowhere; in the corner there is an old bookshelf, many pages and books are on the ground, yet one book still remains on the shelf. Behind you to the south is the cave entrance, to the west there is a wooden door, it appears to have a few burn marks on it, and a few signs of applied force aswell, and to the north is another door; this door is made of metal, it appears to have been under heavy amounts of force judgeing by the large dents on the front.");
			}
	//Handeler will then detect the current room, then run that room's script.
	else if (TextGUI.roomNum==1)
	{
		Room1.main(null);
	}
	else if (TextGUI.roomNum ==2)
		{
			room2.main(null);
		}
	else if (TextGUI.roomNum ==3)
		{
			room3.main(null);
		}
	else if(TextGUI.roomNum==4)
		{
			room4.main(null);
		}
	else if(TextGUI.roomNum == 5)
		{
			room5.main(null);
		}
	else if(TextGUI.roomNum==6)
		{
			room6.main(null);
		}
	else if(TextGUI.roomNum==7)
		{
			room7.main(null);
		}
	else if(TextGUI.roomNum==8)
		{
			room8.main(null);
		}
	else if(TextGUI.roomNum==9)
		{
			room9.main(null);
		}
	else if(TextGUI.roomNum==10)
		{
			room10.main(null);
		}
	else if(TextGUI.roomNum==11)
		{
			room11.main(null);
		}
	else if(TextGUI.roomNum==12)
		{
			room12.main(null);
		}
	else if(TextGUI.roomNum==13)
		{
			room13.main(null);
		}
	else if(TextGUI.roomNum==14)
		{
			room14.main(null);
		}
	else if(TextGUI.roomNum==15)
		{
			room15.main(null);
		}
	else if(TextGUI.roomNum==16)
		{
			Boss.main(null);
		}
	else if(TextGUI.roomNum == 17)
	{
		room16.main(null);
	}
	//if somehow none of handeler's ifs got passed this error message will display
	else
		//Debugger
		TextGUI.area.setText(TextGUI.area.getText() + "\nOH NOES! Looks like somthing went wrong or nothing is programed to respond to this yet, try typeing 'help'");
	
}
}
