package com.zzg.vue.DAO;

import java.util.List;
import java.util.Map;

public interface StudentDAO {
    List<Map<String, Object>> lsit();

    int delStu(String id);
}
