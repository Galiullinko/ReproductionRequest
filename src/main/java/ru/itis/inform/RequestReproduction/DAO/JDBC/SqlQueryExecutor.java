package ru.itis.inform.RequestReproduction.dao.jdbc;

import org.springframework.jdbc.core.RowMapper;

import java.util.List;
import java.util.Map;

/**
 * Created by Galiullin_ko on 09.04.16.
 */
public interface SQLQueryExecutor {
    <T> List<T> queryForObjects(String sql, RowMapper<T> rowMapper);
    <T> List<T> queryForObjects(String sql, Map<String, Object> paramMap, RowMapper<T> rowMapper);
    <T> T queryForObject(String sql, Map<String, Object> paramMap, RowMapper<T> rowMapper);
    void updateQuery(String sql, Map<String, Object> paramMap);
    int queryForInt(String sql, Map<String, Object> paramMap);
    int queryForInt(String sql);
}
