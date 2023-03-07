package com.jad.productadapter.antiqua;

public class Capsula {
    public final char[] nomen = "Capsula".toCharArray();
    public final Res[] res = new Res[10];
    public static final int Statura = 10;

    public Capsula() {
        for (int i = 0; i < Capsula.Statura; i ++){
            this.res[i] = null;
        }
    }

    public char[] propono() {
        char[] temporarius = new char[Capsula.Statura * 21];
        int numerus = 0;
        for(int i = 0; (i < Capsula.Statura) && (this.res[i] != null); i++) {
            for(int j = 0; j < this.res[i].nomen.length; j++) {
                temporarius[numerus++] = this.res[i].nomen[j];
            }
            temporarius[numerus++] = ' ';
        }
        return temporarius;
    }
}
