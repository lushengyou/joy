package com.dao;

import com.util.DBAccess;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;

public class InterfaceQueryDao
{
  private static final Logger log = Logger.getLogger(InterfaceQueryDao.class);

  public List<Map<String, String>> doQuery(String sql)
  {
    log.info("执行sql：" + sql);
    DBAccess db = new DBAccess();
    List returnList = new ArrayList();
    try {
      returnList = db.doQuery(sql, new Object[0]);
    } catch (Exception e) {
      e.printStackTrace();
    }

    return returnList;
  }

  public String doUpdate(String sql)
  {
    log.info("执行sql：" + sql);
    DBAccess db = new DBAccess();
    int returnCode = 0;
    try {
      returnCode = db.doUpdate(sql, new String[0]);
    } catch (Exception e) {
      e.printStackTrace();
    }

    return returnCode+"";
  }
}