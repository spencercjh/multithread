/* 解方程。
给定一个字符串，代表一个 一元一次 方程。 如果有解求解，输出格式“x=数字” ，如果解的个数无穷，输出 “infinite solutions”。 如果 没有解输出“no solution”
字符串 长度不超过 256 。 样例：10x-2x-8=4x+7+x
输出:
x=5
*/
public class test2018_2 {
    private static int xLeftCoefficient = 0;
    private static int xRightCoefficient = 0;
    private static String leftConstantString = "", rightConstantString = "";

    public static void main(String[] args) {
        String equation = "2-3+1+10x+5-2x-8+3x+2=2+5-1+4x+7+x-10";
        String leftEquation = equation.substring(0, equation.indexOf('='));
        String rightEquation = equation.substring(equation.indexOf('=') + 1, equation.length());
        dealCoefficient(leftEquation, true);
        dealCoefficient(rightEquation, false);
        System.out.println(xLeftCoefficient);
        System.out.println(xRightCoefficient);
        System.out.println(leftConstantString);
        System.out.println(rightConstantString);
        int leftConstant = dealConstant(leftConstantString);
        int rightConstant = dealConstant(rightConstantString);
        System.out.println(leftConstant);
        System.out.println(rightConstant);
        xLeftCoefficient = xLeftCoefficient - xRightCoefficient;
        rightConstant = rightConstant - leftConstant;
        System.out.println("x=" + String.valueOf(rightConstant / xLeftCoefficient));
    }

    private static void dealCoefficient(String equation, boolean leftOrRight) {
        int begin = 0, xLocation, end = equation.length();
        while (begin < end) {
            begin = 0;
            xLocation = equation.indexOf('x');
            /*没有找到x，剩下的式子全是常数运算*/
            if (xLocation < begin) {
                if (leftOrRight) {
                    leftConstantString += equation;
                } else {
                    rightConstantString += equation;
                }
                return;
            }
            String frontNum = equation.substring(begin, xLocation);
            int frontNumber;
            /*x前的系数前还有常数运算 如1+10x*/
            if (frontNum.lastIndexOf('+') != -1 || frontNum.lastIndexOf('-') != -1) {
                int plusLocation = frontNum.lastIndexOf('+'), minusLocation = frontNum.lastIndexOf('-');
                if (plusLocation > minusLocation) {
                    if (leftOrRight) {
                        leftConstantString += frontNum.substring(0, frontNum.lastIndexOf('+'));
                    } else {
                        rightConstantString += frontNum.substring(0, frontNum.lastIndexOf('+'));
                    }
                    frontNum = frontNum.substring(frontNum.lastIndexOf('+'));
                } else if (minusLocation > plusLocation) {
                    if (leftOrRight) {
                        leftConstantString += frontNum.substring(0, frontNum.lastIndexOf('-'));
                    } else {
                        rightConstantString += frontNum.substring(0, frontNum.lastIndexOf('-'));
                    }
                    frontNum = frontNum.substring(frontNum.lastIndexOf('-'));
                } else if (plusLocation >= 0) {

                } else if (minusLocation >= 0) {

                }
            }
            /*x前系数为1 +x*/
            if (frontNum.charAt(frontNum.length() - 1) == '+') {
                frontNumber = 1;
                if (leftOrRight) {
                    leftConstantString += frontNum.substring(0, frontNum.length() - 1);
                } else {
                    rightConstantString += frontNum.substring(0, frontNum.length() - 1);
                }

            }
            /*x前系数为-1 -x*/
            else if (frontNum.charAt(frontNum.length() - 1) == '-') {
                frontNumber = -1;
                if (leftOrRight) {
                    leftConstantString += frontNum.substring(0, frontNum.length() - 1);
                } else {
                    rightConstantString += frontNum.substring(0, frontNum.length() - 1);
                }
            }
            /*x前的系数为正常整数*/
            else {
                frontNumber = Integer.parseInt(frontNum);
            }
            if (leftOrRight) {
                xLeftCoefficient += frontNumber;
            } else {
                xRightCoefficient += frontNumber;
            }
            begin = xLocation + 1;
            end = equation.length();
            equation = equation.substring(begin, end);
        }
    }

    private static int dealConstant(String formula) {
        int sum = 0;
        if (formula.charAt(0) != '+' && formula.charAt(0) != '-') {
            sum += Integer.parseInt(String.valueOf(formula.charAt(0)));
        }
        int begin = 0, end = formula.length();
        while (begin < end) {
            int plusLocation = formula.indexOf('+'), minusLocation = formula.indexOf('-');
            if ((plusLocation < minusLocation) && plusLocation != -1) {
                sum += Integer.parseInt(String.valueOf(formula.charAt(plusLocation + 1)));
                if (formula.substring(formula.indexOf('+') + 1).indexOf('+') == -1 && formula.substring(formula.indexOf('+') + 1).indexOf('-') == -1) {
                    return sum;
                }
                formula = formula.substring(formula.indexOf('+') + 2);
            } else if ((minusLocation < plusLocation) && minusLocation != -1) {
                sum -= Integer.parseInt(String.valueOf(formula.charAt(minusLocation + 1)));
                if (formula.substring(formula.indexOf('-') + 1).indexOf('+') == -1 && formula.substring(formula.indexOf('-') + 1).indexOf('-') == -1) {
                    return sum;
                }
                formula = formula.substring(formula.indexOf('-') + 2);
            } else if (plusLocation >= 0) {
                sum += Integer.parseInt(String.valueOf(formula.charAt(plusLocation + 1)));
                if (formula.substring(formula.indexOf('+') + 1).indexOf('+') == -1 && formula.substring(formula.indexOf('+') + 1).indexOf('-') == -1) {
                    return sum;
                }
                formula = formula.substring(formula.indexOf('+') + 2);
            } else if (minusLocation >= 0) {
                sum -= Integer.parseInt(String.valueOf(formula.charAt(minusLocation + 1)));
                if (formula.substring(formula.indexOf('-') + 1).indexOf('+') == -1 && formula.substring(formula.indexOf('-') + 1).indexOf('-') == -1) {
                    return sum;
                }
                formula = formula.substring(formula.indexOf('-') + 2);
            }
            end = formula.length();
        }
        return sum;
    }
}
