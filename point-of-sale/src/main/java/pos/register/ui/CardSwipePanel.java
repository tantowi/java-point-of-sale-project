package pos.register.ui;

import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 * Simulates a card swipe.
 * 
 * @author neopragma
 */
public class CardSwipePanel extends JPanel {

	private static final long serialVersionUID = 7190948028476562625L;
	private Border raisedBevel = BorderFactory.createRaisedBevelBorder();
	private Border loweredBevel = BorderFactory.createLoweredBevelBorder();
	private Border compoundBorder = BorderFactory.createCompoundBorder(raisedBevel, loweredBevel);
	
	public CardSwipePanel() {
		this.setBorder(compoundBorder);
	    this.setLayout(new FlowLayout());
		this.add(new JLabel("Card Swipe Panel"));		
	}

}
