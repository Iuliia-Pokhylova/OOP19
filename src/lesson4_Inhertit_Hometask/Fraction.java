//�������� ����� ����� (Fraction), 
//������ � ���� int ���������, int �����������.
//��������� ��������� ��������:
// - �������� ������ (����� Fraction add(Fraction frac))
// - ��������� (����� Fraction sub(Fraction frac))
// - ��������� (����� Fraction mul(Fraction frac))
// - ������� (����� Fraction div(Fraction frac))
// - ���������� � ������(����� String toString())
// - ����� (����� void print())
package lesson4_Inhertit_Hometask;

public class Fraction {
	private int numerator, denomenator;

	public Fraction() {
		this.numerator = (int) (Math.random() * 25 + 1);
		this.denomenator = (int) (Math.random() * 25 + 1);
	}

	public Fraction(int numerator, int denomenator) {
		this.numerator = numerator;
		this.denomenator = denomenator;
	}

	public Fraction add(Fraction frac) {
		int ch = this.numerator + frac.numerator * this.denomenator
				/ frac.denomenator;
		return new Fraction(ch, this.denomenator);
	}

	public Fraction sub(Fraction frac) {
		int ch = this.numerator - frac.numerator * this.denomenator
				/ frac.denomenator;
		return new Fraction(ch, this.denomenator);
	}

	public Fraction mul(Fraction frac) {
		int ch = this.numerator * frac.numerator;
		int zn = this.denomenator * frac.denomenator;
		return new Fraction(ch, zn);
	}

	public Fraction div(Fraction frac) {
		int ch = this.numerator * frac.denomenator;
		int zn = this.denomenator * frac.numerator;
		return new Fraction(ch, zn);
	}

	public String toString() {
		return this.numerator + "/" + this.denomenator;
	}

	public void print() {
		System.out.println(this.numerator + "/" + this.denomenator);
	}
}
