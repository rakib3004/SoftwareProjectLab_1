package JavFX;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class StatisticsFX extends Application {


    @Override
    public void start(Stage primaryStage) {

        Button multiVariableRegression = new Button("MultiVariable Regression");
        Button analyticHierarchy = new Button("Analytic Hierarchy");
        Button pageRankAlgorithm = new Button("Page Rank Algorithm");


        multiVariableRegression.setTranslateX(500);
        multiVariableRegression.setTranslateY(250);
        analyticHierarchy.setTranslateX(500);
        analyticHierarchy.setTranslateY(350);
        pageRankAlgorithm.setTranslateX(500);
        pageRankAlgorithm.setTranslateY(450);


        multiVariableRegression.setOnAction(actionEvent -> {

            MultiVaribleRegressionFX multiVaribleRegressionFX = new MultiVaribleRegressionFX();
            try {

                multiVaribleRegressionFX.start(primaryStage);
            } catch (Exception exception) {
                exception.printStackTrace();
            }

        });
        analyticHierarchy.setOnAction(actionEvent -> {
            FxMainClass fxMainClass = new FxMainClass();
            try {
                fxMainClass.start(primaryStage);
            } catch (Exception exception) {
                exception.printStackTrace();
            }

        });
        pageRankAlgorithm.setOnAction(actionEvent -> {
            System.exit(0);


        });

        multiVariableRegression.setStyle("-fx-padding: 8 15 15 15;\n" +
                "    -fx-background-insets: 0,0 0 5 0, 0 0 6 0, 0 0 7 0;\n" +
                "    -fx-background-radius: 8;\n" +
                "    -fx-background-color: \n" +
                "        linear-gradient(from 0% 93% to 0% 100%, #8d9092 0%, #717375 100%),\n" +
                "        #8d9092,\n" +
                "        #717375,\n" +
                "        radial-gradient(center 50% 50%, radius 100%, #ffffff, #a1a3a6);\n" +
                "    -fx-effect: dropshadow( gaussian , rgba(0,0,0,0.75) , 4,0,0,1 );\n" +
                "    -fx-font-weight: bold;\n" +
                "    -fx-font-size: 2.1em;");

        pageRankAlgorithm.setStyle("-fx-padding: 8 15 15 15;\n" +
                "    -fx-background-insets: 0,0 0 5 0, 0 0 6 0, 0 0 7 0;\n" +
                "    -fx-background-radius: 8;\n" +
                "    -fx-background-color: \n" +
                "        linear-gradient(from 0% 93% to 0% 100%, #8d9092 0%, #717375 100%),\n" +
                "        #8d9092,\n" +
                "        #717375,\n" +
                "        radial-gradient(center 50% 50%, radius 100%, #ffffff, #a1a3a6);\n" +
                "    -fx-effect: dropshadow( gaussian , rgba(0,0,0,0.75) , 4,0,0,1 );\n" +
                "    -fx-font-weight: bold;\n" +
                "    -fx-font-size: 2.1em;");
        analyticHierarchy.setStyle("-fx-padding: 8 15 15 15;\n" +
                "    -fx-background-insets: 0,0 0 5 0, 0 0 6 0, 0 0 7 0;\n" +
                "    -fx-background-radius: 8;\n" +
                "    -fx-background-color: \n" +
                "        linear-gradient(from 0% 93% to 0% 100%, #8d9092 0%, #717375 100%),\n" +
                "        #8d9092,\n" +
                "        #717375,\n" +
                "        radial-gradient(center 50% 50%, radius 100%, #ffffff, #a1a3a6);\n" +
                "    -fx-effect: dropshadow( gaussian , rgba(0,0,0,0.75) , 4,0,0,1 );\n" +
                "    -fx-font-weight: bold;\n" +
                "    -fx-font-size: 2.1em;");

        multiVariableRegression.setPrefSize(350, 80);
        analyticHierarchy.setPrefSize(350, 80);
        pageRankAlgorithm.setPrefSize(350, 80);


        Image image = new Image("libraryBackground4.jpg");
        Canvas canvas = new Canvas(1500,950);
        Group group = new Group();
        group.getChildren().addAll(canvas,multiVariableRegression,pageRankAlgorithm,analyticHierarchy);

        GraphicsContext graphicsContext = canvas.getGraphicsContext2D();
        graphicsContext.drawImage(image,0,0);
      /*  HBox hBox = new HBox();
        hBox.getChildren().addAll(exit,menu,back);

    //    hBox.setSpacing(60);*/



      /*  VBox vBox3 = new VBox();
        vBox3.getChildren().addAll(vBox2,group);

        vBox3.setMaxSize(850, 650);
        vBox3.setSpacing(5);*/

        Scene scene1 = new Scene(group,1500,950);


        primaryStage.setScene(scene1);
        primaryStage.setTitle("Books Statistics");
        primaryStage.setFullScreen(true);
        primaryStage.show();


    }
}
