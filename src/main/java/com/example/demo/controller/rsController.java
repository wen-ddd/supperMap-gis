package com.example.demo.controller;

import com.supermap.data.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.demo.domain.gsgdxz;
import com.example.demo.util.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class rsController {

    @Value("${spring.datasource.url}")
    private String server = "124.71.161.224:5432";
    @Value("${spring.datasource.database}")
    private String database = "test";
    @Value("${spring.datasource.username}")
    private String userName = "postgres";
    @Value("${spring.datasource.password}")
    private String password = "admin123";

    List arrayList = new ArrayList();
    util util = new util();

    @RequestMapping("/gsgdxz")
    @ResponseBody
    public Object geojson(@RequestParam(value = "param", required = false, defaultValue = "") String param) {

        gsgdxz gsgdxz = new gsgdxz();

        try {

            Datasource ds = util.openDatasourcePostgreSQL(server,database,userName,password);
            // 打开成功,输出数据源相关信息
            // Open successfully, and output the information of the datasource.
            if (ds != null) {

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

                return new json("查询成功","200",arrayList);

            } else {

                return new json("查询失败","201",arrayList);

            }

        } catch (Exception ex) {

            return new json("查询失败","201",arrayList);

        }

    }


}
