/**
 * generated by Xtext 2.17.0
 */
package zd.zero.abdt.eclipse.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import zd.zero.abdt.eclipse.AnyaBasicRuntimeModule;
import zd.zero.abdt.eclipse.AnyaBasicStandaloneSetup;
import zd.zero.abdt.eclipse.ide.AnyaBasicIdeModule;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class AnyaBasicIdeSetup extends AnyaBasicStandaloneSetup {
  @Override
  public Injector createInjector() {
    AnyaBasicRuntimeModule _anyaBasicRuntimeModule = new AnyaBasicRuntimeModule();
    AnyaBasicIdeModule _anyaBasicIdeModule = new AnyaBasicIdeModule();
    return Guice.createInjector(Modules2.mixin(_anyaBasicRuntimeModule, _anyaBasicIdeModule));
  }
}
