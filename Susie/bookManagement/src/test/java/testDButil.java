import utl.DBUTIL.db.DBUtil;

import java.sql.Connection;

/**
 * Created by husiq on 12/22/2016.
 */
public class testDButil {
    public static void main(String[] args) throws java.sql.SQLException {
        DBUtil db = new DBUtil();
        Connection con = db.getConnection();
    }
}
