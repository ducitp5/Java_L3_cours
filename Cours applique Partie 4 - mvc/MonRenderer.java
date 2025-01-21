import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.ListCellRenderer;

@SuppressWarnings({ "serial", "rawtypes" })
abstract class MonRenderer extends JLabel implements ListCellRenderer {
	private String message;

	public MonRenderer(String message) {
		this.message = message;
		setOpaque(true);
	}

	public Component getListCellRendererComponent(JList list, Object value,
			int index, boolean isSelected, boolean cellHasFocus) {
		setText(message + value.toString());
		setBackground(isSelected ? Color.red : Color.white);
		setForeground(isSelected ? Color.green : Color.blue);
		setFont(isSelected ? new Font("Courrier New", Font.BOLD, 15)
				: new Font("Courrier New", Font.ITALIC, 15));
		return this;
	}
}