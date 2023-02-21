public class DamageRate implements Observer{
    private DotCom dotCom = new DotCom();

    public void setDotCom(DotCom dotCom) {
        this.dotCom = dotCom;
    }
    public void update(){
        System.out.println("Damage rate of" + getName() + 100*(DotCom.size() - cells) / DotCom.size() % ));
    }

