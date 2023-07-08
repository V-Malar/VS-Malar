class Reverse {
    public static void main(String[] args) {
        int number_in=1234;
        String reverse="";
        String number_out=String.valueOf(number_in);
        for (int i=number_out.length()-1;i>=0;i--)
        {
            reverse += number_out.charAt(i);
        }
        System.out.println(Integer.valueOf(reverse));
    }
}
