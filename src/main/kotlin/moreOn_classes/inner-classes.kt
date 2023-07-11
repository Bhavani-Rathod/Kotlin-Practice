package moreOn_classes

fun main(){

    val listView = ListView(arrayOf("Bhavani", "Subhash", "Rathod"))

    listView.ListViewItem().displayItem(2)
}

class ListView(var listItem: Array<String>){

    inner class ListViewItem(){

        fun displayItem(position: Int){
            println(listItem[position])
        }

    }

}