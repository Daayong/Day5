package com.iu.s4;

import java.util.Scanner;

public class ArrayTest2 {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("시험 과목수를 입력하세요!");
		
		int num = sc.nextInt();
		
		int [] nums = new int[num];
		
		//각 인덱스 번호에 숫자 입력
		for(int i=0; i<nums.length; i++) {
			System.out.println(i+1+"번 점수 입력");
			nums[i]=sc.nextInt();
		}
		
		int total=0;
		for(int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
			total = total+nums[i];
		}
		
		//총점과 평균 출력
		double avg = total/(double)num;
		
		System.out.println("총점 :"+total);
		System.out.println("평균 :"+avg);
		
	}
}
