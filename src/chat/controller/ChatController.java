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
	public void start(){
		System.out.println("Hello, world!");
		String response = "words";
		
		while(sadBot.lengthChecker(response)){
			response = display.collectResponse("oh hey friendo");
		}
	}
}
