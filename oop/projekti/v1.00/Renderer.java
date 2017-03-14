package flappy2;

import java.awt.Graphics;

import javax.swing.JPanel;

public class Renderer extends JPanel
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4379041704872533563L;

	@Override // override JPanelin metodista
	protected void paintComponent(Graphics g) 
	{
		super.paintComponent(g);

		FlappyBird.flappyBird.repaint(g);
	}
	
}