package uz.najottalim.unescouzbekistan

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import androidx.recyclerview.widget.LinearLayoutManager
import uz.najottalim.unescouzbekistan.databinding.FragmentCulturekBinding


class CulturekFragmentval(onItemClick: (Item) -> Unit) : Fragment() {

    lateinit var binding: FragmentCulturekBinding

    lateinit var list: ArrayList<Item>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        list = ArrayList()

        list.apply { add(Item("https://firebasestorage.googleapis.com/v0/b/forefather-a18bf.appspot.com/o/comp.jpg?alt=media&token=cb434786-1329-41f5-9c7b-7a0b5d39a096","HP pavilion Gaming 13","Siz bu ampyutrni olasngiz yutqazmaysiz"))
            add(Item("https://firebasestorage.googleapis.com/v0/b/forefather-a18bf.appspot.com/o/comp.jpg?alt=media&token=cb434786-1329-41f5-9c7b-7a0b5d39a096","HP pavilion Gaming 13","Siz bu ampyutrni olasngiz yutqazmaysiz"))
            add(Item("https://firebasestorage.googleapis.com/v0/b/forefather-a18bf.appspot.com/o/comp.jpg?alt=media&token=cb434786-1329-41f5-9c7b-7a0b5d39a096","HP pavilion Gaming 13","Siz bu ampyutrni olasngiz yutqazmaysiz"))
            add(Item("https://firebasestorage.googleapis.com/v0/b/forefather-a18bf.appspot.com/o/comp.jpg?alt=media&token=cb434786-1329-41f5-9c7b-7a0b5d39a096","HP pavilion Gaming 13","Siz bu ampyutrni olasngiz yutqazmaysiz"))
            add(Item("https://firebasestorage.googleapis.com/v0/b/forefather-a18bf.appspot.com/o/comp.jpg?alt=media&token=cb434786-1329-41f5-9c7b-7a0b5d39a096","HP pavilion Gaming 13","Siz bu ampyutrni olasngiz yutqazmaysiz"))
            add(Item("https://firebasestorage.googleapis.com/v0/b/forefather-a18bf.appspot.com/o/comp.jpg?alt=media&token=cb434786-1329-41f5-9c7b-7a0b5d39a096","HP pavilion Gaming 13","Siz bu ampyutrni olasngiz yutqazmaysiz"))
            add(Item("https://firebasestorage.googleapis.com/v0/b/forefather-a18bf.appspot.com/o/comp.jpg?alt=media&token=cb434786-1329-41f5-9c7b-7a0b5d39a096","HP pavilion Gaming 13","Siz bu ampyutrni olasngiz yutqazmaysiz"))}

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentCulturekBinding.inflate(layoutInflater)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val adapter = FragmentAdapter(list){

        }
        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = LinearLayoutManager(context)
    }
}