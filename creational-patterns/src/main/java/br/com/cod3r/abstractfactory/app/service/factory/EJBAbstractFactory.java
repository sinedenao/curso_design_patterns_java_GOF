package br.com.cod3r.abstractfactory.app.service.factory;

import br.com.cod3r.abstractfactory.app.service.services.CarService;
import br.com.cod3r.abstractfactory.app.service.services.UserService;
import br.com.cod3r.abstractfactory.app.service.services.CarEJBService;
import br.com.cod3r.abstractfactory.app.service.services.UserEJBService;

public class EJBAbstractFactory implements ServicesAbstractFactory{
    
    @Override
    public CarService getCarService(){
        return new CarEJBService();
    }

    @Override
    public UserService getUserService(){
        return new UserEJBService();
    }
}
