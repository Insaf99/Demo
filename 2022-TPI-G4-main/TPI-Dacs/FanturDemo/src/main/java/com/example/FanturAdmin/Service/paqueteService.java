package com.example.FanturAdmin.Service;

import com.example.FanturAdmin.Dao.PaqueteDao;
import com.example.FanturAdmin.Model.Paquete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
;import java.util.List;

@Service
public class paqueteService {

    @Autowired
    private PaqueteDao paquetedao;
    
    @Transactional(readOnly= true)
    public List<Paquete> listarpaquetes(){
        return paquetedao.findAll();
    }

}
