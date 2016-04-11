package ru.itis.inform.RequestReproduction.DAO.JDBC;

import java.util.List;
import java.util.Map;

/**
 * Created by Galiullin_ko on 09.04.16.
 */
public interface ParamsMapper {
    Map<String, Object> asMap(List<String> keys, List<?> values);
}
