package desserts_3.Components;

import org.springframework.stereotype.Component;

import desserts_3.Dessert;
import desserts_3.annotations.Cold;
import desserts_3.annotations.Creamy;

@Component
@Creamy
@Cold
public class IceCream implements Dessert {

}
