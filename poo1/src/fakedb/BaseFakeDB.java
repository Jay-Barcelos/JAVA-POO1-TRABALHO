package fakedb;

import java.util.ArrayList;

public abstract class BaseFakeDB<TDominio>{

        protected ArrayList<TDominio> tabela;

        public ArrayList<TDominio> getTabela(){
            return this.tabela;
        }

        public abstrac void preencherDados();

        public BaseFakeDB(){
            this.preencherDados();
        }
} 
