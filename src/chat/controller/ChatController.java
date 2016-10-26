package chat.controller;

import chat.model.Chatbot;
import chat.view.ChatbotViewer;
public class ChatController {
	
	private Chatbot sadBot;
	private ChatbotViewer display;
	
	public ChatController()
	{
		sadBot = new Chatbot("Meme Machine");
		display = new ChatbotViewer();
	}
	public void start()
	{
		System.out.println("Hello, world!");
		String response = display.collectResponse("What do you want to talk about?");
		while(sadBot.lengthChecker(response))
		{
			display.displayMessage(useChatbotCheckers(response));
			response = display.collectResponse("Oh, you want to talk about " + response + "? Then talk.");
		} 
	}
	private String useChatbotCheckers(String input){
		String checkedInput = "";
		if(sadBot.memeChecker(input))
		{
			checkedInput += "Oh, I see you like those dank memes xD";
		}
		
		/*
	 	if(sadBot.contentChecker(input))
		{
			checkedInput += "y'all got that good secret topic stuff";
		}
		*/
	
		if(checkedInput.length() == 0)
		{
			checkedInput = "Say something, I'm giving up on you.";
		}
		
		return checkedInput;
	}
	
}
