package com.tinmegali.androidmvp.common.mvp;

/**
 * ---------------------------------------------------
 * Created by Tin Megali on 25/02/16.
 * Project: AndroidMVP
 * ---------------------------------------------------
 * <a href="http://www.tinmegali.com">tinmegali.com</a>
 * <a href="http://www.github.com/tinmegali>github</a>
 * ---------------------------------------------------
 * Based on <a href="https://github.com/douglascraigschmidt/POSA-15/tree/master/ex/AcronymExpander/src/vandy/mooc">
 * framework MVP</a> developed by
 * <a href="https://github.com/douglascraigschmidt">
 * Dr. Douglas Schmidth</a>
 * ---------------------------------------------------
 */

/**
 * Interface com operações básicas que todos os modelos
 * devem implementar
 * @param <RequiredModelOps>
 */
public interface ModelOps<RequiredModelOps> {

    /**
     * Método disparado pelo GenericModel para inicializar
     * os objeto de operações, após ele ser instanciado
     *
     * @param presenterOps  interface com o Presenter
     */
    void onCreate(RequiredModelOps presenterOps);

    /**
     * Método disparado nas operações quando o Presenter registra
     * uma destruição, seja definitiva ou por mudança de configuração
     *
     * @param isChangingConfiguration   Informa se está ocorrendo
     *                                  uma mudança de configuração
     */
    void onDestroy(boolean isChangingConfiguration);
}