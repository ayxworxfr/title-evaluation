# EVALUATION API


<a name="overview"></a>
## 概览
EVALUATION VUE API Document.


### 版本信息
*版本* : 1.0


### 联系方式
*名字* : evildoer  
*邮箱* : 123456@qq.com


### 许可信息
*许可证* : Apache 2.0  
*许可网址* : https://www.apache.org/licenses/LICENSE-2.0.html  
*服务条款* : null


### URI scheme
*域名* : localhost:8486  
*基础路径* : /


### 标签

* abroad-controller : Abroad Controller
* achievement-controller : Achievement Controller
* award-controller : Award Controller
* branch-office-controller : Branch Office Controller
* captcha-controller : Captcha Controller
* evaluation-controller : Evaluation Controller
* experience-controller : Experience Controller
* login-code-controller : Login Code Controller
* other-controller : Other Controller
* paper-controller : Paper Controller
* patent-controller : Patent Controller
* person-controller : Person Controller
* qualification-controller : Qualification Controller
* study-controller : Study Controller
* supply-controller : Supply Controller
* system-controller : System Controller
* train-person-controller : Train Person Controller
* unit-controller : Unit Controller
* user-controller : User Controller




<a name="paths"></a>
## 资源

<a name="abroad-controller_resource"></a>
### Abroad-controller
Abroad Controller


<a name="addusingpost"></a>
#### add
```
POST /evaluation/{evaluation_id}/abroad/add
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**evaluation_id**  <br>*必填*|evaluation_id|integer (int64)|
|**Body**|**abroad**  <br>*必填*|abroad|[Abroad](#abroad)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ServerResponse](#serverresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/evaluation/0/abroad/add
```


###### 请求 body
```
json :
{
  "content" : "string",
  "endTime" : "string",
  "job" : "xx职位",
  "proveUrl" : "string",
  "startTime" : "string",
  "unit" : "xx部门"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string",
  "success" : true
}
```


<a name="deleteusingdelete"></a>
#### delete
```
DELETE /evaluation/{evaluation_id}/abroad/delete/{id}
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**id**  <br>*必填*|id|integer (int64)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ServerResponse](#serverresponse)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/evaluation/{evaluation_id}/abroad/delete/0
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string",
  "success" : true
}
```


<a name="listusingget"></a>
#### list
```
GET /evaluation/{evaluation_id}/abroad/list
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**evaluation_id**  <br>*必填*|evaluation_id|integer (int64)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ServerResponse«List«Abroad»»](#449aa334f95d21140f6a71a72c62cbe4)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/evaluation/0/abroad/list
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : [ {
    "content" : "string",
    "endTime" : "string",
    "job" : "xx职位",
    "proveUrl" : "string",
    "startTime" : "string",
    "unit" : "xx部门"
  } ],
  "message" : "string",
  "success" : true
}
```


<a name="getbyidusingget"></a>
#### getById
```
GET /evaluation/{evaluation_id}/abroad/{id}
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**id**  <br>*必填*|id|integer (int64)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ServerResponse«Abroad»](#f8bcf53b6b1dba6b924055af81daa55b)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/evaluation/{evaluation_id}/abroad/0
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "content" : "string",
    "endTime" : "string",
    "job" : "xx职位",
    "proveUrl" : "string",
    "startTime" : "string",
    "unit" : "xx部门"
  },
  "message" : "string",
  "success" : true
}
```


<a name="updatebyidusingput"></a>
#### updateById
```
PUT /evaluation/{evaluation_id}/abroad/{id}
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**id**  <br>*必填*|id|integer (int32)|
|**Body**|**abroad**  <br>*必填*|abroad|[Abroad](#abroad)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ServerResponse](#serverresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/evaluation/{evaluation_id}/abroad/0
```


###### 请求 body
```
json :
{
  "content" : "string",
  "endTime" : "string",
  "job" : "xx职位",
  "proveUrl" : "string",
  "startTime" : "string",
  "unit" : "xx部门"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string",
  "success" : true
}
```


<a name="achievement-controller_resource"></a>
### Achievement-controller
Achievement Controller


<a name="addusingpost_1"></a>
#### add
```
POST /evaluation/{evaluation_id}/achievement/add
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**evaluation_id**  <br>*必填*|evaluation_id|integer (int64)|
|**Body**|**achievement**  <br>*必填*|achievement|[Achievement](#achievement)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ServerResponse](#serverresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/evaluation/0/achievement/add
```


###### 请求 body
```
json :
{
  "appointmentUrl" : "string",
  "awardUrl" : "string",
  "content" : "string",
  "dataUrl" : "string",
  "effect" : "string",
  "endTime" : "string",
  "level" : "string",
  "name" : "string",
  "situation" : "string",
  "startTime" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string",
  "success" : true
}
```


<a name="deleteusingdelete_1"></a>
#### delete
```
DELETE /evaluation/{evaluation_id}/achievement/delete/{id}
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**id**  <br>*必填*|id|integer (int64)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ServerResponse](#serverresponse)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/evaluation/{evaluation_id}/achievement/delete/0
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string",
  "success" : true
}
```


<a name="listusingget_1"></a>
#### list
```
GET /evaluation/{evaluation_id}/achievement/list
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**evaluation_id**  <br>*必填*|evaluation_id|integer (int64)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ServerResponse«List«Achievement»»](#fdda92232ba893e6015bde176b9da2da)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/evaluation/0/achievement/list
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : [ {
    "appointmentUrl" : "string",
    "awardUrl" : "string",
    "content" : "string",
    "dataUrl" : "string",
    "effect" : "string",
    "endTime" : "string",
    "level" : "string",
    "name" : "string",
    "situation" : "string",
    "startTime" : "string"
  } ],
  "message" : "string",
  "success" : true
}
```


<a name="getbyidusingget_1"></a>
#### getById
```
GET /evaluation/{evaluation_id}/achievement/{id}
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**id**  <br>*必填*|id|integer (int64)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ServerResponse](#serverresponse)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/evaluation/{evaluation_id}/achievement/0
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string",
  "success" : true
}
```


<a name="updatebyidusingput_1"></a>
#### updateById
```
PUT /evaluation/{evaluation_id}/achievement/{id}
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**id**  <br>*必填*|id|integer (int32)|
|**Body**|**achievement**  <br>*必填*|achievement|[Achievement](#achievement)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ServerResponse](#serverresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/evaluation/{evaluation_id}/achievement/0
```


###### 请求 body
```
json :
{
  "appointmentUrl" : "string",
  "awardUrl" : "string",
  "content" : "string",
  "dataUrl" : "string",
  "effect" : "string",
  "endTime" : "string",
  "level" : "string",
  "name" : "string",
  "situation" : "string",
  "startTime" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string",
  "success" : true
}
```


<a name="award-controller_resource"></a>
### Award-controller
Award Controller


<a name="addusingpost_2"></a>
#### add
```
POST /evaluation/{evaluation_id}/award/add
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**evaluation_id**  <br>*必填*|evaluation_id|integer (int64)|
|**Body**|**award**  <br>*必填*|award|[Award](#award)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ServerResponse](#serverresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/evaluation/0/award/add
```


###### 请求 body
```
json :
{
  "agrantTime" : "string",
  "awardAgrent" : "string",
  "level" : 0,
  "name" : "string",
  "proveUrl" : "string",
  "summary" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string",
  "success" : true
}
```


<a name="deleteusingdelete_2"></a>
#### delete
```
DELETE /evaluation/{evaluation_id}/award/delete/{id}
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**id**  <br>*必填*|id|integer (int64)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ServerResponse](#serverresponse)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/evaluation/{evaluation_id}/award/delete/0
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string",
  "success" : true
}
```


<a name="listusingget_2"></a>
#### list
```
GET /evaluation/{evaluation_id}/award/list
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**evaluation_id**  <br>*必填*|evaluation_id|integer (int64)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ServerResponse«List«Award»»](#c2637ffd6049398f7aef1db7547dcd1c)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/evaluation/0/award/list
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : [ {
    "agrantTime" : "string",
    "awardAgrent" : "string",
    "level" : 0,
    "name" : "string",
    "proveUrl" : "string",
    "summary" : "string"
  } ],
  "message" : "string",
  "success" : true
}
```


<a name="getbyidusingget_2"></a>
#### getById
```
GET /evaluation/{evaluation_id}/award/{id}
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**id**  <br>*必填*|id|integer (int64)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ServerResponse](#serverresponse)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/evaluation/{evaluation_id}/award/0
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string",
  "success" : true
}
```


<a name="updatebyidusingput_2"></a>
#### updateById
```
PUT /evaluation/{evaluation_id}/award/{id}
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**id**  <br>*必填*|id|integer (int32)|
|**Body**|**award**  <br>*必填*|award|[Award](#award)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ServerResponse](#serverresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/evaluation/{evaluation_id}/award/0
```


###### 请求 body
```
json :
{
  "agrantTime" : "string",
  "awardAgrent" : "string",
  "level" : 0,
  "name" : "string",
  "proveUrl" : "string",
  "summary" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string",
  "success" : true
}
```


<a name="branch-office-controller_resource"></a>
### Branch-office-controller
Branch Office Controller


<a name="addusingpost_3"></a>
#### add
```
POST /branch-office/add
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**branchOffice**  <br>*必填*|branchOffice|[BranchOffice](#branchoffice)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ServerResponse](#serverresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/branch-office/add
```


###### 请求 body
```
json :
{
  "name" : "string",
  "signature" : "string",
  "unitId" : 0,
  "userId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string",
  "success" : true
}
```


<a name="deleteusingdelete_3"></a>
#### delete
```
DELETE /branch-office/delete/{branchOffice_id}
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**branchOffice_id**  <br>*必填*|branchOffice_id|integer (int64)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ServerResponse](#serverresponse)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/branch-office/delete/0
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string",
  "success" : true
}
```


<a name="listusingget_3"></a>
#### list
```
GET /branch-office/list
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ServerResponse«PageInfo«BranchOfficeVo»»](#d84487ddfb8fd91316affa338164ab3e)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/branch-office/list
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "endRow" : 0,
    "hasNextPage" : true,
    "hasPreviousPage" : true,
    "isFirstPage" : true,
    "isLastPage" : true,
    "list" : [ {
      "name" : "string",
      "signature" : "string",
      "unit" : {
        "account" : "string",
        "address" : "string",
        "email" : "string",
        "image" : "string",
        "industry" : 0,
        "legalPerson" : "string",
        "level" : 0,
        "license" : "string",
        "name" : "string",
        "position" : "string",
        "principal" : "string",
        "property" : 0,
        "signature" : "string",
        "userId" : 0
      },
      "unitId" : 0,
      "userId" : 0
    } ],
    "navigateFirstPage" : 0,
    "navigateLastPage" : 0,
    "navigatePages" : 0,
    "navigatepageNums" : [ 0 ],
    "nextPage" : 0,
    "pageNum" : 0,
    "pageSize" : 0,
    "pages" : 0,
    "prePage" : 0,
    "size" : 0,
    "startRow" : 0,
    "total" : 0
  },
  "message" : "string",
  "success" : true
}
```


<a name="updateusingput"></a>
#### update
```
PUT /branch-office/update
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**branchOffice**  <br>*必填*|branchOffice|[BranchOffice](#branchoffice)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ServerResponse](#serverresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/branch-office/update
```


###### 请求 body
```
json :
{
  "name" : "string",
  "signature" : "string",
  "unitId" : 0,
  "userId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string",
  "success" : true
}
```


<a name="getbyidusingget_3"></a>
#### getById
```
GET /branch-office/{id}
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**id**  <br>*必填*|id|integer (int64)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ServerResponse](#serverresponse)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/branch-office/0
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string",
  "success" : true
}
```


<a name="captcha-controller_resource"></a>
### Captcha-controller
Captcha Controller


<a name="getcaptchausingpost"></a>
#### getCaptcha
```
POST /Captcha.jpg
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|无内容|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/Captcha.jpg
```


<a name="getcaptchausingget"></a>
#### getCaptcha
```
GET /Captcha.jpg
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/Captcha.jpg
```


<a name="getcaptchausingput"></a>
#### getCaptcha
```
PUT /Captcha.jpg
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|无内容|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/Captcha.jpg
```


<a name="getcaptchausingdelete"></a>
#### getCaptcha
```
DELETE /Captcha.jpg
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|无内容|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/Captcha.jpg
```


<a name="getcaptchausingpatch"></a>
#### getCaptcha
```
PATCH /Captcha.jpg
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|无内容|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/Captcha.jpg
```


<a name="getcaptchausinghead"></a>
#### getCaptcha
```
HEAD /Captcha.jpg
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|无内容|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/Captcha.jpg
```


<a name="getcaptchausingoptions"></a>
#### getCaptcha
```
OPTIONS /Captcha.jpg
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|无内容|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/Captcha.jpg
```


<a name="evaluation-controller_resource"></a>
### Evaluation-controller
Evaluation Controller


<a name="addusingpost_4"></a>
#### add
```
POST /evaluation/add
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**evaluation**  <br>*必填*|evaluation|[Evaluation](#evaluation)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ServerResponse](#serverresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/evaluation/add
```


###### 请求 body
```
json :
{
  "jury" : "string",
  "level" : 0,
  "source" : "string",
  "userId" : 0,
  "year" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string",
  "success" : true
}
```


<a name="deleteusingdelete_4"></a>
#### delete
```
DELETE /evaluation/delete/{id}
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**id**  <br>*必填*|id|integer (int64)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ServerResponse](#serverresponse)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/evaluation/delete/0
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string",
  "success" : true
}
```


<a name="listusingget_4"></a>
#### list
```
GET /evaluation/list
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ServerResponse«PageInfo«EvaluationVo»»](#45a84cb483cb93cf867f67f975bcec6f)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/evaluation/list
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "endRow" : 0,
    "hasNextPage" : true,
    "hasPreviousPage" : true,
    "isFirstPage" : true,
    "isLastPage" : true,
    "list" : [ {
      "jury" : "string",
      "level" : 0,
      "person" : {
        "birthDay" : "string",
        "birthPlace" : "string",
        "email" : "string",
        "filePlace" : "string",
        "idcard" : "string",
        "name" : "string",
        "nation" : 0,
        "phone" : "string",
        "political" : 0,
        "sex" : 0,
        "status" : 0
      },
      "source" : "string",
      "supply" : {
        "frontUrl" : "string",
        "oldname" : "string",
        "posTime" : "string",
        "position" : 0,
        "property" : 0,
        "reverseUrl" : "string",
        "skillAge" : 0,
        "summary" : "string",
        "unitId" : 0,
        "workTime" : "string"
      },
      "userId" : 0,
      "year" : "string"
    } ],
    "navigateFirstPage" : 0,
    "navigateLastPage" : 0,
    "navigatePages" : 0,
    "navigatepageNums" : [ 0 ],
    "nextPage" : 0,
    "pageNum" : 0,
    "pageSize" : 0,
    "pages" : 0,
    "prePage" : 0,
    "size" : 0,
    "startRow" : 0,
    "total" : 0
  },
  "message" : "string",
  "success" : true
}
```


<a name="getbyidusingget_4"></a>
#### getById
```
GET /evaluation/{id}
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**id**  <br>*必填*|id|integer (int64)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ServerResponse](#serverresponse)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/evaluation/0
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string",
  "success" : true
}
```


<a name="updatebyidusingput_3"></a>
#### updateById
```
PUT /evaluation/{id}
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**id**  <br>*必填*|id|integer (int32)|
|**Body**|**evaluation**  <br>*必填*|evaluation|[Evaluation](#evaluation)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ServerResponse](#serverresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/evaluation/0
```


###### 请求 body
```
json :
{
  "jury" : "string",
  "level" : 0,
  "source" : "string",
  "userId" : 0,
  "year" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string",
  "success" : true
}
```


<a name="experience-controller_resource"></a>
### Experience-controller
Experience Controller


<a name="addusingpost_5"></a>
#### add
```
POST /evaluation/{evaluation_id}/experience/add
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**evaluation_id**  <br>*必填*|evaluation_id|integer (int64)|
|**Body**|**experience**  <br>*必填*|experience|[Experience](#experience)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ServerResponse](#serverresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/evaluation/0/experience/add
```


###### 请求 body
```
json :
{
  "achievement" : "string",
  "deadline" : "string",
  "event" : "string",
  "position" : "string",
  "proveUrl" : "string",
  "unit" : "string",
  "witness" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string",
  "success" : true
}
```


<a name="deleteusingdelete_5"></a>
#### delete
```
DELETE /evaluation/{evaluation_id}/experience/delete/{id}
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**id**  <br>*必填*|id|integer (int64)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ServerResponse](#serverresponse)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/evaluation/{evaluation_id}/experience/delete/0
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string",
  "success" : true
}
```


<a name="listusingget_5"></a>
#### list
```
GET /evaluation/{evaluation_id}/experience/list
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**evaluation_id**  <br>*必填*|evaluation_id|integer (int64)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ServerResponse«List«Experience»»](#66c2b8d6fdd08429c4f04dc27df78789)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/evaluation/0/experience/list
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : [ {
    "achievement" : "string",
    "deadline" : "string",
    "event" : "string",
    "position" : "string",
    "proveUrl" : "string",
    "unit" : "string",
    "witness" : "string"
  } ],
  "message" : "string",
  "success" : true
}
```


<a name="getbyidusingget_5"></a>
#### getById
```
GET /evaluation/{evaluation_id}/experience/{id}
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**id**  <br>*必填*|id|integer (int64)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ServerResponse](#serverresponse)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/evaluation/{evaluation_id}/experience/0
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string",
  "success" : true
}
```


<a name="updatebyidusingput_4"></a>
#### updateById
```
PUT /evaluation/{evaluation_id}/experience/{id}
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**id**  <br>*必填*|id|integer (int32)|
|**Body**|**experience**  <br>*必填*|experience|[Experience](#experience)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ServerResponse](#serverresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/evaluation/{evaluation_id}/experience/0
```


###### 请求 body
```
json :
{
  "achievement" : "string",
  "deadline" : "string",
  "event" : "string",
  "position" : "string",
  "proveUrl" : "string",
  "unit" : "string",
  "witness" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string",
  "success" : true
}
```


<a name="login-code-controller_resource"></a>
### Login-code-controller
Login Code Controller


<a name="addusingpost_6"></a>
#### 添加用户
```
POST /login-code/add
```


##### 说明
添加用户接口


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**code**  <br>*必填*|code|[CodeForm](#codeform)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ServerResponse](#serverresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/login-code/add
```


###### 请求 body
```
json :
{
  "account" : "123",
  "createTime" : "2020-12-12T11:11:11.111Z",
  "failureTime" : "2018-12-20T11:11:11.111Z",
  "password" : "123456"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string",
  "success" : true
}
```


<a name="deleteusingdelete_6"></a>
#### 通过code登录
```
DELETE /login-code/delete/{code}
```


##### 说明
通过code登录接口


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**FormData**|**code**  <br>*必填*|登录码|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ServerResponse](#serverresponse)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/login-code/delete/{code}
```


###### 请求 formData
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string",
  "success" : true
}
```


<a name="loginbycodeusingpost"></a>
#### 通过code登录
```
POST /login-code/login
```


##### 说明
通过code登录接口


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**code**  <br>*必填*|传入json格式|[CodeForm](#codeform)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ServerResponse](#serverresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/login-code/login
```


###### 请求 body
```
json :
{
  "account" : "123",
  "createTime" : "2020-12-12T11:11:11.111Z",
  "failureTime" : "2018-12-20T11:11:11.111Z",
  "password" : "123456"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string",
  "success" : true
}
```


<a name="other-controller_resource"></a>
### Other-controller
Other Controller


<a name="addusingpost_7"></a>
#### add
```
POST /evaluation/{evaluation_id}/other/add
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**evaluation_id**  <br>*必填*|evaluation_id|integer (int64)|
|**Body**|**other**  <br>*必填*|other|[Other](#other)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ServerResponse](#serverresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/evaluation/0/other/add
```


###### 请求 body
```
json :
{
  "evaluationId" : 0,
  "projectUrl" : "string",
  "title" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string",
  "success" : true
}
```


<a name="deleteusingdelete_7"></a>
#### delete
```
DELETE /evaluation/{evaluation_id}/other/delete/{id}
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**id**  <br>*必填*|id|integer (int64)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ServerResponse](#serverresponse)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/evaluation/{evaluation_id}/other/delete/0
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string",
  "success" : true
}
```


<a name="listusingget_6"></a>
#### list
```
GET /evaluation/{evaluation_id}/other/list
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**evaluation_id**  <br>*必填*|evaluation_id|integer (int64)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ServerResponse«List«Other»»](#16d43f2da6b970b6720a688979424781)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/evaluation/0/other/list
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : [ {
    "evaluationId" : 0,
    "projectUrl" : "string",
    "title" : "string"
  } ],
  "message" : "string",
  "success" : true
}
```


<a name="getbyidusingget_6"></a>
#### getById
```
GET /evaluation/{evaluation_id}/other/{id}
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**id**  <br>*必填*|id|integer (int64)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ServerResponse](#serverresponse)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/evaluation/{evaluation_id}/other/0
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string",
  "success" : true
}
```


<a name="updatebyidusingput_5"></a>
#### updateById
```
PUT /evaluation/{evaluation_id}/other/{id}
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**id**  <br>*必填*|id|integer (int32)|
|**Body**|**other**  <br>*必填*|other|[Other](#other)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ServerResponse](#serverresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/evaluation/{evaluation_id}/other/0
```


###### 请求 body
```
json :
{
  "evaluationId" : 0,
  "projectUrl" : "string",
  "title" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string",
  "success" : true
}
```


<a name="paper-controller_resource"></a>
### Paper-controller
Paper Controller


<a name="addusingpost_8"></a>
#### add
```
POST /evaluation/{evaluation_id}/paper/add
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**evaluation_id**  <br>*必填*|evaluation_id|integer (int64)|
|**Body**|**paper**  <br>*必填*|paper|[Paper](#paper)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ServerResponse](#serverresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/evaluation/0/paper/add
```


###### 请求 body
```
json :
{
  "catalogUrl" : "string",
  "category" : 0,
  "contentUrl" : "string",
  "coverUrl" : "string",
  "display" : 0,
  "economy" : "string",
  "foreignLevel" : 0,
  "level" : 0,
  "name" : "string",
  "number" : "string",
  "publishTime" : "string",
  "represent" : 0,
  "role" : 0,
  "volume" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string",
  "success" : true
}
```


<a name="deleteusingdelete_8"></a>
#### delete
```
DELETE /evaluation/{evaluation_id}/paper/delete/{id}
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**id**  <br>*必填*|id|integer (int64)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ServerResponse](#serverresponse)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/evaluation/{evaluation_id}/paper/delete/0
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string",
  "success" : true
}
```


<a name="listusingget_7"></a>
#### list
```
GET /evaluation/{evaluation_id}/paper/list
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**evaluation_id**  <br>*必填*|evaluation_id|integer (int64)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ServerResponse«List«Paper»»](#1865af418e64bb93a3e93e8f076c5ca3)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/evaluation/0/paper/list
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : [ {
    "catalogUrl" : "string",
    "category" : 0,
    "contentUrl" : "string",
    "coverUrl" : "string",
    "display" : 0,
    "economy" : "string",
    "foreignLevel" : 0,
    "level" : 0,
    "name" : "string",
    "number" : "string",
    "publishTime" : "string",
    "represent" : 0,
    "role" : 0,
    "volume" : "string"
  } ],
  "message" : "string",
  "success" : true
}
```


<a name="getbyidusingget_7"></a>
#### getById
```
GET /evaluation/{evaluation_id}/paper/{id}
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**id**  <br>*必填*|id|integer (int64)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ServerResponse](#serverresponse)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/evaluation/{evaluation_id}/paper/0
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string",
  "success" : true
}
```


<a name="updatebyidusingput_6"></a>
#### updateById
```
PUT /evaluation/{evaluation_id}/paper/{id}
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**id**  <br>*必填*|id|integer (int32)|
|**Body**|**paper**  <br>*必填*|paper|[Paper](#paper)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ServerResponse](#serverresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/evaluation/{evaluation_id}/paper/0
```


###### 请求 body
```
json :
{
  "catalogUrl" : "string",
  "category" : 0,
  "contentUrl" : "string",
  "coverUrl" : "string",
  "display" : 0,
  "economy" : "string",
  "foreignLevel" : 0,
  "level" : 0,
  "name" : "string",
  "number" : "string",
  "publishTime" : "string",
  "represent" : 0,
  "role" : 0,
  "volume" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string",
  "success" : true
}
```


<a name="patent-controller_resource"></a>
### Patent-controller
Patent Controller


<a name="addusingpost_9"></a>
#### add
```
POST /evaluation/{evaluation_id}/patent/add
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**evaluation_id**  <br>*必填*|evaluation_id|integer (int64)|
|**Body**|**patent**  <br>*必填*|patent|[Patent](#patent)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ServerResponse](#serverresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/evaluation/0/patent/add
```


###### 请求 body
```
json :
{
  "getTime" : "string",
  "introduce" : "string",
  "name" : "string",
  "proveUrl" : "string",
  "type" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string",
  "success" : true
}
```


<a name="deleteusingdelete_9"></a>
#### delete
```
DELETE /evaluation/{evaluation_id}/patent/delete/{id}
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**id**  <br>*必填*|id|integer (int64)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ServerResponse](#serverresponse)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/evaluation/{evaluation_id}/patent/delete/0
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string",
  "success" : true
}
```


<a name="listusingget_8"></a>
#### list
```
GET /evaluation/{evaluation_id}/patent/list
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**evaluation_id**  <br>*必填*|evaluation_id|integer (int64)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ServerResponse«List«Patent»»](#9105505f83cf8149bc981f7e0a56beb7)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/evaluation/0/patent/list
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : [ {
    "getTime" : "string",
    "introduce" : "string",
    "name" : "string",
    "proveUrl" : "string",
    "type" : 0
  } ],
  "message" : "string",
  "success" : true
}
```


<a name="getbyidusingget_8"></a>
#### getById
```
GET /evaluation/{evaluation_id}/patent/{id}
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**id**  <br>*必填*|id|integer (int64)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ServerResponse](#serverresponse)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/evaluation/{evaluation_id}/patent/0
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string",
  "success" : true
}
```


<a name="updatebyidusingput_7"></a>
#### updateById
```
PUT /evaluation/{evaluation_id}/patent/{id}
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**id**  <br>*必填*|id|integer (int32)|
|**Body**|**patent**  <br>*必填*|patent|[Patent](#patent)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ServerResponse](#serverresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/evaluation/{evaluation_id}/patent/0
```


###### 请求 body
```
json :
{
  "getTime" : "string",
  "introduce" : "string",
  "name" : "string",
  "proveUrl" : "string",
  "type" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string",
  "success" : true
}
```


<a name="person-controller_resource"></a>
### Person-controller
Person Controller


<a name="addusingpost_10"></a>
#### add
```
POST /person/add
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**person**  <br>*必填*|person|[Person](#person)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ServerResponse](#serverresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/person/add
```


###### 请求 body
```
json :
{
  "birthDay" : "string",
  "birthPlace" : "string",
  "email" : "string",
  "filePlace" : "string",
  "idcard" : "string",
  "name" : "string",
  "nation" : 0,
  "phone" : "string",
  "political" : 0,
  "sex" : 0,
  "status" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string",
  "success" : true
}
```


<a name="deleteusingdelete_10"></a>
#### delete
```
DELETE /person/delete/{person_id}
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**person_id**  <br>*必填*|person_id|integer (int64)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ServerResponse](#serverresponse)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/person/delete/0
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string",
  "success" : true
}
```


<a name="listusingget_9"></a>
#### list
```
GET /person/list
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ServerResponse«PageInfo«Person»»](#e0d204ac75ed7450b67519df37869d8a)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/person/list
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "endRow" : 0,
    "hasNextPage" : true,
    "hasPreviousPage" : true,
    "isFirstPage" : true,
    "isLastPage" : true,
    "list" : [ {
      "birthDay" : "string",
      "birthPlace" : "string",
      "email" : "string",
      "filePlace" : "string",
      "idcard" : "string",
      "name" : "string",
      "nation" : 0,
      "phone" : "string",
      "political" : 0,
      "sex" : 0,
      "status" : 0
    } ],
    "navigateFirstPage" : 0,
    "navigateLastPage" : 0,
    "navigatePages" : 0,
    "navigatepageNums" : [ 0 ],
    "nextPage" : 0,
    "pageNum" : 0,
    "pageSize" : 0,
    "pages" : 0,
    "prePage" : 0,
    "size" : 0,
    "startRow" : 0,
    "total" : 0
  },
  "message" : "string",
  "success" : true
}
```


<a name="getbyidusingget_9"></a>
#### getById
```
GET /person/{id}
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**id**  <br>*必填*|id|integer (int64)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ServerResponse](#serverresponse)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/person/0
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string",
  "success" : true
}
```


<a name="updatebyidusingput_8"></a>
#### updateById
```
PUT /person/{id}
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**id**  <br>*必填*|id|integer (int32)|
|**Body**|**person**  <br>*必填*|person|[Person](#person)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ServerResponse](#serverresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/person/0
```


###### 请求 body
```
json :
{
  "birthDay" : "string",
  "birthPlace" : "string",
  "email" : "string",
  "filePlace" : "string",
  "idcard" : "string",
  "name" : "string",
  "nation" : 0,
  "phone" : "string",
  "political" : 0,
  "sex" : 0,
  "status" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string",
  "success" : true
}
```


<a name="qualification-controller_resource"></a>
### Qualification-controller
Qualification Controller


<a name="addusingpost_11"></a>
#### add
```
POST /evaluation/{evaluation_id}/qualification/add
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**evaluation_id**  <br>*必填*|evaluation_id|integer (int64)|
|**Body**|**qualification**  <br>*必填*|qualification|[Qualification](#qualification)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ServerResponse](#serverresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/evaluation/0/qualification/add
```


###### 请求 body
```
json :
{
  "approval" : "string",
  "getTime" : "string",
  "name" : "string",
  "number" : "string",
  "professional" : "string",
  "proveUrl" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string",
  "success" : true
}
```


<a name="deleteusingdelete_11"></a>
#### delete
```
DELETE /evaluation/{evaluation_id}/qualification/delete/{id}
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**id**  <br>*必填*|id|integer (int64)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ServerResponse](#serverresponse)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/evaluation/{evaluation_id}/qualification/delete/0
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string",
  "success" : true
}
```


<a name="listusingget_10"></a>
#### list
```
GET /evaluation/{evaluation_id}/qualification/list
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**evaluation_id**  <br>*必填*|evaluation_id|integer (int64)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ServerResponse«List«Qualification»»](#b1db57dde8ce31bb552cec24f5e33391)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/evaluation/0/qualification/list
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : [ {
    "approval" : "string",
    "getTime" : "string",
    "name" : "string",
    "number" : "string",
    "professional" : "string",
    "proveUrl" : "string"
  } ],
  "message" : "string",
  "success" : true
}
```


<a name="getbyidusingget_10"></a>
#### getById
```
GET /evaluation/{evaluation_id}/qualification/{id}
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**id**  <br>*必填*|id|integer (int64)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ServerResponse](#serverresponse)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/evaluation/{evaluation_id}/qualification/0
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string",
  "success" : true
}
```


<a name="updatebyidusingput_9"></a>
#### updateById
```
PUT /evaluation/{evaluation_id}/qualification/{id}
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**id**  <br>*必填*|id|integer (int32)|
|**Body**|**qualification**  <br>*必填*|qualification|[Qualification](#qualification)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ServerResponse](#serverresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/evaluation/{evaluation_id}/qualification/0
```


###### 请求 body
```
json :
{
  "approval" : "string",
  "getTime" : "string",
  "name" : "string",
  "number" : "string",
  "professional" : "string",
  "proveUrl" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string",
  "success" : true
}
```


<a name="study-controller_resource"></a>
### Study-controller
Study Controller


<a name="addusingpost_12"></a>
#### add
```
POST /evaluation/{evaluation_id}/study/add
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**evaluation_id**  <br>*必填*|evaluation_id|integer (int64)|
|**Body**|**study**  <br>*必填*|study|[Study](#study)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ServerResponse](#serverresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/evaluation/0/study/add
```


###### 请求 body
```
json :
{
  "certificateNumber" : "string",
  "graduationTime" : "string",
  "level" : "string",
  "profession" : "string",
  "project" : "string",
  "proveUrl" : "string",
  "quality" : "string",
  "school" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string",
  "success" : true
}
```


<a name="deleteusingdelete_12"></a>
#### delete
```
DELETE /evaluation/{evaluation_id}/study/delete/{id}
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**id**  <br>*必填*|id|integer (int64)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ServerResponse](#serverresponse)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/evaluation/{evaluation_id}/study/delete/0
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string",
  "success" : true
}
```


<a name="listusingget_11"></a>
#### list
```
GET /evaluation/{evaluation_id}/study/list
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**evaluation_id**  <br>*必填*|evaluation_id|integer (int64)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ServerResponse«List«Study»»](#5972cf0aaa98fa6cd3a60b7021bcd777)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/evaluation/0/study/list
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : [ {
    "certificateNumber" : "string",
    "graduationTime" : "string",
    "level" : "string",
    "profession" : "string",
    "project" : "string",
    "proveUrl" : "string",
    "quality" : "string",
    "school" : "string"
  } ],
  "message" : "string",
  "success" : true
}
```


<a name="getbyidusingget_11"></a>
#### getById
```
GET /evaluation/{evaluation_id}/study/{id}
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**id**  <br>*必填*|id|integer (int64)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ServerResponse](#serverresponse)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/evaluation/{evaluation_id}/study/0
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string",
  "success" : true
}
```


<a name="updatebyidusingput_10"></a>
#### updateById
```
PUT /evaluation/{evaluation_id}/study/{id}
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**id**  <br>*必填*|id|integer (int32)|
|**Body**|**study**  <br>*必填*|study|[Study](#study)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ServerResponse](#serverresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/evaluation/{evaluation_id}/study/0
```


###### 请求 body
```
json :
{
  "certificateNumber" : "string",
  "graduationTime" : "string",
  "level" : "string",
  "profession" : "string",
  "project" : "string",
  "proveUrl" : "string",
  "quality" : "string",
  "school" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string",
  "success" : true
}
```


<a name="supply-controller_resource"></a>
### Supply-controller
Supply Controller


<a name="deleteusingdelete_13"></a>
#### delete
```
DELETE /evaluation/{evaluation_id}/supply/delete/{id}
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**id**  <br>*必填*|id|integer (int64)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ServerResponse](#serverresponse)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/evaluation/{evaluation_id}/supply/delete/0
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string",
  "success" : true
}
```


<a name="listusingget_12"></a>
#### list
```
GET /evaluation/{evaluation_id}/supply/list
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**evaluation_id**  <br>*必填*|evaluation_id|integer (int64)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ServerResponse«SupplyVo»](#055b666b7fb65fd7f3168b83d4c47842)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/evaluation/0/supply/list
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "evaluation" : {
      "jury" : "string",
      "level" : 0,
      "source" : "string",
      "userId" : 0,
      "year" : "string"
    },
    "frontUrl" : "string",
    "oldname" : "string",
    "posTime" : "string",
    "position" : 0,
    "property" : 0,
    "reverseUrl" : "string",
    "skillAge" : 0,
    "summary" : "string",
    "unit" : {
      "account" : "string",
      "address" : "string",
      "email" : "string",
      "image" : "string",
      "industry" : 0,
      "legalPerson" : "string",
      "level" : 0,
      "license" : "string",
      "name" : "string",
      "position" : "string",
      "principal" : "string",
      "property" : 0,
      "signature" : "string",
      "userId" : 0
    },
    "unitId" : 0,
    "workTime" : "string"
  },
  "message" : "string",
  "success" : true
}
```


<a name="uploadusingpost"></a>
#### upload
```
POST /evaluation/{evaluation_id}/supply/upload
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**FormData**|**file**  <br>*必填*|file|file|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ServerResponse](#serverresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `multipart/form-data`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/evaluation/{evaluation_id}/supply/upload
```


###### 请求 formData
```
json :
"file"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string",
  "success" : true
}
```


<a name="getbyidusingget_12"></a>
#### getById
```
GET /evaluation/{evaluation_id}/supply/{id}
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**id**  <br>*必填*|id|integer (int64)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ServerResponse](#serverresponse)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/evaluation/{evaluation_id}/supply/0
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string",
  "success" : true
}
```


<a name="updatebyidusingput_11"></a>
#### updateById
```
PUT /evaluation/{evaluation_id}/supply/{id}
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**id**  <br>*必填*|id|integer (int32)|
|**Body**|**supply**  <br>*必填*|supply|[Supply](#supply)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ServerResponse](#serverresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/evaluation/{evaluation_id}/supply/0
```


###### 请求 body
```
json :
{
  "frontUrl" : "string",
  "oldname" : "string",
  "posTime" : "string",
  "position" : 0,
  "property" : 0,
  "reverseUrl" : "string",
  "skillAge" : 0,
  "summary" : "string",
  "unitId" : 0,
  "workTime" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string",
  "success" : true
}
```


<a name="system-controller_resource"></a>
### System-controller
System Controller


<a name="addusertobranchusingpost"></a>
#### 添加用户到分公司
```
POST /system/addUserToBranch/{id}
```


##### 说明
添加用户到分公司接口


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**id**  <br>*必填*|id|integer (int64)|
|**FormData**|**userId**  <br>*必填*|用户id|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ServerResponse](#serverresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/system/addUserToBranch/0
```


###### 请求 formData
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string",
  "success" : true
}
```


<a name="changepasswordusingpost"></a>
#### 修改密码
```
POST /system/change-password
```


##### 说明
修改密码


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**changePassword**  <br>*必填*|传入json格式|[ChangePassword](#changepassword)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ServerResponse](#serverresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/system/change-password
```


###### 请求 body
```
json :
{
  "newPassword" : "123123",
  "oldPassword" : "123456",
  "username" : "admin"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string",
  "success" : true
}
```


<a name="finduserbyidcardusingpost"></a>
#### 通过IDCard查找用户
```
POST /system/findUserByIdCard
```


##### 说明
通过IDCard查找用户接口


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**FormData**|**idcard**  <br>*必填*|身份证|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ServerResponse](#serverresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/system/findUserByIdCard
```


###### 请求 formData
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string",
  "success" : true
}
```


<a name="loginusingpost"></a>
#### 登录
```
POST /system/login
```


##### 说明
评估登录接口


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**userForm**  <br>*必填*|传入json格式|[LoginForm](#loginform)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ServerResponse](#serverresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/system/login
```


###### 请求 body
```
json :
{
  "captcha" : "4563",
  "password" : "123456",
  "status" : 1,
  "unit" : "xx公司",
  "username" : "admin"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string",
  "success" : true
}
```


<a name="registerusingpost"></a>
#### 个人用户注册
```
POST /system/register
```


##### 说明
个人用户注册接口


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**user**  <br>*必填*|传入json格式|[User](#user)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ServerResponse](#serverresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/system/register
```


###### 请求 body
```
json :
{
  "password" : "123456",
  "status" : 1,
  "username" : "admin"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string",
  "success" : true
}
```


<a name="showphotosusingpost"></a>
#### 显示单张图片
```
POST /system/show/{fileName}
```


##### 说明
显示单张图片接口


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**FormData**|**fileName**  <br>*必填*|文件名称|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ResponseEntity](#responseentity)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/system/show/{fileName}
```


###### 请求 formData
```
json :
"string"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "body" : "object",
  "statusCode" : "string",
  "statusCodeValue" : 0
}
```


<a name="unitloginusingpost"></a>
#### 单位登录
```
POST /system/unit-login
```


##### 说明
单位登录接口


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**userForm**  <br>*必填*|传入json格式|[LoginForm](#loginform)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ServerResponse](#serverresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/system/unit-login
```


###### 请求 body
```
json :
{
  "captcha" : "4563",
  "password" : "123456",
  "status" : 1,
  "unit" : "xx公司",
  "username" : "admin"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string",
  "success" : true
}
```


<a name="registerusingpost_1"></a>
#### 单位用户注册
```
POST /system/unit-register
```


##### 说明
单位用户注册接口


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**data**  <br>*必填*|data|[UnitRegisterForm](#unitregisterform)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ServerResponse](#serverresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/system/unit-register
```


###### 请求 body
```
json :
{
  "account" : "string",
  "address" : "string",
  "email" : "string",
  "image" : "string",
  "industry" : 0,
  "legalPerson" : "string",
  "level" : 0,
  "license" : "string",
  "name" : "string",
  "password" : "123",
  "position" : "string",
  "principal" : "string",
  "property" : 0,
  "signature" : "string",
  "userId" : 0,
  "username" : "admin"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string",
  "success" : true
}
```


<a name="uploadusingpost_1"></a>
#### 上传图片
```
POST /system/upload
```


##### 说明
上传图片接口


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**FormData**|**file**  <br>*必填*|文件|string|
|**FormData**|**prefix**  <br>*必填*|文件保存前缀|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ServerResponse](#serverresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `multipart/form-data`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/system/upload
```


###### 请求 formData
```
json :
"unit"
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string",
  "success" : true
}
```


<a name="train-person-controller_resource"></a>
### Train-person-controller
Train Person Controller


<a name="addusingpost_13"></a>
#### add
```
POST /evaluation/{evaluation_id}/train-person/add
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**evaluation_id**  <br>*必填*|evaluation_id|integer (int64)|
|**Body**|**trainPerson**  <br>*必填*|trainPerson|[TrainPerson](#trainperson)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ServerResponse](#serverresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/evaluation/0/train-person/add
```


###### 请求 body
```
json :
{
  "name" : "string",
  "proveUrl" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string",
  "success" : true
}
```


<a name="deleteusingdelete_14"></a>
#### delete
```
DELETE /evaluation/{evaluation_id}/train-person/delete/{id}
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**id**  <br>*必填*|id|integer (int64)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ServerResponse](#serverresponse)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/evaluation/{evaluation_id}/train-person/delete/0
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string",
  "success" : true
}
```


<a name="listusingget_13"></a>
#### list
```
GET /evaluation/{evaluation_id}/train-person/list
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**evaluation_id**  <br>*必填*|evaluation_id|integer (int64)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ServerResponse«List«TrainPerson»»](#0fa1ee6ce5363d9ce472b8a9ba669744)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/evaluation/0/train-person/list
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : [ {
    "name" : "string",
    "proveUrl" : "string"
  } ],
  "message" : "string",
  "success" : true
}
```


<a name="getbyidusingget_13"></a>
#### getById
```
GET /evaluation/{evaluation_id}/train-person/{id}
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**id**  <br>*必填*|id|integer (int64)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ServerResponse](#serverresponse)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/evaluation/{evaluation_id}/train-person/0
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string",
  "success" : true
}
```


<a name="updatebyidusingput_12"></a>
#### updateById
```
PUT /evaluation/{evaluation_id}/train-person/{id}
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**id**  <br>*必填*|id|integer (int32)|
|**Body**|**trainPerson**  <br>*必填*|trainPerson|[TrainPerson](#trainperson)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ServerResponse](#serverresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/evaluation/{evaluation_id}/train-person/0
```


###### 请求 body
```
json :
{
  "name" : "string",
  "proveUrl" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string",
  "success" : true
}
```


<a name="unit-controller_resource"></a>
### Unit-controller
Unit Controller


<a name="deleteusingdelete_15"></a>
#### delete
```
DELETE /unit/delete/{unit_id}
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**unit_id**  <br>*必填*|unit_id|integer (int64)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ServerResponse](#serverresponse)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/unit/delete/0
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string",
  "success" : true
}
```


<a name="listusingget_14"></a>
#### list
```
GET /unit/list
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**account**  <br>*可选*|账户|string|
|**Query**|**industry**  <br>*可选*|单位行业|integer (int32)|
|**Query**|**level**  <br>*可选*|单位级别|integer (int32)|
|**Query**|**name**  <br>*可选*|单位名称|string|
|**Query**|**property**  <br>*可选*|单位性质|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ServerResponse«PageInfo«Unit»»](#d02482cd7f2b2f745fe098f53c2c07f2)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/unit/list
```


###### 请求 query
```
json :
{
  "account" : "123",
  "industry" : 1,
  "level" : 1,
  "name" : "xx公司",
  "property" : 1
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : {
    "endRow" : 0,
    "hasNextPage" : true,
    "hasPreviousPage" : true,
    "isFirstPage" : true,
    "isLastPage" : true,
    "list" : [ {
      "account" : "string",
      "address" : "string",
      "email" : "string",
      "image" : "string",
      "industry" : 0,
      "legalPerson" : "string",
      "level" : 0,
      "license" : "string",
      "name" : "string",
      "position" : "string",
      "principal" : "string",
      "property" : 0,
      "signature" : "string",
      "userId" : 0
    } ],
    "navigateFirstPage" : 0,
    "navigateLastPage" : 0,
    "navigatePages" : 0,
    "navigatepageNums" : [ 0 ],
    "nextPage" : 0,
    "pageNum" : 0,
    "pageSize" : 0,
    "pages" : 0,
    "prePage" : 0,
    "size" : 0,
    "startRow" : 0,
    "total" : 0
  },
  "message" : "string",
  "success" : true
}
```


<a name="updateusingput_1"></a>
#### update
```
PUT /unit/update
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**unit**  <br>*必填*|unit|[Unit](#unit)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ServerResponse](#serverresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/unit/update
```


###### 请求 body
```
json :
{
  "account" : "string",
  "address" : "string",
  "email" : "string",
  "image" : "string",
  "industry" : 0,
  "legalPerson" : "string",
  "level" : 0,
  "license" : "string",
  "name" : "string",
  "position" : "string",
  "principal" : "string",
  "property" : 0,
  "signature" : "string",
  "userId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string",
  "success" : true
}
```


<a name="getbyidusingget_14"></a>
#### getById
```
GET /unit/{id}
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**id**  <br>*必填*|id|integer (int64)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ServerResponse](#serverresponse)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/unit/0
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string",
  "success" : true
}
```


<a name="user-controller_resource"></a>
### User-controller
User Controller


<a name="addusingpost_14"></a>
#### add
```
POST /user/add
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**user**  <br>*必填*|user|[User](#user)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ServerResponse](#serverresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/user/add
```


###### 请求 body
```
json :
{
  "password" : "123456",
  "status" : 1,
  "username" : "admin"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string",
  "success" : true
}
```


<a name="deleteusingdelete_16"></a>
#### delete
```
DELETE /user/delete/{user_id}
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**user_id**  <br>*必填*|user_id|integer (int64)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ServerResponse](#serverresponse)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/user/delete/0
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string",
  "success" : true
}
```


<a name="listusingget_15"></a>
#### list
```
GET /user/list
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**username**  <br>*可选*|用户名|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ServerResponse](#serverresponse)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/user/list
```


###### 请求 query
```
json :
{
  "username" : "admin"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string",
  "success" : true
}
```


<a name="updateusingput_2"></a>
#### update
```
PUT /user/update
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**userVo**  <br>*必填*|userVo|[UserVo](#uservo)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ServerResponse](#serverresponse)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/user/update
```


###### 请求 body
```
json :
{
  "password" : "123456",
  "role" : "string",
  "status" : 1,
  "token" : "string",
  "username" : "admin"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string",
  "success" : true
}
```


<a name="getbyidusingget_15"></a>
#### getById
```
GET /user/{id}
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Path**|**id**  <br>*必填*|id|integer (int64)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[ServerResponse](#serverresponse)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/user/0
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string",
  "success" : true
}
```


