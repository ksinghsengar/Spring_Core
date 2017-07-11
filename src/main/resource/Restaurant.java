    package main.resource;

    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.beans.factory.annotation.Required;
    import org.springframework.stereotype.Component;
    import org.springframework.stereotype.Controller;

//    @Controller
    @Component
    public class Restaurant {
//        @Autowired
        HotDrink hotDrink;

        @Autowired
        public Restaurant(HotDrink hotDrink) {
            this.hotDrink = hotDrink;
        }
        public HotDrink getHotDrink() {
            return hotDrink;
        }

//    @Required
//        @Autowired
        public void setHotDrink(HotDrink hotDrink) {
            this.hotDrink = hotDrink;
        }

        @Override
        public String toString() {
            System.out.println(super.toString());
            return "HotDrink: "+hotDrink;
        }
    }
