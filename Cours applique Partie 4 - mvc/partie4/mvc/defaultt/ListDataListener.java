package partie4.mvc.defaultt;
public interface ListDataListener extends EventListener {
/* Sent after the indices in the index0,index1
* interval have been inserted in the data model.
* The new interval includes both index0 and index1.
* @param e a ListDataEvent encapsulating the event information */
void intervalAdded(ListDataEvent e);
void intervalRemoved(ListDataEvent e);
void contentsChanged(ListDataEvent e);
}