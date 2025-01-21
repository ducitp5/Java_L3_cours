import javax.swing.JFrame;

public class TestListModel {

	public static void main(String [] args){

		JList jlist = new JList( new MonListModel( ));

		JFrame jframe = new JFrame("er");

		jframe.getContentPane( ).add(jlist,BorderLayout.CENTER);

		jframe.setVisible(true);
	}
}

@SuppressWarnings("serial")
abstract class MonListModel extends AbstractListModel {

	public int getSize( ) {return 5;}

	public Object getElementAt(int index) {

		return new Integer(3*index);
	}
}