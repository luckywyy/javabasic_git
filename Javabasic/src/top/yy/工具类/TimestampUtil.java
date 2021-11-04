package top.yy.工具类;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;


public class TimestampUtil {
    /**
     * 获取当前时间的Timestamp
     * @return
     */
    public static Timestamp getNowTimestamp(){
        String time_pattern = "yyyy-MM-dd HH:mm:ss.SSS";
        DateFormat dateFormat = new SimpleDateFormat(time_pattern);
        Date date = new Date();
        System.out.println(dateFormat.format(date));
        return Timestamp.valueOf(dateFormat.format(date));
    }

    /**
     * 给指定秒数后的日期 用于设置过期时间
     * @param seconds
     * @return
     */
    public static Timestamp getNowTimeAddSeconds(int seconds) {
        Calendar calendar = Calendar.getInstance();
        String time_pattern = "yyyy-MM-dd HH:mm:ss.SSS";
        DateFormat dateFormat = new SimpleDateFormat(time_pattern);
        Date date = new Date();
        calendar.setTime(date);
        calendar.add(Calendar.SECOND, seconds);
        return Timestamp.valueOf(dateFormat.format(calendar.getTime()));

    }

    /**
     * 返回指定秒数后的时间 Date类
     * @param seconds
     * @return
     */
    public static Date getNowTimeAddSecondsCastToDate(int seconds) {
        Calendar calendar = Calendar.getInstance();
        String time_pattern = "yyyy-MM-dd HH:mm:ss.SSS";
        DateFormat dateFormat = new SimpleDateFormat(time_pattern);
        Date date = new Date();
        calendar.setTime(date);
        calendar.add(Calendar.SECOND, seconds);

        return calendar.getTime();

    }

    /**
     * 转换Date到Timestamp
     * @param date
     * @return
     */
    public static Timestamp dateCastToTimestamp(Date date) {
        String time_pattern = "yyyy-MM-dd HH:mm:ss.SSS";
        DateFormat dateFormat = new SimpleDateFormat(time_pattern);
        return Timestamp.valueOf(dateFormat.format(date));
    }

    /**
     * 比较两个Timestamp的大小
     * 传入现在时间和期望的时间
     * 如果小于 返回 true 表示没过期
     * 如果大于 返回false 表示已过期
     * @param now
     * @param expected
     * @return
     */
    public static Boolean compareTimestamp(Timestamp now, Timestamp expected) {
        return now.before(expected);
    }

    /**
     * 获取一个随机的sha256字符串
     * @return
     */
    public static String getRandomSHA256Str() {

        return "";
    }

}
