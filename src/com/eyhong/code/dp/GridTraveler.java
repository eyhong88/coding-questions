package com.eyhong.code.dp;

/**
 *  _ _ _
 * |S|_|_|
 * |_|_|E|
 *
 *  _ _ _
 * |S|_|_|
 * |_|_|_|
 * |_|_|E|
 * Start top left and end bottom right.
 * Down or Right ONLY.
 *
 */
public class GridTraveler {
    public static void main(String[] args){
        System.out.println(gridTravel(2,3));
    }

    public static int gridTravel(int down, int right){
        System.out.println(down + " " + right);
        if(down <= 1 && right <= 1)
            return 1;

        return gridTravel(down - 1, right) + gridTravel(down, right - 1);
    }
}

/*                      (3,3)
*           (2,3)                        (3,2)
*   (1,3)             (2,2)          (2,2)       (3,1)
*      (1,2)      (1,2)     (2,1)  (1,2)       (2,1)
*        (1,1)      (1,1) (1,1)      (1,1)  (1,1)
*
*
*                      (2,3)
*           (1,3)                   (2,2)
*               (1,2)         (1,2)         (2,1)
*                   (1,1)         (1,1) (1,1)
*
*/