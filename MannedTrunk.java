package dada;

public class MannedTrunk extends Car implements Load,Manned {
 private int people;
 private double load;
	public MannedTrunk(String name,double prise,int people,double load) {
	// TODO �Զ����ɵĹ��캯�����
	 super(name,prise);//���ø���Ĺ��췽��
	 this.people=people;
	 this.load=load;
	 }
 public String carry() {
	 return "���ˣ�"+people+"��"+" "+"���أ�"+load+"��";
 }
	@Override
	public int getterManned() {
		// TODO �Զ����ɵķ������
		return people;
	}

	
	@Override
	public double getterLoad() {
		// TODO �Զ����ɵķ������
		return load;
	}

	
	
	@Override
	public void setterManned(int Manned) {
		// TODO �Զ����ɵķ������
		this.people=Manned;
	}
	@Override
	public void setterLoad(double load) {
		// TODO �Զ����ɵķ������
		this.load=load;
	}

}
