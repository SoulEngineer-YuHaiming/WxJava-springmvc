define({ "api": [
  {
    "type": "get",
    "url": "/v3.1/ues/:sn/rt-info",
    "title": "获取设备上报实时信息",
    "version": "3.1.0",
    "name": "GetUeRealTimeInfo",
    "group": "UE",
    "header": {
      "fields": {
        "Header": [
          {
            "group": "Header",
            "type": "String",
            "optional": false,
            "field": "Authorization",
            "description": "<p>用户授权token</p>"
          },
          {
            "group": "Header",
            "type": "String",
            "optional": false,
            "field": "firm",
            "description": "<p>厂商编码</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Header-Example:",
          "content": "{\n  \"Authorization\": \"eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOjM2NzgsImF1ZGllbmNlIjoid2ViIiwib3BlbkFJZCI6MTM2NywiY3JlYXRlZCI6MTUzMzg3OTM2ODA0Nywicm9sZXMiOiJVU0VSIiwiZXhwIjoxNTM0NDg0MTY4fQ.Gl5L-NpuwhjuPXFuhPax8ak5c64skjDTCBC64N_QdKQ2VT-zZeceuzXB9TqaYJuhkwNYEhrV3pUx1zhMWG7Org\",\n  \"firm\": \"cnE=\"\n}",
          "type": "json"
        }
      ]
    },
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "sn",
            "description": "<p>设备序列号</p>"
          }
        ]
      }
    },
    "success": {
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "sn",
            "description": "<p>设备序列号</p>"
          },
          {
            "group": "Success 200",
            "type": "Number",
            "optional": false,
            "field": "status",
            "description": "<p>设备状态</p>"
          },
          {
            "group": "Success 200",
            "type": "Number",
            "optional": false,
            "field": "soc",
            "description": "<p>电池电量百分比</p>"
          },
          {
            "group": "Success 200",
            "type": "Number",
            "optional": false,
            "field": "voltage",
            "description": "<p>电池电压</p>"
          },
          {
            "group": "Success 200",
            "type": "Number",
            "optional": false,
            "field": "current",
            "description": "<p>电池电流</p>"
          },
          {
            "group": "Success 200",
            "type": "Number",
            "optional": false,
            "field": "temperature",
            "description": "<p>电池温度</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "reportTime",
            "description": "<p>上报时间(yyyy-MM-dd HH:mm:ss)</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Success-Response:",
          "content": "HTTP/1.1 200 OK\n{\n  \"sn\": \"P000000000\",\n  \"status\": 0,\n  \"soc\": 80,\n  \"voltage\": 60.0,\n  \"current\": 10.0,\n  \"temperature\": null,\n  \"reportTime\": \"2018-08-13 18:11:00\"\n}",
          "type": "json"
        }
      ]
    },
    "filename": "E:/CODE/idea/weixin-java-demo-springmvc-master/src/main/java/com/github/weixin/demo/config/Test.java",
    "groupTitle": "UE",
    "error": {
      "fields": {
        "Error 4xx": [
          {
            "group": "Error 4xx",
            "optional": false,
            "field": "RkNotFoundException",
            "description": "<p>找不到相关数据</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "Error-Response:",
          "content": "HTTP/1.1 404 Not Found\n{\n  \"error\": {\n      \"code\": 404,\n      \"msg\": \"\",\n      \"path\" \"\"\n  }\n}",
          "type": "json"
        }
      ]
    }
  }
] });
