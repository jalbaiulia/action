package desserts_3;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import desserts_3.annotations.Cold;
import desserts_3.annotations.Creamy;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DessertConfig.class)
public class Test {

  @Autowired
  @Cold
  @Creamy
  Dessert dessert;

  @org.junit.Test
  public void play() {

  }


}
