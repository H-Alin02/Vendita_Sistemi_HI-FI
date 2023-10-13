public class FactoryCD implements AbstractFactorySupport{
    @Override
    public AbstractSupport usaSupport(){
        return new SupportCD();
    }

    @Override
    public AbstractPlayer playSupport() {
        return new PlayerCD();
    }

    @Override
    public AbstractRecord recordSupport() {
        return new RecordCD();
    }
}
