/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman.view;

import java.awt.Graphics;
import javax.swing.JPanel;

import com.google.inject.Inject;

/**
 *
 * @author 2106913
 */
public abstract class HangmanPanel extends JPanel{
	@Inject
	public HangmanPanel() {
	}
     @Override
     public void paint(Graphics g){
         super.paint(g);
     };
     
     
     public abstract void incrementIncorrectGuesses();
     public abstract void setIncorrectGuesses(int incorrectGuesses);
}
