public class ObserverC extends Observer{

    public ObserverC(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Observer C received " + subject.getMessage());
    }
}