/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

/**
 *
 * @author MAXHUB
 */
public class ResponseXMLDisplay extends DisplayService{

    @Override
    public XMLParser getParser() {
        return new ResponseXMLMessage();
    }
    
}
