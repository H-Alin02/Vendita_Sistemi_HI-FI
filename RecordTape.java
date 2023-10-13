public class RecordTape implements AbstractRecord{
    public RecordTape(){
        this.record();
    }
    @Override
    public void record(){
        System.out.println("registrazione di un nuovo record sul tape!!");
    }
}
