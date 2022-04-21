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


//Usually when you buy something, you're asked whether your credit card number, phone number or answer to your most secret
//question is still correct. However, since someone could look over your shoulder, you don't want that shown on your screen.
//Instead, we mask it. Your task is to write a function maskify, which changes all
//but the last four characters into '#'.
