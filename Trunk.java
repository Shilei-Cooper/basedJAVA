package dada;
public class Trunk extends Car implements Load {
	private double load;

	public Trunk(String name,double prise,double load) {
		// TODO �Զ����ɵĹ��캯�����
		super(name,prise);//���ø���Ĺ��췽��
		this.load=load;
	}
	@Override
	public String carry() {
		// TODO �Զ����ɵķ������
		return "���أ�"+load+"��";
	}
	@Override
	public double getterLoad() {
		// TODO �Զ����ɵķ������
		return load;
	}


	@Override
	public void setterLoad(double load) {
		// TODO �Զ����ɵķ������
		this.load=load;
	}



}
