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
		baseLayout.putConstraint(SpringLayout.NORTH, chatDisplay, 55, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, chatDisplay, 75, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, chatDisplay, -136, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, chatDisplay, -61, SpringLayout.EAST, this);
		chatField = new JTextField(25);
		baseLayout.putConstraint(SpringLayout.NORTH, chatField, 23, SpringLayout.SOUTH, chatDisplay);
		baseLayout.putConstraint(SpringLayout.WEST, chatField, 0, SpringLayout.WEST, chatDisplay);
		chatButton = new JButton("Chat, if you desire.");
		baseLayout.putConstraint(SpringLayout.NORTH, chatButton, 7, SpringLayout.SOUTH, chatField);
		baseLayout.putConstraint(SpringLayout.EAST, chatButton, -137, SpringLayout.EAST, this);
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
		this.add(chatDisplay);
		this.add(chatField);
		this.add(chatButton);
	}
	
	private void setupLayout()
	{
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
