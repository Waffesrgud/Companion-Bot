package chat.controller;

import chat.view.ChatFrame;
import chat.view.ChatPanel;
import chat.model.Chatbot;
import chat.view.ChatbotViewer;

public class ChatController {
	
	private Chatbot sadBot;
	private ChatbotViewer display;
	private ChatFrame baseFrame;
	private ChatPanel basePanel;
	

	public ChatController()
	{
		sadBot = new Chatbot("sad chat machine");
		baseFrame = new ChatFrame(this);
		basePanel = new ChatPanel(this);
	}
	public void start()
	{
		System.out.println("Hello, world!");
		
		
	}
	
	public String useChatbotCheckers(String input)
	{
		String checkedInput = "";
		if(/*whoops*/true)
		{
		if(sadBot.memeChecker(input))
		{
			checkedInput += "Oh, I see you like those dank memes xD ";
		}
		
		/*
	 	if(sadBot.contentChecker(input))
		{
			checkedInput += "y'all got that good secret topic stuff";
		}
		*/
		
		if(sadBot.politicalTopicChecker(input))
		{
			checkedInput += "Anarcho-capitalism is stupid ";
		}
			
		if(sadBot.twitterChecker(input))
		{
			checkedInput += "This isn't twitter, buddyboy. Type like a normal person. ";
		}
		if(sadBot.keyboardMashChecker(input))
		{
			checkedInput += "Get your face away from the keyboard, disgusting. ";
		}
		if(sadBot.getUserName() == input)
		{
			checkedInput += "Are... are you hacking me? Don't do that!";
		}
		
		if(!sadBot.lengthChecker(input))
		{
			checkedInput += "Lame, talk about politics or something. ";
		}
		int canBeRandom = (int) (Math.random() * 7);
		if (canBeRandom % 7 == 0)
		{
			checkedInput += sadBot.randomTopicGenerator(input);
		}
		} else {
			display.displayMessage("Leaving me? If you want to, fine by me.");
			
			System.exit(0);
		}
		return checkedInput;
	}
	public ChatFrame getBaseFrame()
	{
		return baseFrame;
	}
	public Chatbot getChatbot()
	{
		return sadBot;
	}
}	