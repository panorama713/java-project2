package com.example.javaproject2.CodeUp;

import java.io.*;

public class CodeUp1084 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter((new OutputStreamWriter(System.out)));
        String str = br.readLine();
        int r = Integer.parseInt(str.split(" ")[0]);
        int g = Integer.parseInt(str.split(" ")[1]);
        int b = Integer.parseInt(str.split(" ")[2]);

        long beforeTime = System.currentTimeMillis(); //코드 실행 전에 시간 받아오기

        int cnt = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < g; j++) {
                for (int k = 0; k < b; k++) {
                    cnt++;
                    bw.write(i + " " + j + " " + k + "\n");
                }
            }
        }
        bw.write(String.valueOf(cnt));
        bw.flush();

        long afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
        long secDiffTime = (afterTime - beforeTime); //두 시간에 차 계산
        System.out.println(secDiffTime);
    }
}
