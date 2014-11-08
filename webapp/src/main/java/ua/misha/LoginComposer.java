package ua.misha;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.EventListener;
import org.zkoss.zk.ui.event.Events;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Button;
import org.zkoss.zul.Textbox;

/**
 * User: Misha
 * Date: 08.11.2014
 * Time: 14:59
 */
public class LoginComposer extends GenericForwardComposer {
    @Wire
    private Textbox loginTextbox;
    @Wire
    private Textbox passwordTextbox;
    @Wire
    private Button loginButton;

    @Override
    public void doAfterCompose(Component comp) throws Exception {
        super.doAfterCompose(comp);
        loginButton.addEventListener(Events.ON_CLICK, new EventListener<Event>() {
            @Override
            public void onEvent(Event event) throws Exception {
                System.out.println("click");
            }
        });
    }

}
