import javax.swing.event.ListDataListener;

public interface ListModel {
	/** Returns the length of the list. */
	public int getSize();

	/** Returns the value at the specified index. */
	public Object getElementAt(int index);

	/**
	 * Adds a listener to the list that's notified each time a change to the
	 * data model occurs.
	 */
	public void addListDataListener(ListDataListener l);

	/**
	 * Removes a listener from the list that's notified each time a change to
	 * the data model occurs.
	 */
	public void removeListDataListener(ListDataListener l);
}