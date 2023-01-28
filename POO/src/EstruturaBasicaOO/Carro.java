package EstruturaBasicaOO;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 *
 *
 * @author Silvio Mancilha
 * Aula Dio OrangeTech conceitos baśicos de Estrutura Orientada a Objetos(OO)
 * - Classe
 * - Atributos
 * - Métodos
 */
class Carro {
    
        String cor;
        String modelo;
        double capacidadeTanque;
        
        //Contrutores
        
        Carro(){
            
        }
        
        Carro(String cor, String modelo, int capacidadeTanque){
            this.cor = cor;
            this.modelo = modelo;
            this.capacidadeTanque = capacidadeTanque;
        }
        
        //gets e sets
        void setCor(String cor){
            this.cor = cor;
        }
        
        String getCor(){
            return cor;
        }
        
        void setModelo(String modelo){
            this.modelo = modelo;
        }
        
        String getModelo(){
            return modelo;
        }
        
        void setCapacidadeTanque(int capacidadeTanque){
            this.capacidadeTanque = capacidadeTanque;
        }
        
        int getCapacidadeTanque (){
            return (int) capacidadeTanque;
        }
        
        //método do totla para abastecer o tanque completamente
        double totalValorTanque(double valorCombustivel){
            return capacidadeTanque * valorCombustivel;
        }
        
   
    }


