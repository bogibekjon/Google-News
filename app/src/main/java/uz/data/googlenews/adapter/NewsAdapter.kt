package uz.data.googlenews.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import uz.data.googlenews.R
import uz.data.googlenews.model.News

class NewsAdapter(val context: Context, val list: ArrayList<News>) :
    RecyclerView.Adapter<NewsAdapter.NewsViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_news, parent, false)
        return NewsViewHolder(view)
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        val news = list[position]
        holder.apply {
            tvTitle.text = news.title
            tvName.text = news.name
            tvTime.text = news.time
            ivProfile.setImageResource(news.icon)
            Glide.with(ivNews).load(news.imgUrl).into(ivNews)
            ivMore.setOnClickListener {
                Toast.makeText(context, "$position bosildi", Toast.LENGTH_SHORT).show()
            }
        }

    }

    override fun getItemCount() = list.size

    class NewsViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val ivNews = view.findViewById<ImageView>(R.id.iv_news)
        val tvTitle = view.findViewById<TextView>(R.id.tv_title)
        val tvName = view.findViewById<TextView>(R.id.tv_name)
        val tvTime = view.findViewById<TextView>(R.id.tv_when_whom)
        val ivProfile = view.findViewById<ImageView>(R.id.iv_profile)
        val ivMore = view.findViewById<ImageView>(R.id.iv_more)
        val ivShare = view.findViewById<ImageView>(R.id.iv_share)


    }


}