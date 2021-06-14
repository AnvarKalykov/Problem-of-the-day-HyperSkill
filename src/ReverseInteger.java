public class ReverseInteger {
    public int reverse(int x) {
        String b = Integer.toString(x);
        char[] in =new char[b.length()];
        StringBuffer sb =new StringBuffer(b.length());;
        for(int i =0; i<b.length(); i++ ){
            in[i]=b.charAt(i);
            sb.append(in[i]);

        }
        try{
            String d="";
            String c = sb.reverse().toString();
            int intValue = 0 ;
            if(c.contains("-")){

                d =c.substring(0, c.length()-1);
                intValue = Integer.parseInt("-"+d);

            }else{

                intValue = Integer.parseInt(c);

            }
            return intValue;
        }catch(Exception e){
            return 0;

        }

    }
}