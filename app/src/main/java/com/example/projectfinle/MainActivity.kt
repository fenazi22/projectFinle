package com.example.projectfinle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private var recylerView:RecyclerView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        connectViews()
        prepareListView()
    }
    private fun connectViews(){ recylerView =findViewById(R.id.recylcer) }
    private fun prepareListView(){
        var array:ArrayList<Plants> = arrayListOf()
        array.add(Plants("مسك المدينة",R.drawable.one,"مسك المدينة أو الآس أو الياس واسمه العلمي Myrtus communis "))
        array.add(Plants("الصقلاب", R.drawable.tropic,"نبات الصقلاب اسمه العلمي Asclepias curassavica "))
        array.add(Plants("كالونا", R.drawable.three,"نبتة كالونا شجيرة غنية بأزهار ذات ألوان بديعة. اسم هذه النبتة مشتق من كلمة كالونو باليونانية وتعني التنظيف"))
        array.add(Plants("عصفور الجنة", R.drawable.bird,"نبات عصفور الجنة جمال خاص،"))
        array.add(Plants("شجرة الزيتون", R.drawable.forr,"سم الزيتون العلمي هو Olea europaea."))
        array.add(Plants("فضية", R.drawable.senec,"نبتة فضية أو غبار الفضة أو سنراريا واسمها العلمي Senecio cineraria"))
        array.add(Plants("أم الملايين", R.drawable.bryophy,"بات أم الملايين نبات معمر عصاري عمودي قائم بدون شعيرات ومن أسمائه الشائعة الثريا"))
        array.add(Plants("مكنسة الجنة الكوشيا", R.drawable.plant,"نبات الكوشيا اسمه العلمي Bassia scoparia أو Kochia scoparia"))
        array.add(Plants("تاج الفضة", R.drawable.cotyledon,"نبات تاج الفضة واسمه العلمي Cotyledon undulata وهو نبات لحمي الأوراق"))
        array.add(Plants("الاثل", R.drawable.tamarix,"الأثل جمع أثلة، اسمها العلمي Tamarix aphylla"))

        val customAdapter:customAdapter=customAdapter(array)
        recylerView?.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
    recylerView?.adapter=customAdapter
    }

}