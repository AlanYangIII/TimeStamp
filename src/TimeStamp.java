import java.util.Scanner;

class Time {
    private long year1, month1, day1, hour1, min1, sec1;       ///时间转秒数用的东西

    private long sec2;      //秒数转时间用的秒数
    private long year2 = 1970, month2 = 1, day2 = 1;
    private long min2 = 0, hour2 = 8;

    public static long tempX = 0;

    public Time(long year, long month, long day, long hour, long min, long sec) {        //写时间转秒数的构造方法
        this.year1 = year;
        this.month1 = month;
        this.day1 = day;
        this.hour1 = hour;
        this.min1 = min;
        this.sec1 = sec;
    }

    public Time(long sec) {      //写秒数转时间的构造方法
        this.sec2 = sec;
        System.out.println();
    }

    public void TimeTransferSec() {

        long year, month, day, hour, min;
        long sec = 0;
        long temp1;
        long temp2;
        year = year1 - year2;
        month = month1 - month2;
        day = day1 - day2;
        hour = hour1;
        min = min1 - min2;      //分钟和秒数无需修改

        //起始时间为1970.1.1 00:00:00    最后减去8个小时的秒数！！！！！
        //365天=31536000
        //366天=31622400
        //3平+1闰=126230400

        if (year1 < 1972) {
            sec += year * 31536000;
            if (month == 0) {       //其为1月
                sec = sec + day * 86400 + hour * 3600 + min * 60 + sec1;
            } else if (month == 1) {     //其为2月
                sec = sec + (31 + day) * 86400 + hour * 3600 + min * 60 + sec1;
            } else if (month == 2) {     //3月
                sec = sec + (31 + 28 + day) * 86400 + hour * 3600 + min * 60 + sec1;
            } else if (month == 3) {     //其为4月
                sec = sec + (31 + 28 + 31 + day) * 86400 + hour * 3600 + min * 60 + sec1;
            } else if (month == 4) {
                sec = sec + (31 + 28 + 31 + 30 + day) * 86400 + hour * 3600 + min * 60 + sec1;
            } else if (month == 5) {
                sec = sec + (31 + 28 + 31 + 30 + 31 + day) * 86400 + hour * 3600 + min * 60 + sec1;
            } else if (month == 6) {
                sec = sec + (31 + 28 + 31 + 30 + 31 + 30 + day) * 86400 + hour * 3600 + min * 60 + sec1;
            } else if (month == 7) {
                sec = sec + (31 + 28 + 31 + 30 + 31 + 30 + 31 + day) * 86400 + hour * 3600 + min * 60 + sec1;
            } else if (month == 8) {
                sec = sec + (31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + day) * 86400 + hour * 3600 + min * 60 + sec1;
            } else if (month == 9) {
                sec = sec + (31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + day) * 86400 + hour * 3600 + min * 60 + sec1;
            } else if (month == 10) {
                sec = sec + (31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + day) * 86400 + hour * 3600 + min * 60 + sec1;
            } else if (month == 11) {
                sec = sec + (31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + day) * 86400 + hour * 3600 + min * 60 + sec1;
            }
            sec -= 28800;
            tempX = sec;


        } else if (year1 == 1972) {
            sec = 2 * 31536000;
            if (month == 0) {       //其为1月
                sec = sec + day * 86400 + hour * 3600 + min * 60 + sec1;
            } else if (month == 1) {     //其为2月
                sec = sec + (31 + day) * 86400 + hour * 3600 + min * 60 + sec1;
            } else if (month == 2) {     //3月
                sec = sec + (31 + 29 + day) * 86400 + hour * 3600 + min * 60 + sec1;
            } else if (month == 3) {     //其为4月
                sec = sec + (31 + 29 + 31 + day) * 86400 + hour * 3600 + min * 60 + sec1;
            } else if (month == 4) {
                sec = sec + (31 + 29 + 31 + 30 + day) * 86400 + hour * 3600 + min * 60 + sec1;
            } else if (month == 5) {
                sec = sec + (31 + 29 + 31 + 30 + 31 + day) * 86400 + hour * 3600 + min * 60 + sec1;
            } else if (month == 6) {
                sec = sec + (31 + 29 + 31 + 30 + 31 + 30 + day) * 86400 + hour * 3600 + min * 60 + sec1;
            } else if (month == 7) {
                sec = sec + (31 + 29 + 31 + 30 + 31 + 30 + 31 + day) * 86400 + hour * 3600 + min * 60 + sec1;
            } else if (month == 8) {
                sec = sec + (31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + day) * 86400 + hour * 3600 + min * 60 + sec1;
            } else if (month == 9) {
                sec = sec + (31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + day) * 86400 + hour * 3600 + min * 60 + sec1;
            } else if (month == 10) {
                sec = sec + (31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + day) * 86400 + hour * 3600 + min * 60 + sec1;
            } else if (month == 11) {
                sec = sec + (31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + day) * 86400 + hour * 3600 + min * 60 + sec1;
            }
            sec -= 28800;
            tempX = sec;

        } else {
            sec = sec + 2 * 31536000 + 31622400;

            temp1 = (year - 3) % 4;
            temp2 = (year - 3) / 4;       //有多少个4年

            sec += (temp2 * 126230400);

            ///剩余平年计算：
            sec += temp1 * 31536000;
            if (month == 0) {       //其为1月
                sec = sec + day * 86400 + hour * 3600 + min * 60 + sec1;
            } else if (month == 1) {     //其为2月
                sec = sec + (31 + day) * 86400 + hour * 3600 + min * 60 + sec1;
            } else if (month == 2) {     //3月
                sec = sec + (31 + 28 + day) * 86400 + hour * 3600 + min * 60 + sec1;
            } else if (month == 3) {     //其为4月
                sec = sec + (31 + 28 + 31 + day) * 86400 + hour * 3600 + min * 60 + sec1;
            } else if (month == 4) {
                sec = sec + (31 + 28 + 31 + 30 + day) * 86400 + hour * 3600 + min * 60 + sec1;
            } else if (month == 5) {
                sec = sec + (31 + 28 + 31 + 30 + 31 + day) * 86400 + hour * 3600 + min * 60 + sec1;
            } else if (month == 6) {
                sec = sec + (31 + 28 + 31 + 30 + 31 + 30 + day) * 86400 + hour * 3600 + min * 60 + sec1;
            } else if (month == 7) {
                sec = sec + (31 + 28 + 31 + 30 + 31 + 30 + 31 + day) * 86400 + hour * 3600 + min * 60 + sec1;
            } else if (month == 8) {
                sec = sec + (31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + day) * 86400 + hour * 3600 + min * 60 + sec1;
            } else if (month == 9) {
                sec = sec + (31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + day) * 86400 + hour * 3600 + min * 60 + sec1;
            } else if (month == 10) {
                sec = sec + (31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + day) * 86400 + hour * 3600 + min * 60 + sec1;
            } else if (month == 11) {
                sec = sec + (31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + day) * 86400 + hour * 3600 + min * 60 + sec1;
            }

            if (year1 % 4 == 0) {
                sec += 86400;
            }

            if ((year1 % 4 == 0 && month1 == 2 && day1 == 29) || (year1 % 4 == 0 && month1 == 2 && day1 == 28)) {
                sec -= 86400;
            }

            for (int i = 1970; i < year1; i++) {
                if (i % 4 == 0 && i % 100 == 0 && i % 400 != 0) {
                    sec -= 86400;
                }
            }

            sec -= 28800;

            tempX = sec;
        }
    }

    public void SecTransferTime() {

        long i = -1;
        if (sec2 >= 86400) {
            for (i = sec2; i >= 86400; i -= 86400) {
                day2++;
                sec2 -= 86400;
                if ((year2 % 4 == 0 && year2 % 100 != 0) || year2 % 400 == 0)   //闰年
                {
                    if (day2 == 30 && month2 == 2) {
                        month2++;
                        day2 = 1;
                    }
                    if (day2 == 31) {
                        if (month2 == 4 || month2 == 6 || month2 == 9 || month2 == 11) {
                            month2++;
                            day2 = 1;
                        }
                    }
                    if (day2 == 32) {
                        if (month2 == 12) {
                            month2 = 1;
                            year2++;
                            day2 = 1;
                        } else {
                            month2++;
                            day2 = 1;
                        }
                    }
                } else   //平年
                {
                    if (day2 == 29 && month2 == 2) {
                        day2 = 1;
                        month2++;
                    }
                    if (day2 == 31) {
                        if (month2 == 4 || month2 == 6 || month2 == 9 || month2 == 11) {
                            day2 = 1;
                            month2++;
                        }
                    }
                    if (day2 == 32) {
                        if (month2 == 12) {
                            month2 = 1;
                            day2 = 1;
                            year2++;
                        } else {
                            month2++;
                            day2 = 1;
                        }
                    }
                }
            }
        }

        //long temp = sec;   //剩余不到一天的秒数
        //起始时间08：00

        if (sec2 < 86400 && sec2 >= 3600) {
            for (i = sec2; i >= 3600; i -= 3600) {
                hour2++;
                sec2 -= 3600;
                if (hour2 == 24) {
                    hour2 = 0;
                    day2++;
                    if ((year2 % 4 == 0 && year2 % 100 != 0) || year2 % 400 == 0)   //闰年
                    {
                        if (day2 == 30 && month2 == 2) {
                            month2++;
                            day2 = 1;
                        }
                        if (day2 == 31) {
                            if (month2 == 4 || month2 == 6 || month2 == 9 || month2 == 11) {
                                month2++;
                                day2 = 1;
                            }
                        }
                        if (day2 == 32) {
                            if (month2 == 12) {
                                month2 = 1;
                                year2++;
                                day2 = 1;
                            } else {
                                month2++;
                                day2 = 1;
                            }
                        }
                    } else   //平年
                    {
                        if (day2 == 29 && month2 == 2) {
                            day2 = 1;
                            month2++;
                        }

                        if (day2 == 31) {
                            if (month2 == 4 || month2 == 6 || month2 == 9 || month2 == 11) {
                                day2 = 1;
                                month2++;
                            }
                        }
                        if (day2 == 32) {
                            if (month2 == 12) {
                                month2 = 1;
                                day2 = 1;
                                year2++;
                            } else {
                                month2++;
                                day2 = 1;
                            }
                        }

                    }
                }
            }
        }

        if (sec2 < 3600 && sec2 >= 60) {
            for (i = sec2; i >= 60; i -= 60) {
                min2++;
                sec2 -= 60;
            }
        }

        System.out.println("该秒数对应的时间为：" + year2 + "年" + month2 + "月" + day2 + "日" + hour2 + "时" + min2 + "分" + sec2 + "秒");
        System.out.println();

    }

}

public class TimeStamp {
    public static void main(String[] args) {
        int choice;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("请根据下列需要输入数字(1,2,3,4 ONLY),该程序可一直运行进行计算");
            System.out.println("1为具体时间转秒数");
            System.out.println("2为秒数转具体时间");
            System.out.println("3为时差计算");
            System.out.println("4为退出程序(邀请您最后按按4..)");
            choice = scan.nextInt();
            switch (choice) {
                case 1: {       //时间转秒数
                    System.out.println("请您依次输入数字对应 年，月，日，小时，分钟，秒数 (请在每一个数据输入完成后按一下回车 , 并且时间需晚于1970.1.1 08:00:00)");
                    long year = scan.nextLong();
                    long month = scan.nextLong();
                    long day = scan.nextLong();
                    long hour = scan.nextLong();
                    long min = scan.nextLong();
                    long sec = scan.nextLong();
                    Time t1 = new Time(year, month, day, hour, min, sec);
                    t1.TimeTransferSec();
                    System.out.println("\n该时间对应的秒数为:" + Time.tempX);
                    System.out.println();
                    break;
                }

                case 2: {       //秒数转时间
                    System.out.println("请您输入需要进行转换的秒数：");
                    long sec = scan.nextLong();
                    Time t2 = new Time(sec);
                    t2.SecTransferTime();
                    break;
                }

                case 3: {
                    System.out.println("请您输入需要计算时差的两个时间 (格式为：每输入一个年或月或日等数字按一下回车，输完一个时间后等待系统提示再输入下一个时间)");
                    long year1 = scan.nextLong();
                    long month1 = scan.nextLong();
                    long day1 = scan.nextLong();
                    long hour1 = scan.nextLong();
                    long min1 = scan.nextLong();
                    long sec1 = scan.nextLong();
                    System.out.println("请输入另一个时间:");
                    long year2 = scan.nextLong();
                    long month2 = scan.nextLong();
                    long day2 = scan.nextLong();
                    long hour2 = scan.nextLong();
                    long min2 = scan.nextLong();
                    long sec2 = scan.nextLong();
                    long temp1 = 0;
                    long temp2 = 0;
                    Time t3 = new Time(year1, month1, day1, hour1, min1, sec1);
                    t3.TimeTransferSec();
                    temp1 = Time.tempX;
                    Time t4 = new Time(year2, month2, day2, hour2, min2, sec2);
                    t4.TimeTransferSec();
                    temp2 = Time.tempX;

                    if (temp1 >= temp2) {
                        System.out.println("\n两时间的时差为" + (temp1 - temp2) + "秒\n");
                    } else {
                        System.out.println("\n两时间的时差为" + (temp2 - temp1) + "秒\n");
                    }
                    break;
                }
                case 4: {
                    System.out.println();
                    System.out.println("学长(姐),改作业辛苦了!谢谢您!!!");
                    return;
                }
                default: {
                    System.out.println();
                    System.out.println("请您在下面重新输入正确数字！");
                    System.out.println();
                    break;
                }
            }
        } while (true);
    }
}