package partie4.mvc.defaultt;
abstract class MonListModel extends AbstractListModel {
private int size=5;
private int multiplicateur=3;
public int getSize( ) {
return this.size;
}
public void incrSize( ){
this.size+=1;
fireIntervalAdded(this,this.size-1,this.size-1);
}
public void incrMultiplicateur( ){
this.multiplicateur+=1;
fireContentsChanged(this,0,this.size-1);
}
public Object getElementAt(int index) {
return new Integer(3*index);
}