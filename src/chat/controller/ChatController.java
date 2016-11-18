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
			checkedInput += "Anarcho-capitalism is stupid";
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

		return checkedInput;
	}
	
}