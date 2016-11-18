package chat.view;

import javax.swing.*;
import chat.controller.ChatController;
import java.awt.Color;
import java.awt.event.*;

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
		chatDisplay = new JTextArea(5, 20);
		chatField = new JTextField(25);
		chatButton = new JButton("Chat, if you desire.");
		chatButton.setToolTipText("sending message to CIA");

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
		baseLayout.putConstraint(SpringLayout.WEST, chatField, 60, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, chatField, -6, SpringLayout.NORTH, chatButton);
		baseLayout.putConstraint(SpringLayout.WEST, chatButton, 135, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, chatButton, -28, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, chatDisplay, -115, SpringLayout.NORTH, chatField);
		baseLayout.putConstraint(SpringLayout.WEST, chatDisplay, 0, SpringLayout.WEST, chatField);
		baseLayout.putConstraint(SpringLayout.SOUTH, chatDisplay, -6, SpringLayout.NORTH, chatField);
		baseLayout.putConstraint(SpringLayout.EAST, chatDisplay, 0, SpringLayout.EAST, chatField);
	}
	
	private void setupListeners()
	{
		chatButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String chatbotResponse = baseController.useChatbotCheckers(chatField.getText());
				
				chatDisplay.setText("Chatbot says: " + chatbotResponse);
				chatField.setText("");
			}
		 });
	 }
}
