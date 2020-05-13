package patrones.facade.ejemplo1;

public class MovilFacade {
    Galaxy galaxy = new Galaxy();
    IPhone iphone = new IPhone();
    Huawei huawei = new Huawei();
    // Implementar servicios de la Clase facade
    public void venderGalaxy(){
        galaxy.modelo();
        galaxy.precio();
    }
    public void venderIPhone(){
        iphone.modelo();
        iphone.precio();
    }
    public void venderHuawei(){
        huawei.modelo();
        huawei.precio();
    }
}
