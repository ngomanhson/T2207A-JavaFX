import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{ //Bao rang khu vuc nay  co ngoai le
        //ThongTin
//        Parent root = FXMLLoader.load(getClass().getResource("thongtin.fxml"));
//        primaryStage.setScene(new Scene(root, 600, 600));
//        primaryStage.show();

        //DanhSach
//        Parent thu = FXMLLoader.load(getClass().getResource("guithu.fxml"));
//        primaryStage.setScene(new Scene(thu, 600, 600));
//        primaryStage.show();

        //DanhBa
        Parent thu = FXMLLoader.load(getClass().getResource("danhba.fxml"));
        primaryStage.setScene(new Scene(thu, 600, 600));
        primaryStage.show();
    }
}
