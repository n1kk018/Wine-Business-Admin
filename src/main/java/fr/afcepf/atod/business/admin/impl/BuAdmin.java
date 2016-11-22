package fr.afcepf.atod.business.admin.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.ParseException;

import fr.afcepf.atod.business.admin.api.IBuAdmin;
import fr.afcepf.atod.business.admin.dto.AdminDTO;
import fr.afcepf.atod.vin.data.exception.WineErrorCode;
import fr.afcepf.atod.vin.data.exception.WineException;
import fr.afcepf.atod.wine.data.admin.api.IDaoAdmin;
import fr.afcepf.atod.wine.entity.Admin;
import fr.afcepf.atod.wine.entity.User;

public class BuAdmin implements IBuAdmin {
    @Autowired
    private IDaoAdmin daoAdmin;
    @Autowired
    private ModelMapper modelMapper;
    
    @Override
    public AdminDTO connect(String paramMail, String paramPassword) throws WineException {
        WineException wineException = null;
        User admin = null;
        try {
            if (!paramMail.equalsIgnoreCase("")
                    && !paramPassword.equalsIgnoreCase("")) {
                admin = daoAdmin.connect(paramMail, paramPassword);
                if (!admin.getLastname().equalsIgnoreCase("")) {
                    // return user;
                } else {
                    wineException = new WineException(
                            WineErrorCode.RECHERCHE_NON_PRESENTE_EN_BASE,
                            paramMail + " - not found in the db");
                }
            } else {
                wineException = new WineException(
                        WineErrorCode.RECHERCHE_NON_PRESENTE_EN_BASE,
                        "invalid credentials");
            }
        } catch (Exception e) {
            wineException = new WineException(
                    WineErrorCode.RECHERCHE_NON_PRESENTE_EN_BASE,
                    "invalid credentials");
        }
        if (wineException != null) {
            throw wineException;
        }
        return convertToDto((Admin) admin);
    }

    @Override
    public AdminDTO addNewAdmin(AdminDTO paramAdmin) throws WineException {
        try {
            daoAdmin.insertObj(convertToEntity(paramAdmin));
        } catch (Exception e) {
            throw new WineException(WineErrorCode.IMPOSSIBLE_AJOUT_DANS_BASE, "Erreur d'insertion!!!!");
        }
        return paramAdmin;
    }
    
    private AdminDTO convertToDto(Admin admin) {
        AdminDTO adminDto = modelMapper.map(admin, AdminDTO.class);
        return adminDto;
    }
    
    private Admin convertToEntity(AdminDTO adminDto) throws ParseException {
        Admin post = modelMapper.map(adminDto, Admin.class);
        return post;
    }
}
