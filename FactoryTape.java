public class FactoryTape implements AbstractFactorySupport{
    @Override
    public AbstractSupport usaSupport(){
        return new SupportTape();
    }

    @Override
    public AbstractPlayer playSupport() {
        return new PlayerTape();
    }

    @Override
    public AbstractRecord recordSupport() {
        return new RecordTape();
    }
}
