package practice02;

import java.util.Random;
import java.util.Scanner;

public class Prob05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String ch = "n";
		
		do {
			Random rand = new Random();
			int randNum = rand.nextInt(100) + 1;
			
			int min = 1;
			int max = 100;
			int userNum = 0;
			int cnt = 1;

			System.out.println("수를 결정하였습니다. 맞추어 보세요");
			
			while(true) {
				System.out.println(min + "-" + max);
				
				System.out.print(cnt+">>");
				userNum = sc.nextInt();
				
				if(userNum == randNum) break;
				else if(userNum < randNum) {
					min = userNum;
					System.out.println("더 높게");
					cnt++;
				}
				else {
					max = userNum;
					System.out.println("더 낮게");
					cnt++;
				}
			}
			System.out.println("맞았습니다.");
			
			System.out.print("다시 하시겟습니까(y/n)>>");
			ch = sc.next();
			
		} while(ch.equals("y"));
	}

}
