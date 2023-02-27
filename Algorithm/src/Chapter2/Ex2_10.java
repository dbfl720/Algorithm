package Chapter2;

import java.util.Scanner;

// 클래스에서 배열 구현하기
		// 신체검사 데이터용 클래스 배열에서 평균 키와 시력의 분포를 구함
		
		class PhysicalExamination {
			static final int VMAX = 21;  // 시력 분포(0.0 ~ 0.1~ 단위로 21개)
			
			static class PhyscData {
				String name;
				int height;
				double vision;
				
				//생성자
				
				PhyscData(String name, int height, double vision) {
					this.name = name;
					this.height = height;
					this.vision = vision;
				}
			}
			
			
			// 키와 평균값을 구함
			static double aveHeight(PhyscData[] dat) {
				double sum = 0;
				
				for (int i = 0; i < dat.length; i++) 
					sum += dat[i].height;
				
				return sum / dat.length;
			}
			
			
			// 시력 분포를 구함
			static void distVision(PhyscData[] dat, int[] dist) {
				int i = 0;
				dist[i] = 0;
				for(i = 0; i < dat.length; i++)
					if(dat[i].vision >= 0.0 && dat[i].vision <= VMAX / 10.0)
						dist[(int)(dat[i].vision * 10)]++;
			}
			
			
			
			

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
	
		PhyscData[] x = {
				new PhyscData("강민하", 162, 0.3),
				new PhyscData("강민하", 162, 0.4),
				new PhyscData("강민하", 162, 0.5),
				new PhyscData("강민하", 162, 0.6),
				new PhyscData("강민하", 162, 0.7),
				new PhyscData("강민하", 162, 0.8),
				
				
		};
		
		int[] vdist = new int[VMAX];  // 시력 분포  ?? 
		
		System.out.println("신체검사 리스트");
		System.out.println("이름   키     시력");
		for( int i = 0; i < x.length; i++)
			System.out.printf("%-8s%3d%5.1f\n", x[i].name, x[i].height, x[i].vision);
			System.out.printf("\n 평균키: %5.1fcm\n", aveHeight(x));
		
			distVision(x, vdist); // 시력 분포를 구함
			
			System.out.println("시력 분포");
			for(int i = 0; i < VMAX; i++)
				System.out.printf("%3.1f~: %2d명\n", i / 10.0, vdist[i]);
	
	} // main
} // PhyscialExamination 