## Ex4 - 대소문자 바꿔서 출력하기

String이 내부적으로 `char 배열`을 사용하고 있으므로 각 char에 접근해서 `toLowerCase()`나 `toUpperCase()`를 사용하면 되겠다는 접근을 생각했다.

하지만 `toLowerCase()`나 `toUpperCase()`는 String의 메서드이고 메서드를 사용하기 전에 소문자인지 대문자인지 판별하는 방법에 대해서는 잘 떠오르지 않았다.

곰곰히 생각하다가 char는 int로 표현할 수 있다는 것이 떠올랐다.

그래서 A,Z,a,z의 아스키코드 값을 확인하고, A부터 Z의 아스키코드 값을 갖는 char는 32를 더하고 a부터 z의 아스키코드 값을 갖는 char는 32를 빼는 식으로 소문자/대문자 변환을 했다.

그리고 char 배열에 추가하여 새로운 String 객체를 생성하여 출력하도록 하였다.

내가 작성한 코드가 통과하긴했지만 다른 사람들의 풀이를 보면서 다음과 같은 점을 알 수 있었다.

1. char의 wrapper 클래스인 `Character`클래스에 소문자인지 대문자인지 판별할 수 있는 static 메서드가 있다.
```java
public static String changeCase2(String str) {  // Character 클래스를 이용한 풀이
    StringBuilder newStr = new StringBuilder();
    
    for (char c : str.toCharArray()) {
        if(Character.isLowerCase(c)) {
            newStr.append(Character.toUpperCase(c));
        } else if (Character.isUpperCase(c)) {
            newStr.append(Character.toLowerCase(c));
        }
    }
    
    return newStr.toString();
}
```
2. char를 아스키코드 값으로 비교해도 되지만 A,Z,a,z라는 문자로 비교하여도 된다.
```java
public static String changeCase3(String str) {  // 문자로 비교하는 풀이
    StringBuilder sb = new StringBuilder();

    for (char c : str.toCharArray()) {
        if(c >= 'A' && c <= 'Z') {
            sb.append((char) (c + 32));
        } else if (c >= 'a' && c <= 'z') {
            sb.append((char) (c - 32));
        }
    }

    return sb.toString();
}
```