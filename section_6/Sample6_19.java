//���v�E���ϕ\�쐬
import java.util.Scanner;

class Sample6_19{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int noClass;    //�N���X��
		int[][] point;  //���_
		int[] sum;      //�e�N���X�̍��v���_
		int sumAll = 0; //�w�N�̍��v���_
		int n = 0;      //�l��
		
		//�N���X������
		System.out.println("�w�N�ōs�����e�X�g�̍��v�_�E���ϓ_���v�Z����");
		System.out.print("�N���X���F"); noClass = scan.nextInt();
		
		//�N���X���Ƃ̐l��
		point = new int[noClass][];
		for(int i = 0; i < noClass; i++){
			System.out.print((i + 1) + "�g�̐l���F");
			point[i] = new int[scan.nextInt()];
		}
		
		//�_�����
		for(int i = 0; i < noClass; i++){
			for(int j = 0; j < point[i].length; j++){
				System.out.print((i + 1) + "�g" + (j + 1) + "�Ԃ̓_�� : ");
				point[i][j] = scan.nextInt();
			}
		}
		
		//���v���_
		sum = new int[noClass];
		for(int i = 0; i < noClass; i++){
			for(int j = 0; j < point[i].length; j++){
				sum[i] += point[i][j]; //�N���X����
				sumAll += point[i][j]; //�w�N
				n      += 1;           //�w�N�S�̂̐l��
			}
		}
		
		//�o��
		System.out.printf("  �g |%6s%6s\n","���v","����");
		System.out.println("----------------------");
		for(int i = 0; i < noClass; i++){
			System.out.printf("%2d�g |%8d%8.1f\n", (i + 1), sum[i],((double)sum[i] / point[i].length));
		}
		System.out.println("----------------------");
		System.out.printf("  �v |%8d%8.1f\n", sumAll, ( (double)sumAll / n));
	}
}