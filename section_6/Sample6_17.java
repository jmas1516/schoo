//�p��A���w���ϓ_
import java.util.Scanner;
class Sample6_17{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int n = 6; //���k��
		int[][] point = new int[n][2];
		
		//�_������
		for(int i = 0; i < n; i++){
			System.out.println((i+1) + "�l��");
			
			for(int j = 0; j < 2; j++){
				if(j == 0) System.out.print("����̓_�� : ");
				else       System.out.print("���w�̓_�� : ");
				point[i][j] = scan.nextInt();
			}
		}
		
		//�Ȗڂ̕��ϓ_
		int[] sumStu = new int[n]; //�w���̍��v�_
		int sumLan = 0; //����̍��v�_
		int sumMat = 0; //���w�̍��v�_
		
		for(int i = 0; i < n; i++){
			for(int j = 0; j < 2; j++){
				sumStu[i] += point[i][j];
				if(j == 0) sumLan += point[i][j];
				if(j == 1) sumMat += point[i][j];
			}
		}
		
		//�o��
		System.out.println("       ���ϓ_ ");
		System.out.printf ("����   %4.1f\n", (sumLan / 6.0));
		System.out.printf ("���w   %4.1f\n", (sumMat / 6.0));
		System.out.println();
		for(int i = 0; i < n; i++)
			System.out.printf((i+1) + "�l��  %4.1f\n", (sumStu[i] / 2.0));
	}
}