package org.pw;

import com.apple.eawt.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import org.graalvm.compiler.phases.common.NodeCounterPhase;

public class App {

    @Override
    public void start(NodeCounterPhase.Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/main.fxml"));
        primaryStage.setScene(new Scene(root));
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main (String[] args ) {

    }
}
