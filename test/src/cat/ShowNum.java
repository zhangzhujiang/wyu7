package cat;

public class ShowNum {
	public void show(int num) throws Exception {
		if(num < 0) {
		Exception me = new Exception("�쳣��" +
		num + "��������");
		throw(me);//�׳��쳣����������show()��ִ��
		}
		System.out.println(num);
		}


}
