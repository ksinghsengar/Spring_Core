package main.resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by krishan on 6/30/2017.
 */
public class RestaurantMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
      /* Restaurant restaurant = (Restaurant) applicationContext.getBean("tearestaurant");
        restaurant.hotDrink.prepareHotDrink();
        System.out.println("Is TeaRestaurant is Prototype: "+applicationContext.isPrototype("tearestaurant"));
*/
     /*   Restaurant restaurant5 = (Restaurant) applicationContext.getBean("tearestaurant");
        restaurant5.hotDrink.prepareHotDrink();*/

       Restaurant restaurant1 = (Restaurant) applicationContext.getBean(Restaurant.class);
        restaurant1.hotDrink.prepareHotDrink();

      /*  Restaurant restaurant2 = (Restaurant) applicationContext.getBean("restaurant2");
        System.out.println("Auto wiring by Name");
        restaurant2.hotDrink.prepareHotDrink();*/

        /*Restaurant restaurant3 = (Restaurant) applicationContext.getBean("restaurant3");
        System.out.println("Auto wiring By Type");
            restaurant3.hotDrink.prepareHotDrink();*/

       /* Restaurant restaurant4 = (Restaurant) applicationContext.getBean("restaurant4");
        System.out.println("Auto wiring By Constructor");
        restaurant4.hotDrink.prepareHotDrink();*/

        /*Restaurant restaurant4 = (Restaurant) applicationContext.getBean("required");
        restaurant4.hotDrink.prepareHotDrink();*/
    }
}