import java.util.Scanner;
public class l1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int score = 0;
        String str1;
        String str2;
        int temp;
        int cnt = 1;
        System.out.print("Enter first word: ");
        str2 = scan.nextLine();
        while (score < 50){
            str1 = str2;
            System.out.print("Enter next word: ");
            str2 = scan.nextLine();
            cnt++;
            temp = str1.compareTo(str2);
            if (temp < 0){
                score += 2;
                System.out.println("+2 points: current word alphabetically after; SCORE: " + score);
            }else if (temp > 0){
                score -= 5;
                System.out.println("-5 points: current word alphabetically before; SCORE: " + score);
            }else{
                score -= 10;
                System.out.println("-10 points: current word same as previous word; SCORE: " + score);
            }
            if (str1.substring(str1.length() - (str1.length() < 2 ? str1.length() : 2), str1.length()).equalsIgnoreCase(str2.substring(0, str2.length() > 2 ? 2 : str2.length()))){
                score += 5;
                System.out.println("+5 points: last 2 letters of previous word match first 2 letters of current; SCORE: " + score);
            }
            if (str2.toLowerCase().indexOf(str1.substring(0, 1).toLowerCase()) >= 0){
                score += 3;
                System.out.println("+3 points: first letter of previous word found in current word; SCORE: " + score);
            }
            if (str1.length() == str2.length()){
                score += 2;
                System.out.println("+2 points: current word and previous word same length; SCORE: " + score);
            }
        }
        System.out.println("You win! It took you " + cnt + " words! Try again for a lower word count :)");
    }
}