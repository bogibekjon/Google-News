package uz.data.googlenews.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import uz.data.googlenews.R
import uz.data.googlenews.adapter.NewsAdapter
import uz.data.googlenews.model.News

class MainActivity : AppCompatActivity() {
    lateinit var list: ArrayList<News>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        val rvNews = findViewById<RecyclerView>(R.id.rv_news)
        list = loadMyList()
        val newsAdapter = NewsAdapter(this,list)
        val layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        rvNews.adapter=newsAdapter
        rvNews.layoutManager=layoutManager


    }

    private fun loadMyList(): java.util.ArrayList<News> {
        val myList = ArrayList<News>()
        myList.add(
            News(
                "https://www.rbc.ua/static/img/_/v/_viyskoviy_sau_gvozdika_2s1_gettyimages_1243867710_18_650x410.jpg",
                "Россияне за сутки потеряли несколько позиций под Бахмутом: карты боев",
                R.drawable.facebook,
                "АНТОН МАЛИНОВСКИЙ",
                "20 ДЕКАБРЯ 2022 06:45"
            )
        )

        myList.add(
            News(
                "https://images.unian.net/photos/2022_07/1657016717-7477.jpg",
                "Атака РФ дронами-убийцами 19 декабря: Зеленский пригрозил Ирану",
                R.drawable.apple,
                "Инна Андалицкая",
                "00:20, 20.12.22"
            )
        )

        myList.add(
            News(
                "https://www.interfax.ru/ftproot/textphotos/2022/12/20/pe700.jpg",
                "Минюст РФ подал иск о ликвидации Московской Хельсинкской группы",
                R.drawable.instagram,
                "В РОССИИ",
                "16:18, 20 декабря 2022"
            )
        )

        myList.add(
            News(
                "https://www.rbc.ua/static/img/_/v/_viyskoviy_sau_gvozdika_2s1_gettyimages_1243867710_18_650x410.jpg",
                "Россияне за сутки потеряли несколько позиций под Бахмутом: карты боев",
                R.drawable.facebook,
                "АНТОН МАЛИНОВСКИЙ",
                "20 ДЕКАБРЯ 2022 06:45"
            )
        )

        myList.add(
            News(
                "https://images.unian.net/photos/2022_07/1657016717-7477.jpg",
                "Атака РФ дронами-убийцами 19 декабря: Зеленский пригрозил Ирану",
                R.drawable.apple,
                "Инна Андалицкая",
                "00:20, 20.12.22"
            )
        )

        myList.add(
            News(
                "https://www.interfax.ru/ftproot/textphotos/2022/12/20/pe700.jpg",
                "Минюст РФ подал иск о ликвидации Московской Хельсинкской группы",
                R.drawable.instagram,
                "В РОССИИ",
                "16:18, 20 декабря 2022"
            )
        )

        myList.add(
            News(
                "https://www.rbc.ua/static/img/_/v/_viyskoviy_sau_gvozdika_2s1_gettyimages_1243867710_18_650x410.jpg",
                "Россияне за сутки потеряли несколько позиций под Бахмутом: карты боев",
                R.drawable.facebook,
                "АНТОН МАЛИНОВСКИЙ",
                "20 ДЕКАБРЯ 2022 06:45"
            )
        )

        myList.add(
            News(
                "https://images.unian.net/photos/2022_07/1657016717-7477.jpg",
                "Атака РФ дронами-убийцами 19 декабря: Зеленский пригрозил Ирану",
                R.drawable.apple,
                "Инна Андалицкая",
                "00:20, 20.12.22"
            )
        )

        myList.add(
            News(
                "https://www.interfax.ru/ftproot/textphotos/2022/12/20/pe700.jpg",
                "Минюст РФ подал иск о ликвидации Московской Хельсинкской группы",
                R.drawable.instagram,
                "В РОССИИ",
                "16:18, 20 декабря 2022"
            )
        )

        return myList
    }
}