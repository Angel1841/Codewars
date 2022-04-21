public class CreditCardMask{
    public static String maskify(String str) {

        if(str.length() > 4){

            String swap = str.substring(0,str.length() - 4);

            StringBuilder masked = new StringBuilder();

            for (int i = 0; i < swap.length(); i++) {
                masked.append("#");
            }

            str = masked + str.substring(str.length() - 4);


            System.out.println(str);

        }else{
            System.out.println(str);
        }
        return str;
    }

}
