package com.systems.petrichor.carmenraptus;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class DownloaderApp extends Application {
    Stage stage;
    Scene scene;
    VBox root;


    public DownloaderApp() {
        root = new VBox();
    }

    @Override
    public void start(Stage stage) {
        // setup root
        root.getChildren().addAll();
        scene = new Scene(root);

        // setup stage
        this.stage = stage;
        stage.setTitle("Carmen Raptus");
        stage.setScene(scene);
        stage.setOnCloseRequest(event -> Platform.exit());
        stage.sizeToScene();
        stage.show();
    }

}
/*
18th, 4PM
18th, 10PM
19th, 4AM
19th, 10AM
19th, 4PM
19th, 10PM
20th, 7AM
20th, 1PM
20th, 7PM

*/

// Snatched from your Overlords.
