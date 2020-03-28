package JavFX;
import MainPackage.Processing;
import ObjectOriented.BookData;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.chart.*;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FxMainClass extends Application {
    int x = 0;
    public static void main(String[] args) throws IOException
    {
        Processing processing = new Processing();
        processing.fileReader();
       // Application.launch(args);
    }
    @Override
    public void start (Stage stage) throws IOException {

        Label label = new Label("\t\"Recommendation Tool for Library Management\"");
  
        Font font = Font.font("Verdana", FontWeight.EXTRA_BOLD, 25);
        Font font1 = Font.font("Verdana", FontWeight.BOLD, 15);

        label.setFont(font);
        label.setStyle("-fx-body-color: white;");
        Label label2 = new Label("\t\t\t\t\t\"All Statistical Analysis For Library Books\"");
label2.setFont(font1);
        VBox vBox2 = new VBox();
        vBox2.getChildren().addAll(label,label2);



     //   vBox.setMinSize(550, 650);
           vBox2.setSpacing(5);

        vBox2.setStyle("-fx-padding: 5;" +
                "-fx-border-style: inset;" +
                "-fx-border-width: 2;" +
                "-fx-border-insets: 5;" +
                "-fx-border-radius: 0;" +
                "-fx-border-color: white;" +
                "-fx-background-color: lime;");

        // Create the Scene

        // Create the Scene

        CategoryAxis categoryAxis = new CategoryAxis();
        categoryAxis.setLabel("Destination");

        NumberAxis numberAxis = new NumberAxis();
        numberAxis.setLabel("No. of Train");

        BarChart barChart = new BarChart(categoryAxis,numberAxis);

        XYChart.Series series1 = new XYChart.Series();
        series1.setName("Train");

        series1.getData().add(new XYChart.Data("Mohanganj",3));
        series1.getData().add(new XYChart.Data("Deyanganj",5));
        series1.getData().add(new XYChart.Data("Chattragam",7));

        barChart.getData().add(series1);

        XYChart.Series series2 = new XYChart.Series();
        series2.setName("Station");

        series2.getData().add(new XYChart.Data("Mohanganj",17));
        series2.getData().add(new XYChart.Data("Deyanganj",23));
        series2.getData().add(new XYChart.Data("Chattragam",38));

        barChart.getData().add(series2);

        XYChart.Series series3 = new XYChart.Series();
        series3.setName("Passengers");

        series3.getData().add(new XYChart.Data("Mohanganj",27));
        series3.getData().add(new XYChart.Data("Deyanganj",30));
        series3.getData().add(new XYChart.Data("Chattragam",18));

        barChart.getData().add(series3);


        XYChart.Series series4 = new XYChart.Series();
        series4.setName("Distance");

        series4.getData().add(new XYChart.Data("Mohanganj",37));
        series4.getData().add(new XYChart.Data("Deyanganj",25));
        series4.getData().add(new XYChart.Data("Chattragam",12));

        barChart.getData().add(series4);

 XYChart.Series series5 = new XYChart.Series();
        series5.setName("Distance");

        series5.getData().add(new XYChart.Data("Mohanganj",37));
        series5.getData().add(new XYChart.Data("Deyanganj",25));
        series5.getData().add(new XYChart.Data("Chattragam",12));

        barChart.getData().add(series5);






        PieChart pieChart = new PieChart();

        PieChart.Data slice1 = new PieChart.Data("Golpo", 23);
        PieChart.Data slice2 = new PieChart.Data("Kobita"  , 17);
        PieChart.Data slice3 = new PieChart.Data("Kisore Uponnash" , 36);
        PieChart.Data slice4 = new PieChart.Data("Romantic Uponnash" , 26);
        PieChart.Data slice5 = new PieChart.Data("History" , 14);
        PieChart.Data slice6 = new PieChart.Data("General Knowledge" , 17);
        PieChart.Data slice7 = new PieChart.Data("Science Fiction" , 9);
        PieChart.Data slice8 = new PieChart.Data("Probondho" , 33);
        PieChart.Data slice9 = new PieChart.Data("Rocona Somogro" , 26);

        pieChart.getData().add(slice1);
        pieChart.getData().add(slice2);
        pieChart.getData().add(slice3);
        pieChart.getData().add(slice4);
        pieChart.getData().add(slice5);
        pieChart.getData().add(slice6);
        pieChart.getData().add(slice7);
        pieChart.getData().add(slice8);
        pieChart.getData().add(slice9);

        HBox hBox1 = new HBox(barChart,pieChart);
;


        TableView tableView = new TableView();

        TableColumn<String, BookData> column0 = new TableColumn<>("Serial No");
        column0.setCellValueFactory(new PropertyValueFactory<>("SerialNo"));

        TableColumn<String, BookData> column1 = new TableColumn<>("Book Name");
        column1.setCellValueFactory(new PropertyValueFactory<>("bookName"));


        TableColumn<String, BookData> column2 = new TableColumn<>("Writer Name");
        column2.setCellValueFactory(new PropertyValueFactory<>("WriterName"));

TableColumn<String, BookData> column3 = new TableColumn<>("Book ID");
        column3.setCellValueFactory(new PropertyValueFactory<>("bookId"));


        TableColumn<String, BookData> column4 = new TableColumn<>("Borrow Count");
        column4.setCellValueFactory(new PropertyValueFactory<>("BorrowCount"));

        TableColumn<String, BookData> column5 = new TableColumn<>("Book Price");
        column5.setCellValueFactory(new PropertyValueFactory<>("BookPrice"));


        tableView.getColumns().add(column0);
        tableView.getColumns().add(column1);
        tableView.getColumns().add(column2);
        tableView.getColumns().add(column3);
        tableView.getColumns().add(column4);
        tableView.getColumns().add(column5);

        File file = new File("IIT_SPL.txt");
        FileReader fr = new FileReader(file);
        char[] a = new char[120500];
        fr.read(a);


        // reads the content to the array
        String  bookName[] = new String[1050];
        String writerName[] = new String[1050];
        String bookId[] = new String[1050];


        String borrowCount[] = new String[1050];

        String bookPrice[] = new String[1050];



        bookName[x] = "\0";
        writerName[x] = "\0";
        bookId[x] = "\0";
        borrowCount[x] = "\0";
        bookPrice[x] = "\0";

        int t = 0;
        for (int i = 0; a[i] != '\0'; i++) {
            if (a[i] == '\t') {
                i++;
                t++;
                t = t % 5;
            }
            if (a[i] == '\n') {
                i++;
                t++;

                t = t % 5;
String p = ""+x;

                tableView.getItems().add(new BookData( p,bookName[x],  writerName[x], bookId[x], borrowCount[x],bookPrice[x]));

                x++;
                bookName[x] = "\0";
                writerName[x] = "\0";
                bookId[x] = "\0";

                borrowCount[x] = "\0";
                bookPrice[x] = "\0";

            }
            if (t == 0) {

                bookName[x] = bookName[x] + a[i];
            } else if (t == 1) {
                writerName[x] = writerName[x] + a[i];

            } else if (t == 2) {
                bookId[x] = bookId[x] + a[i];


            } else if (t == 3) {
                borrowCount[x] = borrowCount[x] + a[i];

            }
            else if(t==4){
                bookPrice[x]=bookPrice[x]+a[i];
            }
        }
        fr.close();






        VBox vBox3 = new VBox();
       vBox3.getChildren().addAll(vBox2,hBox1,tableView);

        vBox3.setMaxSize(850, 650);
        vBox3.setSpacing(5);

//scrollPane.pannableProperty().set(true);
//scrollPane.fitToHeightProperty().set(true);
//scrollPane.fitToWidthProperty().set(true);
//scrollPane.vbarPolicyProperty().setValue(ScrollPane.ScrollBarPolicy.NEVER);
        Scene scene1 = new Scene(vBox3,900,700);

        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setContent(vBox3);
// Add the scene to the Stage
        stage.setScene(scene1);
// Set the title of the Stage
        stage.setTitle("Books Statistics");
// Display the Stage
        stage.show();


    }


}