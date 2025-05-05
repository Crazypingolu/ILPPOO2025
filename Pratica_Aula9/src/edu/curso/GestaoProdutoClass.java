package edu.curso;

import java.util.ArrayList;
import java.util.List;

public class GestaoProdutoClass implements PublicadoraClass {
    private List<AssinanteProdutoClass> list = new ArrayList<>();
    @Override
    public void adicionar(AssinanteProdutoClass as){
        list.add(as);
    }
}
