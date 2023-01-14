package com.example.clothesshop.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.clothesshop.R
import com.example.clothesshop.data.model.Clothes

// und die Liste an Jokes um sie für die RecyclerView vorzubereiten
class ClothesAdapter(
    private val dataset: List<Clothes>
) : RecyclerView.Adapter<ClothesAdapter.ViewHolder>() {
    // IDEE EINES VIEWHOLDERS
    // der ViewHolder weiß welche Teile des Layouts beim Recycling angepasst werden
    class ViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val clothesImage = view.findViewById<ImageView>(R.id.clothes_image)
        val clothesTitle = view.findViewById<TextView>(R.id.clothes_name_text)
        val clothesRating = view.findViewById<TextView>(R.id.clothes_rating_text)
        val clothesPrice = view.findViewById<TextView>(R.id.clothes_price_text)
    }
    // ERSTELLEN DES VIEWHOLDERS
    // hier werden neue ViewHolder erstellt
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.clothes_item, parent, false)
        return ViewHolder(adapterLayout)
    }
    // BEFÜLLEN DES VIEWHOLDERS
    // hier findet der Recyclingprozess statt
    // die vom ViewHolder bereitgestellten Parameter werden verändert
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val clothes = dataset[position]

        holder.clothesImage.setImageResource(clothes.imageResource)
        holder.clothesTitle.text = clothes.title
        holder.clothesRating.text = clothes.rating.toString()
        holder.clothesPrice.text = clothes.price.toString()




/*        holder.adoptButton.setOnClickListener {
            Toast.makeText(context,"${dog.name} freut sich schon", Toast.LENGTH_SHORT)
                .show()
        }*/

    }
    // damit der LayoutManager weiß wie lang die Liste ist
    override fun getItemCount(): Int {
        return dataset.size
    }
}