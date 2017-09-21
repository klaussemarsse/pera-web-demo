package ml.icitapeng.pera.ui;

import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.server.DefaultErrorHandler;
import com.vaadin.server.FontAwesome;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.spring.navigator.SpringViewProvider;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;

import ml.icitapeng.pera.HasLogger;
import ml.icitapeng.pera.ui.view.AccessDeniedView;

@SpringUI
@Theme("valo")
@Title("police-personnel-record-administration")
public class PeraUI extends UI implements HasLogger{
	
	private SpringViewProvider viewProvider;
	
	private NavigationManager navigationManager;
	
	private MainView mainView;

	@Autowired
	public PeraUI(SpringViewProvider viewProvider, NavigationManager navigationManager, MainView mainView) {
		this.viewProvider = viewProvider;
		this.navigationManager = navigationManager;
		this.mainView = mainView;
	}

	@Override
	protected void init(VaadinRequest request) {
		setErrorHandler(event -> {
			Throwable t = DefaultErrorHandler.findRelevantThrowable(event.getThrowable());
			getLogger().error("Error during request", t);
		});
		
		viewProvider.setAccessDeniedViewClass(AccessDeniedView.class);
		setContent(mainView);
		
		navigationManager.navigateToDefaultView();
	}

}
