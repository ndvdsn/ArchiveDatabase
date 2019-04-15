import React from "react";

const Artist = (props) => {

  return(
    <div className = "single-artist">
      <p>Name: {props.artist.name}</p>
      <p>Country: {props.artist.country}</p>
      // <p>Groups: {props.artist.groups}</p>
      // <p>SingleEvents: {props.artist.singleEvents}</p>

      // "name": "Keiji Haino",
      // "id": 1,
      // "country": "Japan",
      // "groups": [],
      // "singleEvents": [],

    </div>
  )
}
export default Artist;
