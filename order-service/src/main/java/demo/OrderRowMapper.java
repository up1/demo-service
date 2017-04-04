package demo;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class OrderRowMapper implements RowMapper<Order> {
    @Override
    public Order mapRow(ResultSet resultSet, int rowNumber) throws SQLException {
        Order order = new Order();
        order.setId(resultSet.getLong("id"));
        order.setUserId(resultSet.getLong("user_id"));
        order.setDetail(resultSet.getString("detail"));
        return order;
    }
}

