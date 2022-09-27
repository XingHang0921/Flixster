package codepath.com.flixster

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class MyAdapter(private val movies: List<Movies>, moviesFragment: MoviesFragment) : RecyclerView.Adapter<MyAdapter.MovieViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder
    {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.movies_layout, parent, false)
        return MovieViewHolder(view)
    }
    inner class MovieViewHolder(val view: View):RecyclerView.ViewHolder(view)
    {
            val mMoviesTitle: TextView = view.findViewById<View>(R.id.mTitle) as TextView
            val mMoviesDescription: TextView = view.findViewById<View>(R.id.mDescription) as TextView
            val mMoviesImageUrl: ImageView = view.findViewById<View>(R.id.mImage) as ImageView

    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int)
    {
        val movie = movies[position]
        holder.mMoviesTitle.text = movie.moviesTitle.toString()
        holder.mMoviesDescription.text = movie.moviesDescription.toString()

        Glide.with(holder.view)
            .load(movie.moviesImageUrl)
            .centerInside()
            .into(holder.mMoviesImageUrl)
    }

    override fun getItemCount(): Int {
        return movies.size
    }

}