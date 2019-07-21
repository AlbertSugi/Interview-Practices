
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;




public class hourGlass {



        // Complete the hourglassSum function below.
        public int hourglassSum(int[][] arr) {

            int answer = 0;


            for(int x = 0;x<4;x++){
                for(int y = 0;y<4;y++){

                    int pos1 = arr[x][y];
                    int pos2 = arr[x][y+1];
                    int pos3 = arr[x][y+2];
                    int pos4 = arr[x+1][y+1];
                    int pos5 = arr[x+2][y];
                    int pos6 = arr[x+2][y+1];
                    int pos7 =arr[x+2][y+2];

                    int curr = pos1+pos2+pos3+pos4+pos5+pos6+pos7;

                    if(curr>answer){
                        answer =curr;
                    }
                }
            }

            return answer;


        }




        public static void main(String[] args) {
            hourGlass hourGlass = new hourGlass();
            int[][] arr = new int [][]{{-9 ,-9, -9 , 1 ,1 ,1 },{0 ,-9 , 0 , 4 ,3 ,2},{-9 ,-9 ,-9 , 1, 2 ,3},{0,0,8 ,6,6,0},{0,0,0,-2,0,0},{0,0,1,2,4,0}};
            System.out.print(hourGlass.hourglassSum(arr));
        }
    }


