package dada;
public class MannedCar extends Car implements Manned {
	private int manned;
	public MannedCar(String name,double prise,int people) {
		super(name,prise);//���ø���Ĺ��췽��
		this.manned=people;
	}
	@Override
	public String carry() {
		// TODO �Զ����ɵķ������
		return "����:"+manned+"��";
	}

	@Override
	public int getterManned() {
		// TODO �Զ����ɵķ������
		return manned;
	}

	@Override
	public void setterManned(int manned) {
		// TODO �Զ����ɵķ������
		this.manned=manned;
	}
	
	

}
