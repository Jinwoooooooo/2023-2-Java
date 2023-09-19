<h1>1. 자바에서 클래스를 선언할 때 사용하는 자바의 키워드는?</h1>
<br>
<br>   A : public class
<br>
<h1>2. 다음은 10과 20을 더해 합을 출력하려고 작성한 자바 프로그램이지만 오류가 있다.</h1>
<br>
<br>   public class SampleProgram {
<br>       int i;
<br>       int j;
<br>       i = 10;
<br>       j = 20;
<br>       System.out.println(i+j);
<br>   }
<br>
<br>   (1) 오류를 찾아내어 고쳐라.
<br>    A : public class SampleProgram {
<br>          public static void main(String[] args) {
<br>      		   int i;
<br>      		   int j;
<br>      		   i = 10;
<br>      		   j = 20;
<br>      		   System.out.println(i+j);
<br>      	  }
<br>        }
<br>   (2) 이 자바 클래스를 저장하는 소스 파일 이름은 무엇인가?
<br>    A : SampleProgram
<br>   (3) 명령창에서 이 프로그램을 컴파일하는 명령은?
<br>    A : javac SampleProgram.java
<br>   (4) 명령창에서 이 프로그램을 실행하는 명령은?
<br>    A : java SampleProgram.java
<br>
<br><h1>3. 다음 중 식별자 사용이 잘못된 경우를 모두 골라라.</h1>
<br>   int _i;
<br>   int %j;
<br>   char 안녕;
<br>   double 1var;
<br>   char student_ID;
<br>   final int  abcdefghijklmnopqrstuvwxyz;
<br>
<br>   A : int %j; // %기호는 자바 식별자에 사용 불가능
<br>       double 1var; // 변수 이름은 숫자로 시작 불가능
<br>
<br><h1>4. 다음 각 항목이 나타내는 변수를 선언하라.</h1>
<br>   (1) int형 변수 height
<br>    A : int height;
<br>   (2) 0.25로 초기화된 double형 변수 size
<br>    A : double size = 0.25;
<br>   (3) height 변수의 값과 size 변수의 값을 더한 값으로 초기화된 double형 변수 total
<br>    A : double total = height + size;
<br>   (4) 문자 'a'로 초기화된 char형 변수 c
<br>    A : char c = 'a';
<br>   (5) 자신의 이름으로 초기화된 문자열 변수 name
<br>    A : String name = "정진우";
<br>
<br><h1>5. 다음 수식의 결과 값과 타입은?</h1>
<br>   (1) 67 + 12.8
<br>    A : 79.8 / double
<br>   (2) 10/3
<br>    A : 3 / int
<br>   (3) 10.0/3
<br>    A : 3.3333333333333335 / double
<br>   (4) 10==9
<br>    A : false / boolean
