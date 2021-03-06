package com.example.demo.util;

import com.supermap.data.Datasource;
import com.supermap.data.DatasourceConnectionInfo;
import com.supermap.data.EngineType;
import com.supermap.data.Workspace;

public class util {

    /**
     * 打开PostgreSQL数据源
     * Open the oracle datasource.
     */
    public Datasource openDatasourcePostgreSQL(String server, String database,
                                           String userName, String password) {

        Datasource ds = null;
        try {
            Workspace m_workspace=new Workspace();
            DatasourceConnectionInfo info = new DatasourceConnectionInfo();
            info.setEngineType(EngineType.POSTGRESQL);
            info.setServer(server);
            info.setDatabase(database);
            info.setUser(userName);
            info.setPassword(password);
            ds = m_workspace.getDatasources().open(info);
            // 打开成功,输出数据源相关信息
            // Open successfully, and output the information of the datasource.

        } catch (Exception ex) {

        }
        return ds;
    }

}
