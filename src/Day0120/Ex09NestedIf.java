package Day0120;
// 중첩 if문(Nested if)
// 한개의 if block 안에
// 새로운 if block이 들어가는것을
// 중첩 if문이라고 한다.
import java.util.Scanner;
public class Ex09NestedIf {
 //   public static void main(String[] args) {
 //       int number =-5;
 //       if(number >= 0) {
 //           System.out.println("자연수입니다.");
 //           double d = 3.14;
 //           if(d==3.14) {
 //               System.out.println("d는 원주율입니다.");
 //           }
 //       }
  //  }
// 성별 - 나이 - 신체등급을 사용자에게 입력받아서
// 현역 - 공익 - 면제를 출력받으시오
    // 남자는 1 여자는 2로 입력받고 여성에게는 "현역판정불가"를 내리고
    // 성인이 아닌 사용자도 " 현역판정불가"를 내린다
    // 신체등급 1~3등급은 현역, 4등급 공익, 그 외 면제
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("성별을 입력해주세요 남자=1 여자=2: ");
        int gender = scanner.nextInt();
        if(gender == 1) {
            //남자이므로 나이를 입력받는다
            System.out.print("나이: ");
            int age = scanner.nextInt();
            
            if(age>18) {
                //성인이므로 신체등급을 입력받는다.
                System.out.print("신체등급: ");
                int category = scanner.nextInt();
                
                if(category <=3) {
                    System.out.println("현역입니다.");
                }else if (category == 4) {
                    System.out.println("공익입니다.");
                }else {
                    System.out.println("면제입니다.");
                }
               
            }else {
                //미성년자이므로 경고메세지만 출력한다.
                System.out.println("미성년자에게는 아직 신체등급을 부여되지 않습니다.");
            }
        }else {
            System.out.println("여성에게는 국방의 의무를 묻지 않습니다.");
            //여성이므로 메세지만 출력한다.
        }
        
        //System.out.print("성별을 입력해주세요 남자=1 여자=2: ");
        //int gender = scanner.nextInt();
        
        //if(gender == 1) {
        //            System.out.println("국방의 의무의 대상이 아닙니다.");
        //  if(gender == 2) {
        //      System.out.print("나이를 입력해주세요");
        //      int age = scanner.nextInt();
        //      if( age < 19) {
        //          System.out.println("현역 대상이 아닙니다.");
        //          System.out.print("신체등급: ");
        //          int level = scanner.nextInt();
        //          if(level < 3) { 
        //              System.out.println("현역");                           
        //          }else if(level == 4 ) {
        //              System.out.println("공익");
        //          }else {
        //              System.out.println("면제");
        //          }
        //      }
        //  }
        //}
        

       
 
        
        scanner.close();
        
        
    }
}
