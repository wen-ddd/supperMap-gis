package com.example.demo.controller;

import com.example.demo.domain.JDBCProperties;
import com.example.demo.service.gsgdxzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.demo.util.*;

import java.util.List;


@Controller
@RequestMapping("/attr")
public class AttrController {
    @Autowired
    JDBCProperties JDBCProperties;

    gsgdxzService gsgdxzService = new gsgdxzService();

    @RequestMapping("/gsgdxz")
    @ResponseBody
    public Object gsgdxzList(@RequestParam(value = "param", required = false, defaultValue = "") String param) {

        List gsgdxzList = gsgdxzService.gsgdxzList(param,JDBCProperties);

        return new json("查询成功", "200", gsgdxzList);

    }


//    @RequestMapping("/gsgdxz/space")
//    @ResponseBody
//    public Object getSpaceData(@RequestParam(value = "param", required = false, defaultValue = "") String param) {
//
//        gsgdxz gsgdxz = new gsgdxz();
//
//        try {
//
////            Datasource ds = util.openDatasourcePostgreSQL(server, database, userName, password);
//            Datasource ds = util.openDatasourcePostgreSQL(JDBCProperties.getUrl(), JDBCProperties.getDatabase(), JDBCProperties.getUsername(), JDBCProperties.getPassword());
//
//            // 打开成功,输出数据源相关信息
//            // Open successfully, and output the information of the datasource.
//            if (ds != null) {
//                List arrayList = new ArrayList();
//
//                DatasetVector datasetVector = (DatasetVector) ds.getDatasets().get("gsgdxz");
//
//                // 返回空间查询中的搜索对象
//                Recordset srcRecordset = datasetVector.query("id=80",CursorType.STATIC);
//
//                // 设置查询参数
//                QueryParameter parameter = new QueryParameter();
//                parameter.setAttributeFilter("id<80");
//                parameter.setCursorType(CursorType.STATIC);
//                parameter.setSpatialQueryMode(SpatialQueryMode.DISJOINT);
//                parameter.setSpatialQueryObject(srcRecordset);
//
//
//                // 根据查询条件执行查询操作，返回查询结果记录集
//                Recordset recordset = datasetVector.query(parameter);
//
//                int recordCount = recordset.getRecordCount();
//                recordset.moveFirst();
//
//                for (int i = 0; i < recordCount; i++) {
//
//                    Geometry geometry = recordset.getGeometry();
//
//                    String geojson = Toolkit.GeometryToGeoJson(geometry);
//
//                    gsgdxz.setId((Number) recordset.getFieldValue("id"));
//                    gsgdxz.setGdbh((String) recordset.getFieldValue("gdbh"));
//                    gsgdxz.setGdmc((String) recordset.getFieldValue("gdmc"));
//                    gsgdxz.setXzrq((String) recordset.getFieldValue("xzrq"));
//                    gsgdxz.setXzqdm((String) recordset.getFieldValue("xzqdm"));
//                    gsgdxz.setXzqmc((String) recordset.getFieldValue("xzqmc"));
//                    gsgdxz.setGdqd((String) recordset.getFieldValue("gdqd"));
//                    gsgdxz.setGdzd((String) recordset.getFieldValue("gdzd"));
//                    gsgdxz.setGdlb((String) recordset.getFieldValue("gdlb"));
//                    gsgdxz.setGdlx((String) recordset.getFieldValue("gdlx"));
//                    gsgdxz.setPsnd((String) recordset.getFieldValue("psnd"));
//                    gsgdxz.setPsfs((String) recordset.getFieldValue("psfs"));
//                    gsgdxz.setYllx((String) recordset.getFieldValue("yllx"));
//                    gsgdxz.setGc((String) recordset.getFieldValue("gc"));
//                    gsgdxz.setGj((Number) recordset.getFieldValue("gj"));
//                    gsgdxz.setGdcd((Number) recordset.getFieldValue("gdcd"));
//
//                    gsgdxz.setGeom(geojson);
//
//                    arrayList.add(gsgdxz);
//
//                    geometry.dispose();
//
//                    recordset.moveNext();
//
//                }
//
//                recordset.dispose();
//
//                return new json("查询成功", "200", arrayList);
//
//            } else {
//
//                return new json("查询失败", "201", new ArrayList());
//
//            }
//
//        } catch (Exception ex) {
//
//            return new json("查询失败", "201", new ArrayList());
//
//        }
//
//    }


}
