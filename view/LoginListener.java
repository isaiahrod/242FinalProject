package view;

import java.util.EventListener;

public interface LoginListener extends EventListener {

	public void okButtonClick(OKButtonEventObject ev);
	// create a data saving object ev on button click
}
