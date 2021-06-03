package com.string.solution;

/**
 * @Author pengweiwei
 * @Date 2021/6/3 22:55
 */
public class RobotReturnToOrigin {
    public static boolean judgeCircle(String moves) {
        int horizon = 0, vertical = 0;
        for (Character c : moves.toCharArray()) {
            switch (c) {
                case 'L':
                    horizon++;
                    break;
                case 'R':
                    horizon--;
                    break;
                case 'U':
                    vertical++;
                    break;
                case 'D':
                    vertical--;
                    break;
                default:
                    break;
            }
        }
        return horizon == 0 && vertical == 0;
    }

    public static void main(String[] args) {
        String moves1 = "UD";
        String moves2 = "LLD";
        System.out.println(judgeCircle(moves1));
        System.out.println(judgeCircle(moves2));
    }
}
