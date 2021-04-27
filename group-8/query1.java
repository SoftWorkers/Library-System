import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class query1 {
    public List<Dept> query(String name,Double price,String publication){
        List<Dept> depts=new ArrayList<>();
        Connection connection=DBConnection.getConnection();// 获取连接
        Statement statement=null;
        ResultSet set=null;
        try {
            statement =connection.createStatement(); //通过连接获取 statement 对象
            String selectStr=" ";
            if (name!=null&&!name.equals("")){
                selectStr="select * from jingdong where name like '%"+name+"%'";
            }else if (price!= null&&!price.equals("")) {
                selectStr = "select * from jingdong where price like '%"+price+"%'";
            }else if (publication!=null&&!publication.equals("")) {
                selectStr = "select * from jingdong where publication like '%"+publication+"%'";
            }
            else {
                selectStr="select * from jingdong";
            }

            set= statement.executeQuery(selectStr);

            while (set.next()){   //遍历 resultSet
                Dept dept=new Dept();
                dept.setId(set.getInt("id"));
                dept.setName(set.getString("name"));
                dept.setPrice(set.getDouble("price"));
                dept.setPublication (set.getString("publication"));
                depts.add(dept);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("更新失败");
        }finally {
            if (set!=null){
                try {
                    set.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (statement!=null){
                try {
                    statement.close();  //关闭连接
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection!=null){
                try {
                    connection.close(); //关闭连接
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        return depts;
    }
}
