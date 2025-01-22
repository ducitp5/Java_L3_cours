package partie4.mvc.defaultt;
import java.util.Vector;


public class JList {

	//constructeur de la classe JList
	public JList(final Object[ ] listData){
	
		this (new AbstractListModel( ) {

			public int getSize( ) { return listData.length; }
	
			public Object getElementAt(int i) { return listData[i]; }
		});
	}
	
	public void setListData(final Vector listData) {
	
		setModel (new AbstractListModel( ) {
	
			public int getSize( ) { return listData.size( ); }
	
			public Object getElementAt(int i) { return listData.get(i); }
	
		});
	}
}
