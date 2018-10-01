/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ARRAY_MEDIANA;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import static javafx.scene.input.KeyCode.T;

/**
 *
 * @author adam
 */
public class test {
    public static void main(String[]args)
    {
        ArrayList<Integer> acz = new ArrayList<>();
        
        for (int i = 0;i<15;i++)
        {
            acz.add(i);
        }
        acz.sort(Collections.reverseOrder());
        System.out.println(acz);
    }
}
