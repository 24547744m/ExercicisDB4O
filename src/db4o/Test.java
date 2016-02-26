package db4o;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.config.EmbeddedConfiguration;

/**
 * Created by damuser on 25/02/16.
 */
public class Test {

    public static void main(String[] args) {

        EmbeddedConfiguration configuration = Db4oEmbedded.newConfiguration();
        configuration.common().objectClass(Jugador.class).cascadeOnUpdate(true);
        ObjectContainer db = Db4oEmbedded.openFile("src/db/football.db4o");

//        db.query();
        db.close();

    }


}
