public class Main {
    public void Pr1(String s){
        int count = 0;
        for (int i=0; i<s.length(); i++) {
            if (Character.isDigit(s.charAt(i))){
                count++;
            }
        }
        if (count>8){
            System.out.println("PDP");
        }else {
            System.out.println("ACADEMY");
        }
    }
    public int Pr2(String s){
        int sum = 0;
        for (int i=0; i<s.length(); i++) {
            if (Character.isDigit(s.charAt(i))){
                sum += s.charAt(i)-'0';
            }
        }
        return sum;
    }
    public boolean Pr3(int year){
        return year%400==0 || (year%4==0 && year%100!=0);
    }
    public void Pr4(String str){
        int digits = 0;
        int lowercase = 0;
        int uppercase = 0;
        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (Character.isDigit(ch)){
                digits++;
            } else if (Character.isLowerCase(ch)){
                lowercase++;
            } else if (Character.isUpperCase(ch)){
                uppercase++;
            }
        }
        System.out.println("Digits: " + digits);
        System.out.println("Lowercase: " + lowercase);
        System.out.println("Uppercase: " + uppercase);
    }
    public boolean Pr5(int n){
        int sum = 0;
        for (int i=1; i<n; i++){
            if (n%i==0){
                sum +=i;
            }
        }
        return sum == n;
    }
    public String Pr6(String str){
        String result = "";
        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)){
                result += Character.toLowerCase(ch);
            } else if (Character.isLowerCase(ch)){
                result += Character.toUpperCase(ch);
            } else {
                result += ch;
            }
        }
        return result;
    }
    public boolean Pr7(String password){
        boolean hasLowercase = false;
        boolean hasStar = false;
        boolean hasDigit = false;
        if (password.length()<8){
            return false;
        }
        for (int i=0; i<password.length(); i++){
            char ch=password.charAt(i);
            if (Character.isLowerCase(ch)){
                hasLowercase =true;
            }
            if (ch=='*'){
                hasStar=true;
            }
            if (Character.isDigit(ch)){
                hasDigit =true;
            }
        }
        return hasLowercase && hasStar && hasDigit;
    }
    public String Pr8(String str){
        String result = "";
        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)){
                result += "*";
            } else {
                result += ch;
            }
        }
        return result;
    }
    public void Pr9(double a, double b){
        double c = Math.sqrt(a*a+b*b);
        double area = (a*b)/2;
        double perimeter = a+b+c;
        System.out.println("Hypotenuse: " + c);
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
    public int Pr10(String str){
        int count = 0;
        for (int i=0; i<str.length(); i++){
            if (Character.isLetter(str.charAt(i))){
                count++;
            }
        }
        return count;
    }
    public boolean Pr11(int n){
        if (n<0){
            return false;
        }
        for (int i=0; i*i<=n; i++){
            if (i*i==n){
                return true;
            }
        }
        return false;
    }
    public String Pr121(String str){
        String result = "";
        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (!Character.isLetter(ch)){
                result += ch;
            }
        }
        return result;
    }
    public int Pr122(int s, int n){
        int result = 1;
        for (int i=1; i<=n; i++){
            result *= s;
        }
        return result;
    }
    public void Pr13(int n, int k){
        int whole = 0;
        int remainder = n;
        while (remainder>=k){
            remainder-=k;
            whole++;
        }
        System.out.println("Whole = " + whole);
        System.out.println("Remainder = " + remainder);
    }
    public String Pr14(String str){
        String result = "";
        for (int i=str.length()-1; i>=0; i--){
            result += str.charAt(i);
        }
        return result;
    }
    public void Pr15(String str){
        int uppercase = 0;
        int lowercase = 0;
        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)){
                uppercase++;
            } else if (Character.isLowerCase(ch)){
                lowercase++;
            }
        }
        if (uppercase>lowercase){
            System.out.println("PDP");
        } else {
            System.out.println("ACADEMY");
        }
    }
    public boolean Pr16(int a, int b){
        return a==7 || b==7 || a+b==7 || a-b==7 || b-a==7;
    }
    public String Pr17(String str){
        String result = "";
        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (!Character.isDigit(ch)){
                result += ch;
            }
        }
        return result;
    }
}