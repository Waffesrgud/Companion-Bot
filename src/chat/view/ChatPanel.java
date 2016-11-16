package chat.view;

import javax.swing.*;
import chat.controller.ChatController;
import java.awt.Color;

public class ChatPanel extends JPanel{
	private ChatController baseController;
	private SpringLayout baseLayout;
	private JTextArea chatDisplay;
	private JTextField chatField;
	private JButton chatButton;
	
	public ChatPanel(ChatController baseController)
	{
		super();
		this.baseController = baseController;
		
		baseLayout = new SpringLayout();
		chatDisplay = new JTextArea(25, 5);
		chatField = new JTextField(25);
		baseLayout.putConstraint(SpringLayout.EAST, chatField, -10, SpringLayout.EAST, this);
		chatButton = new JButton("Chat, if you desire.");
		baseLayout.putConstraint(SpringLayout.NORTH, chatButton, 145, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, chatField, -44, SpringLayout.NORTH, chatButton);
		baseLayout.putConstraint(SpringLayout.EAST, chatButton, -90, SpringLayout.EAST, this);
		
		setupChatDisplay();
		setupPanel();
		setupListeners();
		setupLayout();
	}
	
	private void setupChatDisplay()
	{
		chatDisplay.setEditable(false);
		chatDisplay.setEnabled(false);
		chatDisplay.setWrapStyleWord(true);
		chatDisplay.setLineWrap(true);
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.GREEN);
		this.add(chatButton);
		this.add(chatDisplay);
		this.add(chatField);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
}
