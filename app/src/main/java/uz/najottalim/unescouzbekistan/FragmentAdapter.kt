package uz.najottalim.unescouzbekistan

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import uz.najottalim.unescouzbekistan.databinding.ItemViewBinding


class FragmentAdapter(_list: ArrayList<Item>, val onClickListener: (Item) -> Unit) :
    RecyclerView.Adapter<FragmentAdapter.ViewHolder>() {

    val list: ArrayList<Item> = _list


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemViewBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.tvTextName.text = list[position].name
        holder.binding.tvTextDescription.text = list[position].description
        Picasso.get().load(list[position].url).into(holder.binding.photoUrl)
        holder.binding.root.setOnClickListener {
            onClickListener(list[position])
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class ViewHolder(val binding: ItemViewBinding) : RecyclerView.ViewHolder(binding.root) {

    }
}
