import React from "react";
import Artist from "./Artist"

const ArtistList = (props) => {

  const artists = props.artistsArray.map((artist) => {
    return (

      <li key = {artist.id} className = "artist-item">
      <Artist artist = {artist}/>
      </li>
    )
  })

  return(
    <ul>
    {artists}
    </ul>
  )
}
export default ArtistList
