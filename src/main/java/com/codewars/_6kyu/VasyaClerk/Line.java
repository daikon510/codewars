package com.codewars._6kyu.VasyaClerk;

import java.util.Arrays;

class Line {
    static String Tickets(int[] peopleInLine) {
        return Arrays.stream(peopleInLine).boxed()
                .reduce(
                        new Clerk(0, 0, 0, false),
                        Clerk::receive,
                        (a, b) -> null
                ).check();
    }

    static class Clerk {
        int HANDS_25;
        int HANDS_50;
        int HANDS_100;
        boolean ERROR_FLAG;

        public Clerk(int _25, int _50, int _100, boolean error) {
            HANDS_25 = _25;
            HANDS_50 = _50;
            HANDS_100 = _100;
            ERROR_FLAG = error;
        }

        String check() {
            return ERROR_FLAG ? "NO" : "YES";
        }

        public void set25(int i) {
            this.HANDS_25 = i;
        }

        public void set50(int i) {
            this.HANDS_50 = i;
        }

        public void set100(int i) {
            this.HANDS_100 = i;
        }

        public void setFlag(boolean f) {
            this.ERROR_FLAG = f;
        }

        Clerk receive(Integer bill) {
            if (bill == 25) {
                set25(HANDS_25 + 1);
            } else if (bill == 50 && HANDS_25 > 0) {
                set25(HANDS_25 - 1);
                set50(HANDS_50 + 1);
            } else if (HANDS_25 > 0 && HANDS_50 > 0) {
                set25(HANDS_25 - 1);
                set50(HANDS_50 - 1);
                set100(HANDS_100 + 1);
            } else if (HANDS_25 >= 3 && HANDS_50 == 0) {
                set25(HANDS_25 - 3);
                set100(HANDS_100 + 1);
            } else {
                setFlag(true);
            }
            return this;
        }
    }
}