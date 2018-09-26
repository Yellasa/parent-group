package com.yt.stude.mybatis.execute.impl;

import com.yt.stude.mybatis.execute.MyExecutor;
import com.yt.stude.mybatis.pojo.User;

import java.sql.*;
import java.util.logging.Logger;

/**
 * @ClassName: MyExecutorImpl
 * @Author: yangting@ty
 * @CreateDate: 2018/9/26 10:59
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/9/26 10:59
 * @UpdateRemark: 更新说明
 **/
public class MyExecutorImpl implements MyExecutor
{
    Logger logger = Logger.getLogger("SQL_");
    @Override
    public <T> T query(String sql, Object parmeter)
    {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        connection = getCollection();
        try
        {
            preparedStatement = connection.prepareStatement(sql);
            Long id = Long.parseLong(parmeter.toString());
            preparedStatement.setLong(1,id);
            logger.info(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            User user = new User();
            while (resultSet.next()){
                user.setName(resultSet.getString(2));
            }
            resultSet.close();
            preparedStatement.close();
            connection.close();
            return (T) user;
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
        return null;
    }

    private Connection getCollection()
    {
        String driver="com.mysql.cj.jdbc.Driver";
        String dburl="jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC";
        String userName = "root";
        String pwd = "123456";

        try
        {
            Class.forName(driver);
            Connection connection = DriverManager.getConnection(dburl, userName, pwd);
            return connection;
        } catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
        return null;

    }
}
