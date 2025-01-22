package partie4.mvc.defaultt;
import java.io.Serializable;
import java.util.EventListener;

public abstract class AbstractListModel implements ListModel, Serializable {
	/**
	 * Adds a listener to the list that's notified each time a change to the
	 * data model occurs.
	 */
	public void addListDataListener(ListDataListener l) {
	}

	public void removeListDataListener(ListDataListener l) {
	}

	/**
	 * Returns an array of all the list data listeners registered on this
	 * AbstractListModel.
	 */
	public ListDataListener[] getListDataListeners() {
	}

	/**
	 * AbstractListModel subclasses must call this method after one or more
	 * elements of the list change. The changed elements are specified by the
	 * closed interval index0, index1 -- the endpoints are included. Note that
	 * index0 need not be less than or equal to index1.
	 * 
	 * @param source
	 *            the ListModel that changed, typically "this"
	 * @param index0
	 *            one end of the new interval
	 * @param index1
	 *            the other end of the new interval
	 */
	protected void fireIntervalAdded(Object source, int index0, int index1) {
	}

	protected void fireIntervalRemoved(Object source, int index0, int index1) {
	}

	public EventListener[] getListeners(Class listenerType) {
	}

	protected void fireContentsChanged(Object source, int index0, int index1) {
		Object[] listeners = listenerList.getListenerList();
		ListDataEvent e = null;
		for (int i = listeners.length - 2; i >= 0; i -= 2) {
			if (listeners[i] == ListDataListener.class) {
				if (e == null) {
					e = new ListDataEvent(source,
							ListDataEvent.CONTENTS_CHANGED, index0, index1);
				}
				((ListDataListener) listeners[i + 1]).contentsChanged(e);
			}
		}
	}

}