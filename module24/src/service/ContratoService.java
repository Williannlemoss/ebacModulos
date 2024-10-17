package service;

import dao.IContratoDao;

public class ContratoService implements IContratoService {

    private final IContratoDao contratoDao;

    public ContratoService(IContratoDao dao) {
        this.contratoDao = dao;
    }

    @Override
    public String salvar() {
        contratoDao.salvar();
        return "Success";
    }

    @Override
    public String buscar() {
        contratoDao.buscar();
        return "Success";
    }

    @Override
    public String excluir() {
        contratoDao.excluir();
        return "Success";
    }

    @Override
    public String atualizar() {
        contratoDao.atualizar();
        return "Success";
    }
}