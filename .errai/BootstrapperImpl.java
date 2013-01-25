package org.jboss.errai.ioc.client;

import de.itasesor.client.local.App;
import de.itasesor.client.shared.HelloMessage;
import de.itasesor.client.shared.Response;
import java.lang.annotation.Annotation;
import javax.enterprise.event.Event;
import javax.enterprise.inject.Any;
import javax.enterprise.inject.Default;
import javax.inject.Provider;
import org.jboss.errai.bus.client.ErraiBus;
import org.jboss.errai.bus.client.framework.Subscription;
import org.jboss.errai.enterprise.client.cdi.AbstractCDIEventCallback;
import org.jboss.errai.enterprise.client.cdi.CDIEventTypeLookup;
import org.jboss.errai.enterprise.client.cdi.EventProvider;
import org.jboss.errai.enterprise.client.cdi.InstanceProvider;
import org.jboss.errai.enterprise.client.cdi.api.CDI;
import org.jboss.errai.ioc.client.api.ContextualTypeProvider;
import org.jboss.errai.ioc.client.api.builtin.CallerProvider;
import org.jboss.errai.ioc.client.api.builtin.DisposerProvider;
import org.jboss.errai.ioc.client.api.builtin.IOCBeanManagerProvider;
import org.jboss.errai.ioc.client.api.builtin.InitBallotProvider;
import org.jboss.errai.ioc.client.api.builtin.MessageBusProvider;
import org.jboss.errai.ioc.client.api.builtin.RequestDispatcherProvider;
import org.jboss.errai.ioc.client.api.builtin.RootPanelProvider;
import org.jboss.errai.ioc.client.api.builtin.SenderProvider;
import org.jboss.errai.ioc.client.container.CreationalCallback;
import org.jboss.errai.ioc.client.container.CreationalContext;
import org.jboss.errai.ioc.client.container.DestructionCallback;
import org.jboss.errai.ioc.client.container.IOCBeanManager;
import org.jboss.errai.ioc.client.container.InitializationCallback;

public class BootstrapperImpl implements Bootstrapper {
  {
    CDIEventTypeLookup.get().addLookup("de.itasesor.client.shared.Response", "java.lang.Object");
    new CDI().initLookupTable(CDIEventTypeLookup.get());
  }
  private final Default _1998831462Default_1134433283 = new Default() {
    public Class annotationType() {
      return Default.class;
    }
  };
  private final Any _1998831462Any_1060369315 = new Any() {
    public Class annotationType() {
      return Any.class;
    }
  };
  private final Annotation[] arrayOf_19635043Annotation_1484522153 = new Annotation[] { _1998831462Default_1134433283, _1998831462Any_1060369315 };
  private final BootstrapperInjectionContext injContext = new BootstrapperInjectionContext();
  private final CreationalContext context = injContext.getRootContext();
  private final CreationalCallback<CallerProvider> inj33433_CallerProvider_creational = new CreationalCallback<CallerProvider>() {
    public CallerProvider getInstance(final CreationalContext context) {
      final CallerProvider inj33428_CallerProvider = new CallerProvider();
      context.addBean(context.getBeanReference(CallerProvider.class, arrayOf_19635043Annotation_1484522153), inj33428_CallerProvider);
      return inj33428_CallerProvider;
    }
  };
  private final CallerProvider inj33428_CallerProvider = inj33433_CallerProvider_creational.getInstance(context);
  private final CreationalCallback<RequestDispatcherProvider> inj33434_RequestDispatcherProvider_creational = new CreationalCallback<RequestDispatcherProvider>() {
    public RequestDispatcherProvider getInstance(final CreationalContext context) {
      final RequestDispatcherProvider inj33416_RequestDispatcherProvider = new RequestDispatcherProvider();
      context.addBean(context.getBeanReference(RequestDispatcherProvider.class, arrayOf_19635043Annotation_1484522153), inj33416_RequestDispatcherProvider);
      return inj33416_RequestDispatcherProvider;
    }
  };
  private final RequestDispatcherProvider inj33416_RequestDispatcherProvider = inj33434_RequestDispatcherProvider_creational.getInstance(context);
  private final CreationalCallback<SenderProvider> inj33435_SenderProvider_creational = new CreationalCallback<SenderProvider>() {
    public SenderProvider getInstance(final CreationalContext context) {
      final SenderProvider inj33432_SenderProvider = new SenderProvider();
      context.addBean(context.getBeanReference(SenderProvider.class, arrayOf_19635043Annotation_1484522153), inj33432_SenderProvider);
      return inj33432_SenderProvider;
    }
  };
  private final SenderProvider inj33432_SenderProvider = inj33435_SenderProvider_creational.getInstance(context);
  private final CreationalCallback<RootPanelProvider> inj33436_RootPanelProvider_creational = new CreationalCallback<RootPanelProvider>() {
    public RootPanelProvider getInstance(final CreationalContext context) {
      final RootPanelProvider inj33418_RootPanelProvider = new RootPanelProvider();
      context.addBean(context.getBeanReference(RootPanelProvider.class, arrayOf_19635043Annotation_1484522153), inj33418_RootPanelProvider);
      return inj33418_RootPanelProvider;
    }
  };
  private final RootPanelProvider inj33418_RootPanelProvider = inj33436_RootPanelProvider_creational.getInstance(context);
  private final CreationalCallback<InstanceProvider> inj33437_InstanceProvider_creational = new CreationalCallback<InstanceProvider>() {
    public InstanceProvider getInstance(final CreationalContext context) {
      final InstanceProvider inj33422_InstanceProvider = new InstanceProvider();
      context.addBean(context.getBeanReference(InstanceProvider.class, arrayOf_19635043Annotation_1484522153), inj33422_InstanceProvider);
      return inj33422_InstanceProvider;
    }
  };
  private final InstanceProvider inj33422_InstanceProvider = inj33437_InstanceProvider_creational.getInstance(context);
  private final CreationalCallback<EventProvider> inj33438_EventProvider_creational = new CreationalCallback<EventProvider>() {
    public EventProvider getInstance(final CreationalContext context) {
      final EventProvider inj33426_EventProvider = new EventProvider();
      context.addBean(context.getBeanReference(EventProvider.class, arrayOf_19635043Annotation_1484522153), inj33426_EventProvider);
      return inj33426_EventProvider;
    }
  };
  private final EventProvider inj33426_EventProvider = inj33438_EventProvider_creational.getInstance(context);
  private final CreationalCallback<IOCBeanManagerProvider> inj33439_IOCBeanManagerProvider_creational = new CreationalCallback<IOCBeanManagerProvider>() {
    public IOCBeanManagerProvider getInstance(final CreationalContext context) {
      final IOCBeanManagerProvider inj33420_IOCBeanManagerProvider = new IOCBeanManagerProvider();
      context.addBean(context.getBeanReference(IOCBeanManagerProvider.class, arrayOf_19635043Annotation_1484522153), inj33420_IOCBeanManagerProvider);
      return inj33420_IOCBeanManagerProvider;
    }
  };
  private final IOCBeanManagerProvider inj33420_IOCBeanManagerProvider = inj33439_IOCBeanManagerProvider_creational.getInstance(context);
  private final CreationalCallback<MessageBusProvider> inj33440_MessageBusProvider_creational = new CreationalCallback<MessageBusProvider>() {
    public MessageBusProvider getInstance(final CreationalContext context) {
      final MessageBusProvider inj33414_MessageBusProvider = new MessageBusProvider();
      context.addBean(context.getBeanReference(MessageBusProvider.class, arrayOf_19635043Annotation_1484522153), inj33414_MessageBusProvider);
      return inj33414_MessageBusProvider;
    }
  };
  private final MessageBusProvider inj33414_MessageBusProvider = inj33440_MessageBusProvider_creational.getInstance(context);
  private final CreationalCallback<InitBallotProvider> inj33441_InitBallotProvider_creational = new CreationalCallback<InitBallotProvider>() {
    public InitBallotProvider getInstance(final CreationalContext context) {
      final InitBallotProvider inj33424_InitBallotProvider = new InitBallotProvider();
      context.addBean(context.getBeanReference(InitBallotProvider.class, arrayOf_19635043Annotation_1484522153), inj33424_InitBallotProvider);
      return inj33424_InitBallotProvider;
    }
  };
  private final InitBallotProvider inj33424_InitBallotProvider = inj33441_InitBallotProvider_creational.getInstance(context);
  private InitializationCallback<App> init_inj33442_App = new InitializationCallback<App>() {
    public void init(final App obj) {
      obj.buildUI();
    }
  };
  private final CreationalCallback<App> inj33443_App_creational = new CreationalCallback<App>() {
    public App getInstance(final CreationalContext context) {
      final App inj33442_App = new App();
      context.addBean(context.getBeanReference(App.class, arrayOf_19635043Annotation_1484522153), inj33442_App);
      _1985882670_messageEvent(inj33442_App, inj33426_EventProvider.provide(new Class[] { HelloMessage.class }, null));
      final Subscription var35 = CDI.subscribe("de.itasesor.client.shared.Response", new AbstractCDIEventCallback<Response>() {
        public void fireEvent(final Response event) {
          inj33442_App.response(event);
        }
        public String toString() {
          return "Observer: de.itasesor.client.shared.Response []";
        }
      });
      final Subscription var36 = ErraiBus.get().subscribe("cdi.event:de.itasesor.client.shared.Response", CDI.ROUTING_CALLBACK);
      context.addDestructionCallback(inj33442_App, new DestructionCallback<App>() {
        public void destroy(final App obj) {
          var35.remove();
          var36.remove();
        }
      });
      context.addInitializationCallback(inj33442_App, init_inj33442_App);
      return inj33442_App;
    }
  };
  private final App inj33442_App = inj33443_App_creational.getInstance(context);
  private final CreationalCallback<DisposerProvider> inj33444_DisposerProvider_creational = new CreationalCallback<DisposerProvider>() {
    public DisposerProvider getInstance(final CreationalContext context) {
      final DisposerProvider inj33430_DisposerProvider = new DisposerProvider();
      context.addBean(context.getBeanReference(DisposerProvider.class, arrayOf_19635043Annotation_1484522153), inj33430_DisposerProvider);
      _$1300398733_beanManager(inj33430_DisposerProvider, inj33420_IOCBeanManagerProvider.get());
      return inj33430_DisposerProvider;
    }
  };
  private final DisposerProvider inj33430_DisposerProvider = inj33444_DisposerProvider_creational.getInstance(context);
  private void declareBeans_0() {
    injContext.addBean(CallerProvider.class, CallerProvider.class, inj33433_CallerProvider_creational, inj33428_CallerProvider, arrayOf_19635043Annotation_1484522153, null, true);
    injContext.addBean(ContextualTypeProvider.class, CallerProvider.class, inj33433_CallerProvider_creational, inj33428_CallerProvider, arrayOf_19635043Annotation_1484522153, null, false);
    injContext.addBean(RequestDispatcherProvider.class, RequestDispatcherProvider.class, inj33434_RequestDispatcherProvider_creational, inj33416_RequestDispatcherProvider, arrayOf_19635043Annotation_1484522153, null, true);
    injContext.addBean(Provider.class, RequestDispatcherProvider.class, inj33434_RequestDispatcherProvider_creational, inj33416_RequestDispatcherProvider, arrayOf_19635043Annotation_1484522153, null, false);
    injContext.addBean(SenderProvider.class, SenderProvider.class, inj33435_SenderProvider_creational, inj33432_SenderProvider, arrayOf_19635043Annotation_1484522153, null, true);
    injContext.addBean(ContextualTypeProvider.class, SenderProvider.class, inj33435_SenderProvider_creational, inj33432_SenderProvider, arrayOf_19635043Annotation_1484522153, null, false);
    injContext.addBean(RootPanelProvider.class, RootPanelProvider.class, inj33436_RootPanelProvider_creational, inj33418_RootPanelProvider, arrayOf_19635043Annotation_1484522153, null, true);
    injContext.addBean(Provider.class, RootPanelProvider.class, inj33436_RootPanelProvider_creational, inj33418_RootPanelProvider, arrayOf_19635043Annotation_1484522153, null, false);
    injContext.addBean(InstanceProvider.class, InstanceProvider.class, inj33437_InstanceProvider_creational, inj33422_InstanceProvider, arrayOf_19635043Annotation_1484522153, null, true);
    injContext.addBean(ContextualTypeProvider.class, InstanceProvider.class, inj33437_InstanceProvider_creational, inj33422_InstanceProvider, arrayOf_19635043Annotation_1484522153, null, false);
    injContext.addBean(EventProvider.class, EventProvider.class, inj33438_EventProvider_creational, inj33426_EventProvider, arrayOf_19635043Annotation_1484522153, null, true);
    injContext.addBean(ContextualTypeProvider.class, EventProvider.class, inj33438_EventProvider_creational, inj33426_EventProvider, arrayOf_19635043Annotation_1484522153, null, false);
    injContext.addBean(IOCBeanManagerProvider.class, IOCBeanManagerProvider.class, inj33439_IOCBeanManagerProvider_creational, inj33420_IOCBeanManagerProvider, arrayOf_19635043Annotation_1484522153, null, true);
    injContext.addBean(Provider.class, IOCBeanManagerProvider.class, inj33439_IOCBeanManagerProvider_creational, inj33420_IOCBeanManagerProvider, arrayOf_19635043Annotation_1484522153, null, false);
    injContext.addBean(MessageBusProvider.class, MessageBusProvider.class, inj33440_MessageBusProvider_creational, inj33414_MessageBusProvider, arrayOf_19635043Annotation_1484522153, null, true);
    injContext.addBean(Provider.class, MessageBusProvider.class, inj33440_MessageBusProvider_creational, inj33414_MessageBusProvider, arrayOf_19635043Annotation_1484522153, null, false);
    injContext.addBean(InitBallotProvider.class, InitBallotProvider.class, inj33441_InitBallotProvider_creational, inj33424_InitBallotProvider, arrayOf_19635043Annotation_1484522153, null, true);
    injContext.addBean(ContextualTypeProvider.class, InitBallotProvider.class, inj33441_InitBallotProvider_creational, inj33424_InitBallotProvider, arrayOf_19635043Annotation_1484522153, null, false);
    injContext.addBean(App.class, App.class, inj33443_App_creational, inj33442_App, arrayOf_19635043Annotation_1484522153, null, true);
    injContext.addBean(DisposerProvider.class, DisposerProvider.class, inj33444_DisposerProvider_creational, inj33430_DisposerProvider, arrayOf_19635043Annotation_1484522153, null, true);
    injContext.addBean(ContextualTypeProvider.class, DisposerProvider.class, inj33444_DisposerProvider_creational, inj33430_DisposerProvider, arrayOf_19635043Annotation_1484522153, null, false);
  }

  private native static void _$1300398733_beanManager(DisposerProvider instance, IOCBeanManager value) /*-{
    instance.@org.jboss.errai.ioc.client.api.builtin.DisposerProvider::beanManager = value;
  }-*/;

  private native static void _1985882670_messageEvent(App instance, Event value) /*-{
    instance.@de.itasesor.client.local.App::messageEvent = value;
  }-*/;

  // The main IOC bootstrap method.
  public BootstrapperInjectionContext bootstrapContainer() {
    declareBeans_0();
    return injContext;
  }
}