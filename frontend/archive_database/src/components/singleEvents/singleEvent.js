import React from "react";

const SingleEvent = (props) => {

  if(!props.singleEvent){
    return null;
  }

  const artists = props.singleEvent.artists.map((artist, index)=>{
      return <ul key={index}>{artist.name}</ul>
  })

  return(
    <div className = "single-singleEvent">
      <div className = "details">
        <ul>
          <li>Title: {props.singleEvent.title} </li>
          <li>Date: {props.singleEvent.date} </li>
          <li>Location: {props.singleEvent.location} </li>
          <li>Venue: {props.singleEvent.venue} </li>
          <li>Artist: {artists} </li>
          <li>MultiEvent: {props.singleEvent.multiEventName} </li>
        </ul>
      </div>
    </div>

  )
}

export default SingleEvent;
