package com.github.weixin.demo.config;

/**
 * @program: WxJava-springmvc
 * @description:
 * @author: YuHaiming(小余)
 * @create: 2019-09-25 14:24
 **/
public class Test {

    /**
     *
     * @apiDefine RkNotFoundException
     *
     * @apiError RkNotFoundException 找不到相关数据
     *
     * @apiErrorExample Error-Response:
     *     HTTP/1.1 404 Not Found
     *     {
     *       "error": {
     *           "code": 404,
     *           "msg": "",
     *           "path" ""
     *       }
     *     }
     *
     */

    /**
     *
     * @api {get} /v3.1/ues/:sn/rt-info 获取设备上报实时信息
     * @apiVersion 3.1.0
     * @apiName GetUeRealTimeInfo
     * @apiGroup UE
     *
     * @apiHeader {String} Authorization 用户授权token
     * @apiHeader {String} firm 厂商编码
     * @apiHeaderExample {json} Header-Example:
     *     {
     *       "Authorization": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOjM2NzgsImF1ZGllbmNlIjoid2ViIiwib3BlbkFJZCI6MTM2NywiY3JlYXRlZCI6MTUzMzg3OTM2ODA0Nywicm9sZXMiOiJVU0VSIiwiZXhwIjoxNTM0NDg0MTY4fQ.Gl5L-NpuwhjuPXFuhPax8ak5c64skjDTCBC64N_QdKQ2VT-zZeceuzXB9TqaYJuhkwNYEhrV3pUx1zhMWG7Org",
     *       "firm": "cnE="
     *     }
     *
     * @apiParam {String} sn 设备序列号
     *
     * @apiSuccess {String} sn 设备序列号
     * @apiSuccess {Number} status 设备状态
     * @apiSuccess {Number} soc 电池电量百分比
     * @apiSuccess {Number} voltage 电池电压
     * @apiSuccess {Number} current 电池电流
     * @apiSuccess {Number} temperature 电池温度
     * @apiSuccess {String} reportTime 上报时间(yyyy-MM-dd HH:mm:ss)
     *
     * @apiSuccessExample Success-Response:
     *     HTTP/1.1 200 OK
     *     {
     *       "sn": "P000000000",
     *       "status": 0,
     *       "soc": 80,
     *       "voltage": 60.0,
     *       "current": 10.0,
     *       "temperature": null,
     *       "reportTime": "2018-08-13 18:11:00"
     *     }
     *
     * @apiUse RkNotFoundException
     *
     */
    public void test(){


    }
}
