package chat.view;

import javax.swing.JFrame;
import chat.controller.ChatController;
import java.awt.Dimension;

public class ChatFrame extends JFrame{
private ChatController baseController;
private ChatPanel appPanel;

public ChatFrame(ChatController baseController)
{
	super();
	this.baseController = baseController;
	this.appPanel = new ChatPanel(baseController);
	setupFrame();
}

private void setupFrame()
{
this.setSize(new Dimension(600, 400));
this.setTitle("S A D B O I I - v.01");
this.setVisible(true);
}
}