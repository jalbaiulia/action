package soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDPlayerConfig {

  @Bean
  public CompactDisc sgtPeppers() {
    return new SgtPeppers();
  }

  @Bean
  public MediaPlayer cdPlayer() {
    return new CDPlayer(sgtPeppers());
  }


  // By default, all beans in Spring are singletons
  // Same instance SgtPeppers will be used bu Spring magic, though we have "new SgtPeppers()"
  @Bean(name="anotherCDPlayer")
  public CDPlayer anotherCDPlayer() {
    return new CDPlayer(sgtPeppers());
  }


  @Bean
  public CDPlayer cdPlayer(CompactDisc compactDisc) {
    return new CDPlayer(compactDisc);
  }

}
