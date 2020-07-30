package Archive;

import java.math.BigInteger;
import java.util.ArrayList;

public class RsaDec {
    public static String rsaDecrypt(String msg , int n ,int d){
        ArrayList<String> al = new ArrayList<>();
        ArrayList<Integer> alInt = new ArrayList<>();
        BigInteger index[] = new BigInteger[msg.length()/4];
        int finalIndex[] = new int[msg.length()/4];
        String holder [] = new String[finalIndex.length] ;
        BigInteger N = BigInteger.valueOf(n);
        BigInteger M;
        String msgString ="";
        ArrayList<String> stringcut = new ArrayList<>();
        for (int i = 0; i < msg.length(); i+=4) {
            String part = msg.substring(i,Math.min(msg.length(),i+4));
            al.add(part);
        }
        for (int i = 0; i < al.size(); i++) {
            alInt.add(Integer.parseInt(al.get(i)));
        }

        for (int i = 0; i < index.length; i++) {
            M = BigInteger.valueOf(alInt.get(i));
            index[i] = M.pow(d).mod(N) ;
            finalIndex [i] = index[i].intValue();
        }

        for (int i = 0; i < finalIndex.length; i++) {
            holder[i] = Integer.toString(finalIndex[i]);
        }
        for (int i = 0; i < holder.length; i++) {
            if(holder[i].length()%2==0){

            }else{
                holder[i] = "0".concat(holder[i]);
            }
        }
        for (int i = 0; i < holder.length; i++) {
            msgString = msgString.concat(holder[i]);
        }
        for (int i = 0; i < msgString.length(); i=i+2) {
            String part = msgString.substring(i,Math.min(msgString.length(),i+2));
            stringcut.add(part);
        }
        String finalStringCut [] = new String[stringcut.size()];
        for (int i = 0; i < stringcut.size(); i++) {
            finalStringCut[i] = stringcut.get(i);
        }
        int indexArr [] = new int[finalStringCut.length];
        for (int i = 0; i < finalStringCut.length; i++) {
            indexArr[i] = Integer.parseInt(finalStringCut[i]);
            indexArr[i]= indexArr[i]+65;
        }

        char charSec [] = new char[finalStringCut.length];

        for (int i = 0; i < finalStringCut.length; i++) {
            charSec[i] = (char) indexArr[i];
        }

        String decryptedMsg = new String(charSec);

        return decryptedMsg ;
    }

    public static void main(String[] args) {

        System.out.println(rsaDecrypt("066719470671",2537,937));
        System.out.println(rsaDecrypt("09810461",2537,937));
    }
}