package com.example.demo;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * 描述说明:
 *
 * @author cxk
 * @version 1.0
 */
@RestController
public class HelloController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());



    @RequestMapping(value="/index")
    public @ResponseBody JSONObject faceImageCheck(HttpServletRequest request) throws IOException {
        System.out.println(request.getParameter("mode"));
        JSONObject ret = new JSONObject();
        JSONObject date = new JSONObject();
        JSONArray array = new JSONArray();

            JSONObject param = new JSONObject();
            param.put("Unique_number",8011);
            param.put("Card_state",32);
            param.put("UID","");
            param.put("Card_Number","2514557406");
            param.put("Card_Type","A");
            param.put("Full_Name","陈");
            param.put("Balance",100000);
            param.put("Opening_date","2020/11/25 10:00:00");
            param.put("Limit_times1",2550000);
            param.put("Limit_times2",255000);
            param.put("Limit_times3",2550000);
            param.put("Limit_times4",255000);
            param.put("Consumption_quota",1000000);
            param.put("imgData","http://192.168.1.28:6388/images/facimages/images/20202933.png");
            param.put("EQUIPMENT","001,002,003,004,005,006,007,008,009,014,011,015,013,016,017,018,028,026,027,033,049,046,101,114,116,119,147,122,255,366,019,024,030,067,021,023,031,022,029,038,039,041,000,042,043,044,047,045,048,078,050,051,059,256,257,034,035,036,037,040,052,053,054,063,055,056,057,058,072,065,092,095,096,103,066,081,082,083,084,089,097,098,099,104,105,106,107,108,109,112,124,110,112,061,062,115,064,068,069,071,073,074,075,076,077,079,080,085,086,087,088,090,093,113,232,117,118,120,070,094,100,102,111,405,197,202,125,259,134,148,260,131,126,127,128,129,130,149,132,135,136,137,138,139,060,612,143,262,266,140,141,142,144,145,146,150,222,262,151,152,153,154,155,168,158,169,172,173,174,196,265,267,159,160,161,162,269,735,270,206,203,091,228,198,199,200,201,204,,,208,209,210,211,212,213,254,121,123,219,220,229,242,205,133,300,227,230,233,234,231,235,236,237,238,248,249,250,156,157,239,245,163,164,165,166,167,170,171,175,176,179,178,180,181,182,183,184,185,186,187,188,189,190,191,192,193,194,195,692,272,999,998,997,996,995,994,993,992,991,990,252,240,241,246,247,214,215,216,217,218,221,223,224,225,226,691,402,258,686,243,244,253,278,251,264,271,273,274,275");
            array.add(param);

        date.put("totalCount",1);
        date.put("totalPage",1);
        date.put("pageIndex",1);
        date.put("pageSize",1);
        date.put("Results",array);
//        date.put("updateConfig","0");
//        date.put("updateUserInfo","1");
//        date.put("IsOpen","1");1
        ret.put("Code",10000);
        ret.put("Message","成功");
        ret.put("Date",date);
        System.out.println(ret.toString());
        return ret;
    }
}
