import javax.swing.event.TreeModelListener;
import javax.swing.tree.TreePath;

public interface TreeModel{
public java.lang.Object getRoot( );
public java.lang.Object getChild(Object parent, int index);
public int getChildCount(Object parent);
public boolean isLeaf(Object node);
public void valueForPathChanged(TreePath path, newValue);
public int getIndexOfChild(Object parent, Object child);
public void addTreeModelListener(TreeModelListener l);
public void removeTreeModelListener(TreeModelListener l);
}