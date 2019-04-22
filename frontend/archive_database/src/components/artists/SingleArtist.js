import React from "react";
import { Link } from "react-router-dom";

const SingleArtist = (props) => {

  if(!props.artist){
    return null;
  }


  const dateBasic = props.artist.singleEvents.map((singleEvent)=>{
    return singleEvent.date
  })
  const slicedDate = dateBasic.slice(0,10)

  const formattedDate = moment(slicedDate).format("dddd Do MMM YYYY");

  const time = dateBasic.slice(11,16)


  const groups = props.artist.groups.map((group, index)=>{
    return <li key={index}>{group.name}</li>
  })

  const singleEvents = props.artist.singleEvents.map((singleEvent, index) => {
    return <li key={index}>{singleEvent.title}</li>
  })

  return(
    <div className = "single-artist">

      <p>Name: {props.artist.name}</p>
      <p>Country: {props.artist.country}</p>
      <p>Groups: {groups}</p>
      <p>SingleEvents: {singleEvents} {formattedDate} {time} </p>

    </div>
  )
}
