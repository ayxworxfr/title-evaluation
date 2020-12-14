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

* branch-office-controller : Branch Office Controller
* captcha-controller : Captcha Controller
* evaluation-controller : Evaluation Controller
* login-code-controller : Login Code Controller
* person-controller : Person Controller
* supply-controller : Supply Controller
* system-controller : System Controller
* unit-controller : Unit Controller
* user-controller : User Controller




<a name="paths"></a>
## 资源

<a name="branch-office-controller_resource"></a>
### Branch-office-controller
Branch Office Controller


<a name="addusingpost"></a>
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


<a name="deleteusingdelete"></a>
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


<a name="listusingget"></a>
#### list
```
GET /branch-office/list
```


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
/branch-office/list
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


<a name="getbyidusingget"></a>
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


<a name="addusingpost_1"></a>
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
  "status" : 0,
  "supplyId" : 0,
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


<a name="deleteusingdelete_1"></a>
#### delete
```
DELETE /evaluation/delete/{person_id}
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


<a name="listusingget_1"></a>
#### list
```
GET /evaluation/list
```


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
/evaluation/list
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


<a name="getbyidusingget_1"></a>
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


<a name="updatebyidusingput"></a>
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
  "status" : 0,
  "supplyId" : 0,
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


<a name="login-code-controller_resource"></a>
### Login-code-controller
Login Code Controller


<a name="addusingpost_2"></a>
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


<a name="deleteusingdelete_2"></a>
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


<a name="person-controller_resource"></a>
### Person-controller
Person Controller


<a name="addusingpost_3"></a>
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


<a name="deleteusingdelete_3"></a>
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


<a name="listusingget_2"></a>
#### list
```
GET /person/list
```


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
/person/list
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


<a name="getbyidusingget_2"></a>
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


<a name="updatebyidusingput_1"></a>
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


<a name="supply-controller_resource"></a>
### Supply-controller
Supply Controller


<a name="uploadusingpost"></a>
#### upload
```
POST /supply/upload
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
/supply/upload
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
/system/login
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
/system/unit-login
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


<a name="unit-controller_resource"></a>
### Unit-controller
Unit Controller


<a name="deleteusingdelete_4"></a>
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


<a name="listusingget_3"></a>
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
|**200**|OK|[ServerResponse](#serverresponse)|
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
  "data" : "object",
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


<a name="getbyidusingget_3"></a>
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


<a name="addusingpost_4"></a>
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


<a name="deleteusingdelete_5"></a>
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


<a name="listusingget_4"></a>
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


<a name="getbyidusingget_4"></a>
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




<a name="definitions"></a>
## 定义

<a name="branchoffice"></a>
### BranchOffice

|名称|说明|类型|
|---|---|---|
|**name**  <br>*可选*|**样例** : `"string"`|string|
|**signature**  <br>*可选*|**样例** : `"string"`|string|
|**unitId**  <br>*可选*|**样例** : `0`|integer (int64)|
|**userId**  <br>*可选*|**样例** : `0`|integer (int64)|


<a name="changepassword"></a>
### ChangePassword

|名称|说明|类型|
|---|---|---|
|**newPassword**  <br>*必填*|新密码  <br>**样例** : `"123123"`|string|
|**oldPassword**  <br>*必填*|旧密码  <br>**样例** : `"123456"`|string|
|**username**  <br>*必填*|用户名  <br>**样例** : `"admin"`|string|


<a name="codeform"></a>
### CodeForm

|名称|说明|类型|
|---|---|---|
|**account**  <br>*可选*|账户  <br>**样例** : `"123"`|string|
|**createTime**  <br>*必填*|创建时间  <br>**样例** : `"2020-12-12T11:11:11.111Z"`|string (date-time)|
|**failureTime**  <br>*必填*|失效时间  <br>**样例** : `"2018-12-20T11:11:11.111Z"`|string (date-time)|
|**password**  <br>*可选*|密码  <br>**样例** : `"123456"`|string|


<a name="evaluation"></a>
### Evaluation

|名称|说明|类型|
|---|---|---|
|**jury**  <br>*可选*|**样例** : `"string"`|string|
|**level**  <br>*可选*|**样例** : `0`|integer (int32)|
|**source**  <br>*可选*|**样例** : `"string"`|string|
|**status**  <br>*可选*|**样例** : `0`|integer (int32)|
|**supplyId**  <br>*可选*|**样例** : `0`|integer (int64)|
|**userId**  <br>*可选*|**样例** : `0`|integer (int64)|
|**year**  <br>*可选*|**样例** : `"string"`|string (date-time)|


<a name="person"></a>
### Person

|名称|说明|类型|
|---|---|---|
|**birthDay**  <br>*可选*|**样例** : `"string"`|string|
|**birthPlace**  <br>*可选*|**样例** : `"string"`|string|
|**email**  <br>*可选*|**样例** : `"string"`|string|
|**filePlace**  <br>*可选*|**样例** : `"string"`|string|
|**idcard**  <br>*可选*|**样例** : `"string"`|string|
|**nation**  <br>*可选*|**样例** : `0`|integer (int32)|
|**phone**  <br>*可选*|**样例** : `"string"`|string|
|**political**  <br>*可选*|**样例** : `0`|integer (int32)|
|**sex**  <br>*可选*|**样例** : `0`|integer (int32)|
|**status**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="responseentity"></a>
### ResponseEntity

|名称|说明|类型|
|---|---|---|
|**body**  <br>*可选*|**样例** : `"object"`|object|
|**statusCode**  <br>*可选*|**样例** : `"string"`|enum (100 CONTINUE, 101 SWITCHING_PROTOCOLS, 102 PROCESSING, 103 CHECKPOINT, 200 OK, 201 CREATED, 202 ACCEPTED, 203 NON_AUTHORITATIVE_INFORMATION, 204 NO_CONTENT, 205 RESET_CONTENT, 206 PARTIAL_CONTENT, 207 MULTI_STATUS, 208 ALREADY_REPORTED, 226 IM_USED, 300 MULTIPLE_CHOICES, 301 MOVED_PERMANENTLY, 302 FOUND, 302 MOVED_TEMPORARILY, 303 SEE_OTHER, 304 NOT_MODIFIED, 305 USE_PROXY, 307 TEMPORARY_REDIRECT, 308 PERMANENT_REDIRECT, 400 BAD_REQUEST, 401 UNAUTHORIZED, 402 PAYMENT_REQUIRED, 403 FORBIDDEN, 404 NOT_FOUND, 405 METHOD_NOT_ALLOWED, 406 NOT_ACCEPTABLE, 407 PROXY_AUTHENTICATION_REQUIRED, 408 REQUEST_TIMEOUT, 409 CONFLICT, 410 GONE, 411 LENGTH_REQUIRED, 412 PRECONDITION_FAILED, 413 PAYLOAD_TOO_LARGE, 413 REQUEST_ENTITY_TOO_LARGE, 414 URI_TOO_LONG, 414 REQUEST_URI_TOO_LONG, 415 UNSUPPORTED_MEDIA_TYPE, 416 REQUESTED_RANGE_NOT_SATISFIABLE, 417 EXPECTATION_FAILED, 418 I_AM_A_TEAPOT, 419 INSUFFICIENT_SPACE_ON_RESOURCE, 420 METHOD_FAILURE, 421 DESTINATION_LOCKED, 422 UNPROCESSABLE_ENTITY, 423 LOCKED, 424 FAILED_DEPENDENCY, 425 TOO_EARLY, 426 UPGRADE_REQUIRED, 428 PRECONDITION_REQUIRED, 429 TOO_MANY_REQUESTS, 431 REQUEST_HEADER_FIELDS_TOO_LARGE, 451 UNAVAILABLE_FOR_LEGAL_REASONS, 500 INTERNAL_SERVER_ERROR, 501 NOT_IMPLEMENTED, 502 BAD_GATEWAY, 503 SERVICE_UNAVAILABLE, 504 GATEWAY_TIMEOUT, 505 HTTP_VERSION_NOT_SUPPORTED, 506 VARIANT_ALSO_NEGOTIATES, 507 INSUFFICIENT_STORAGE, 508 LOOP_DETECTED, 509 BANDWIDTH_LIMIT_EXCEEDED, 510 NOT_EXTENDED, 511 NETWORK_AUTHENTICATION_REQUIRED)|
|**statusCodeValue**  <br>*可选*|**样例** : `0`|integer (int32)|


<a name="serverresponse"></a>
### ServerResponse

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"object"`|object|
|**message**  <br>*可选*|**样例** : `"string"`|string|
|**success**  <br>*可选*|**样例** : `true`|boolean|


<a name="unit"></a>
### Unit

|名称|说明|类型|
|---|---|---|
|**account**  <br>*可选*|**样例** : `"string"`|string|
|**address**  <br>*可选*|**样例** : `"string"`|string|
|**email**  <br>*可选*|**样例** : `"string"`|string|
|**image**  <br>*可选*|**样例** : `"string"`|string|
|**industry**  <br>*可选*|**样例** : `0`|integer (int32)|
|**legalPerson**  <br>*可选*|**样例** : `"string"`|string|
|**level**  <br>*可选*|**样例** : `0`|integer (int32)|
|**license**  <br>*可选*|**样例** : `"string"`|string|
|**name**  <br>*可选*|**样例** : `"string"`|string|
|**position**  <br>*可选*|**样例** : `"string"`|string|
|**principal**  <br>*可选*|**样例** : `"string"`|string|
|**property**  <br>*可选*|**样例** : `0`|integer (int32)|
|**signature**  <br>*可选*|**样例** : `"string"`|string|
|**userId**  <br>*可选*|**样例** : `0`|integer (int64)|


<a name="unitregisterform"></a>
### UnitRegisterForm

|名称|说明|类型|
|---|---|---|
|**account**  <br>*可选*|**样例** : `"string"`|string|
|**address**  <br>*可选*|**样例** : `"string"`|string|
|**email**  <br>*可选*|**样例** : `"string"`|string|
|**image**  <br>*可选*|**样例** : `"string"`|string|
|**industry**  <br>*可选*|**样例** : `0`|integer (int32)|
|**legalPerson**  <br>*可选*|**样例** : `"string"`|string|
|**level**  <br>*可选*|**样例** : `0`|integer (int32)|
|**license**  <br>*可选*|**样例** : `"string"`|string|
|**name**  <br>*可选*|**样例** : `"string"`|string|
|**password**  <br>*可选*|密码  <br>**样例** : `"123"`|string|
|**position**  <br>*可选*|**样例** : `"string"`|string|
|**principal**  <br>*可选*|**样例** : `"string"`|string|
|**property**  <br>*可选*|**样例** : `0`|integer (int32)|
|**signature**  <br>*可选*|**样例** : `"string"`|string|
|**userId**  <br>*可选*|**样例** : `0`|integer (int64)|
|**username**  <br>*可选*|用户账户  <br>**样例** : `"admin"`|string|


<a name="user"></a>
### User
用户类


|名称|说明|类型|
|---|---|---|
|**password**  <br>*必填*|密码  <br>**样例** : `"123456"`|string|
|**status**  <br>*可选*|状态  <br>**样例** : `1`|integer (int32)|
|**username**  <br>*必填*|用户名  <br>**样例** : `"admin"`|string|


<a name="uservo"></a>
### UserVo
用户类


|名称|说明|类型|
|---|---|---|
|**password**  <br>*必填*|密码  <br>**样例** : `"123456"`|string|
|**role**  <br>*可选*|**样例** : `"string"`|string|
|**status**  <br>*可选*|状态  <br>**样例** : `1`|integer (int32)|
|**token**  <br>*可选*|**样例** : `"string"`|string|
|**username**  <br>*必填*|用户名  <br>**样例** : `"admin"`|string|





