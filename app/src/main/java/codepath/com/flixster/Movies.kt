package codepath.com.flixster

import com.google.gson.annotations.SerializedName

class Movies
{
    @SerializedName("title")
    var moviesTitle:String? = null

    @SerializedName("description")
    var moviesDescription:String? = null

    @SerializedName("imageUrl")
    var moviesImageUrl:String? = null
}