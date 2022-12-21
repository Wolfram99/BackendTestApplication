package com.example.BackendTestApplication.Controller;


import com.example.BackendTestApplication.Bicycle.BuildCheck;
//import com.example.BackendTestApplication.DAO.GettingData;
//import org.springframework.beans.factory.annotation.Autowired;
import com.example.BackendTestApplication.Bicycle.BuildCheckDs;
import com.example.BackendTestApplication.Bicycle.WriterFile;
import com.example.BackendTestApplication.Repositories.CardRepo;
import com.example.BackendTestApplication.Repositories.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/check")
public class CheckConttroller {


    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    @Qualifier("jdbcProductRepo")
    private ProductRepo productRepo;

    @Autowired
    @Qualifier("jdbcCardRepo")
    private CardRepo cardRepo;


    @GetMapping()
    public String webRenderCheck(@RequestParam("itemid") String[] itemIdQuantity){
        BuildCheck b = new BuildCheckDs();
        WriterFile.writeToFile(b.buildCheckDS(itemIdQuantity, productRepo.findAll(), cardRepo.findAll()));
        return  b.buildCheckDS(itemIdQuantity, productRepo.findAll(), cardRepo.findAll());
    }
}
