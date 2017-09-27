/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperatureconverter.temperature.converter;

/**
 *
 * @author bpham
 */
public class WrongPageException extends RuntimeException {

    public WrongPageException(String message) {
        super(message);
    }
    
}
