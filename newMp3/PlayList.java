package newMp3;

import java.util.ArrayList;

public class PlayList {

    private String playListName;
    public ArrayList<Music> musics = new ArrayList<Music>();


    public PlayList(String playListName, ArrayList<Music> musics) {
        this.playListName = playListName;
        this.musics = musics;
    }

    public PlayList(String playListName) {
        this.playListName = playListName;
    }

    //Method for music Play list

    public String getPlayListName(){
        this.playListName = playListName;
        return playListName;
    }

    public ArrayList<Music> musicArrayList(){

        Music music1 = new Music("The king of kings", 001, 10000);
        Music music2 = new Music("The power of Kings", 011, 20000);

        musics.add(music1);
        musics.add(music2);
        return musics;
    }



//    private final ArrayList<Item>itemList;
//    private  String customerName;
//
//    public Cart(String customerName) {
//        this.customerName = customerName;
//        itemList = new ArrayList<>() ;
//    }
//
//
//    public void addEachItemsToItemList(Item items){
//        itemList.add(items);
//    }




}


/*
Add each element of arrayList using forLoop
for (int i = 0; i < num.size(); i++) {
        result.add(i, num.get(i));
        }

OR YOU CAN USE THIS
        result.addAll(num);
*/


/*
Ah ... I get it ... you are trying to create a list of strings where the strings are representations of the input lists:

Do this:

for (int i = 0; i < num.size(); i++) {
    result.add(i, num.toString());
}
This will give you the output you are asking for.

Another possibility is that you want a list of lists of strings:

ArrayList<ArrayList<String>> result = new ArrayList<>();
for (int i = 0; i < num.size(); i++) {
    result.add(i, num);
}
* */