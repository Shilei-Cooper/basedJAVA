package dada;



public class Main {
	Input i=new Input();

	//int j1;
	//����һ�������͵�����
	public static final Car[] cars= {
			new MannedCar("�µ�A4", 500, 4),
			new MannedCar("���Դ�6", 400, 4),
			new MannedTrunk("Ƥ��ѩ6", 800, 4, 2),
			new MannedCar("����", 800, 20),
			new Trunk("�ɻ���", 400, 4),
			new Trunk("��ά��", 1000, 20)

	};
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		System.out.printf("��ӭ��ʹ��dada�⳵ϵͳ��%n���Ƿ�Ҫ�⳵��\r1����     0����\n");
		Main m1=new Main();
		m1.judge();
	}
	public void judge() {
		int j=i.input();

		if(j==1) {

			this.showTab();
		}else
			if(j==0){
				System.out.println("��ӭ���ٴ�ʹ�ñ�ϵͳ");
			}else {                                            //�����0��1ʱϵͳ�������
				while(j!=0 && j!=1) {
					System.out.println("����������0��1��лл");
					this.judge();
				}

			}

	}
	public void showTab(){
		System.out.printf("�����⳵�����ͼ����Ŀ��\r���\t��������\t���\t����\n");
		for(int j=0;j<cars.length;j++) {
			System.out.printf("%d\t%s\t%.2f\t%s%n",j+1,cars[j].getterName(),cars[j].getterPrise(),cars[j].carry());
		}

		System.out.println("�������������õ�����������");
		final int j=i.input();

		this.fewCars(j);
	}
	public void fewCars(final int j) {

		int few[]=new int[cars.length];
		for(int j1=0;j1<j;j1++) {
			System.out.printf("�������%d��������ţ�\n",j1+1);
			int num=i.input();
			if(num>=1&&num<=cars.length) {
				few[num-1]++;
			}else {
				System.out.println("��������������ʾ�ĳ�����ţ�лл��");

				this.fewCars(j);
				break;
			}

		}
		this.bill(few);
	}
	public void bill(int[] few) {
		System.out.println("�������⳵��������");
		final int day=i.input();
		double money=0.00;
		System.out.println("�����˵����£�");
		//������˵Ĳ���
		System.out.println("*****�����˵ĳ��У�*****");
		int seat=0;
		for(int i=0;i<few.length;i++) {
			if(few[i]!=0 && cars[i] instanceof Manned) {
				System.out.printf("%d��%s ",few[i],cars[i].getterName());
				seat+=((Manned)cars[i]).getterManned()*few[i];
				money+=cars[i].getterPrise()*few[i];
			}
		}
		System.out.printf("\t������:%d��\n",seat);
		//����ػ��Ĳ���
		System.out.println("*****���ػ��ĳ���:*****");
		int load=0;
		for(int i=0;i<few.length;i++) {
			if (few[i]!=0 && cars[i] instanceof Load) {
				System.out.printf("%d��%s ",few[i],cars[i].getterName());
				load+=((Load)cars[i]).getterLoad()*few[i];
				money+=cars[i].getterPrise()*few[i];
			}	
		}
		System.out.printf("\t���ػ�:%d��\n",load);
		System.out.printf("*****�⳵���ܼ۸�Ϊ��%.2fԪ*****",money);
	}
}



