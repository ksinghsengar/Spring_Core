package main.resource;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

/**
 * Created by krishan on 6/30/2017.
 */
//@Controller
//    @Component
    @Repository
public class ExpressTea implements  HotDrink{
    public void prepareHotDrink(){
        System.out.println("Prepare hot drink inside ExpressTea");
    }

}
