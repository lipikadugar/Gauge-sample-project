package steps;

import com.thoughtworks.gauge.AfterScenario;
import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;
import com.thoughtworks.gauge.TableRow;

public class Greet {

    @Step("Say <greeting> to <product name>")
    public void helloWorld(String greeting, String name) {
        System.out.println(greeting + ", " + name);
    }

    @Step("Greet to many people <table>")
    public void stepWithTable(Table table) {
        System.out.println(table.getColumnNames());
        for (TableRow tableRow : table.getTableRows()) {
            System.out.println(tableRow.getCell("Greeting") + " " + tableRow.getCell("Person"));
        }
    }

    @AfterScenario
    public void contextStep() {
        System.out.println("Bye!! Bye!!");
    }
}