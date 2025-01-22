package partie4.mvc.defaultt;
public class ListDataEvent extends EventObject
{ /** CONTENTS_CHANGED or INTERVAL_ADDED or INTERVAL_REMOVED*/
public int getType( ) {... }
/**@return an int representing the lower index value*/
public int getIndex0( ) {... }
/** @return an int representing the upper index value */
public int getIndex1( ) {... }
}