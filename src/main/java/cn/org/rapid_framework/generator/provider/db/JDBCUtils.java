package cn.org.rapid_framework.generator.provider.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @Description
 * @Author Administrator
 * @Date 2017/6/7
 */
public class JDBCUtils {

    public static Connection getConnection(String url, String username, String password) {
        Connection con = null;
        Properties props =new Properties();
        try {
            props.setProperty("user", username);
            props.setProperty("password", password);
            props.setProperty("remarks", "true"); //设置可以获取remarks信息
            props.setProperty("useInformationSchema", "true");//设置可以获取tables remarks信息
            con = DriverManager.getConnection(url, props);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }

}
