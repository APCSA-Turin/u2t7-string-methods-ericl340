public class l3 {
    public static void main(String[] args) {
        CustomStringMethods methods = new CustomStringMethods();
        
        
        String str = methods.yellOrWhisper("Hello James!");
        System.out.println(str);
        str = methods.yellOrWhisper("hello James!");
        System.out.println(str);
        str = methods.yellOrWhisper("aBCDEFGHIJK");
        System.out.println(str);
        str = methods.yellOrWhisper("Abcdefghijk");
        System.out.println(str);
        str = methods.yellOrWhisper("B");
        System.out.println(str);
        str = methods.yellOrWhisper("b");
        System.out.println(str);
        str = methods.yellOrWhisper("IT'S SUNNY!");
        System.out.println(str);
        str = methods.yellOrWhisper("it's rainy");
        System.out.println(str);
        
    }
}
