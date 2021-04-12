
package com.company.project;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

	@Override
	public void start (Stage stage) throws IOException {

		Scene scene = FXMLLoader.load(getClass().getResource("hello_world.fxml"));

		stage.setTitle("Application Title");
		stage.setScene(scene);

		stage.show();
	}

	public static void main (String[] args) {
		launch();
	}
}
