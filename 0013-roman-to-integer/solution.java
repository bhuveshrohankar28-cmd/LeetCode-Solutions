class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        int i = s.length() - 1;
        while (i >= 0) {
            char ele = s.charAt(i);
            if (ele == 'I') {
                i--;
                sum += 1;
            } else if (ele == 'V') {
                if (i > 0 && s.charAt(i - 1) == 'I') {
                    i = i - 2;
                    sum += 4;
                } else {
                    i--;
                    sum += 5;
                }

            } else if (ele == 'X') {
                if (i > 0 && s.charAt(i - 1) == 'I') {
                    i = i - 2;
                    sum += 9;
                } else {
                    i--;
                    sum += 10;
                }
            } else if (ele == 'L') {
                if (i > 0 && s.charAt(i - 1) == 'X') {
                    i = i - 2;
                    sum += 40;
                } else {
                    i--;
                    sum += 50;
                }
            } else if (ele == 'C') {
                if (i > 0 && s.charAt(i - 1) == 'X') {
                    i = i - 2;
                    sum += 90;
                } else {
                    i--;
                    sum += 100;
                }
            } else if (ele == 'D') {
                if (i > 0 && s.charAt(i - 1) == 'C') {
                    i = i - 2;
                    sum += 400;
                } else {
                    i--;
                    sum += 500;
                }
            } else if (ele == 'M') {
                if (i > 0 && s.charAt(i - 1) == 'C') {
                    i = i - 2;
                    sum += 900;
                } else {
                    i--;
                    sum += 1000;
                }
            }
        }
        return sum;
    }
}

