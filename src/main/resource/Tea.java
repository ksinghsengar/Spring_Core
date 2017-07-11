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
public class Tea implements HotDrink{
    public void  prepareHotDrink(){
        System.out.println("prepareHotDrink IN Tea");
//        System.out.println(super.toString());
    }

    @Override
    public String toString() {
       return super.toString();
    }
}
