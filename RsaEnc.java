package Archive;

import java.math.BigInteger;
import java.util.ArrayList;

public class RsaEnc {
    public static String rsaEncrypt(String msg ,int N , int e){
        String MSG = msg.toUpperCase();
        int msgIndex [] = new int[MSG.length()];
        String stringIndex [] = new String [MSG.length()];
        String concatIndex [] = new String[MSG.length()/2];
        long finalIndex [] = new long [MSG.length()/2];
        ArrayList<String> al = new ArrayList<>();
        BigInteger bigIngerIndex [] = new BigInteger[MSG.length()/2];
        BigInteger CX [] = new BigInteger[MSG.length()/2];
        BigInteger n = BigInteger.valueOf(N);

        for (int i = 0; i < MSG.length(); i++) {
            msgIndex[i] = (int) MSG.charAt(i);
            msgIndex[i]=msgIndex[i]-65;
            stringIndex[i] = Integer.toString(msgIndex[i]);
        }

        String x = String.join("",stringIndex);

        for (int i = 0; i < x.length(); i+=4){
            String part = x.substring(i,Math.min(x.length(),i+4));
            al.add(part);
        }

        for (int i = 0; i < concatIndex.length; i++) {
            concatIndex[i] = al.get(i);
        }


        for (int i = 0; i < finalIndex.length ; i++) {
            finalIndex[i] = Integer.parseInt(concatIndex[i]);
            bigIngerIndex[i] = BigInteger.valueOf(finalIndex[i]);
        }


        for (int i = 0; i < CX.length ; i++) {
            CX[i]= bigIngerIndex[i].pow(e).mod(n);
        }
        int holder [] = new int[CX.length];

        for (int i = 0; i < CX.length; i++) {
            holder[i] = CX[i].intValue();
        }
        String holder2 [] = new String[CX.length];
        for (int i = 0; i < holder.length; i++) {
            holder2[i] = String.valueOf(holder[i]);
        }
        String encryptedMsg = "" ;
        for (int i = 0; i < CX.length; i++) {
            encryptedMsg = encryptedMsg.concat(holder2[i]);
        }

        return encryptedMsg ;
    }


    public static void main(String[] args) {
        System.out.println(rsaEncrypt("UPLOAD",3233,17));

    }
}