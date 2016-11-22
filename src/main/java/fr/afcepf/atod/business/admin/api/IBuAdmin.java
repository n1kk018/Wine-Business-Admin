package fr.afcepf.atod.business.admin.api;

import fr.afcepf.atod.business.admin.dto.AdminDTO;
import fr.afcepf.atod.vin.data.exception.WineException;

public interface IBuAdmin {
    AdminDTO connect(String mail, String password) throws WineException;
    AdminDTO addNewAdmin(AdminDTO admin) throws WineException; 
}
