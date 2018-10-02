/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jwt.dao;

import com.jwt.model.Recibo;
import java.util.List;

/**
 *
 * @author ely
 */
public interface ReciboDAO {
    
    
    public void addRecibo(Recibo recibo);

	public List<Recibo> getAllRecibos();

	public void deleteRecibo(Integer reciboId);

	public Recibo updateRecibo(Recibo recibo);

	public Recibo getRecibo(int reciboid);
}
