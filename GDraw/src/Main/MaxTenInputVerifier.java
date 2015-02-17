package Main;



import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JTextField;

public class MaxTenInputVerifier extends InputVerifier {
	
	private int numNodes;
	public MaxTenInputVerifier(){
		super();
	}

		 
		@Override
		public boolean verify(JComponent input) {
			numNodes = Window.getNumNodes();
			 String text = ((JTextField) input).getText();
			 if (text.isEmpty())
				 return true;
		        try {
		            int value = Integer.parseInt(text);
		            return (value <= numNodes && value >= 0 && value < 11); 
		        } catch (NumberFormatException e) {
		            return false;
		        }
		}
		
		
		
		
	}


