package com.bd.mysql.servicio;

import java.util.List;

import com.bd.mysql.modelo.ClassMedico;

public interface IMedicoServicio {
	public void RegistrarMedico(ClassMedico classmedico);
	public void EliminarMedico(Integer id);
	public ClassMedico BuscarporId(Integer id);
	public List<ClassMedico> ListadoMedico();

}
