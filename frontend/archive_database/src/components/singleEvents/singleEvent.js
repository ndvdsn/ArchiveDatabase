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
          <div>
          <li>Title: {props.singleEvent.title}</li>
          </div>
          <li>Date: {props.singleEvent.date} </li>
          <li>Location: {props.singleEvent.location} </li>
          <li>Venue: {props.singleEvent.venue} </li>
          <li>Artist: {artists} </li>
          <li>MultiEvent: {props.singleEvent.multiEvent.multiEventName} </li>
        </ul>
      </div>
    </div>

  )
}

export default SingleEvent;

// <li><p className="list-heading">Title: </p><p>{' '} {props.singleEvent.title} </p></li>
