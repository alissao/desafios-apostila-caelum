package com.cotefacil2;

public class FabricaDeCarro {

    private static FabricaDeCarro instance;

    public static synchronized FabricaDeCarro getInstance() {
            if (instance == null) {
                instance = new FabricaDeCarro();
            }
            return instance;
    }

}
