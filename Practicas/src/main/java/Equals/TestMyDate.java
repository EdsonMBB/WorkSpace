package Equals;

public class TestMyDate {

           public static void main(String[] args) {

            MyDate m1 = new MyDate(2,8,2019);
            MyDate m2 = new MyDate(2,8,2019);
            MyDate m3 = null;

            if(m1==m2) {
                System.out.println("m1==m2");

            }else {
                System.out.println("m1!=m2");

            }

            if(m1.equals(m2)) {

                System.out.println("m1 is equal to m2");

            }else {

                System.out.println("m1 is not equal to m2");

            }

// Compare if m3 is equals to m1 or m2

            if(m1.equals(m3) || m2.equals(m3)) {

                System.out.println("m3 is equal to m1 or m2");

            }else {

                System.out.println("m3 is not equal to m1 or m2");

            }

        }

    }



    class MyDate{

        private int day;

        private int month;

        private int year;



        // Write the missing constructor here


        public MyDate(int day, int month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;
        }

        public int getDay() {

            return day;

        }

        public void setDay(int day) {

            this.day = day;

        }

        public int getMonth() {

            return month;

        }

        public void setMonth(int month) {

            this.month = month;

        }

        public int getYear() {

            return year;

        }

        public void setYear(int year) {

            this.year = year;

        }



        public boolean equals(Object obj) {

            if(this == obj) return true;
            if(obj instanceof MyDate) {
                MyDate mD = (MyDate) obj;
                return (this.day == mD.day&&this.month == mD.month && this.year== mD.year);
            }
            return false;

        }

    }

