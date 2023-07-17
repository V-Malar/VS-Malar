public class Main{
public static void main(String argv[]){
Main s = new Main();
}
private Main(){
String s = "Marcus";
String s2 = new String("Marcus").intern();
if(s == s2){
System.out.println("we have a match");
}else{
System.out.println("Not equal" + s + " " + s2);
}
}
}
