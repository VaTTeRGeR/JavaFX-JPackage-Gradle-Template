module ProjectModuleName {

	requires java.base;
	
	requires javafx.base;
	requires javafx.controls;
	requires javafx.fxml;
	requires transitive javafx.graphics;
	requires javafx.media;
	requires javafx.web;

	opens com.company.project to javafx.fxml;

	exports com.company.project;
}
