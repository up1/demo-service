package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class OrderRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public OrderRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Transactional(readOnly = true)
    public List<Order> findByUserId(Long userId) {
        try {
            String sql = "SELECT * FROM ORDERS WHERE user_id=?";
            return  this.jdbcTemplate.query(sql,
                    new Object[]{userId}, new OrderRowMapper());
        }catch (Exception exception) {
            throw new OrderNotFoundException(userId);
        }
    }
}
