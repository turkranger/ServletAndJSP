package _07_ServletListener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class ContextAttributeListenerImp implements
		ServletContextAttributeListener,ServletRequestListener  {

	@Override
	public void attributeAdded(ServletContextAttributeEvent arg0) {
		System.out.println("ServletContext attributeAdded : " + arg0.getName()
				+ " " + arg0.getValue());

	}

	@Override
	public void attributeRemoved(ServletContextAttributeEvent arg0) {
		System.out.println("ServletContext attributeRemoved : "
				+ arg0.getName() + " " + arg0.getValue());
	}

	@Override
	public void attributeReplaced(ServletContextAttributeEvent arg0) {
		System.out.println("ServletContext attributeReplaces : "
				+ arg0.getName() + " " + arg0.getValue());
	}

	@Override
	public void requestDestroyed(ServletRequestEvent arg0) {
		System.out.println("requestInitialized...");
		
	}

	@Override
	public void requestInitialized(ServletRequestEvent arg0) {
		System.out.println("requestDestroyed...");
	}

}
