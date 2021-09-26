/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kodlamaio.northwind.core.utilities.results;

/**
 *
 * @author yahya
 */
public class Result {
    private boolean success;
    private String message;
    public Result(boolean success){
        this.success=success;
    }
    public Result(boolean success, String message){
        this(success);// amaç do not repeat yourself tek parametreli constructor var zaten bizde burada direk onu kullandık birdaha birdaha yazmadık
        this.success=success;
    }
    public boolean isSuccess(){
        return this.success;
    }
    public String getMessage(){
        return this.message;
    }
}
