import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

//치훈이의 전공평점을 계산해주는 프로그램을 작성해보자.
//전공평점은 전공과목별 (학점 × 과목평점)의 합을 학점의 총합으로 나눈 값이다.
//인하대학교 컴퓨터공학과의 등급에 따른 과목평점은 다음 표와 같다.
//P/F 과목의 경우 등급이 P또는 F로 표시되는데, 등급이 P인 과목은 계산에서 제외해야 한다.
public class Main {
//	20줄에 걸쳐 치훈이가 수강한 전공과목의 과목명, 학점, 등급이 공백으로 구분되어 주어진다.
//	치훈이의 전공평점을 출력한다.
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Map<String, Double> score = new HashMap<>(); // hashmap
		String[] sc1 = { "A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F" }; // key
		double[] sc2 = { 4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0 }; // value
//		String valStr;
//		double val = 0;
		int totalG = 0; // 학점 총합
		double tot = 0; // 학점*과목평점 합
		for (int i = 0; i < sc1.length; i++) {
			score.put(sc1[i], sc2[i]);
//			valStr = score.get(sc1[i]);
//			val = Integer.parseInt(valStr); 개똥멍청이임 sc2 실수형타입으로 선언하면 되는데 str으로 선언해서 int형으로 바꾸려고 개뻘짓함 
		}
		// StringTokenizer st; //
		for (int i = 0; i < 20; i++) {

			String[] arr = bf.readLine().split(" "); // 공백기준으로 배열 분리함
			if (arr.length == 3) { // arr.length가 3까지 출력되야함 (과목 학점 등급)
				String sub = arr[0]; // 과목
				double cr = Double.parseDouble(arr[1]); // 학점(double형으로 바꿈)
				String gr = arr[2]; // 등급

				if (!arr[2].equalsIgnoreCase("P")) { // arr[2] ; 등급이 p가 아닐때
					double GradeP = score.getOrDefault(gr, 0.0); // gr의 value값 ; 값 없으면 default값 0으로 value값 반환
					totalG += cr; // 학점 총합
					tot += cr * GradeP; // 전공과목별 학점*과목평점의 합
				}
			}
		}
		double total = tot / totalG; // 전공평점 계산
		System.out.printf("%.6f", total);
	}
}