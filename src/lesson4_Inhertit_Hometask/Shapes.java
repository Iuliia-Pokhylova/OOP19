package lesson4_Inhertit_Hometask;

public abstract class Shapes {

	private static int shapesCount = 0;
//
//	public Shapes() {
//		shapesCount++;
//	}

	public static int getCount() {
		return shapesCount;
	}

	public abstract double square(); /*{
		System.out.println("������� �����? :)");
		return 0;
	}*/

	public abstract double perimetr(); /*{
		System.out.println("�������� �����? :)");
		return 0;
	}*/

	public abstract void about();/* {
		System.out.println(" � � ������ Shape ");
	}*/
}
