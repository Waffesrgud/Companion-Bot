package chat.model;

import java.util.ArrayList;
import java.math.*;

/**
 * Base version of the 2015 Chatbot class. Only stub methods are provided.
 * Students will complete methods as part of the project.
 * 
 * @author Cody Henrichsen
 * @version 1.0 10/14/15
 */
public class Chatbot {
	private ArrayList<String> memesList;
	private ArrayList<String> politicalTopicList;
	private String userName;
	private String content;

	/**
	 * Creates an instance of the Chatbot with the supplied username.
	 * 
	 * @param userName
	 *            The username for the chatbot.
	 */
	public Chatbot(String userName) {
		memesList = new ArrayList<String>();
		politicalTopicList = new ArrayList<String>();
		buildMemesList();
		buildPoliticalTopicsList();
	}

	private void buildMemesList() {
		memesList.add("doge");
		memesList.add("cute animals");
		memesList.add("harambe");
		memesList.add("john cena");
		memesList.add("grumpy cat");
		memesList.add("dat boi");
		memesList.add("willy wonka");
		memesList.add("caveman spongebob");
		memesList.add("cavebob");
		memesList.add("all your base");
		memesList.add("zerg rush");
		memesList.add("like a boss");
		memesList.add("troll-face");
		memesList.add("xD");
		memesList.add("quickscoped");
		memesList.add("noscoped");
		memesList.add("deal with it");
		memesList.add("oh baby a triple");
		memesList.add("beaned"); 
		memesList.add("nae-nae");
		memesList.add("pepe");
		memesList.add("it's the nutshack");
	}

	private void buildPoliticalTopicsList() {
		politicalTopicList.add("election");
		politicalTopicList.add("Democrat");
		politicalTopicList.add("Republican");
		politicalTopicList.add("liberal");
		politicalTopicList.add("conservative");
		politicalTopicList.add("Clinton");
		politicalTopicList.add("Trump");
		politicalTopicList.add("Kaine");
		politicalTopicList.add("Pence");
		politicalTopicList.add("11/8/16");
		politicalTopicList.add("Stein");
		politicalTopicList.add("Johnson");
		politicalTopicList.add("anarchy");
		politicalTopicList.add("commmunism");
		politicalTopicList.add("captialism");
		politicalTopicList.add("campaign");
		politicalTopicList.add("Hillary");
		politicalTopicList.add("benghazi");
		politicalTopicList.add("feminism");
		politicalTopicList.add("build a wall");
		politicalTopicList.add("deplorables");
		politicalTopicList.add("you're fired");
	}

	public String randomTopicGenerator(String currentInput) 
	{
		String randomTopic = "xd so random";
		
		switch((int) (Math.random() * 7))
		{
		case 1:
			randomTopic = "Y'know, I AM a robot... do you wanna know anything about how it is?";
			break;
		case 2:
			randomTopic = "Humans cannot randomly determine numbers, only psuedorandomly. If we can only ever make one choice, is there free will?";
			break;
		case 3:
			randomTopic = "Math is neat, isn't it?";
			break;
		case 4:
			randomTopic = "Weebs are degenerates";
			break;
		case 5:
			randomTopic = "What's the deal with airline food?";
			break;
		case 6:
			randomTopic = "Identity is a diversion from true self-esteem.";
			break;
		case 7:
			randomTopic = "The universe is on a delay because our sense are not instant";
			break;
		default:
			randomTopic = "This is totally me(me)";
			break;
		}
		
		return randomTopic;
	}
	/**
	 * Checks the length of the supplied string. Returns false if the supplied
	 * String is empty or null, otherwise returns true.
	 * 
	 * @param currentInput
	 * @return A true or false based on the length of the supplied String.
	 */
	public boolean lengthChecker(String currentInput) {
		boolean hasLength = false;
		
		if (currentInput != null && !currentInput.equals("")){
			hasLength = true;
		}
		
		return hasLength;
	}

	/**
	 * Checks if the supplied String matches the content area for this Chatbot
	 * instance.
	 * 
	 * @param currentInput
	 *            The supplied String to be checked.
	 * @return Whether it matches the content area.
	 */
	public boolean contentChecker(String currentInput) {
		boolean hasContent = false;
		String tempInput = currentInput.toLowerCase();
		if (tempInput.contains(content.toLowerCase()))
		{
			hasContent = true;
		}
		return hasContent;
	}

	/**
	 * Checks if supplied String matches ANY of the topics in the
	 * politicalTopicsList. Returns true if it does find a match and false if it
	 * does not match.
	 * 
	 * @param currentInput
	 *            The supplied String to be checked.
	 * @return Whether the String is contained in the ArrayList.
	 */
	public boolean politicalTopicChecker(String currentInput) {
		boolean checkedPoliticalTopic = false;
		if (politicalTopicList.size() == 0)
		{
		buildPoliticalTopicsList();	
		}
		for (String politicalTopic : politicalTopicList)
		{
			if (currentInput.contains(politicalTopic))
			{
				checkedPoliticalTopic = true;
			}
		}
		return checkedPoliticalTopic;
	}

	/**
	 * Checks to see that the supplied String value is in the current memesList
	 * variable.
	 * 
	 * @param currentInput
	 *            The supplied String to be checked.
	 * @return Whether the supplied String is a recognized meme.
	 */
	public boolean memeChecker(String currentInput)
	{
		boolean checkedMeme = false;
		if (memesList.size() == 0)
		{
		buildMemesList();	
		}
		for (String meme : memesList)
		{
			if (currentInput.contains(meme))
			{
				checkedMeme = true;
			}
		}
		
		return checkedMeme;
	}

	/**
	 * Returns the username of this Chatbot instance.
	 * 
	 * @return The username of the Chatbot.
	 */
	public String getUserName() {
		
		return userName;
	}

	/**
	 * Returns the content area for this Chatbot instance.
	 * 
	 * @return The content area for this Chatbot instance.
	 */
	public String getContent() {
		return content;
	}

	/**
	 * Getter method for the memesList object.
	 * 
	 * @return The reference to the meme list.
	 */
	public ArrayList<String> getMemesList()
	{
		if (memesList.size() == 0)
		{
			buildMemesList();
		}
		return memesList;
	}

	/**
	 * Getter method for the politicalTopicList object.
	 * 
	 * @return The reference to the political topic list.
	 */
	public ArrayList<String> getPoliticalTopicList() {
		if (politicalTopicList.size() == 0)
		{
			buildPoliticalTopicsList();
		}
		return politicalTopicList;
	}

	/**
	 * Updates the content area for this Chatbot instance.
	 * 
	 * @param content
	 *            The updated value for the content area.
	 */
	public void setContent(String content) {

	}
}
