package com.example.demo.service;

import com.example.demo.domain.JDBCProperties;
import com.example.demo.domain.gsgdxz;
import com.example.demo.util.util;
import com.supermap.data.*;

import java.util.ArrayList;
import java.util.List;

public class gsgdxzService {

    util util = new util();

    public List gsgdxzList(String param,JDBCProperties JDBCProperties){

        try {

            Datasource ds = util.openDatasourcePostgreSQL(JDBCProperties.getUrl(), JDBCProperties.getDatabase(), JDBCProperties.getUsername(), JDBCProperties.getPassword());
            // 打开成功,输出数据源相关信息
            // Open successfully, and output the information of the datasource.
            if (ds != null) {
                List arrayList = new ArrayList();

                DatasetVector datasetVector = (DatasetVector) ds.getDatasets().get("gsgdxz");

                //根据属性条件查询
                QueryParameter queryParameter = new QueryParameter();
                queryParameter.setAttributeFilter(param);
                queryParameter.setHasGeometry(true);

                // 根据查询条件执行查询操作，返回查询结果记录集
                Recordset recordset = datasetVector.query(queryParameter);

                int recordCount = recordset.getRecordCount();
                recordset.moveFirst();

                for (int i = 0; i < recordCount; i++) {

                    gsgdxz gsgdxz = new gsgdxz();

                    Geometry geometry = recordset.getGeometry();

                    String geojson = Toolkit.GeometryToGeoJson(geometry);

                    gsgdxz.setId((Number) recordset.getFieldValue("id"));
                    gsgdxz.setGdbh((String) recordset.getFieldValue("gdbh"));
                    gsgdxz.setGdmc((String) recordset.getFieldValue("gdmc"));
                    gsgdxz.setXzrq((String) recordset.getFieldValue("xzrq"));
                    gsgdxz.setXzqdm((String) recordset.getFieldValue("xzqdm"));
                    gsgdxz.setXzqmc((String) recordset.getFieldValue("xzqmc"));
                    gsgdxz.setGdqd((String) recordset.getFieldValue("gdqd"));
                    gsgdxz.setGdzd((String) recordset.getFieldValue("gdzd"));
                    gsgdxz.setGdlb((String) recordset.getFieldValue("gdlb"));
                    gsgdxz.setGdlx((String) recordset.getFieldValue("gdlx"));
                    gsgdxz.setPsnd((String) recordset.getFieldValue("psnd"));
                    gsgdxz.setPsfs((String) recordset.getFieldValue("psfs"));
                    gsgdxz.setYllx((String) recordset.getFieldValue("yllx"));
                    gsgdxz.setGc((String) recordset.getFieldValue("gc"));
                    gsgdxz.setGj((Number) recordset.getFieldValue("gj"));
                    gsgdxz.setGdcd((Number) recordset.getFieldValue("gdcd"));

                    gsgdxz.setGeom(geojson);

                    arrayList.add(gsgdxz);

                    geometry.dispose();

                    recordset.moveNext();

                }

                recordset.dispose();

                return arrayList;

            } else {

                return new ArrayList();

            }

        } catch (Exception ex) {

            return new ArrayList();

        }


    }


}
