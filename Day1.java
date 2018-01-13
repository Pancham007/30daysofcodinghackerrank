public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

int a;
double b;
String c,dog;
a=scan.nextInt();
i+=a;
b=scan.nextDouble();
d+=b;
c=scan.nextLine();
dog=scan.nextLine();
s=s.concat(dog);
System.out.println(i);
System.out.println(d);
System.out.println(s);

        scan.close();
    }
}