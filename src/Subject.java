import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> observers = new ArrayList<Observer>();
    private String message;

    public String getMessage() {

        switch (message) {
            case "Monday" -> message = "Monday Message";
        }

        switch (message) {
            case "Tuesday" -> message = "Tuesday Message";
        }

        switch (message) {
            case "Wednesday" -> message = "Wednesday Message";
        }

        switch (message) {
            case "Thursday" -> message = "Thursday Message";
        }

        switch (message) {
            case "Friday" -> message = "Friday Message";
        }


        return message;
    }

    public void setMessage(String message) {
        this.message = message;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}