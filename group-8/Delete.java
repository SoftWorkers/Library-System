import bb.DBconnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {
    public void delete(String name) {
        Connection connection = DBconnection.getConnection();
        PreparedStatement statement1 = null;
        try {
            String deleteStr = "delete from jingdong where 书名=?";
            statement1 = connection.prepareStatement(deleteStr);
            statement1.setString(1,name);
            int i = statement1.executeUpdate();
            if (i >= 0) {
                System.out.println("删除成功");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (statement1 != null) {
                try {
                    statement1.close();  //关闭连接
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close(); //关闭连接
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
