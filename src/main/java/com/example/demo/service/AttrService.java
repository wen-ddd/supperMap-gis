package com.example.demo.service;

import com.example.demo.domain.JDBCProperties;
import com.example.demo.domain.*;
import com.example.demo.util.util;
import com.supermap.data.*;

import java.util.ArrayList;
import java.util.List;

public class AttrService {

    util util = new util();

    /**
     * 供水管道现状数据
     * @param param 条件
     * @param JDBCProperties
     * @return
     */
    public List gsgdxzList(String param, JDBCProperties JDBCProperties) {

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

    /**
     * 供水水厂现状
     * @param param
     * @param JDBCProperties
     * @return
     */
    public List gsscxzList(String param, JDBCProperties JDBCProperties) {

        try {

            Datasource ds = util.openDatasourcePostgreSQL(JDBCProperties.getUrl(), JDBCProperties.getDatabase(), JDBCProperties.getUsername(), JDBCProperties.getPassword());
            // 打开成功,输出数据源相关信息
            // Open successfully, and output the information of the datasource.
            if (ds != null) {
                List arrayList = new ArrayList();

                DatasetVector datasetVector = (DatasetVector) ds.getDatasets().get("gsscxz");

                //根据属性条件查询
                QueryParameter queryParameter = new QueryParameter();
                queryParameter.setAttributeFilter(param);
                queryParameter.setHasGeometry(true);

                // 根据查询条件执行查询操作，返回查询结果记录集
                Recordset recordset = datasetVector.query(queryParameter);

                int recordCount = recordset.getRecordCount();
                recordset.moveFirst();

                for (int i = 0; i < recordCount; i++) {

                    gsscxz gsscxz = new gsscxz();

                    Geometry geometry = recordset.getGeometry();

                    String geojson = Toolkit.GeometryToGeoJson(geometry);
                    String id = String.valueOf(recordset.getFieldValue("id"));
                    String zdmj = String.valueOf(recordset.getFieldValue("zdmj"));
                    String sjgm = String.valueOf(recordset.getFieldValue("sjgm"));
                    String sjgsgm = String.valueOf(recordset.getFieldValue("sjgsgm"));

                    gsscxz.setId(Integer.valueOf(id));
                    gsscxz.setZdmj(Double.valueOf(zdmj));
                    gsscxz.setSjgm(Double.valueOf(sjgm));
                    gsscxz.setSjgsgm(Double.valueOf(sjgsgm));
                    gsscxz.setScmc((String) recordset.getFieldValue("scmc"));
                    gsscxz.setXzrq((String) recordset.getFieldValue("xzrq"));
                    gsscxz.setXzqdm((String) recordset.getFieldValue("xzqdm"));
                    gsscxz.setXzqmc((String) recordset.getFieldValue("xzqmc"));
                    gsscxz.setWz((String) recordset.getFieldValue("wz"));
                    gsscxz.setSclb((String) recordset.getFieldValue("sclb"));
                    gsscxz.setJsnd((String) recordset.getFieldValue("jsnd"));
                    gsscxz.setSy((String) recordset.getFieldValue("sy"));
                    gsscxz.setGsqy((String) recordset.getFieldValue("gsqy"));
                    gsscxz.setGeom(geojson);

                    arrayList.add(gsscxz);

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

    /**
     * 供水高位水厂现状
     * @param param
     * @param JDBCProperties
     * @return
     */
    public List gsgwscxzList(String param, JDBCProperties JDBCProperties) {

        try {

            Datasource ds = util.openDatasourcePostgreSQL(JDBCProperties.getUrl(), JDBCProperties.getDatabase(), JDBCProperties.getUsername(), JDBCProperties.getPassword());
            // 打开成功,输出数据源相关信息
            // Open successfully, and output the information of the datasource.
            if (ds != null) {
                List arrayList = new ArrayList();

                DatasetVector datasetVector = (DatasetVector) ds.getDatasets().get("gsgwscxz");

                //根据属性条件查询
                QueryParameter queryParameter = new QueryParameter();
                queryParameter.setAttributeFilter(param);
                queryParameter.setHasGeometry(true);

                // 根据查询条件执行查询操作，返回查询结果记录集
                Recordset recordset = datasetVector.query(queryParameter);

                int recordCount = recordset.getRecordCount();
                recordset.moveFirst();

                for (int i = 0; i < recordCount; i++) {

                    gsgwscxz gsgwscxz = new gsgwscxz();

                    Geometry geometry = recordset.getGeometry();

                    String geojson = Toolkit.GeometryToGeoJson(geometry);
                    String id = String.valueOf(recordset.getFieldValue("id"));
                    String zdmj = String.valueOf(recordset.getFieldValue("zdmj"));
                    String sjgm = String.valueOf(recordset.getFieldValue("sjgm"));
                    String sjgsgm = String.valueOf(recordset.getFieldValue("sjgsgm"));
                    String scrl = String.valueOf(recordset.getFieldValue("scrl"));

                    gsgwscxz.setId(Integer.valueOf(id));
                    gsgwscxz.setZdmj(Double.valueOf(zdmj));
                    gsgwscxz.setSjgm(Double.valueOf(sjgm));
                    gsgwscxz.setSjgsgm(Double.valueOf(sjgsgm));
                    gsgwscxz.setScrl(Double.valueOf(scrl));
                    gsgwscxz.setGwscmc((String) recordset.getFieldValue("gwscmc"));
                    gsgwscxz.setXzrq((String) recordset.getFieldValue("xzrq"));
                    gsgwscxz.setXzqdm((String) recordset.getFieldValue("xzqdm"));
                    gsgwscxz.setXzqmc((String) recordset.getFieldValue("xzqmc"));
                    gsgwscxz.setWz((String) recordset.getFieldValue("wz"));
                    gsgwscxz.setSclb((String) recordset.getFieldValue("sclb"));
                    gsgwscxz.setJsnd((String) recordset.getFieldValue("jsnd"));
                    gsgwscxz.setQs((String) recordset.getFieldValue("qs"));
                    gsgwscxz.setGsqy((String) recordset.getFieldValue("gsqy"));
                    gsgwscxz.setGeom(geojson);

                    arrayList.add(gsgwscxz);

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

    /**
     * 雨水管道现状
     * @param param
     * @param JDBCProperties
     * @return
     */
    public List ysgdxzList(String param, JDBCProperties JDBCProperties) {

        try {

            Datasource ds = util.openDatasourcePostgreSQL(JDBCProperties.getUrl(), JDBCProperties.getDatabase(), JDBCProperties.getUsername(), JDBCProperties.getPassword());
            // 打开成功,输出数据源相关信息
            // Open successfully, and output the information of the datasource.
            if (ds != null) {
                List arrayList = new ArrayList();

                DatasetVector datasetVector = (DatasetVector) ds.getDatasets().get("ysgdxz");

                //根据属性条件查询
                QueryParameter queryParameter = new QueryParameter();
                queryParameter.setAttributeFilter(param);
                queryParameter.setHasGeometry(true);

                // 根据查询条件执行查询操作，返回查询结果记录集
                Recordset recordset = datasetVector.query(queryParameter);

                int recordCount = recordset.getRecordCount();
                recordset.moveFirst();

                for (int i = 0; i < recordCount; i++) {

                    ysgdxz ysgdxz = new ysgdxz();

                    Geometry geometry = recordset.getGeometry();

                    String geojson = Toolkit.GeometryToGeoJson(geometry);
                    String id = String.valueOf(recordset.getFieldValue("id"));
                    String qddmbg = String.valueOf(recordset.getFieldValue("qddmbg"));
                    String qdgdbg = String.valueOf(recordset.getFieldValue("qdgdbg"));
                    String zddmbg = String.valueOf(recordset.getFieldValue("zddmbg"));
                    String zdgdbg = String.valueOf(recordset.getFieldValue("zdgdbg"));
                    String pd = String.valueOf(recordset.getFieldValue("pd"));
                    String gdcd = String.valueOf(recordset.getFieldValue("gdcd"));

                    ysgdxz.setId(Integer.valueOf(id));
                    ysgdxz.setQddmbg(Double.valueOf(qddmbg));
                    ysgdxz.setQdgdbg(Double.valueOf(qdgdbg));
                    ysgdxz.setZddmbg(Double.valueOf(zddmbg));
                    ysgdxz.setZdgdbg(Double.valueOf(zdgdbg));
                    ysgdxz.setPd(Double.valueOf(pd));
                    ysgdxz.setGdcd(Double.valueOf(gdcd));

                    ysgdxz.setGdbh((String) recordset.getFieldValue("gdbh"));
                    ysgdxz.setGdmc((String) recordset.getFieldValue("gdmc"));
                    ysgdxz.setXzrq((String) recordset.getFieldValue("xzrq"));
                    ysgdxz.setXzqdm((String) recordset.getFieldValue("xzqdm"));
                    ysgdxz.setXzqmc((String) recordset.getFieldValue("xzqmc"));
                    ysgdxz.setGdqd((String) recordset.getFieldValue("gdqd"));
                    ysgdxz.setGdzd((String) recordset.getFieldValue("gdzd"));
                    ysgdxz.setPsnd((String) recordset.getFieldValue("psnd"));
                    ysgdxz.setGc((String) recordset.getFieldValue("gc"));
                    ysgdxz.setGj((String) recordset.getFieldValue("gj"));
                    ysgdxz.setGeom(geojson);

                    arrayList.add(ysgdxz);

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

    /**
     * 雨水渠现状
     * @param param
     * @param JDBCProperties
     * @return
     */
    public List ysqxzList(String param, JDBCProperties JDBCProperties) {

        try {

            Datasource ds = util.openDatasourcePostgreSQL(JDBCProperties.getUrl(), JDBCProperties.getDatabase(), JDBCProperties.getUsername(), JDBCProperties.getPassword());
            // 打开成功,输出数据源相关信息
            // Open successfully, and output the information of the datasource.
            if (ds != null) {
                List arrayList = new ArrayList();

                DatasetVector datasetVector = (DatasetVector) ds.getDatasets().get("ysqxz");

                //根据属性条件查询
                QueryParameter queryParameter = new QueryParameter();
                queryParameter.setAttributeFilter(param);
                queryParameter.setHasGeometry(true);

                // 根据查询条件执行查询操作，返回查询结果记录集
                Recordset recordset = datasetVector.query(queryParameter);

                int recordCount = recordset.getRecordCount();
                recordset.moveFirst();

                for (int i = 0; i < recordCount; i++) {

                    ysqxz ysqxz = new ysqxz();

                    Geometry geometry = recordset.getGeometry();

                    String geojson = Toolkit.GeometryToGeoJson(geometry);
                    String id = String.valueOf(recordset.getFieldValue("id"));
                    String qddmbg = String.valueOf(recordset.getFieldValue("qddmbg"));
                    String qdqdbg = String.valueOf(recordset.getFieldValue("qdqdbg"));
                    String zddmbg = String.valueOf(recordset.getFieldValue("zddmbg"));
                    String zdqdbg = String.valueOf(recordset.getFieldValue("zdqdbg"));
                    String qk = String.valueOf(recordset.getFieldValue("qk"));
                    String qs = String.valueOf(recordset.getFieldValue("qs"));
                    String qcd = String.valueOf(recordset.getFieldValue("qcd"));
                    String pd = String.valueOf(recordset.getFieldValue("pd"));

                    ysqxz.setId(Integer.valueOf(id));
                    ysqxz.setQddmbg(Double.valueOf(qddmbg));
                    ysqxz.setQdqdbg(Double.valueOf(qdqdbg));
                    ysqxz.setZddmbg(Double.valueOf(zddmbg));
                    ysqxz.setZddmbg(Double.valueOf(zdqdbg));
                    ysqxz.setPd(Double.valueOf(pd));
                    ysqxz.setQk(Double.valueOf(qk));
                    ysqxz.setQs(Double.valueOf(qs));
                    ysqxz.setQcd(Double.valueOf(qcd));

                    ysqxz.setYsqbh((String) recordset.getFieldValue("ysqbh"));
                    ysqxz.setYsqmc((String) recordset.getFieldValue("ysqmc"));
                    ysqxz.setXzrq((String) recordset.getFieldValue("xzrq"));
                    ysqxz.setXzqdm((String) recordset.getFieldValue("xzqdm"));
                    ysqxz.setXzqmc((String) recordset.getFieldValue("xzqmc"));
                    ysqxz.setQqd((String) recordset.getFieldValue("qqd"));
                    ysqxz.setQzd((String) recordset.getFieldValue("qzd"));
                    ysqxz.setJsnd((String) recordset.getFieldValue("jsnd"));
                    ysqxz.setLx((String) recordset.getFieldValue("lx"));
                    ysqxz.setGeom(geojson);

                    arrayList.add(ysqxz);

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

    /**
     * 雨水排水口现状
     * @param param
     * @param JDBCProperties
     * @return
     */
    public List yspskxzList(String param, JDBCProperties JDBCProperties) {

        try {

            Datasource ds = util.openDatasourcePostgreSQL(JDBCProperties.getUrl(), JDBCProperties.getDatabase(), JDBCProperties.getUsername(), JDBCProperties.getPassword());
            // 打开成功,输出数据源相关信息
            // Open successfully, and output the information of the datasource.
            if (ds != null) {
                List arrayList = new ArrayList();

                DatasetVector datasetVector = (DatasetVector) ds.getDatasets().get("yspskxz");

                //根据属性条件查询
                QueryParameter queryParameter = new QueryParameter();
                queryParameter.setAttributeFilter(param);
                queryParameter.setHasGeometry(true);

                // 根据查询条件执行查询操作，返回查询结果记录集
                Recordset recordset = datasetVector.query(queryParameter);

                int recordCount = recordset.getRecordCount();
                recordset.moveFirst();

                for (int i = 0; i < recordCount; i++) {

                    yspskxz yspskxz = new yspskxz();

                    Geometry geometry = recordset.getGeometry();

                    String geojson = Toolkit.GeometryToGeoJson(geometry);
                    String id = String.valueOf(recordset.getFieldValue("id"));
                    String zdpsl = String.valueOf(recordset.getFieldValue("zdpsl"));

                    yspskxz.setId(Integer.valueOf(id));
                    yspskxz.setZdpsl(Double.valueOf(zdpsl));

                    yspskxz.setPskbh((String) recordset.getFieldValue("pskbh"));
                    yspskxz.setPskmc((String) recordset.getFieldValue("pskmc"));
                    yspskxz.setXzrq((String) recordset.getFieldValue("xzrq"));
                    yspskxz.setWz((String) recordset.getFieldValue("wz"));
                    yspskxz.setJsnd((String) recordset.getFieldValue("jsnd"));
                    yspskxz.setPrwz((String) recordset.getFieldValue("prwz"));
                    yspskxz.setGeom(geojson);

                    arrayList.add(yspskxz);

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

    /**
     * 雨水提升泵站现状
     * @param param
     * @param JDBCProperties
     * @return
     */
    public List ystsbzxzList(String param, JDBCProperties JDBCProperties) {

        try {

            Datasource ds = util.openDatasourcePostgreSQL(JDBCProperties.getUrl(), JDBCProperties.getDatabase(), JDBCProperties.getUsername(), JDBCProperties.getPassword());
            // 打开成功,输出数据源相关信息
            // Open successfully, and output the information of the datasource.
            if (ds != null) {
                List arrayList = new ArrayList();

                DatasetVector datasetVector = (DatasetVector) ds.getDatasets().get("ystsbzxz");

                //根据属性条件查询
                QueryParameter queryParameter = new QueryParameter();
                queryParameter.setAttributeFilter(param);
                queryParameter.setHasGeometry(true);

                // 根据查询条件执行查询操作，返回查询结果记录集
                Recordset recordset = datasetVector.query(queryParameter);

                int recordCount = recordset.getRecordCount();
                recordset.moveFirst();

                for (int i = 0; i < recordCount; i++) {

                    ystsbzxz ystsbzxz = new ystsbzxz();

                    Geometry geometry = recordset.getGeometry();

                    String geojson = Toolkit.GeometryToGeoJson(geometry);
                    String id = String.valueOf(recordset.getFieldValue("id"));
                    String sbll = String.valueOf(recordset.getFieldValue("sbll"));
                    String yc = String.valueOf(recordset.getFieldValue("yc"));
                    String rydl = String.valueOf(recordset.getFieldValue("rydl"));

                    ystsbzxz.setId(Integer.valueOf(id));
                    ystsbzxz.setSbll(Double.valueOf(sbll));
                    ystsbzxz.setYc(Double.valueOf(yc));
                    ystsbzxz.setRydl(Double.valueOf(rydl));

                    ystsbzxz.setTsbbh((String) recordset.getFieldValue("tsbbh"));
                    ystsbzxz.setTsbmc((String) recordset.getFieldValue("tsbmc"));
                    ystsbzxz.setXzrq((String) recordset.getFieldValue("xzrq"));
                    ystsbzxz.setXzqdm((String) recordset.getFieldValue("xzqdm"));
                    ystsbzxz.setXzqmc((String) recordset.getFieldValue("xzqmc"));
                    ystsbzxz.setWz((String) recordset.getFieldValue("wz"));
                    ystsbzxz.setJsnd((String) recordset.getFieldValue("jsnd"));
                    ystsbzxz.setQs((String) recordset.getFieldValue("qs"));
                    ystsbzxz.setGeom(geojson);

                    arrayList.add(ystsbzxz);

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

    /**
     * 污水管道现状
     * @param param
     * @param JDBCProperties
     * @return
     */
    public List wsgdxzList(String param, JDBCProperties JDBCProperties) {

        try {

            Datasource ds = util.openDatasourcePostgreSQL(JDBCProperties.getUrl(), JDBCProperties.getDatabase(), JDBCProperties.getUsername(), JDBCProperties.getPassword());
            // 打开成功,输出数据源相关信息
            // Open successfully, and output the information of the datasource.
            if (ds != null) {
                List arrayList = new ArrayList();

                DatasetVector datasetVector = (DatasetVector) ds.getDatasets().get("wsgdxz");

                //根据属性条件查询
                QueryParameter queryParameter = new QueryParameter();
                queryParameter.setAttributeFilter(param);
                queryParameter.setHasGeometry(true);

                // 根据查询条件执行查询操作，返回查询结果记录集
                Recordset recordset = datasetVector.query(queryParameter);

                int recordCount = recordset.getRecordCount();
                recordset.moveFirst();

                for (int i = 0; i < recordCount; i++) {

                    wsgdxz wsgdxz = new wsgdxz();

                    Geometry geometry = recordset.getGeometry();

                    String geojson = Toolkit.GeometryToGeoJson(geometry);
                    String id = String.valueOf(recordset.getFieldValue("id"));
                    String gj = String.valueOf(recordset.getFieldValue("gj"));
                    String gdcd = String.valueOf(recordset.getFieldValue("gdcd"));
                    String pd = String.valueOf(recordset.getFieldValue("pd"));
                    String qddmbg = String.valueOf(recordset.getFieldValue("qddmbg"));
                    String qdgdbg = String.valueOf(recordset.getFieldValue("qdgdbg"));
                    String zddmbg = String.valueOf(recordset.getFieldValue("zddmbg"));
                    String zdgdbg = String.valueOf(recordset.getFieldValue("zdgdbg"));

                    wsgdxz.setId(Integer.valueOf(id));
                    wsgdxz.setGj(Double.valueOf(gj));
                    wsgdxz.setGdcd(Double.valueOf(gdcd));
                    wsgdxz.setPd(Double.valueOf(pd));
                    wsgdxz.setQddmbg(Double.valueOf(qddmbg));
                    wsgdxz.setQdgdbg(Double.valueOf(qdgdbg));
                    wsgdxz.setZddmbg(Double.valueOf(zddmbg));
                    wsgdxz.setZdgdbg(Double.valueOf(zdgdbg));

                    wsgdxz.setGdbh((String) recordset.getFieldValue("gdbh"));
                    wsgdxz.setGdmc((String) recordset.getFieldValue("gdmc"));
                    wsgdxz.setXzrq((String) recordset.getFieldValue("xzrq"));
                    wsgdxz.setXzqdm((String) recordset.getFieldValue("xzqdm"));
                    wsgdxz.setXzqmc((String) recordset.getFieldValue("xzqmc"));
                    wsgdxz.setGdqd((String) recordset.getFieldValue("gdqd"));
                    wsgdxz.setGdzd((String) recordset.getFieldValue("gdzd"));
                    wsgdxz.setPsnd((String) recordset.getFieldValue("psnd"));
                    wsgdxz.setPsfs((String) recordset.getFieldValue("psfs"));
                    wsgdxz.setYllx((String) recordset.getFieldValue("yllx"));
                    wsgdxz.setGc((String) recordset.getFieldValue("gc"));

                    wsgdxz.setGeom(geojson);

                    arrayList.add(wsgdxz);

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

    /**
     * 污水提升泵站现状
     * @param param
     * @param JDBCProperties
     * @return
     */
    public List wstsbzxzList(String param, JDBCProperties JDBCProperties) {

        try {

            Datasource ds = util.openDatasourcePostgreSQL(JDBCProperties.getUrl(), JDBCProperties.getDatabase(), JDBCProperties.getUsername(), JDBCProperties.getPassword());
            // 打开成功,输出数据源相关信息
            // Open successfully, and output the information of the datasource.
            if (ds != null) {
                List arrayList = new ArrayList();

                DatasetVector datasetVector = (DatasetVector) ds.getDatasets().get("wstsbzxz");

                //根据属性条件查询
                QueryParameter queryParameter = new QueryParameter();
                queryParameter.setAttributeFilter(param);
                queryParameter.setHasGeometry(true);

                // 根据查询条件执行查询操作，返回查询结果记录集
                Recordset recordset = datasetVector.query(queryParameter);

                int recordCount = recordset.getRecordCount();
                recordset.moveFirst();

                for (int i = 0; i < recordCount; i++) {

                    wstsbzxz wstsbzxz = new wstsbzxz();

                    Geometry geometry = recordset.getGeometry();

                    String geojson = Toolkit.GeometryToGeoJson(geometry);
                    String id = String.valueOf(recordset.getFieldValue("id"));
                    String sbll = String.valueOf(recordset.getFieldValue("sbll"));
                    String rydl = String.valueOf(recordset.getFieldValue("rydl"));
                    String yc = String.valueOf(recordset.getFieldValue("yc"));
                    String sjgm = String.valueOf(recordset.getFieldValue("sjgm"));
                    String zdmj = String.valueOf(recordset.getFieldValue("zdmj"));

                    wstsbzxz.setId(Integer.valueOf(id));
                    wstsbzxz.setSbll(Double.valueOf(sbll));
                    wstsbzxz.setRydl(Double.valueOf(rydl));
                    wstsbzxz.setYc(Double.valueOf(yc));
                    wstsbzxz.setSjgm(Double.valueOf(sjgm));
                    wstsbzxz.setZdmj(Double.valueOf(zdmj));

                    wstsbzxz.setBzmc((String) recordset.getFieldValue("bzmc"));
                    wstsbzxz.setXzrq((String) recordset.getFieldValue("xzrq"));
                    wstsbzxz.setXzqdm((String) recordset.getFieldValue("xzqdm"));
                    wstsbzxz.setXzqmc((String) recordset.getFieldValue("xzqmc"));
                    wstsbzxz.setWz((String) recordset.getFieldValue("wz"));
                    wstsbzxz.setJsnd((String) recordset.getFieldValue("jsnd"));
                    wstsbzxz.setFwqy((String) recordset.getFieldValue("fwqy"));
                    wstsbzxz.setQs((String) recordset.getFieldValue("qs"));
                    wstsbzxz.setGeom(geojson);

                    arrayList.add(wstsbzxz);

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

    /**
     * 污水处理厂现状
     * @param param
     * @param JDBCProperties
     * @return
     */
    public List wsclcxzList(String param, JDBCProperties JDBCProperties) {

        try {

            Datasource ds = util.openDatasourcePostgreSQL(JDBCProperties.getUrl(), JDBCProperties.getDatabase(), JDBCProperties.getUsername(), JDBCProperties.getPassword());
            // 打开成功,输出数据源相关信息
            // Open successfully, and output the information of the datasource.
            if (ds != null) {
                List arrayList = new ArrayList();

                DatasetVector datasetVector = (DatasetVector) ds.getDatasets().get("wsclcxz");

                //根据属性条件查询
                QueryParameter queryParameter = new QueryParameter();
                queryParameter.setAttributeFilter(param);
                queryParameter.setHasGeometry(true);

                // 根据查询条件执行查询操作，返回查询结果记录集
                Recordset recordset = datasetVector.query(queryParameter);

                int recordCount = recordset.getRecordCount();
                recordset.moveFirst();

                for (int i = 0; i < recordCount; i++) {

                    wsclcxz wsclcxz = new wsclcxz();

                    Geometry geometry = recordset.getGeometry();

                    String geojson = Toolkit.GeometryToGeoJson(geometry);
                    String id = String.valueOf(recordset.getFieldValue("id"));
                    String zdmj = String.valueOf(recordset.getFieldValue("zdmj"));
                    String sjgm = String.valueOf(recordset.getFieldValue("sjgm"));
                    String sjclgm = String.valueOf(recordset.getFieldValue("sjclgm"));

                    wsclcxz.setId(Integer.valueOf(id));
                    wsclcxz.setZdmj(Double.valueOf(zdmj));
                    wsclcxz.setSjgm(Double.valueOf(sjgm));
                    wsclcxz.setSjclgm(Double.valueOf(sjclgm));

                    wsclcxz.setScmc((String) recordset.getFieldValue("scmc"));
                    wsclcxz.setXzrq((String) recordset.getFieldValue("xzrq"));
                    wsclcxz.setXzqdm((String) recordset.getFieldValue("xzqdm"));
                    wsclcxz.setXzqmc((String) recordset.getFieldValue("xzqmc"));
                    wsclcxz.setWz((String) recordset.getFieldValue("wz"));
                    wsclcxz.setJsnd((String) recordset.getFieldValue("jsnd"));
                    wsclcxz.setFwqy((String) recordset.getFieldValue("fwqy"));

                    wsclcxz.setGeom(geojson);

                    arrayList.add(wsclcxz);

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

    /**
     * 污水站企业专用现状
     * @param param
     * @param JDBCProperties
     * @return
     */
    public List wszqyzyxzList(String param, JDBCProperties JDBCProperties) {

        try {

            Datasource ds = util.openDatasourcePostgreSQL(JDBCProperties.getUrl(), JDBCProperties.getDatabase(), JDBCProperties.getUsername(), JDBCProperties.getPassword());
            // 打开成功,输出数据源相关信息
            // Open successfully, and output the information of the datasource.
            if (ds != null) {
                List arrayList = new ArrayList();

                DatasetVector datasetVector = (DatasetVector) ds.getDatasets().get("wszqyzyxz");

                //根据属性条件查询
                QueryParameter queryParameter = new QueryParameter();
                queryParameter.setAttributeFilter(param);
                queryParameter.setHasGeometry(true);

                // 根据查询条件执行查询操作，返回查询结果记录集
                Recordset recordset = datasetVector.query(queryParameter);

                int recordCount = recordset.getRecordCount();
                recordset.moveFirst();

                for (int i = 0; i < recordCount; i++) {

                    wszqyzyxz wszqyzyxz = new wszqyzyxz();

                    Geometry geometry = recordset.getGeometry();

                    String geojson = Toolkit.GeometryToGeoJson(geometry);
                    String id = String.valueOf(recordset.getFieldValue("id"));
                    String zdmj = String.valueOf(recordset.getFieldValue("zdmj"));
                    String rclnl = String.valueOf(recordset.getFieldValue("rclnl"));

                    wszqyzyxz.setId(Integer.valueOf(id));
                    wszqyzyxz.setZdmj(Double.valueOf(zdmj));
                    wszqyzyxz.setRclnl(Double.valueOf(rclnl));

                    wszqyzyxz.setWszmc((String) recordset.getFieldValue("wszmc"));
                    wszqyzyxz.setXzrq((String) recordset.getFieldValue("xzrq"));
                    wszqyzyxz.setWz((String) recordset.getFieldValue("wz"));
                    wszqyzyxz.setJsnd((String) recordset.getFieldValue("jsnd"));
                    wszqyzyxz.setFwqy((String) recordset.getFieldValue("fwqy"));
                    wszqyzyxz.setSsqy((String) recordset.getFieldValue("ssqy"));

                    wszqyzyxz.setGeom(geojson);

                    arrayList.add(wszqyzyxz);

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

    /**
     * 通讯线现状
     * @param param
     * @param JDBCProperties
     * @return
     */
    public List txxxzList(String param, JDBCProperties JDBCProperties) {

        try {

            Datasource ds = util.openDatasourcePostgreSQL(JDBCProperties.getUrl(), JDBCProperties.getDatabase(), JDBCProperties.getUsername(), JDBCProperties.getPassword());
            // 打开成功,输出数据源相关信息
            // Open successfully, and output the information of the datasource.
            if (ds != null) {
                List arrayList = new ArrayList();

                DatasetVector datasetVector = (DatasetVector) ds.getDatasets().get("txxxz");

                //根据属性条件查询
                QueryParameter queryParameter = new QueryParameter();
                queryParameter.setAttributeFilter(param);
                queryParameter.setHasGeometry(true);

                // 根据查询条件执行查询操作，返回查询结果记录集
                Recordset recordset = datasetVector.query(queryParameter);

                int recordCount = recordset.getRecordCount();
                recordset.moveFirst();

                for (int i = 0; i < recordCount; i++) {

                    txxxz txxxz = new txxxz();

                    Geometry geometry = recordset.getGeometry();

                    String geojson = Toolkit.GeometryToGeoJson(geometry);
                    String id = String.valueOf(recordset.getFieldValue("id"));
                    String txxcd = String.valueOf(recordset.getFieldValue("txxcd"));

                    txxxz.setId(Integer.valueOf(id));
                    txxxz.setTxxcd(Double.valueOf(txxcd));

                    txxxz.setTxxbh((String) recordset.getFieldValue("txxbh"));
                    txxxz.setTxxmc((String) recordset.getFieldValue("txxmc"));
                    txxxz.setXzrq((String) recordset.getFieldValue("xzrq"));
                    txxxz.setXzqdm((String) recordset.getFieldValue("xzqdm"));
                    txxxz.setXzqmc((String) recordset.getFieldValue("xzqmc"));
                    txxxz.setTxxqd((String) recordset.getFieldValue("txxqd"));
                    txxxz.setTxxzd((String) recordset.getFieldValue("txxzd"));
                    txxxz.setTxyys((String) recordset.getFieldValue("txyys"));
                    txxxz.setPsfs((String) recordset.getFieldValue("psfs"));
                    txxxz.setTxgks((String) recordset.getFieldValue("txgks"));

                    txxxz.setGeom(geojson);

                    arrayList.add(txxxz);

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

    /**
     * 通讯基站现状
     * @param param
     * @param JDBCProperties
     * @return
     */
    public List txjzxzList(String param, JDBCProperties JDBCProperties) {

        try {

            Datasource ds = util.openDatasourcePostgreSQL(JDBCProperties.getUrl(), JDBCProperties.getDatabase(), JDBCProperties.getUsername(), JDBCProperties.getPassword());
            // 打开成功,输出数据源相关信息
            // Open successfully, and output the information of the datasource.
            if (ds != null) {
                List arrayList = new ArrayList();

                DatasetVector datasetVector = (DatasetVector) ds.getDatasets().get("txjzxz");

                //根据属性条件查询
                QueryParameter queryParameter = new QueryParameter();
                queryParameter.setAttributeFilter(param);
                queryParameter.setHasGeometry(true);

                // 根据查询条件执行查询操作，返回查询结果记录集
                Recordset recordset = datasetVector.query(queryParameter);

                int recordCount = recordset.getRecordCount();
                recordset.moveFirst();

                for (int i = 0; i < recordCount; i++) {

                    txjzxz txjzxz = new txjzxz();

                    Geometry geometry = recordset.getGeometry();

                    String geojson = Toolkit.GeometryToGeoJson(geometry);
                    String id = String.valueOf(recordset.getFieldValue("id"));
                    String rydl = String.valueOf(recordset.getFieldValue("rydl"));
                    String fwbj = String.valueOf(recordset.getFieldValue("fwbj"));


                    txjzxz.setId(Integer.valueOf(id));
                    txjzxz.setRydl(Double.valueOf(rydl));
                    txjzxz.setFwbj(Double.valueOf(fwbj));


                    txjzxz.setJzbh((String) recordset.getFieldValue("jzbh"));
                    txjzxz.setJzmc((String) recordset.getFieldValue("jzmc"));
                    txjzxz.setXzrq((String) recordset.getFieldValue("xzrq"));
                    txjzxz.setXzqdm((String) recordset.getFieldValue("xzqdm"));
                    txjzxz.setXzqmc((String) recordset.getFieldValue("xzqmc"));
                    txjzxz.setWz((String) recordset.getFieldValue("wz"));
                    txjzxz.setJsnd((String) recordset.getFieldValue("jsnd"));
                    txjzxz.setTxyys((String) recordset.getFieldValue("txyys"));
                    txjzxz.setJzjb((String) recordset.getFieldValue("jzjb"));

                    txjzxz.setGeom(geojson);

                    arrayList.add(txjzxz);

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
