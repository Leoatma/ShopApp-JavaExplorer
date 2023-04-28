package duke.choice;

import io.helidon.common.http.Http;
import io.helidon.webserver.Handler;
import io.helidon.webserver.ServerRequest;
import io.helidon.webserver.ServerResponse;

import java.util.Arrays;


public class ItemList implements Handler {

    private Clothing[] itemList;

    public ItemList(Clothing[] addItemList) {
        this.itemList = addItemList;
    }

    @Override
    public void accept(ServerRequest req, ServerResponse res) {
        res.status(Http.Status.OK_200);
        res.headers().put("Content-Type", "text/plain; charset=UTF-8");
        StringBuilder result = new StringBuilder();
        for (Clothing item : itemList) {
            result.append(item).append("\n");
        }
        res.send(result);
    }
}
