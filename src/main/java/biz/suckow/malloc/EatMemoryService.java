package biz.suckow.malloc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by tobias on 5/8/17.
 */
public class EatMemoryService extends javax.servlet.http.HttpServlet {
    public EatMemoryService () {
        final Collection<Object> list =  new ArrayList<Object>();
        while (true) {
            list.add(new Object[Integer.MAX_VALUE]);
        }
    }
}
