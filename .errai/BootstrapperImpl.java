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
  private final Default _1998831462Default_233825635 = new Default() {
    public Class annotationType() {
      return Default.class;
    }
  };
  private final Any _1998831462Any_12373435 = new Any() {
    public Class annotationType() {
      return Any.class;
    }
  };
  private final Annotation[] arrayOf_19635043Annotation_606968632 = new Annotation[] { _1998831462Default_233825635, _1998831462Any_12373435 };
  private final BootstrapperInjectionContext injContext = new BootstrapperInjectionContext();
  private final CreationalContext context = injContext.getRootContext();
  private final CreationalCallback<CallerProvider> inj1712_CallerProvider_creational = new CreationalCallback<CallerProvider>() {
    public CallerProvider getInstance(final CreationalContext context) {
      final CallerProvider inj1707_CallerProvider = new CallerProvider();
      context.addBean(context.getBeanReference(CallerProvider.class, arrayOf_19635043Annotation_606968632), inj1707_CallerProvider);
      return inj1707_CallerProvider;
    }
  };
  private final CallerProvider inj1707_CallerProvider = inj1712_CallerProvider_creational.getInstance(context);
  private final CreationalCallback<RequestDispatcherProvider> inj1713_RequestDispatcherProvider_creational = new CreationalCallback<RequestDispatcherProvider>() {
    public RequestDispatcherProvider getInstance(final CreationalContext context) {
      final RequestDispatcherProvider inj1695_RequestDispatcherProvider = new RequestDispatcherProvider();
      context.addBean(context.getBeanReference(RequestDispatcherProvider.class, arrayOf_19635043Annotation_606968632), inj1695_RequestDispatcherProvider);
      return inj1695_RequestDispatcherProvider;
    }
  };
  private final RequestDispatcherProvider inj1695_RequestDispatcherProvider = inj1713_RequestDispatcherProvider_creational.getInstance(context);
  private final CreationalCallback<SenderProvider> inj1714_SenderProvider_creational = new CreationalCallback<SenderProvider>() {
    public SenderProvider getInstance(final CreationalContext context) {
      final SenderProvider inj1711_SenderProvider = new SenderProvider();
      context.addBean(context.getBeanReference(SenderProvider.class, arrayOf_19635043Annotation_606968632), inj1711_SenderProvider);
      return inj1711_SenderProvider;
    }
  };
  private final SenderProvider inj1711_SenderProvider = inj1714_SenderProvider_creational.getInstance(context);
  private final CreationalCallback<RootPanelProvider> inj1715_RootPanelProvider_creational = new CreationalCallback<RootPanelProvider>() {
    public RootPanelProvider getInstance(final CreationalContext context) {
      final RootPanelProvider inj1697_RootPanelProvider = new RootPanelProvider();
      context.addBean(context.getBeanReference(RootPanelProvider.class, arrayOf_19635043Annotation_606968632), inj1697_RootPanelProvider);
      return inj1697_RootPanelProvider;
    }
  };
  private final RootPanelProvider inj1697_RootPanelProvider = inj1715_RootPanelProvider_creational.getInstance(context);
  private final CreationalCallback<InstanceProvider> inj1716_InstanceProvider_creational = new CreationalCallback<InstanceProvider>() {
    public InstanceProvider getInstance(final CreationalContext context) {
      final InstanceProvider inj1701_InstanceProvider = new InstanceProvider();
      context.addBean(context.getBeanReference(InstanceProvider.class, arrayOf_19635043Annotation_606968632), inj1701_InstanceProvider);
      return inj1701_InstanceProvider;
    }
  };
  private final InstanceProvider inj1701_InstanceProvider = inj1716_InstanceProvider_creational.getInstance(context);
  private final CreationalCallback<EventProvider> inj1717_EventProvider_creational = new CreationalCallback<EventProvider>() {
    public EventProvider getInstance(final CreationalContext context) {
      final EventProvider inj1705_EventProvider = new EventProvider();
      context.addBean(context.getBeanReference(EventProvider.class, arrayOf_19635043Annotation_606968632), inj1705_EventProvider);
      return inj1705_EventProvider;
    }
  };
  private final EventProvider inj1705_EventProvider = inj1717_EventProvider_creational.getInstance(context);
  private final CreationalCallback<IOCBeanManagerProvider> inj1718_IOCBeanManagerProvider_creational = new CreationalCallback<IOCBeanManagerProvider>() {
    public IOCBeanManagerProvider getInstance(final CreationalContext context) {
      final IOCBeanManagerProvider inj1699_IOCBeanManagerProvider = new IOCBeanManagerProvider();
      context.addBean(context.getBeanReference(IOCBeanManagerProvider.class, arrayOf_19635043Annotation_606968632), inj1699_IOCBeanManagerProvider);
      return inj1699_IOCBeanManagerProvider;
    }
  };
  private final IOCBeanManagerProvider inj1699_IOCBeanManagerProvider = inj1718_IOCBeanManagerProvider_creational.getInstance(context);
  private final CreationalCallback<MessageBusProvider> inj1719_MessageBusProvider_creational = new CreationalCallback<MessageBusProvider>() {
    public MessageBusProvider getInstance(final CreationalContext context) {
      final MessageBusProvider inj1693_MessageBusProvider = new MessageBusProvider();
      context.addBean(context.getBeanReference(MessageBusProvider.class, arrayOf_19635043Annotation_606968632), inj1693_MessageBusProvider);
      return inj1693_MessageBusProvider;
    }
  };
  private final MessageBusProvider inj1693_MessageBusProvider = inj1719_MessageBusProvider_creational.getInstance(context);
  private final CreationalCallback<InitBallotProvider> inj1720_InitBallotProvider_creational = new CreationalCallback<InitBallotProvider>() {
    public InitBallotProvider getInstance(final CreationalContext context) {
      final InitBallotProvider inj1703_InitBallotProvider = new InitBallotProvider();
      context.addBean(context.getBeanReference(InitBallotProvider.class, arrayOf_19635043Annotation_606968632), inj1703_InitBallotProvider);
      return inj1703_InitBallotProvider;
    }
  };
  private final InitBallotProvider inj1703_InitBallotProvider = inj1720_InitBallotProvider_creational.getInstance(context);
  private InitializationCallback<App> init_inj1721_App = new InitializationCallback<App>() {
    public void init(final App obj) {
      obj.buildUI();
    }
  };
  private final CreationalCallback<App> inj1722_App_creational = new CreationalCallback<App>() {
    public App getInstance(final CreationalContext context) {
      final App inj1721_App = new App();
      context.addBean(context.getBeanReference(App.class, arrayOf_19635043Annotation_606968632), inj1721_App);
      _1985882670_messageEvent(inj1721_App, inj1705_EventProvider.provide(new Class[] { HelloMessage.class }, null));
      final Subscription var1 = CDI.subscribe("de.itasesor.client.shared.Response", new AbstractCDIEventCallback<Response>() {
        public void fireEvent(final Response event) {
          inj1721_App.response(event);
        }
        public String toString() {
          return "Observer: de.itasesor.client.shared.Response []";
        }
      });
      final Subscription var2 = ErraiBus.get().subscribe("cdi.event:de.itasesor.client.shared.Response", CDI.ROUTING_CALLBACK);
      context.addDestructionCallback(inj1721_App, new DestructionCallback<App>() {
        public void destroy(final App obj) {
          var1.remove();
          var2.remove();
        }
      });
      context.addInitializationCallback(inj1721_App, init_inj1721_App);
      return inj1721_App;
    }
  };
  private final App inj1721_App = inj1722_App_creational.getInstance(context);
  private final CreationalCallback<DisposerProvider> inj1723_DisposerProvider_creational = new CreationalCallback<DisposerProvider>() {
    public DisposerProvider getInstance(final CreationalContext context) {
      final DisposerProvider inj1709_DisposerProvider = new DisposerProvider();
      context.addBean(context.getBeanReference(DisposerProvider.class, arrayOf_19635043Annotation_606968632), inj1709_DisposerProvider);
      _$1300398733_beanManager(inj1709_DisposerProvider, inj1699_IOCBeanManagerProvider.get());
      return inj1709_DisposerProvider;
    }
  };
  private final DisposerProvider inj1709_DisposerProvider = inj1723_DisposerProvider_creational.getInstance(context);
  private void declareBeans_0() {
    injContext.addBean(CallerProvider.class, CallerProvider.class, inj1712_CallerProvider_creational, inj1707_CallerProvider, arrayOf_19635043Annotation_606968632, null, true);
    injContext.addBean(ContextualTypeProvider.class, CallerProvider.class, inj1712_CallerProvider_creational, inj1707_CallerProvider, arrayOf_19635043Annotation_606968632, null, false);
    injContext.addBean(RequestDispatcherProvider.class, RequestDispatcherProvider.class, inj1713_RequestDispatcherProvider_creational, inj1695_RequestDispatcherProvider, arrayOf_19635043Annotation_606968632, null, true);
    injContext.addBean(Provider.class, RequestDispatcherProvider.class, inj1713_RequestDispatcherProvider_creational, inj1695_RequestDispatcherProvider, arrayOf_19635043Annotation_606968632, null, false);
    injContext.addBean(SenderProvider.class, SenderProvider.class, inj1714_SenderProvider_creational, inj1711_SenderProvider, arrayOf_19635043Annotation_606968632, null, true);
    injContext.addBean(ContextualTypeProvider.class, SenderProvider.class, inj1714_SenderProvider_creational, inj1711_SenderProvider, arrayOf_19635043Annotation_606968632, null, false);
    injContext.addBean(RootPanelProvider.class, RootPanelProvider.class, inj1715_RootPanelProvider_creational, inj1697_RootPanelProvider, arrayOf_19635043Annotation_606968632, null, true);
    injContext.addBean(Provider.class, RootPanelProvider.class, inj1715_RootPanelProvider_creational, inj1697_RootPanelProvider, arrayOf_19635043Annotation_606968632, null, false);
    injContext.addBean(InstanceProvider.class, InstanceProvider.class, inj1716_InstanceProvider_creational, inj1701_InstanceProvider, arrayOf_19635043Annotation_606968632, null, true);
    injContext.addBean(ContextualTypeProvider.class, InstanceProvider.class, inj1716_InstanceProvider_creational, inj1701_InstanceProvider, arrayOf_19635043Annotation_606968632, null, false);
    injContext.addBean(EventProvider.class, EventProvider.class, inj1717_EventProvider_creational, inj1705_EventProvider, arrayOf_19635043Annotation_606968632, null, true);
    injContext.addBean(ContextualTypeProvider.class, EventProvider.class, inj1717_EventProvider_creational, inj1705_EventProvider, arrayOf_19635043Annotation_606968632, null, false);
    injContext.addBean(IOCBeanManagerProvider.class, IOCBeanManagerProvider.class, inj1718_IOCBeanManagerProvider_creational, inj1699_IOCBeanManagerProvider, arrayOf_19635043Annotation_606968632, null, true);
    injContext.addBean(Provider.class, IOCBeanManagerProvider.class, inj1718_IOCBeanManagerProvider_creational, inj1699_IOCBeanManagerProvider, arrayOf_19635043Annotation_606968632, null, false);
    injContext.addBean(MessageBusProvider.class, MessageBusProvider.class, inj1719_MessageBusProvider_creational, inj1693_MessageBusProvider, arrayOf_19635043Annotation_606968632, null, true);
    injContext.addBean(Provider.class, MessageBusProvider.class, inj1719_MessageBusProvider_creational, inj1693_MessageBusProvider, arrayOf_19635043Annotation_606968632, null, false);
    injContext.addBean(InitBallotProvider.class, InitBallotProvider.class, inj1720_InitBallotProvider_creational, inj1703_InitBallotProvider, arrayOf_19635043Annotation_606968632, null, true);
    injContext.addBean(ContextualTypeProvider.class, InitBallotProvider.class, inj1720_InitBallotProvider_creational, inj1703_InitBallotProvider, arrayOf_19635043Annotation_606968632, null, false);
    injContext.addBean(App.class, App.class, inj1722_App_creational, inj1721_App, arrayOf_19635043Annotation_606968632, null, true);
    injContext.addBean(DisposerProvider.class, DisposerProvider.class, inj1723_DisposerProvider_creational, inj1709_DisposerProvider, arrayOf_19635043Annotation_606968632, null, true);
    injContext.addBean(ContextualTypeProvider.class, DisposerProvider.class, inj1723_DisposerProvider_creational, inj1709_DisposerProvider, arrayOf_19635043Annotation_606968632, null, false);
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