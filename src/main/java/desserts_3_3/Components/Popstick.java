package desserts_3.Components;

import org.springframework.stereotype.Component;

import desserts_3.Dessert;
import desserts_3.annotations.Cold;
import desserts_3.annotations.Fruity;

@Component
@Fruity
@Cold
public class Popstick implements Dessert {

}
