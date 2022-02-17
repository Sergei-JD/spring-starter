package com.spring.database.repisitory;

import com.spring.bpp.InjectBean;
import com.spring.database.pool.ConnectionPool;

public class CompanyRepository {

    @InjectBean
    private ConnectionPool connectionPool;
}
