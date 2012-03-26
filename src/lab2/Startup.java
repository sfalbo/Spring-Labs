package lab2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * See if you can modify this class to use Spring as in Lab1.
 */
public class Startup {

    public static void main(String[] args) {
        // First create some low-level instances using
        // Liskov Substitution Principle

//        TipCalculator calc1 =
//           new FoodServiceTipCalculator(TipService.ServiceQuality.FAIR,125.00);

//        TipCalculator calc2 =
//           new BaggageServiceTipCalculator(TipService.ServiceQuality.GOOD,5);

        // Next, create the high-level class
        
        final AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        TipService ts = (TipService)ctx.getBean("TipService");
        // Now ask the tip manager to do some work...
        double tip = ts.getTip();
        String quality = ts.getServiceQuality();

        // Now prove it works...
        System.out.println("\nThe tip for the "
                + ts.getClass().getSimpleName() + " is: "
                + tip + ", with a service qualilty of: " + quality);

    }

}
