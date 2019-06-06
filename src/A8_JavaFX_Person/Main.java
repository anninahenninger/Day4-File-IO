package A8_JavaFX_Person;
/**
 *  Write a Java JavaFX application that stores Person data in  a ListView and
 *     Stores the content of ListView (that are objects of type Person (name, surname, age) ) in a file persons.txt
 *     That reads (on a button click) that file, parses name, surname and age of each person, and stores them in a
 *     ListView
 *     Try to use a CRUD (create/read/update/delete) functionality from JavaFX GUI, and then try to save and load the
 *     data from a file
 */

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        ObservableList<Person> items = FXCollections.observableArrayList (
                new Person("Jenny", "Tang", 30),
                new Person("Annina", "Henninger", 37),
                new Person("Judith", "Lang-Ladurner", 41));

        ListView list = new ListView();
        list.setItems(items);

        Scene scene = new Scene(list, 800, 120);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        Application.launch(args);

        
    }
}
