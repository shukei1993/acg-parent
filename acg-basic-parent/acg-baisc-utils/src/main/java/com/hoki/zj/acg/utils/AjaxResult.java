package com.hoki.zj.acg.utils;

/**
 * Ajaxリクエストのリスポンス
 */
public class AjaxResult {
    private boolean success = true;
    private String message = "操作は成功しました!";


    // フロント側に返すオブジェクト
    private Object resultObj;

    public boolean isSuccess() {
        return success;
    }

    public AjaxResult setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public AjaxResult setMessage(String message) {
        this.message = message;
        return this;
    }

    public Object getResultObj() {
        return resultObj;
    }

    public AjaxResult setResultObj(Object resultObj) {
        this.resultObj = resultObj;
        return this;
    }

    //com.hoki.zj.acg.utils.AjaxResult.me()成功
    //com.hoki.zj.acg.utils.AjaxResult.me().setMessage()成功
    //com.hoki.zj.acg.utils.AjaxResult.me().setSuccess(false),setMessage("失败");
    public  static AjaxResult me(){
        return new AjaxResult();
    }



    /*
    // 成功しました
    public com.hoki.zj.acg.utils.AjaxResult() {
    }

    // 失败して、エラーメッセージを返す
    public com.hoki.zj.acg.utils.AjaxResult(String message) {
        this.success = false;
        this.message = message;
    }*/
}
