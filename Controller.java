//Arsoon Shiwani
package sample;

import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private ListView<Employee> employeeListView;
@FXML
private TextField firstNameTextField;
@FXML
private TextField lastNameTextField;
@FXML
private CheckBox isActiveCheckBox;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        employeeListView.getSelectionModel().selectedItemProperty().addListener((
                        ObservableValue< ? extends Worker> ov, Worker old_val, Worker new_val)->
        {
            Worker selectedItem = employeeListView.getSelectionModel().getSelectedItem();
            firstNameTextField.setText(((Employee)selectedItem).firstName);//try this in try and catch box
            lastNameTextField.setText(((Employee)selectedItem).lastName);
            isActiveCheckBox.setSelected(((Employee)selectedItem).isActive);//type casting
        }
        );

        ObservableList<Employee> items = employeeListView.getItems();
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        employee1.firstName = "Robert";
        employee1.lastName = "Smith";
        employee2.firstName = "Lisa";
        employee2.lastName = "Smith";


        items.add(employee1);
        items.add(employee2);


        for(int i = 0; i <10; i++)
        {
           Employee employee = new Employee();
           employee.firstName = "Generic";
           employee.lastName = "Employee" + " " + i;
           items.add(employee);
           employee.hire();
       }

        Staff Staff1 = new Staff();
        Staff1.firstName = "StaffPerson";
        Staff1.lastName = "GoodWorker";

        Faculty faculty1 = new Faculty();
        faculty1.firstName = "FacultyPerson";
        faculty1.lastName = "TerribleWorker";
        items.add(Staff1);
        items.add(faculty1);

    }
}
