/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templeinfostorage;

import templeinfostorage.ui.TempleUI;
/**
 * Project main
 * @author tonyl
 */
public class TempleInfoStorage {
    private static TempleUI m_TempleUI;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        m_TempleUI = new TempleUI();
        m_TempleUI.start(null);
    }
    
}
