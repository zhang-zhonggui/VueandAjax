package com.zzg.vue.DAO.impl;

import com.zzg.vue.DAO.GradeDAO;
import com.zzg.vue.servlet.Grade;
import com.zzg.vue.util.DAOUtil;

import java.util.List;
import java.util.Map;

/**
 * @Author: zzg
 * @Description: TODO
 * @DateTime: 2021/11/27 9:58
 */
public class GradeDAOImpl implements GradeDAO {
    @Override
    public List<Map<String, Object>> lsit() {
        String sql = "select * from t_class";
        return DAOUtil.request(sql);
    }
}
