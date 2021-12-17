package com.zzg.vue.DAO;

import java.util.Map;

public interface AdminDAO {
    Map<String, Object> login(String username, String password);
}
