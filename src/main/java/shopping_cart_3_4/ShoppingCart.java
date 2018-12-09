package shopping_cart_3_4;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

@Component
public interface ShoppingCart {

  @Scope(
      value = WebApplicationContext.SCOPE_SESSION,
      proxyMode = ScopedProxyMode.INTERFACES)
  public ShoppingCart cart();
}