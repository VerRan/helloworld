package hello;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage; 

public class JavaFxDemo extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		WebView browser = new WebView();
		WebEngine webEngine = browser.getEngine();
		String path=this.getClass().getResource("demo.html").getPath();
		String demoHtml = FileUtil.file2String(new java.io.File(path),"UTF-8");
		webEngine.loadContent(demoHtml);
		Scene scene  = new Scene(browser,800,600);
		primaryStage.setTitle(" WebView Demo ");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
