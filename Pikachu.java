/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Pikaczu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Czy zdamy bamboszka?");
        Scanner in = new Scanner(System.in);
        in.nextLine();
        System.out.println(
"        ,@@@@@@@@@@,,@@@@@@@%  .#&@@@&&.,@@@@@@@@@@,      %@@@@@@%*   ,@@@%     .#&@@@&&.  *&@@@@&(  ,@@@@@@@%  %@@@@@,     ,@@,          \n" +
"            ,@@,    ,@@,      ,@@/   ./.    ,@@,          %@%   ,&@# .&@&@@(   .@@/   ./. #@&.  .,/  ,@@,       %@%  *&@&.  ,@@,          \n" +
"            ,@@,    ,@@&%%%%. .&@@/,        ,@@,          %@%   ,&@# %@& /@@,  .&@@/,     (@@&%(*.   ,@@&%%%%.  %@%    &@#  ,@@,          \n" +
"            ,@@,    ,@@/,,,,    ./#&@@@(    ,@@,          %@@@@@@%* /@@,  #@&.   ./#&@@@(   *(%&@@&. ,@@/,,,,   %@%    &@#  .&&.          \n" +
"            ,@@,    ,@@,      ./,   .&@#    ,@@,          %@%      ,@@@@@@@@@% ./.   .&@# /*.   /@@. ,@@,       %@%  *&@&.   ,,           \n" +
"            ,@@,    ,@@@@@@@% .#&@@@@&/     ,@@,          %@%     .&@#     ,@@/.#&@@@@&/   /%&@@@@.  ,@@@@@@@%  %@@@@@.     ,@@,          \n" +
",*************,,*/(((((//,,*(#%%%%%%%%%%%%%%%#(*,,,****************************************************,*/(((((((((/((((////****/((##%%%%%%\n" +
",*************,,//((((((//,,*(%%%%%%%%%%%%%%%%%##/*****************************************************,,*/(///(//////****//((##%%%%%%%%%%%\n" +
",************,,*/(((((((//***/#%%%%%%%%%%%%%%%%%%%#(/***************************************************,*//////////*//((#%%%%%%%%%%%%%%%%%\n" +
",***********,,*////////////***/##%%%%%%%%%%%%%%%%%%%##(*,***********************************************,,*////////(###%%%%%%%%%%%%%%%%%%%%\n" +
",**********,,,*/*******//////**/(#%%%%%%%%%%%%%%%%%%%%%#(/**********************************************,,,***/(##%%%%%%%%%%%%%%%%%%%%%%%%%\n" +
",*********,,,,*************///***/(#%%%%%%%%%%%%%%%%%%%%%%#(/***********************************,****,****/((#%%%%%%%%%%%%%%%%%%%%%%%%%%%%#\n" +
",*********,,,***************//****/(##%%%%%%%%%%%%%%%%%%%%%%##//**************//////////////////////((#####%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#(\n" +
",********,,,,***********************/(#%%%%%%%%%%%%%%%%%%%%%%%##################%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%##(/\n" +
",*******,..,***********************,,*/##%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%###((//\n" +
",*******,.,,***********************,,,,*(#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%##(//**//\n" +
",******,.,,,************************,,,,*/(#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#(//*******\n" +
",*****,,,,,********,***,,,,,,,,,,,,*,,,,,,*/(######%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%##(/**********\n" +
",*****,..,*******,,,,,,,,,,,,,,,,,,,,,,*,,,,*///((#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%###(/************\n" +
",*****,,,*******,,,,,*,,,,,,,,,,,,,,,,,****,,,*/(#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#######(//**************\n" +
",****,.,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,**,,,/(%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#((//******************\n" +
",***,..,,,,,,,,,,,,,,,,,,,,,,,,,,,,,..,,,,,,,*(#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#(/*******************\n" +
",**,,.,,,,,,,,,,,,,,,,,,,,,,,,,,.......,,,,,,/#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#####%%%%%%%%%%%%%%%%#(/******************\n" +
",**,..,,,,,,,,,,,,,,,,,,,,,,,,,......,,,*,,,*(#%%%%%%%%##(((/(##%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%##(((/*/((#%%%%%%%%%%%%%%#(/*****************\n" +
",*,..,,,,,,,,,,,,,,,,,,,,,,,,,,,.....,,**,,*/#%%%%%%%##((((*,**/#%%%%%%%%%%%%%%%%%%%%%%%%%%%%##((##/,,,*(#%%%%%%%%%%%%%%#(*****************\n" +
".*,.,,,**,,,,,,,,,,,,,,,,,,,,,,,,,,*****,,,/(%%%%%%%%#(//(#/,..*/#%%%%%%%%%%%%%%%%%%%%%%%%%%%#(//(#/,..,/(#%%%%%%%%%%%%%%#/*****///////////\n" +
".,..,,,,,,,,,,,,,,,,,,,,,,,,,,*,,*******,,,(#%%%%%%%%#(*,,,....,/#%%%%%%%%%%%%%%%%%%%%%%%%%%%#(*,,,....,/(#%%%%%%%%%%%%%%#(*,**////////////\n" +
".,..,,,,,,,,,...........,,,,,,*,********,,*(#%%%%%%%%%#(/*,,...,/#%%%%%%%%%%%%%%%%%%%%%%%%%%%%#(/*,,..,*/##%%%%%%%%%%%%%%%#(***////////////\n" +
"...,,,,,,,................,,*,**********,,/#%%%%%%%%%%%%#((////((#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%##((///(#%%%%%%%%%%%%%%%%%%(/**////////////\n" +
" ..,,,,,,.................,,,**********,,*(#%%%%%%%%%%%%%%%%%%#%%%%%%%%#((///((#%%%%%%%%%%%%%%%%%%%%%#%%%%%%%%%%%%%%%%%%%%%#/**////////////\n" +
".,,,,,,,,.................,,***********,,/(####%%%%%%%%%%%%%%%%%%%%%%%%#(/*,,,*(#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#(/*////////////\n" +
".,***,,,,,,..............,,,**********,..,***//((##%%%%%%%%%%%%%%%%%%%%%%%##((##%%%%%%%%%%%%%%%%%%%%%%%%%##(((((((((###%%%%%#/**///////////\n" +
".*****,,,,,,,,,,,,,,,,,,,*************,..,*******/(#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%##///*//////((#%%%%%#(**///////////\n" +
".****************/******/***////*****,.,*///////**/#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#(////////////(#%%%%%#/**//////////\n" +
".***********************/////*******,..,*//////////(#%%%%%%%%%%%%%%%%%%%%##########%%%%%%%%%%%%%%%%%%%%#(///////////*/(#%%%%%#(***/////////\n" +
".************************///********,..,*//////////#%%%%%%%%%%%%%%%%%%#(//*****///(((##%%%%%%%%%%%%%%%%#(///////////**/##%%%%##/***////////\n" +
".***********************************,.,,***///////(#%%%%%%%%%%%%%%%%#(/*,,,*//((((////(#%%%%%%%%%%%%%%%#((////////////(#%%%%%%#(*********//\n" +
",***********,,,*,,*,,**************,,,*//******//(#%%%%%%%%%%%%%%%%%#(*,,*/(((#####(((((#%%%%%%%%%%%%%%%##///////////(#%%%%%%%%#(***///////\n" +
",*************,,**,,,************,,,,,/(##((((####%%%%%%%%%%%%%%%%%%%(/**/(((#((((#((//(#%%%%%%%%%%%%%%%%%#(((((((((##%%%%%%%%%%#/**///////\n" +
",******************************,,,,,,,*(#%#%%%%%%%%%%%%%%%%%%%%%%%%%%#(**/((#(#(((#((//(#%%%%%%%%%%%%%%%%%%%%%%%#%#%%%%%%%%%%%%%#(**///////\n" +
",*************,**************,****,,,,,/(#%%%%%%%%%%%%%%%%%%%%%%%%%%%%#(/*/((((#((((///(#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%(/*///////\n" +
",*************************************,*/#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%##(////////////(#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#/**/////*\n" +
",******////****///////////////////////***/#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%####(((((((###%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#(********\n" +
".,*,****///////////////////////////////***/#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#(/*******\n" +
".,,,,*****//////////////////////////*******(#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%##(*******\n" +
".,,,,,,***********/////////////////********/(#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%(*******");
    }
}
