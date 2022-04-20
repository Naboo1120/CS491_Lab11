public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new ObserverC(subject);
        new ObserverB(subject);
        new ObserverC(subject);

        subject.setMessage("Friday");
    }
}