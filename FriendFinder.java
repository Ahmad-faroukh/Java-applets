package Archive;

public class FriendFinder {
    public static int friendCount(boolean array [][]){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <array.length ; j++) {
                if(array[i][j] && array[j][i]){
                    count++;
                }
            }
        }
        return count;
    }

    public static boolean friendsInCommon(boolean array [][],int i ,int j){
     boolean flag = false ;
        for (int x = 0; x < array.length; x++) {
            if(array[i][x] && array[x][i] && array[j][x] && array[x][j] ){
                flag = true ;
            }
        }
     return flag ;
    }
    public static boolean map [][] = new boolean[5][5];

    public static void main(String[] args) {
        map[0][1] = true ;
        map[0][3] = true ;
        map[0][4] = true ;
        map[1][0] = true ;
        map[1][2] = true ;
        map[1][4] = true ;
        map[2][1] = true ;
        map[3][0] = true ;
        map[3][4] = true ;
        map[4][3] = true ;
        map[4][1] = true ;
        map[4][0] = true ;
        System.out.print("Number of friends in this array ");
        System.out.println(friendCount(map));
        System.out.print("Number of friend pairs in the array ");
        System.out.println(friendCount(map)/2);

        System.out.println(friendsInCommon(map,0,4));// 0 and 4 have a common friend
        System.out.println(friendsInCommon(map,1,2));// 1 and 2 have no common friends
    }
}