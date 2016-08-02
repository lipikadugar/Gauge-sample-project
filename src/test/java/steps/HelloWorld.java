package steps;

import com.thoughtworks.gauge.Step;

public class HelloWorld {
    @Step("Print Hello World")
    public void hello() {
        System.out.println("Hello World");
    }
}
