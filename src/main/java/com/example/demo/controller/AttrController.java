package com.example.demo.controller;

import com.example.demo.domain.JDBCProperties;
import com.example.demo.service.AttrService;
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

    AttrService AttrService = new AttrService();

    /**
     * 供水管道现状
     * @param param
     * @return
     */
    @RequestMapping("/gsgdxz")
    @ResponseBody
    public Object gsgdxzList(@RequestParam(value = "param", required = false, defaultValue = "") String param) {

        List gsgdxzList = AttrService.gsgdxzList(param,JDBCProperties);

        return new json("查询成功", "200", gsgdxzList);

    }

    /**
     * 供水水厂现状
     * @param param
     * @return
     */
    @RequestMapping("/gsscxz")
    @ResponseBody
    public Object gsscxzList(@RequestParam(value = "param", required = false, defaultValue = "") String param) {

        List gsscxzList = AttrService.gsscxzList(param,JDBCProperties);

        return new json("查询成功", "200", gsscxzList);

    }

    /**
     * 供水高位水厂现状
     * @param param
     * @return
     */
    @RequestMapping("/gsgwscxz")
    @ResponseBody
    public Object gsgwscxzList(@RequestParam(value = "param", required = false, defaultValue = "") String param) {

        List gsgwscxzList = AttrService.gsgwscxzList(param,JDBCProperties);

        return new json("查询成功", "200", gsgwscxzList);

    }

    /**
     * 雨水管道现状
     * @param param
     * @return
     */
    @RequestMapping("/ysgdxz")
    @ResponseBody
    public Object ysgdxzList(@RequestParam(value = "param", required = false, defaultValue = "") String param) {

        List ysgdxzList = AttrService.ysgdxzList(param,JDBCProperties);

        return new json("查询成功", "200", ysgdxzList);

    }

    /**
     * 雨水渠现状
     * @param param
     * @return
     */
    @RequestMapping("/ysqxz")
    @ResponseBody
    public Object ysqxzList(@RequestParam(value = "param", required = false, defaultValue = "") String param) {

        List ysqxzList = AttrService.ysqxzList(param,JDBCProperties);

        return new json("查询成功", "200", ysqxzList);

    }

    /**
     * 雨水排水口现状
     * @param param
     * @return
     */
    @RequestMapping("/yspskxz")
    @ResponseBody
    public Object yspskxzList(@RequestParam(value = "param", required = false, defaultValue = "") String param) {

        List yspskxzList = AttrService.yspskxzList(param,JDBCProperties);

        return new json("查询成功", "200", yspskxzList);

    }

    /**
     * 雨水提升泵站现状
     * @param param
     * @return
     */
    @RequestMapping("/ystsbzxz")
    @ResponseBody
    public Object ystsbzxzList(@RequestParam(value = "param", required = false, defaultValue = "") String param) {

        List ystsbzxzList = AttrService.ystsbzxzList(param,JDBCProperties);

        return new json("查询成功", "200", ystsbzxzList);

    }

    /**
     * 污水管道现状
     * @param param
     * @return
     */
    @RequestMapping("/wsgdxz")
    @ResponseBody
    public Object wsgdxzList(@RequestParam(value = "param", required = false, defaultValue = "") String param) {

        List wsgdxzList = AttrService.wsgdxzList(param,JDBCProperties);

        return new json("查询成功", "200", wsgdxzList);

    }

    /**
     * 污水提升泵站现状
     * @param param
     * @return
     */
    @RequestMapping("/wstsbzxz")
    @ResponseBody
    public Object wstsbzxzList(@RequestParam(value = "param", required = false, defaultValue = "") String param) {

        List wstsbzxzList = AttrService.wstsbzxzList(param,JDBCProperties);

        return new json("查询成功", "200", wstsbzxzList);

    }

    /**
     * 污水处理厂现状
     * @param param
     * @return
     */
    @RequestMapping("/wsclcxz")
    @ResponseBody
    public Object wsclcxzList(@RequestParam(value = "param", required = false, defaultValue = "") String param) {

        List wsclcxzList = AttrService.wsclcxzList(param,JDBCProperties);

        return new json("查询成功", "200", wsclcxzList);

    }

    /**
     * 污水站企业专用现状
     * @param param
     * @return
     */
    @RequestMapping("/wszqyzyxz")
    @ResponseBody
    public Object wszqyzyxzList(@RequestParam(value = "param", required = false, defaultValue = "") String param) {

        List wszqyzyxzList = AttrService.wszqyzyxzList(param,JDBCProperties);

        return new json("查询成功", "200", wszqyzyxzList);

    }

    /**
     * 通讯线现状
     * @param param
     * @return
     */
    @RequestMapping("/txxxz")
    @ResponseBody
    public Object txxxzList(@RequestParam(value = "param", required = false, defaultValue = "") String param) {

        List txxxzList = AttrService.txxxzList(param,JDBCProperties);

        return new json("查询成功", "200", txxxzList);

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
