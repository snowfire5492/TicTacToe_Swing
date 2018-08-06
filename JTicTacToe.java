/**
 * Name: 		Schenck, Eric
 * Homework: 	# 1
 * Due:			January 22, 2018
 * Course:		cs24501-w18
 * 
 * Description:	
 * 			a tic-tac-toe game board created using jButton and GridLayout.
 *
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class JTicTacToe implements ActionListener{
	
	boolean nextIsX = true;					// used to keep track whether to play X or O on gameboard
	
	// creating 9 buttons to be playable squares on gameboard
	JButton upperLeft = new JButton("");
	JButton upperMiddle = new JButton("");
	JButton upperRight = new JButton("");
	JButton left = new JButton("");
	JButton middle = new JButton("");
	JButton right = new JButton("");
	JButton lowerLeft = new JButton("");
	JButton lowerMid = new JButton("");
	JButton lowerRight = new JButton("");
	
	
	JTicTacToe(){
		
		// creating gameboard
		JFrame jfrm = new JFrame("Tic Tac Toe");
		
		// creating GridLayout for 3x3 tic tac toe
		jfrm.getContentPane().setLayout(new GridLayout(3,3));
		
		// setting an initial square size for window
		jfrm.setSize(230, 230);
		
		// code so close button will terminate program
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	
		// assigning action Listener to each button
		upperLeft.addActionListener(this);
		upperMiddle.addActionListener(this);
		upperRight.addActionListener(this);
		left.addActionListener(this);
		middle.addActionListener(this);
		right.addActionListener(this);
		lowerLeft.addActionListener(this);
		lowerMid.addActionListener(this);
		lowerRight.addActionListener(this);
		
		// setting action commands for each button
		upperLeft.setActionCommand("upLeft");
		upperMiddle.setActionCommand("upMid");
		upperRight.setActionCommand("upRight");
		left.setActionCommand("left");
		middle.setActionCommand("middle");
		right.setActionCommand("right");
		lowerLeft.setActionCommand("lowLeft");
		lowerMid.setActionCommand("lowMid");
		lowerRight.setActionCommand("lowRight");
		
		// adding buttons to jFrame
		jfrm.getContentPane().add(upperLeft);
		jfrm.getContentPane().add(upperMiddle);
		jfrm.getContentPane().add(upperRight);
		jfrm.getContentPane().add(left);
		jfrm.getContentPane().add(middle);
		jfrm.getContentPane().add(right);
		jfrm.getContentPane().add(lowerLeft);
		jfrm.getContentPane().add(lowerMid);
		jfrm.getContentPane().add(lowerRight);
		
		
		
		// setting visibility to true
		jfrm.setVisible(true);
	}
	
	
	

	@Override
	public void actionPerformed(ActionEvent ae) {
		
		
		switch(ae.getActionCommand()){
		
			case "upLeft":								// upperLeft was pressed
				
				if(upperLeft.getText().equals("")){			// check if Text is blank
															// if not blank then spot is played and not changeable
					
					if(nextIsX){							// check if X is next to be played
						upperLeft.setText("X");				// if so play X
						nextIsX = false;					// set boolean false for next move
						
					}else{									// else play O
						upperLeft.setText("O");				
						nextIsX = true;						// set boolean true for next move
					}
				}	
				break;
			
			case "upMid":
			
				if(upperMiddle.getText().equals("")){			// check if Text is blank
															// if not blank then spot is played and not changeable
					if(nextIsX){							// check if X is next to be played
						upperMiddle.setText("X");			// if so play X
						nextIsX = false;					// set boolean false for next move
						
					}else{									// else play O
						upperMiddle.setText("O");				
						nextIsX = true;						// set boolean true for next move
					}
				}
				
				break;
		
			case "upRight":
				
				if(upperRight.getText().equals("")){			// check if Text is blank
														// if not blank then spot is played and not changeable

					if(nextIsX){							// check if X is next to be played
						upperRight.setText("X");			// if so play X
						nextIsX = false;					// set boolean false for next move
						
					}else{									// else play O
						upperRight.setText("O");				
						nextIsX = true;						// set boolean true for next move
					}
					
				} 
				break;
				
			case "left":
				
				if(left.getText().equals("")){			// check if Text is blank
														// if not blank then spot is played and not changeable
					if(nextIsX){							// check if X is next to be played
						left.setText("X");					// if so play X
						nextIsX = false;					// set boolean false for next move
						
					}else{									// else play O
						left.setText("O");				
						nextIsX = true;						// set boolean true for next move
					}
				}	
				
				break;
				
			case "middle":
				
				if(middle.getText().equals("")){			// check if Text is blank
														// if not blank then spot is played and not changeable
					if(nextIsX){							// check if X is next to be played
						middle.setText("X");				// if so play X
						nextIsX = false;					// set boolean false for next move
						
					}else{									// else play O
						middle.setText("O");				
						nextIsX = true;						// set boolean true for next move
					}
					
				}
				
				break;
				
			case "right":
				
				if(right.getText().equals("")){			// check if Text is blank
														// if not blank then spot is played and not changeable
					if(nextIsX){							// check if X is next to be played
						right.setText("X");					// if so play X
						nextIsX = false;					// set boolean false for next move
						
					}else{									// else play O
						right.setText("O");				
						nextIsX = true;						// set boolean true for next move
					}
					
				}
				break;
				
			case "lowLeft":
				
				if(lowerLeft.getText().equals("")){			// check if Text is blank
														// if not blank then spot is played and not changeable
					if(nextIsX){							// check if X is next to be played
						lowerLeft.setText("X");				// if so play X
						nextIsX = false;					// set boolean false for next move
						
					}else{									// else play O
						lowerLeft.setText("O");				
						nextIsX = true;						// set boolean true for next move
					}
					
				}
				break;
				
			case "lowMid":
				
				if(lowerMid.getText().equals("")){			// check if Text is blank
														// if not blank then spot is played and not changeable
					if(nextIsX){							// check if X is next to be played
						lowerMid.setText("X");				// if so play X
						nextIsX = false;					// set boolean false for next move
						
					}else{									// else play O
						lowerMid.setText("O");				
						nextIsX = true;						// set boolean true for next move
					}
					
				}
				break;
				
			case "lowRight":
				
				if(lowerRight.getText().equals("")){			// check if Text is blank
														// if not blank then spot is played and not changeable
					if(nextIsX){							// check if X is next to be played
						lowerRight.setText("X");				// if so play X
						nextIsX = false;					// set boolean false for next move
						
					}else{									// else play O
						lowerRight.setText("O");				
						nextIsX = true;						// set boolean true for next move
					}
						
				}
				break;
				
			default:
				
				break;
				
		}
		
	}
	
	
	public static void main(String[] args){
		
		System.out.println("E.Schenck's Tic Tac Toe");
		new JTicTacToe();
	}
	
	
	
	
	

}
