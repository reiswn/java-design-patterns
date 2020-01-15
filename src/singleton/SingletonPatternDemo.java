/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author willian
 */
public class SingletonPatternDemo {

    public static void main(String args[]){
        
        // SingletonObject() has private access in SingletonObject class
        //SingletonObject object = new SingletonObject();
        
        SingletonObject object = SingletonObject.getInstance();
        
        object.showMessage();
        
        SingletonObject object2 = SingletonObject.getInstance();
        System.out.println(object==object2);
        
    }
    
}
