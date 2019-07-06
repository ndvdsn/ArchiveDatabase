import React from "react";
import Artist from "./Artist"

const ArtistList = (props) => {

    

    if (props.artists == null || props.artists.length ===0){
      return<p>Loading...</p>
    }

    const artists = props.artists.map((artist)=>{
      return(
        <li key = {artist.id} className = "artist-item">
        <Artist artist = {artist}/>
        </li>
      )
    })

    return (
      <div>
      <ul>
      {artists}
      </ul>
      </div>
    )
  };

export default ArtistList;
