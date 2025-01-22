package partie4.mvc.defaultt;
import javax.swing.event.TreeModelListener;
import javax.swing.tree.TreePath;

public abstract class MonTreeModel implements TreeModel {
	public java.lang.Object getRoot() {
		return new Integer(4);
	}

	public Object getChild(Object parent, int index) {
		return new Integer(((Integer) parent).intValue() - 1 - index);
	}

	public int getChildCount(Object parent) {
		return 3;
	}

	public boolean isLeaf(Object node) {
		return ((Integer) node).intValue() <= 0;
	}

	public void valueForPathChanged(TreePath path, Object newValue) {
	}

	public int getIndexOfChild(Object parent, Object child) {
		int res = -1;
		for (int i = 0; i < getChildCount(parent) && res == -1; i++)
			if (getChild(parent, i) == child)
				res = i;
		return res;
	}

	public void addTreeModelListener(TreeModelListener l) {
	};

	public void removeTreeModelListener(TreeModelListener l) {
	};
}