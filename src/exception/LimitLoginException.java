/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception;

public class LimitLoginException extends Exception{
    public LimitLoginException() {
        super("Excedido limite de intentos");
    }
}
