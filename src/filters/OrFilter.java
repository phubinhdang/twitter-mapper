package filters;

import twitter4j.Status;
import java.util.ArrayList;
import java.util.List;

public class OrFilter implements Filter {
    private final Filter firstChild;
    private final Filter secondChild;

    public OrFilter(Filter firstChild, Filter secondChild){
        this.firstChild = firstChild;
        this.secondChild = secondChild;
    }
    @Override
    public boolean matches(Status s) {
        return firstChild.matches(s) || secondChild.matches(s);
    }

    @Override
    public List<String> terms() {
        List<String> l = new ArrayList<>();
        l.addAll(firstChild.terms());
        l.addAll(secondChild.terms());
        return l;
    }
    public String toString() {
        return "(" + firstChild.toString() + " or " + secondChild.toString() + ")";
    }

}
