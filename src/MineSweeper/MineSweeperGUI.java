package MineSweeper;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class MineSweeperGUI extends JFrame {
	
	private JPanel jpMain;
	private MSBoard jpMSBoard;
	
	
	public MineSweeperGUI() {
		jpMain = new JPanel();
		jpMain.setLayout(new BorderLayout());
		
		jpMSBoard = new MSBoard();
		jpMain.add(jpMSBoard, BorderLayout.CENTER);
				
		add(jpMain);
		setSize(700,700);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private class MSBoard extends JPanel implements ActionListener{
		Grid g = new Grid();
		private JButton [][] board;
		ImageIcon bomb = new ImageIcon("C:/Users/M A/Downloads/bomb.png");
		ImageIcon bombScaled = new ImageIcon(bomb.getImage().getScaledInstance(143,100,Image.SCALE_FAST));
		
		public MSBoard() {
			setLayout(new GridLayout(g.getNumRows(),g.getNumColumns())); 
			displayBoard();
		}
		
		public void displayBoard() {
			
			board = new JButton[g.getNumRows()][g.getNumColumns()];
			for(int row=0; row<g.getNumRows(); row++){
				for(int col=0; col < board[row].length; col++){
					board[row][col] = new JButton();
					board[row][col].addActionListener(this);
					board[row][col].setBackground(Color.ORANGE);
					this.add(board[row][col]);
					
				}
				
			}
			
		}
		
		
		
		public void actionPerformed(ActionEvent e) {
			JButton btnClicked = (JButton) e.getSource();
			for(int row=0; row<g.getNumRows(); row++){
				for(int col=0; col < board[row].length; col++){
					if( g.getBombGrids()[row][col] == true ) {
						if(btnClicked == board[row][col]) { 
							reveal();
							playAgain();
						}
					}
					else {
						if (btnClicked == board[row][col]) {
							if( g.getCountGrids()[row][col] == 0 ) board[row][col].setText("0");
							if( g.getCountGrids()[row][col] == 1 ) board[row][col].setText("1");
							if( g.getCountGrids()[row][col] == 2 ) board[row][col].setText("2");
							if( g.getCountGrids()[row][col] == 3 ) board[row][col].setText("3");
							if( g.getCountGrids()[row][col] == 4 ) board[row][col].setText("4");
							if( g.getCountGrids()[row][col] == 5 ) board[row][col].setText("5");
							if( g.getCountGrids()[row][col] == 6 ) board[row][col].setText("6");
							if( g.getCountGrids()[row][col] == 7 ) board[row][col].setText("7");
							if( g.getCountGrids()[row][col] == 8 ) board[row][col].setText("8");
							if( g.getCountGrids()[row][col] == 9 ) board[row][col].setText("9");
						}
					}
					
					
				}
				}
			
		}
		
		public void reveal() {
			for(int row=0; row<g.getNumRows(); row++){
				for(int col=0; col < board[row].length; col++){
					if( g.getBombGrids()[row][col] == true )board[row][col].setIcon(bombScaled);
					
					if( g.getCountGrids()[row][col] == 0 ) board[row][col].setText("0");
					if( g.getCountGrids()[row][col] == 1 ) board[row][col].setText("1");
					if( g.getCountGrids()[row][col] == 2 ) board[row][col].setText("2");
					if( g.getCountGrids()[row][col] == 3 ) board[row][col].setText("3");
					if( g.getCountGrids()[row][col] == 4 ) board[row][col].setText("4");
					if( g.getCountGrids()[row][col] == 5 ) board[row][col].setText("5");
					if( g.getCountGrids()[row][col] == 6 ) board[row][col].setText("6");
					if( g.getCountGrids()[row][col] == 7 ) board[row][col].setText("7");
					if( g.getCountGrids()[row][col] == 8 ) board[row][col].setText("8");
					if( g.getCountGrids()[row][col] == 9 ) board[row][col].setText("9");
				}}
		}
		
		public boolean playAgain() {
			String text = "Play Again?";
			int yesNo = JOptionPane.showConfirmDialog(null, text);
			if(yesNo == JOptionPane.YES_OPTION){
				
				//remove(jpMSBoard);
				//jpMSBoard = new MSBoard();
				//add(jpMSBoard);
				//SwingUtilities.updateComponentTreeUI(this);
			
			}
			else{
				System.exit(EXIT_ON_CLOSE);
			}
			return false;
		}
		
		
		
		
	}
}
