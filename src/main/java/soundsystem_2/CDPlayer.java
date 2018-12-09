package soundsystem_2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


// Injecting a CompactDisc into a CDPlayer bean using autowiring

@Component
public class CDPlayer implements MediaPlayer {

  private CompactDisc cd;


  // 1. Constructor Autowire
  //when Spring creates the CDPlayer bean, it should instantiate it via that constructor and pass in a bean that is assignable to CompactDisc
  @Autowired
  public CDPlayer(CompactDisc cd) {
    this.cd = cd;
  }

  public void play() {
    cd.play();
  }



  // setter Autowire
  @Autowired
  public void setCompactDisc(CompactDisc cd) {
    this.cd = cd;
  }


  // any method Autowire
       //If there are no matching beans, Spring will throw an exception as the application context is being created.
       //To avoid that exception, you can set the required attribute on @Autowired to false
  @Autowired(required=false)
  public void insertDisc(CompactDisc cd) {
    this.cd = cd;
  }
        //Leaving the property unwired could lead to NullPointer-Exceptions if you don’t check for null in your code.



}
