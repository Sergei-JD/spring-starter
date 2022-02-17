package com.spring.database.repisitory;

import com.spring.bpp.Auditing;
import com.spring.bpp.Transaction;
import com.spring.database.entity.Company;
import com.spring.database.pool.ConnectionPool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Optional;

@Transaction
@Auditing
public class CompanyRepository implements CrudRepository<Integer, Company> {

//    // var1
//    @Resource(name = "pool1")
//    private ConnectionPool connectionPool;

//    // var2
//    @Autowired
//    @Qualifier("pool1")
//    private ConnectionPool connectionPool;

//    // var3
//    @Autowired
//    private ConnectionPool pool1;

    // var4
    private ConnectionPool pool1;
    @Autowired
    private List<ConnectionPool> pools;
    @Value("${db.pool.size}")
    private Integer poolSize;

    @Autowired
    public void setPool1(ConnectionPool pool1) {
        this.pool1 = pool1;
    }

    @PostConstruct
    private void init() {
        System.out.println("init company repository");
    }

    @Override
    public Optional<Company> findById(Integer id) {
        System.out.println("findById method...");
        return Optional.of(new Company(id));
    }

    @Override
    public void delete(Company entity) {
        System.out.println("delete method...");
    }
}
