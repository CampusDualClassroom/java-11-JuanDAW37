package com.campusdual.classroom;

public class Exercise11 {
    public static void main(String[] args) {
        TVRemote redRemote = new TVRemote("Rojo");
        TVRemote blackRemote = new TVRemote("Negro");
        System.out.println(redRemote.getColor());
        System.out.println(blackRemote.getColor());

        // Encender la TV
        System.out.println("Mando rojo encender: " + redRemote.turnOn());
        System.out.println("Mando negro encender: " + blackRemote.turnOn());

        // Subir un canal mando rojo
        redRemote.channelUp();
        System.out.println("Mando rojo subir canal " + redRemote.channel);
        // Subir un canal mando negro
        blackRemote.channelUp();
        System.out.println("Mando negro subir canal " + blackRemote.channel);

        //Bajar un canal mando rojo
        redRemote.channelDown();
        System.out.println("Mando rojo bajar canal " + redRemote.channel);
        //Bajar un canal mando negro
        blackRemote.channelDown();
        System.out.println("Mando negro bajar canal " + blackRemote.channel);

        // Establecer el canal en 0, intentar bajar un canal y comprobar que no se puede, para mando rojo
        redRemote.channel = 0;
        redRemote.channelDown();
        System.out.println("Mando rojo bajar canal " + redRemote.channel);
        // Establecer el canal en 0, intentar bajar un canal y comprobar que no se puede, para mando negro
        blackRemote.channel = 0;
        blackRemote.channelDown();
        System.out.println("Mando negro bajar canal " + blackRemote.channel);

        // Subir el volumen mando rojo
        redRemote.volumeUp();
        System.out.println("Mando rojo subir volumen " + redRemote.volume);
        // Subir el volumen mando negro
        blackRemote.volumeUp();
        System.out.println("Mando negro subir volumen " + blackRemote.volume);

        // Bajar el volumen mando rojo
        redRemote.volumeDown();
        System.out.println("Mando rojo bajar volumen " + redRemote.volume);
        // Bajar el volumen mando negro
        blackRemote.volumeDown();
        System.out.println("Mando negro bajar volumen " + blackRemote.volume);

        // Establecer el volumen en 0, intentar bajar el volumen y comprobar que no se puede mando rojo
        redRemote.volume = 0;
        redRemote.volumeDown();
        System.out.println("Mando rojo bajar volumen " + redRemote.volume);
        // Establecer el volumen en 0, intentar bajar el volumen y comprobar que no se puede mando negro
        blackRemote.volume = 0;
        blackRemote.volumeDown();
        System.out.println("Mando negro bajar volumen " + blackRemote.volume);

        /*
        *

        * */
        // Obtener el color del mando a distancia y mostrarlo por pantalla mando rojo
        System.out.println(redRemote.getColor());
        // Obtener el color del mando a distancia y mostrarlo por pantalla mando negro
        System.out.println(blackRemote.getColor());

        // Apagar la TV mando rojo
        redRemote.turnOff();
        System.out.println("TV apagada con mando a distancia rojo: " + redRemote.on);
        // Apagar la TV mando negro
        blackRemote.turnOff();
        System.out.println("TV apagada con mando a distancia negro: " + blackRemote.on);
    }

}