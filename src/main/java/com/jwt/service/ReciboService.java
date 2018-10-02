package com.jwt.service;

import java.util.List;

import com.jwt.model.Recibo;

public interface ReciboService {
	
	public void addRecibo(Recibo recibo);

	public List<Recibo> getAllRecibos();

	public void deleteRecibo(Integer reciboId);

	public Recibo getRecibo(int reciboid);

	public Recibo updateRecibo(Recibo recibo);
}
