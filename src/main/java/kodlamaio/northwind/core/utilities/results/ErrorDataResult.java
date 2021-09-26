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
public class ErrorDataResult<T> extends DataResult {

    public ErrorDataResult(T data, String message) {
        super(data, false,message);
    }
    public ErrorDataResult(T data){
        super(data,false);
    }
    public ErrorDataResult( String message) {
        super(null,false,message);
    }
    public ErrorDataResult(){
        super(null,false);
    }
}
