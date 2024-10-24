// For 문을 이용해서 실행결과를 출력하는 코드를 작성하세요.

Public
class MiddleExam {

    Public
    static void main(String[] args){

                        



           // <----입력 칸---->



/* 결과:

*

**

***

****

*/ 


// 정답

for (int i = 1; i <= 4; i++){
    for (int j = 1; j<=i; j++){
        System.out.print('*');
    }
    System.out.println();
}