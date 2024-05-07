/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.reversearray;

/**
 *
 * @author kamau
 */
public class ReverseArray {

    public static void main(String[] args) {
       int arr[] = {12, 1234, 45, 67, 1};
        /* for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
*/
        //to reverse the array
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);

        }
    }
}
